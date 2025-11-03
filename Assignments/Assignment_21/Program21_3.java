/*
    Algorithm

    START
        Accept number from user as no
        If no is negative convert it to positive
        Take a counter Cnt 
        Repeat till cnt is less than or equal to no
            If remainder of no % cnt is equal to 0
                Display cnt
            Increment cnt by 1    
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
//  Description      : This class contains a method to display all factors 
//                     of given number.
//  Author           : Chakradhar Rawaji Dugade
//  Date             : 03/11/2025
//
/////////////////////////////////////////////////////////////////////

class Logic
{
    public void displayFactors(int iNo)
    {
        int iCnt = 0;

        if(iNo < 0)                                                 // Updater
        {
            iNo = -iNo;
        }

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(iNo % iCnt == 0)
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

class Program21_3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);                        // User input
        int iValue = 0;

        System.out.println("Enter the value : ");
        iValue = sc.nextInt();                                      // User input

        Logic obj = new Logic();                                    // Object creation

        obj.displayFactors(iValue);                                 // Method call

        sc.close();
    }
}

/////////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input  : 27       Output  : 1   3   9
//  
/////////////////////////////////////////////////////////////////////
