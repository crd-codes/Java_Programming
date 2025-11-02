/*
    Algorithm

    START
        Accept number from user as no   
        If the input is negative then convert it to positive 
        Store the original number in a temporary variable 
        Take one variable reverse 
        Reverse the number
        Now compare reversed number and original number
        If they both are same
            Diplay Palindrome
        Otherwise
            Display not Palindrome
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
//                     a given number is palindrome or not.
//  Author           : Chakradhar Rawaji Dugade
//  Date             : 02/11/2025
//
/////////////////////////////////////////////////////////////////////

class Logic
{
    public void checkPalindrome(int iNo)                           // Input
    {        
        if(iNo < 0)                                                // Updater
        {
            iNo = -iNo;
        }

        int iTemp = iNo;                                           // To store original number

        int iDigit = 0;
        int iRev = 0;    

        while(iNo != 0)                                             // Business logic
        {
            iDigit = iNo % 10;
            iRev = (iRev * 10) + iDigit;   
            iNo = iNo / 10;
        }
        if(iRev == iTemp)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }     
}

/////////////////////////////////////////////////////////////////////
//
//  Entry point class for the application
//
/////////////////////////////////////////////////////////////////////

class Program17_2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);                       // To accept user input
        int iValue = 0;

        System.out.print("Enter a number : ");
        iValue = sc.nextInt();

        Logic obj = new Logic();                                   // Object creation

        obj.checkPalindrome(iValue);                               // Method call 
        
        sc.close();
    }   
}

/////////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 121     Output : Palindrome
//  Input : 123     Output : Not Palindrome
//  Input : -121    Output : Palindrome
//  Input : 74547   Output : Palindrome
//
/////////////////////////////////////////////////////////////////////
