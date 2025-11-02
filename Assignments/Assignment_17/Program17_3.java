/*
    Algorithm

    START
        Accept two numbers from user as no1 and no2   
        Check which is greater between no1 and no2
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
//  Description      : This class contains a method to find the maximum 
//                     of two numbers.
//  Author           : Chakradhar Rawaji Dugade
//  Date             : 02/11/2025
//
/////////////////////////////////////////////////////////////////////

class Logic
{
    public void findMax(int iNo1, int iNo2)                               // Input
    {
        if(iNo1 > iNo2)
        {
            System.out.println(iNo1);
        }
        else
        {
            System.out.println(iNo2);
        }
    }
}

/////////////////////////////////////////////////////////////////////
//
//  Entry point class for the application
//
/////////////////////////////////////////////////////////////////////

class Program17_3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);                       // To accept user input
    
        System.out.print("Enter first number : ");
        int iValue1 = sc.nextInt();

        System.out.print("Enter second number : ");
        int iValue2 = sc.nextInt();

        Logic obj = new Logic();                                   // Object creation

        obj.findMax(iValue1, iValue2);                             // Method call

        sc.close();
    }   
}

/////////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input1 : 123    Input2 : 245      Output : 245
//  Input1 : 560    Input2 : 212      Output : 560
//  Input1 : -89    Input2 : 21       Output : 21
//
/////////////////////////////////////////////////////////////////////
