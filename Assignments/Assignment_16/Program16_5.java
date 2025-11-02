/*
    Algorithm

    START
        Accept number from user as no   
        If the input is negative then convert it to positive 
        Take counter
        Repeat until number becomes 0
            Divide number by 10
            Increment counter by 1
        End loop
        Display counter as the total number of digits
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
//  Description      : This class contains a method to count the total number 
//                     of digits present in a given integer.
//  Author           : Chakradhar Rawaji Dugade
//  Date             : 02/11/2025
//
/////////////////////////////////////////////////////////////////////

class Logic
{
    public void countDigits(int iNo)                               // Input
    {
        if(iNo < 0)                                                // Updater
        {
            iNo = -iNo;
        }

        int iCnt = 0;

        if(iNo == 0)
        {
            iCnt = 1;
        }
        else
        {
            while(iNo != 0)                                        // Business logic
            {
                iNo = iNo / 10;
                iCnt++;
            }
        }
        System.out.println("Number of digits are: " + iCnt);
    }
    
      
}

/////////////////////////////////////////////////////////////////////
//
//  Entry point class for the application
//
/////////////////////////////////////////////////////////////////////

class Program16_5
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);                       // To accept user input
        int iValue = 0;

        System.out.print("Enter a number : ");
        iValue = sc.nextInt();

        Logic obj = new Logic();                                   // Object creation
        obj.countDigits(iValue);                                   // Method call

        sc.close();
    }   // End of main
}

/////////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 1234     Output : Number of digits are: 4
//  Input : 560      Output : Number of digits are: 3
//  Input : -89      Output : Number of digits are: 2
//  Input : 0        Output : Number of digits are: 1
//
/////////////////////////////////////////////////////////////////////
