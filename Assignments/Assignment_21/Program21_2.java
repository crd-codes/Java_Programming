/*
    Algorithm

    START
        Accept number from user as no
        If no is negative convert it to positive
        Take variable EvenCnt = 0 and OddCnt = 0
        Take a counter Cnt from 1 to no
            If Cnt is even 
                Increment EvenCnt
            Else
                Increment OddCnt
        End loop
        Display EvenCnt and OddCnt
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
//  Description      : This class contains a method to count how many
//                     even and odd numbers are present between 1 to N.
//  Author           : Chakradhar Rawaji Dugade
//  Date             : 03/11/2025
//
/////////////////////////////////////////////////////////////////////

class Logic
{
    public void countEvenOddRange(int iNo)
    {
        int iCnt = 0;
        int iEvenCnt = 0;
        int iOddCnt = 0;

        if(iNo < 0)                                                 // Updater
        {
            iNo = -iNo;
        }

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                iEvenCnt++;
            }
            else
            {
                iOddCnt++;
            }
        }

        System.out.println("Count of even numbers between 1 to " + iNo + " : " + iEvenCnt);
        System.out.println("Count of odd numbers between 1 to " + iNo + " : " + iOddCnt);
    }
}

/////////////////////////////////////////////////////////////////////
//
//  Entry point class for the application
//
/////////////////////////////////////////////////////////////////////

class Program21_2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int iValue = 0;

        System.out.print("Enter the value of N : ");
        iValue = sc.nextInt();

        Logic obj = new Logic();                                     // Object creation

        obj.countEvenOddRange(iValue);                               // Method call

        sc.close();
    }
}

/////////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input  : 13
//  Output : 
//           Count of even numbers between 1 to 13 : 6
//           Count of odd numbers between 1 to 13  : 7
//
//  Input   : 75
//  Output  : 
//            Count of even numbers between 1 to 75 : 37
//            Count of odd numbers between 1 to 75  : 38
//
/////////////////////////////////////////////////////////////////////
