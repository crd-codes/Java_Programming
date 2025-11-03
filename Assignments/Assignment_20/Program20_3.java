/*
    Algorithm

    START
        Accept number from user as no
        If number is negative then convert it to positive
        Take on variable sum = 0
        Repeat from 1 to no/2
            If number is divisible by counter
                Add counter to sum
        End loop
        If sum is equal to no
            Display Number is perfect
        Otherwise
            Display Number is not perfect
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
//                     the given number is a Perfect Number or not.
//  Author           : Chakradhar Rawaji Dugade
//  Date             : 02/11/2025
//
/////////////////////////////////////////////////////////////////////

class Logic
{
    public boolean checkPerfect(int iNo)
    {
        int iCnt = 0;
        int iSum = 0;

        if(iNo < 0)                                            // Updater
        {
            iNo = -iNo;
        }

        for(iCnt = 1; iCnt <= (iNo / 2); iCnt++)               // Business logic
        {
            if(iNo % iCnt == 0)
            {
                iSum = iSum + iCnt;
            }
        }

        if(iSum == iNo)
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

class Program20_3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int iValue = 0;
        boolean bRet = false;

        System.out.print("Enter a number : ");
        iValue = sc.nextInt();

        Logic obj = new Logic();                               // Object creation
        bRet = obj.checkPerfect(iValue);                       // Method call

        if(bRet == true)
        {
            System.out.println(iValue + " is a Perfect Number");
        }
        else
        {
            System.out.println(iValue + " is not a Perfect Number");
        }

        sc.close();
    }
}

/////////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 6     Output : 6 is a Perfect Number
//  Input : 28    Output : 28 is a Perfect Number
//  Input : 12    Output : 12 is not a Perfect Number
//  Input : -6    Output : -6 is a Perfect Number
//
/////////////////////////////////////////////////////////////////////
