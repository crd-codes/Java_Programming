// OOP Design

import java.util.*;

class ArrayX
{
    private int Arr[];
    private int iSize;

    public ArrayX(int no)
    {
        System.out.println("Inside Constructor");

        iSize = no;
        Arr = new int[iSize];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        int i = 0;
        
        System.out.println("Enter the elements of array : ");

        for(i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }
    }

    public void Display()
    {
        System.out.println("Elements of the array are : ");
        int i = 0;
        
        for(i = 0; i < Arr.length; i++)
        {
            System.out.println(Arr[i]);
        }
    }
}

class Program106
{
    public static void main(String A[])
    {
        ArrayX aobj1 = new ArrayX(5);
        System.out.println(aobj1.iSize);    // error
        
        // Bad code(need of access specifier)
        aobj.iSize = 11;                    // error
        aobj.Arr = null;                    // error

        ArrayX aobj2 = new ArrayX(7);
        System.out.println(aobj2.iSize);    // error
    }
}