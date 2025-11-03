/*
    Algorithm

    START
        Accept number from user as no   
        If the input is negative then convert it to positive 
        Take one counter
        Repeat till counter less than or equal to no
            If counter is divisible by 2 and 3
            Then display counter
        Increment counter by 1
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
//  Description      : This class contains a method to display all 
//                     numbers form 1 to N that are divisible by 2 and 3.
//  Author           : Chakradhar Rawaji Dugade
//  Date             : 03/11/2025
//
/////////////////////////////////////////////////////////////////////

class Logic
{
    public void printDivisibleBy2and3(int iNo)                      // Input
    {
        int iCnt = 0;

        if(iNo < 0)                                                // Updater
        {
            iNo = -iNo;
        }

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(iCnt % 2 == 0 && iCnt % 3 == 0)
            {
                System.out.println(iCnt);
            }
        }
    }     
}

/////////////////////////////////////////////////////////////////////
//
//  Entry point class for the application
//
/////////////////////////////////////////////////////////////////////

class Program21_5
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);                       // To accept user input
        int iValue = 0;

        System.out.println("Enter a number : ");
        iValue = sc.nextInt();

        Logic obj = new Logic();                                   // Object creation

        obj.printDivisibleBy2and3(iValue);                         // Method call 

        sc.close();
    }   
}

/////////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 24      Output : 6  12  18  24 
//  Input : 19      Output : 6  12  18
//
/////////////////////////////////////////////////////////////////////
