/*
    Algorithm

    START
        Accept number from user as n
        If the input is negative then convert it to positive
        If number is divisible by 2
            Then display Number is Even
        Otherwise
            Display Number is Odd
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
//  Description      : This class contains method to check whether
//                     a given number is even or odd.
//  Author           : Chakradhar Rawaji Dugade
//  Date             : 02/11/2025
//
/////////////////////////////////////////////////////////////////////

class Logic                                                        
{
    public void checkEvenOdd(int n)                                // Input
    {
        if(n < 0)                                                  // Updater
        {
            n = -n;
        }

        if(n % 2 == 0)                                             // Business logic
        {
            System.out.println("Number is Even");
        }
        else
        {
            System.out.println("Number is Odd");
        }
    }   // End of checkEvenOdd
}

/////////////////////////////////////////////////////////////////////
//
//  Entry point class for the application
//
/////////////////////////////////////////////////////////////////////

class Program16_2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);                       // To accept user input
        int iValue = 0;

        System.out.print("Enter a number : ");
        iValue = sc.nextInt();

        Logic obj = new Logic();                                   // Object creation
        obj.checkEvenOdd(iValue);                                  // Method call

        sc.close();
    }   // End of main
}

/////////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 13      Output : Number is Odd
//  Input : 24      Output : Number is Even
//  Input : -5      Output : Number is Odd
//  Input : -8      Output : Number is Even
//
/////////////////////////////////////////////////////////////////////
