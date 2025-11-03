/*
    Algorithm

    START
        Accept number from user as no
        If the input is negative then convert it to positive
        Take one counter initialized to no
        Repeat till counter greater than or equal to 1
            Display counter
            Decrement counter by 1
        End loop
    STOP
*/

/////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
/////////////////////////////////////////////////////////////////////

import java.util.Scanner;

/////////////////////////////////////////////////////////////////////
//
//  Class Name       : Logic
//  Description      : This class contains a method to print numbers
//                     from N down to 1 in reverse order.
//  Author           : Chakradhar Rawaji Dugade
//  Date             : 02/11/2025
//
/////////////////////////////////////////////////////////////////////

class Logic
{
    public void printReverse(int iNo)
    {
        if(iNo < 0)                                                // Updater
        {
            iNo = -iNo;
        }

        System.out.println("Numbers from " + iNo + " down to 1 are:");

        for(int iCnt = iNo; iCnt >= 1; iCnt--)                     // Business logic
        {
            System.out.print(iCnt + " ");
        }

        System.out.println(); 
    }
}

/////////////////////////////////////////////////////////////////////
//
//  Entry point class for the application
//
/////////////////////////////////////////////////////////////////////

class Program20_2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int iValue = 0;

        System.out.print("Enter a number : ");
        iValue = sc.nextInt();

        Logic obj = new Logic();                                   // Object creation

        obj.printReverse(iValue);                                  // Method call

        sc.close();
    }
}

/////////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 5     Output : 5 4 3 2 1
//  Input : 10    Output : 10 9 8 7 6 5 4 3 2 1
//  Input : -3    Output : 3 2 1
//
/////////////////////////////////////////////////////////////////////
