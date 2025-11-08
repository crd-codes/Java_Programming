import java.io.*;
import java.net.*;

class CalculatorServer
{
    public static void main(String A[]) throws Exception
    {
        ServerSocket ssobj = new ServerSocket(2200);
        System.out.println("Server started... Server is waiting at 2200");
     
        Socket sobj = ssobj.accept();
        System.out.println("Client request arrives and accepted by server");

        DataInputStream diobj = new DataInputStream(sobj.getInputStream());
        DataOutputStream doobj = new DataOutputStream(sobj.getOutputStream());

        while (true)
        {
            int num1 = diobj.readInt();
            int num2 = diobj.readInt();
            String operation = diobj.readUTF();


            int result = 0;
            if (operation.equals("+"))
            {
                result = num1 + num2;
            }
            else if (operation.equals("-")) 
            {
                result = num1 - num2;
            }
            else if (operation.equals("x")) 
            {
                result = num1 * num2;
            }
            else if (operation.equals("/")) 
            {
                if (num2 == 0) {
                    doobj.writeUTF("Error: Cannot divide by 0");
                } else {
                    doobj.writeUTF("Result: " + (num1 / num2));
                }
                continue;
            }
            else 
            {
                doobj.writeUTF("Invalid operation");
                continue;
            }

            doobj.writeUTF(result);
        }
        
    }
}
