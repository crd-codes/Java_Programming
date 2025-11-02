/*
    Algorithm

    START
        Accept three numbers from user as no1, no2 and no3   
        Check which is smaller of no1, no2 and no3
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
//  Description      : This class contains a method to find the minimum
//                     among three numbers.
//  Author           : Chakradhar Rawaji Dugade
//  Date             : 02/11/2025
//
/////////////////////////////////////////////////////////////////////

class Logic
{
    public void findMin(int iNo1, int iNo2, int iNo3)              // Input
    {
        if(iNo1 <= iNo2 && iNo1 <= iNo3)
        {
            System.out.println("Minimum is " + iNo1);
        }
        else if(iNo2 <= iNo1 && iNo2 <= iNo3)
        {
            System.out.println("Minimum is " + iNo2);
        }
        else
        {
            System.out.println("Minimum is " + iNo3);
        }
    }
}


/////////////////////////////////////////////////////////////////////
//
//  Entry point class for the application
//
/////////////////////////////////////////////////////////////////////

class Program17_4

{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);                       // To accept user input
    
        System.out.print("Enter three numbers : ");
        int iValue1 = sc.nextInt();
        int iValue2 = sc.nextInt();
        int iValue3 = sc.nextInt();

        Logic obj = new Logic();                                   // Object creation

        obj.findMin(iValue1, iValue2, iValue3);                    // Method call

        sc.close();
    }   
}

/////////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 12 23 4      Output : 4
//  Input : -56 32 44    Output : -56
//
/////////////////////////////////////////////////////////////////////
