/*
    Algorithm

    START
        Accept number from user as no
        If the number is negative then convert it to positive
        Take variable MinDigit = 9
        Take one counter
        Repeat until number becomes 0
            Extract last digit using remainder operation (digit = no % 10)
            If digit is smaller than MinDigit
                Update MinDigit = digit
            Divide number by 10 to remove last digit
        End loop
        Display the value of MinDigit
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
//                     smallest digit in a given number.
//  Author           : Chakradhar Rawaji Dugade
//  Date             : 02/11/2025
//
/////////////////////////////////////////////////////////////////////

class Logic
{
    public int smallestDigit(int iNo)                              // Input
    {
        int iDigit = 0;
        int iMin = 9;

        if(iNo < 0)                                                // Updater
        {
            iNo = -iNo;
        }

        if(iNo == 0)                                               // Edge case
        {
            return 0;
        }

        while(iNo != 0)                                            // Loop until number becomes 0
        {
            iDigit = iNo % 10;                                     

            if(iDigit < iMin)                                      
            {
                iMin = iDigit;
                
                if(iMin == 0)                                      // Optimization
                {
                    break;
                }
            }

            iNo = iNo / 10;                                        
        }

        return iMin;
    }
}

/////////////////////////////////////////////////////////////////////
//
//  Entry point class for the application
//
/////////////////////////////////////////////////////////////////////

class Program20_5
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);                       // To accept user input
        int iValue = 0, iRet = 0;

        System.out.print("Enter a number : ");
        iValue = sc.nextInt();

        Logic obj = new Logic();                                   // Object creation

        iRet = obj.smallestDigit(iValue);                          // Method call

        System.out.println("Smallest digit in " + iValue + " is " + iRet);

        sc.close();
    }
}

/////////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 12345     Output : Smallest digit in 12345 is 1
//  Input : 890       Output : Smallest digit in 890 is 0
//  Input : -6572     Output : Smallest digit in -6572 is 2
//  Input : 0         Output : Smallest digit in 0 is 0
//
/////////////////////////////////////////////////////////////////////
