/*
    Algorithm

    START
        Accept number from user as no
        If the number is negative then convert it to positive
        Take one variable MaxDigit = 0
        Take one counter
        Repeat until number becomes 0
            Extract last digit using remainder operation (digit = no % 10)
            If digit is greater than MaxDigit
                Update MaxDigit = digit
            Divide number by 10 to remove last digit
        End loop
        Display the value of MaxDigit
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
//  Description      : This class contains a method to find the 
//                     largest digit in a given number.
//  Author           : Chakradhar Rawaji Dugade
//  Date             : 02/11/2025
//
/////////////////////////////////////////////////////////////////////

class Logic
{
    public int largestDigit(int iNo)                               // Input
    {
        int iDigit = 0;
        int iMax = 0;

        if(iNo < 0)                                                // Updater
        {
            iNo = -iNo;
        }

        while(iNo != 0)                                            // Loop until number becomes 0
        {
            iDigit = iNo % 10;                                     

            if(iDigit > iMax)                                      
            {
                iMax = iDigit;
            }

            iNo = iNo / 10;                                        
        }

        return iMax;
    }
}

/////////////////////////////////////////////////////////////////////
//
//  Entry point class for the application
//
/////////////////////////////////////////////////////////////////////

class Program20_4
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);                       // To accept user input
        int iValue = 0, iRet = 0;

        System.out.print("Enter a number : ");
        iValue = sc.nextInt();

        Logic obj = new Logic();                                   // Object creation

        iRet = obj.largestDigit(iValue);                           // Method call

        System.out.println("Largest digit in " + iValue + " is " + iRet);

        sc.close();
    }
}

/////////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 12345     Output : Largest digit in 12345 is 5
//  Input : 890       Output : Largest digit in 890 is 9
//  Input : -6572     Output : Largest digit in -6572 is 7
//
/////////////////////////////////////////////////////////////////////
