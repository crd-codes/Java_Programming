import java.util.Scanner;

class InputOutput
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int No1 = 0, No2 = 0;
        int Ans = 0;

        System.out.println("enter first element");
        No1 = sobj.nextInt();

        System.out.println("enter second element");
        No2 = sobj.nextInt();
        
        Ans = No1 + No2;

        System.out.println("addition is :" +Ans);   //+ for concatination

    }
}