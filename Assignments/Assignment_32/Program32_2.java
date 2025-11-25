import java.util.Scanner;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;
        int k = 0;

        if(iRow != iCol)
        {
            System.out.println("Invalid input");
            System.out.println("Row number and column number should be same");           
            
            return;
        }

        for(i = 1, k = iCol; i <= iRow; i++, k--)
        {
            for(j = 1; j <= iCol; j++)
            {
                if(k == j)
                {
                    System.out.print("#\t");
                }
                else if(k > j) 
                {
                    System.out.print("*\t");
                }
                else 
                {
                    System.out.print("@\t");
                }
            }
            System.out.println();
        }
    }
}

class Program32_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue1 = 0, iValue2 = 0;

        System.out.println("Enter the number of rows : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter the number of columns : ");
        iValue2 = sobj.nextInt();

        Pattern pobj = new Pattern();
        
        pobj.Display(iValue1,iValue2);
    }
}