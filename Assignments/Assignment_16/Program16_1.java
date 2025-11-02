/*
    Algorithm

    START
        Accept number from user as n
        If the input is negative then convert it to positive
        Take one counter iCnt
        Take one variable sum
        Repeat until counter is less than or equal to n
            Add counter to sum
            Increment counter by 1
        End loop
        Display sum
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
//  Description      : It class contains a method to calculate and display 
//                     the summation of first N natural numbers
//  Author           : Chakradhar Rawaji Dugade
//  Date             : 02/11/2025
//
/////////////////////////////////////////////////////////////////////

class Logic                                                        
    public void calculateSum(int n)                                // Input
    {
        int iCnt = 0;
        int iSum = 0;

        if(n < 0)                                                  // Updater
        {
            n = -n;
        }

        for(iCnt = 1; iCnt <= n; iCnt++)                           // Business logic
        {
            iSum = iSum + iCnt;
        }

        System.out.println("Sum of first N natural numbers is: " + iSum);
    }   // End of calculateSum
}

/////////////////////////////////////////////////////////////////////
//
//  Entry point class for the application
//
/////////////////////////////////////////////////////////////////////

class Program16_1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);                       // To accept user input
        int iValue = 0;

        System.out.print("Enter a number : ");
        iValue = sc.nextInt();

        Logic obj = new Logic();                                   // Object creation                        
        obj.calculateSum(iValue);                                  // Method call

        sc.close();
    }   // End of main
}

/////////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 13      Output : Sum of first N natural numbers is: 91
//  Input : 5       Output : Sum of first N natural numbers is: 15
//
/////////////////////////////////////////////////////////////////////
