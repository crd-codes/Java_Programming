/*
    Algorithm

    START
        Accept a number from user as no   
        If the input is negative then convert it to positive 
        Take two variables evenSum and oddSum
        Repeat until number becomes 0
            Extract last digit using modulus operator
            If digit is even
                Add digit to evenSum
            Else
                Add digit to oddSum
            Divide number by 10 to remove last digit
        End loop
        Display evenSum and oddSum
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
//                     of even and odd digits in a given number.
//  Author           : Chakradhar Rawaji Dugade
//  Date             : 02/11/2025
//
/////////////////////////////////////////////////////////////////////

class Logic
{
    public void sumEvenOddDigits(int iNo)                          // Input
    {
        int iDigit = 0;
        int ievenSum = 0;
        int ioddSum = 0;

        if(iNo < 0)                                                // Updater
        {
            iNo = -iNo;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            if(iDigit % 2 == 0)
            {
                ievenSum = ievenSum + iDigit;
            }
            else
            {
                ioddSum = ioddSum + iDigit;
            }

            iNo = iNo / 10;
        }

        System.out.println("Sum of even digits : " + ievenSum);
        System.out.println("Sum of odd digits  : " + ioddSum);
    }     
}

/////////////////////////////////////////////////////////////////////
//
//  Entry point class for the application
//
/////////////////////////////////////////////////////////////////////

class Program18_4
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);                       // To accept user input

        System.out.print("Enter a number : ");
        int iValue = sc.nextInt();

        Logic obj = new Logic();                                   // Object creation
        obj.sumEvenOddDigits(iValue);                              // Method call

        sc.close();
    }   
}

/////////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 12345      Output : Sum of even digits : 6   Sum of odd digits : 9
//  Input : 560        Output : Sum of even digits : 6   Sum of odd digits : 5
//  Input : -789       Output : Sum of even digits : 8   Sum of odd digits : 16
//  Input : 0          Output : Sum of even digits : 0   Sum of odd digits : 0
//
/////////////////////////////////////////////////////////////////////
