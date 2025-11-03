/*
    Algorithm

    START
        Accept number from user as no
        If the number is negative then convert it to positive
        Take one variable Product = 1
        Take one counter
        Repeat until number becomes 0
            Extract last digit using remainder operation (digit = no % 10)
                If digit is not zero
                Now multiply Product with
            Divide number by 10 to remove last digit
        End loop
        Display the Product
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
//  Description      : This class contains a method to calculate the 
//                     product of digits in a given number.
//  Author           : Chakradhar Rawaji Dugade
//  Date             : 03/11/2025
//
/////////////////////////////////////////////////////////////////////

class Logic
{
    public int productOfDigit(int iNo)                             // Input
    {
        int iDigit = 0;
        int iProduct = 1;

        if(iNo < 0)                                                // Updater
        {
            iNo = -iNo;
        }

        while(iNo != 0)                                            // Loop until number becomes 0
        {
            iDigit = iNo % 10;                                     
            if(iDigit != 0)                                        // To skip Zeros
            {
                iProduct = iProduct * iDigit;
            }   
            iNo = iNo / 10;                                        
        }

        return iProduct;
    }
}

/////////////////////////////////////////////////////////////////////
//
//  Entry point class for the application
//
/////////////////////////////////////////////////////////////////////

class Program21_1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);                       // To accept user input
        int iValue = 0, iRet = 0;

        System.out.print("Enter a number : ");
        iValue = sc.nextInt();

        Logic obj = new Logic();                                   // Object creation

        iRet = obj.productOfDigit(iValue);                         // Method call

        System.out.println("The product of digits in " + iValue + " is " + iRet);

        sc.close();
    }
}

/////////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 234       Output : The product of digits in 234 is 24
//  Input : -6572     Output : The product of digits in -6572 is 420
//  Input : 220       Output : The product of digits in 220 is 4
/////////////////////////////////////////////////////////////////////
