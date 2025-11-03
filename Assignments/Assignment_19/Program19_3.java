/*
    Algorithm

    START
        Accept number from user as no
        Check whether is divisible by 5 and 11 or not
        Display result       
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
//                     a number is divisible by 5 and 11 or not.
//  Author           : Chakradhar Rawaji Dugade
//  Date             : 02/11/2025
//
/////////////////////////////////////////////////////////////////////

class Logic
{
    public void checkDivisible(int iNo)                                 // Input
    {
        if(iNo % 5 == 0 && iNo % 11 == 0)
        {
            System.out.println("Divisible by 5 and 11");
        }
        else 
        {
            System.out.println("Not Divisible by 5 and 11");
        }
    }
}

/////////////////////////////////////////////////////////////////////
//
//  Entry point class for the application
//
/////////////////////////////////////////////////////////////////////

class Program19_3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);                       // To accept user input

        System.out.print("Enter a number : ");
        int iValue = sc.nextInt();

        Logic obj = new Logic();                                   // Object creation
        obj.checkDivisible(iValue);                                // Method call

        sc.close();
    }   
}

/////////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 12     Output : Not Divisible by 5 and 11
//  Input : -9     Output : Not Divisible by 5 and 11
//  Input : 110    Output : Divisible by 5 and 11
//
/////////////////////////////////////////////////////////////////////
