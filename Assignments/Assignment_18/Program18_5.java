/*
    Algorithm

    START
        Accept number from user as no
        If number is greater than 0
            Display Number is Positive
        If number is less than 0
            Display Number is Negative
        Otherwise
            Display Number is Zero
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
//                     a given number is positive, negative, or zero.
//  Author           : Chakradhar Rawaji Dugade
//  Date             : 02/11/2025
//
/////////////////////////////////////////////////////////////////////

class Logic
{
    public void checkSign(int iNo)                                 // Input
    {
        if(iNo > 0)
        {
            System.out.println("Number is Positive");
        }
        else if(iNo < 0)
        {
            System.out.println("Number is Negative");
        }
        else
        {
            System.out.println("Number is Zero");
        }
    }
}

/////////////////////////////////////////////////////////////////////
//
//  Entry point class for the application
//
/////////////////////////////////////////////////////////////////////

class Program18_5
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);                       // To accept user input

        System.out.print("Enter a number : ");
        int iValue = sc.nextInt();

        Logic obj = new Logic();                                   // Object creation
        obj.checkSign(iValue);                                     // Method call

        sc.close();
    }   
}

/////////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 25     Output : Number is Positive
//  Input : -9     Output : Number is Negative
//  Input : 0      Output : Number is Zero
//
/////////////////////////////////////////////////////////////////////

