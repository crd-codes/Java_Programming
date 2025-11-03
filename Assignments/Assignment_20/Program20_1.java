/*
    Algorithm

    START
        Accept number from user as no   
        If the input is negative then convert it to positive 
        Take one variable sum 
        Take one counter
        Repeat till counter less than or equal to no
            If counter is even 
            Then add in sum
        Increment counter by 1
        End loop
        Display addition result
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
//  Description      : This class contains a method to display the 
//                     sum of all even numbers up to given number.
//  Author           : Chakradhar Rawaji Dugade
//  Date             : 02/11/2025
//
/////////////////////////////////////////////////////////////////////

class Logic
{
    public int sumEvenNumbers(int iNo)                               // Input
    {
        int iSum = 0;
        int iCnt = 0;

        if(iNo < 0)                                                // Updater
        {
            iNo = -iNo;
        }

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                iSum = iSum + iCnt;
            }
        }
        return iSum;
    }     
}

/////////////////////////////////////////////////////////////////////
//
//  Entry point class for the application
//
/////////////////////////////////////////////////////////////////////

class Program20_1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);                       // To accept user input
        int iValue = 0, iRet = 0;

        System.out.print("Enter a number : ");
        iValue = sc.nextInt();

        Logic obj = new Logic();                                   // Object creation

        iRet = obj.sumEvenNumbers(iValue);                         // Method call 

        System.out.println("Sum of all even numbers up to " + iValue + " is " + iRet);
        sc.close();
    }   
}

/////////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 12      Output : Sum of all even numbers up to 12 is 42
//  Input : 56      Output : Sum of all even numbers up to 56 is 812
//
/////////////////////////////////////////////////////////////////////
