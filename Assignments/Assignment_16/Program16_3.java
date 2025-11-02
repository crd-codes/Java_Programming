/*
    Algorithm

    START
        Accept number from user as no
        If the input is negative then convert it to positive
        Take one variable fact = 1
        Take one counter 
        Repeat until counter is less than or equal to no
            Multiply fact by iCnt
            Increment counter by 1
        End loop
        Display fact
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
//  Description      : This class contains method to find the factorial
//                     of a given number.
//  Author           : Chakradhar Rawaji Dugade
//  Date             : 02/11/2025
//
/////////////////////////////////////////////////////////////////////

class Logic
{
    public void findFactorial(int iNo)                               // Input
    {
        if(iNo < 0)                                                  // Updater
        {
            iNo = -iNo;
        }

        int iFact = 1;                                             // Initialize factorial variable

        for(int iCnt = 1; iCnt <= iNo; iCnt++)                       // Business logic
        {
            iFact = iFact * iCnt;
        }

        System.out.println("Factorial of " + iNo + " is: " + iFact);
    }   // End of findFactorial
}

/////////////////////////////////////////////////////////////////////
//
//  Entry point class for the application
//
/////////////////////////////////////////////////////////////////////

class Program16_3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);                       // To accept user input
        int iValue = 0;

        System.out.print("Enter a number : ");
        iValue = sc.nextInt();

        Logic obj = new Logic();                                   // Object creation
        obj.findFactorial(iValue);                                 // Method call

        sc.close();
    }   // End of main
}

/////////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 5       Output : Factorial of 5 is: 120
//  Input : 4       Output : Factorial of 4 is: 24
//  Input : -3      Output : Factorial of 3 is: 6
//  Input : 1       Output : Factorial of 1 is: 1
//
/////////////////////////////////////////////////////////////////////
