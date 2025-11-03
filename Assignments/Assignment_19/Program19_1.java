/*
    Algorithm

    START
        Accept year from user as year
        If year is negative then convert it to positive
        If iYear is divisible by 4 and not divisible by 100
            OR iYear is divisible by 400
            Then display Leap Year
        Otherwise
            Display Not a Leap Year
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
//  Description      : This class contains a method to check whether 
//                     a given year is a leap year or not.
//  Author           : Chakradhar Rawaji Dugade
//  Date             : 02/11/2025
//
/////////////////////////////////////////////////////////////////////

class Logic
{
    public boolean checkLeapYear(int iYear)                             // Input
    {
        if(iYear < 0)                                                   // Updater
        {
            iYear = -iYear;
        }

        if((iYear % 4 == 0 && iYear % 100 != 0) || (iYear % 400 == 0))  // Business logic
        {
            return true;                                         
        }
        else
        {
            return false;                                       
        }
    }
}

/////////////////////////////////////////////////////////////////////
//
//  Entry point class for the application
//
/////////////////////////////////////////////////////////////////////

class Program19_1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);                           // To accept user input
        int iValue = 0;
        boolean bRet = false;

        System.out.print("Enter a year : ");
        iValue = sc.nextInt();

        Logic obj = new Logic();                                       // Object creation
        bRet = obj.checkLeapYear(iValue);                              // Method call

        if(bRet == true)
        {
            System.out.println(iValue + " is a Leap Year");
        }
        else
        {
            System.out.println(iValue + " is not a Leap Year");
        }

        sc.close();
    }   // End of main
}

/////////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 2024    Output : 2024 is a Leap Year
//  Input : 2000    Output : 2000 is a Leap Year
//  Input : -2020   Output : 2020 is a Leap Year
//  Input : 2023    Output : 2023 is not a Leap Year
//
/////////////////////////////////////////////////////////////////////
