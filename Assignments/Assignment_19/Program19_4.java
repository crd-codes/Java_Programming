/*
    Algorithm

    START
        Accept number from user as no   
        If the input is negative then convert it to positive  
        Take one counter
        Repeat until number becomes 0
            Extract last digit using modulus operator
            Display digit
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
//  Description      : This class contains a method to display the 
//                     of digits in a given number.
//  Author           : Chakradhar Rawaji Dugade
//  Date             : 02/11/2025
//
/////////////////////////////////////////////////////////////////////

class Logic
{
    public void printDigits(int iNo)                               // Input
    {
        int iDigit = 0;

        if(iNo < 0)                                                // Updater
        {
            iNo = -iNo;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;
           System.out.println(iDigit);
            iNo = iNo / 10;
        }

    }     
}

/////////////////////////////////////////////////////////////////////
//
//  Entry point class for the application
//
/////////////////////////////////////////////////////////////////////

class Program19_4
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);                       // To accept user input
        int iValue = 0;

        System.out.print("Enter a number : ");
        iValue = sc.nextInt();

        Logic obj = new Logic();                                   // Object creation

        obj.printDigits(iValue);                                   // Method call 

        sc.close();
    }   
}

/////////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 123      Output : 3 2 1
//  Input : 560      Output : 0 6 5
//  Input : -89      Output : 9 8
//
/////////////////////////////////////////////////////////////////////
