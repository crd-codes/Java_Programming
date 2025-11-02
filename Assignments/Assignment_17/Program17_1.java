/*
    Algorithm

    START
        Accept number from user as no   
        If the input is negative then convert it to positive 
        Take one variable sum 
        Take one counter
        Repeat until number becomes 0
            Extract last digit using modulus operator
            Add sum with digit
            Divide number by 10 to remove last digit
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
//  Description      : This class contains a method to display the sum 
//                     of digits in a given number.
//  Author           : Chakradhar Rawaji Dugade
//  Date             : 02/11/2025
//
/////////////////////////////////////////////////////////////////////

class Logic
{
    public int sumOfDigits(int iNo)                               // Input
    {
        int iDigit = 0;
        int iSum = 0;

        if(iNo < 0)                                                // Updater
        {
            iNo = -iNo;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iSum = iSum + iDigit;
            iNo = iNo / 10;
        }

        //System.out.println("The sum of digits of given number : " + iSum);
        return iSum;
    }     
}

/////////////////////////////////////////////////////////////////////
//
//  Entry point class for the application
//
/////////////////////////////////////////////////////////////////////

class Program17_1
{
    public static void main(String args[])
    {
        int iRet = 0;
        Scanner sc = new Scanner(System.in);                       // To accept user input
        int iValue = 0;

        System.out.print("Enter a number : ");
        iValue = sc.nextInt();

        Logic obj = new Logic();                                   // Object creation
        //obj.sumOfDigits(iValue);                                 // Method call

        iRet = obj.sumOfDigits(iValue);                            // Method call 

        System.out.println(iRet);

        sc.close();
    }   
}

/////////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 123      Output : The sum of digits of given number : 6
//  Input : 560      Output : The sum of digits of given number : 11
//  Input : -89      Output : The sum of digits of given number : 17
//  Input : 0        Output : The sum of digits of given number : 0
//
/////////////////////////////////////////////////////////////////////
