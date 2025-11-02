/*
    Algorithm

    START
        Accept number from user as no   
        If the input is negative then convert it to positive 
        Take one counter
        Repeat until counter is less than or equal to no
            If counter is even
            Display counter 
            Increment counter by 1       
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
//  Description      : This class contains a method to print all 
//                     even numbers upto given number
//  Author           : Chakradhar Rawaji Dugade
//  Date             : 02/11/2025
//
/////////////////////////////////////////////////////////////////////

class Logic
{
    public void printEvenNumbers(int iNo)                          // Input
    {
        int iCnt = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }
        for(iCnt = 1; iCnt <= iNo; iCnt++)                         // Business logic
        {
            if(iCnt % 2 == 0)
            {
                System.out.println(iCnt);
            }
        }
    } 
} 

/////////////////////////////////////////////////////////////////////
//
//  Entry point class for the application
//
/////////////////////////////////////////////////////////////////////

class Program18_2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);                       // To accept user input
    
        System.out.print("Enter a number : ");
        int iValue = sc.nextInt();

        Logic obj = new Logic();
        
        obj.printEvenNumbers(iValue);                              // Method call

        sc.close();
    }
}
//  Testcases successfully handled by the application
//
//  Input : 13       Output : 2       4       6       8       10      12
//  Input : 5        Output : 2       4    
//  
/////////////////////////////////////////////////////////////////////
