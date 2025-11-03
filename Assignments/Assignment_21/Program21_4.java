/*
    Algorithm

    START
        Accept number from user as no
        If no is negative convert it to positive
        Take one variable factcount
        Take a counter Cnt 
        Repeat till cnt is less than or equal to no
            If remainder of no % cnt is equal to 0
                Increment factcount
            Increment cnt by 1    
        End loop
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
//  Description      : This class contains a method to display all factors 
//                     of given number.
//  Author           : Chakradhar Rawaji Dugade
//  Date             : 03/11/2025
//
/////////////////////////////////////////////////////////////////////

class Logic
{
    public int countFactors(int iNo)
    {
        int iCnt = 0;
        int iFactCount = 0;

        if(iNo < 0)                                                 // Updater
        {
            iNo = -iNo;
        }

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                iFactCount++;
            }   
        }
        return iFactCount;
    }
}

/////////////////////////////////////////////////////////////////////
//
//  Entry point class for the application
//
/////////////////////////////////////////////////////////////////////

class Program21_4
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);                        // User input
        int iValue = 0, iRet = 0;

        System.out.println("Enter the value : ");
        iValue = sc.nextInt();                                      // User input

        Logic obj = new Logic();                                    // Object creation

        iRet = obj.countFactors(iValue);                            // Method call

        System.out.println("Total numbers of factors of " +iValue+ " is " + iRet);
        sc.close();
    }
}

/////////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input  : 36       Output  : Total numbers of factors of 36 is 9
//  Input  : 16       Output  : Total numbers of factors of 16 is 5
//  
/////////////////////////////////////////////////////////////////////
