/*
    Algorithm

    START
        Accept number from user as no
        If number is negative then convert it to positive
        Initialize counter as 2 and flag as true
        Repeat until counter is less than or equal no / 2
            If number is divisible by counter
                Set flag as false
                Break the loop
        End loop
        If flag is true
            Display Number is prime
        Otherwise
            Display Number is not prime
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
//                     the given number is a prime number or not.
//  Author           : Chakradhar Rawaji Dugade
//  Date             : 02/11/2025
//
/////////////////////////////////////////////////////////////////////

class Logic
{
    public boolean checkPrime(int iNo)                             // Input
    {
        int iCnt = 0;
        boolean bFlag = true;

        if(iNo < 0)                                                // Updater
        {
            iNo = -iNo;
        }

        if(iNo < 2)                                                // 0 and 1 are not prime
        {
            return false;
        }

        for(iCnt = 2; iCnt <= (iNo / 2); iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                bFlag = false;
                break;                                             
            }
        }

        return bFlag;
    }
}

/////////////////////////////////////////////////////////////////////
//
//  Entry point class for the application
//
/////////////////////////////////////////////////////////////////////

class Program18_1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);                       // To accept user input
        int iValue = 0;
        boolean bRet = false;

        System.out.print("Enter the number : ");
        iValue = sc.nextInt();

        Logic obj = new Logic();                                   // Object creation
        bRet = obj.checkPrime(iValue);                             // Method call

        if(bRet == true)
        {
            System.out.println(iValue + " is a prime number");
        }
        else
        {
            System.out.println(iValue + " is not a prime number");
        }

        sc.close();
    }   // End of main
}

/////////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 5     Output : 5 is a prime number
//  Input : 10    Output : 10 is not a prime number
//  Input : 1     Output : 1 is not a prime number
//  Input : -7    Output : -7 is not a prime number
//
/////////////////////////////////////////////////////////////////////
