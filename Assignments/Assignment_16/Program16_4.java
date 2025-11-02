/*
    Algorithm

    START
        Accept number from user as no   
        If the input is negative then convert it to positive 
        Take one variable reverse = 0
        Repeat until number becomes 0
            Extract last digit using modulus operator(no % 10)
            Multiply reverse by 10 and add digit to it
            Divide number by 10 to remove last digit
        End loop
        Display reverse
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
//  Description      : This class contains method to reverse a given number.
//  Author           : Chakradhar Rawaji Dugade
//  Date             : 02/11/2025
//
/////////////////////////////////////////////////////////////////////

class Logic
{
    public void reverseNumber(int iNo)                              // Input
    {
        if(iNo < 0)                                                 // Updater
        {
            iNo = -iNo;
        }

        int iDigit = 0;
        int iRev = 0;    

        while(iNo != 0)                                             // Business logic
        {
            iDigit = iNo % 10;
            iRev = (iRev * 10) + iDigit;   
            iNo = iNo / 10;
        }

        System.out.println("Reversed number is: " + iRev);  
    }   // End of reverseNumber
}

/////////////////////////////////////////////////////////////////////
//
//  Entry point class for the application
//
/////////////////////////////////////////////////////////////////////

class Program16_4
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);                        // To accept user input
        int iValue = 0;

        System.out.print("Enter a number : ");
        iValue = sc.nextInt();

        Logic obj = new Logic();                                    // Object creation
        obj.reverseNumber(iValue);                                  // Method call

        sc.close();
    }   // End of main
}

/////////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 1234     Output : Reversed number is: 4321
//  Input : 56       Output : Reversed number is: 65
//  Input : -789     Output : Reversed number is: 987
//  Input : 9        Output : Reversed number is: 9
//
/////////////////////////////////////////////////////////////////////
