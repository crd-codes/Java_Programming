import java.util.*;

class Number
{
    public boolean checkPerfect(int iNo)
    {
        int i = 0, iSum = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        //Reverse loop

        for (i = iNo/2 ; (i >= 1) && (iSum < iNo); i--)
        {
            if((iNo % i) == 0)
            {
                iSum = iSum + i;
            }
        }

        return (iSum == iNo);   
    }
}   // End of Number class

class Program85
{
    public static void main(String A[])
    {
        int iValue = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a number : ");
        iValue = sobj.nextInt();

        Number nobj = new Number();
        bRet = nobj.checkPerfect(iValue);

        if(bRet == true)
        {
            System.out.println(iValue+" is perfect number");
        }
        else
        {
            System.out.println(iValue+" is not perfect number");
        }

        // important
        
        sobj = null;
        nobj = null;

        System.gc();
    }
}