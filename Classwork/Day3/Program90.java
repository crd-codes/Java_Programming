import java.util.*;

class Digit
{
    public void DisplayDigits(int iNo)
    {
        int iDigit = 0;
        
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            System.out.println(iDigit);
            iNo = iNo / 10;
        }
    }
}

class Program90
{
    public static void main(String A[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a number : ");
        iValue = sobj.nextInt();

        Digit dobj = new Digit();
        dobj.DisplayDigits(iValue);

        // important
        
        sobj = null;
        dobj = null;

        System.gc();
    }
}