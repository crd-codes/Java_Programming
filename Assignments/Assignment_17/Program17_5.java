/*
    Algorithm

    START
        Accept number from user as no   
        If the input is negative then convert it to positive 
        Take one counter
        Repeat till counter is less than or equal to no
            Display Multiplication of no with counter
            Increment counter by 1            
        End loop
        Display table
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
//  Description      : This class contains a method to display table 
//                     of a given number.
//  Author           : Chakradhar Rawaji Dugade
//  Date             : 02/11/2025
//
/////////////////////////////////////////////////////////////////////

class Logic
{
    public void printTable(int iNo)                                // Input
    {
        int iCnt = 0;

        if(iNo < 0)                                                // Updater
        {
            iNo = -iNo;
        }

        for(iCnt = 1; iCnt <= 10; iCnt++)
        {
           System.out.println(iNo * iCnt + );
        }

    }     
}

/////////////////////////////////////////////////////////////////////
//
//  Entry point class for the application
//
/////////////////////////////////////////////////////////////////////

class Program17_5
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);                       // To accept user input
        int iValue = 0;

        System.out.print("Enter a number : ");
        iValue = sc.nextInt();

        Logic obj = new Logic();                                   // Object creation

        obj.printTable(iValue);                                    // Method call 
        
        sc.close();
    }   
}

/////////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 12      Output : 12      24      36      48      60      72      84      96      108     120
//  Input : -10     Output : 10      20      30      40      50      60      70      80      90      100
//
/////////////////////////////////////////////////////////////////////
