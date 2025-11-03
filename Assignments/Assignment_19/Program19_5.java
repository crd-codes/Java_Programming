/*
    Algorithm

    START
        Accept two numbers from user as base and exponent   
        If base or exponent is negative, convert them to positive
        Take one variable power = 1
        Repeat exponent times
            Multiply power with base
        End loop
        Display the final power value
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
//  Description      : This class contains a method to calculate the 
//                     power of a number using loops.
//  Author           : Chakradhar Rawaji Dugade
//  Date             : 02/11/2025
//
/////////////////////////////////////////////////////////////////////

class Logic
{
    public int calculatePower(int iBase, int iExp)                   // Input
    {
        int iCnt = 0;
        int iPower = 1;

        if(iBase < 0)
        {
            iBase = -iBase;
        }

        if(iExp < 0)
        {
            iExp = -iExp;
        }

        for(iCnt = 1; iCnt <= iExp; iCnt++)
        {
            iPower = iPower * iBase;
        }

        return iPower;
    }
}

/////////////////////////////////////////////////////////////////////
//
//  Entry point class for the application
//
/////////////////////////////////////////////////////////////////////

class Program19_5
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);                         // To accept user input
        int iBase = 0, iExp = 0, iRet = 0;

        System.out.print("Enter base number : ");
        iBase = sc.nextInt();

        System.out.print("Enter exponent : ");
        iExp = sc.nextInt();

        Logic obj = new Logic();                                     // Object creation
        iRet = obj.calculatePower(iBase, iExp);                      // Method call

        System.out.println(iBase + " raised to " + iExp + " is : " + iRet);

        sc.close();
    }   
}

/////////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : Base = 2   Exponent = 3     Output : 8
//  Input : Base = 5   Exponent = 0     Output : 1
//  Input : Base = 3   Exponent = 4     Output : 81
//  Input : Base = -2  Exponent = 3     Output : 8
//
/////////////////////////////////////////////////////////////////////
