import java.util.Scanner;

class SwitchDemo
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iStd = 0;

        System.out.println("Enter your standard : ");
        iStd = sobj.nextInt();

        switch (iStd)
        {
            case 1:
                System.out.println("Exam is at 9am");
                break;

            case 2:
                System.out.println("Exam is at 10am");
                break;

            case 3:
                System.out.println("Exam is at 11am");
                break;

            case 4:
                System.out.println("Exam is at 12noon");
                break;

            default:
                System.out.println("Invalid Standard");
                            
        } 

    
    }
}