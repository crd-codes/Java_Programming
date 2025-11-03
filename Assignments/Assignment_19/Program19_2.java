/*
    Algorithm

    START
        Accept marks from user as input
        If marks between 90 and 100
            Display grade  A
        Else if marks between 80 and 89
            Display grade  B
        Else if marks between 70 and 79
            Display grade  C
        Else if marks between 31 and 60
            Display grade  D
        Else if marks between 1 and 30
            Display Fail
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
//  Description      : This class contains a method to display the grade 
//                     of a student based on their marks.
//  Author           : Chakradhar Rawaji Dugade
//  Date             : 02/11/2025
//
/////////////////////////////////////////////////////////////////////

class Logic
{
    public void displayGrade(int iMarks)                           // Input
    {
        if(iMarks < 0 || iMarks > 100)
        {
            System.out.println("Invalid Marks, Please enter marks between 0 to 100.");
            return;
        }

        if(iMarks >= 90 && iMarks <= 100)                          // Business logic
        {
            System.out.println("Grade: A");
        }
        else if(iMarks >= 80 && iMarks <= 89)
        {
            System.out.println("Grade: B");
        }
        else if(iMarks >= 30 && iMarks <= 79)
        {
            System.out.println("Grade: C");
        }
        else if(iMarks >= 1 && iMarks < 30)
        {
            System.out.println("FAIL");
        }
        
    }   
}

/////////////////////////////////////////////////////////////////////
//
//  Entry point class for the application
//
/////////////////////////////////////////////////////////////////////

class Program19_2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);                       // To accept user input
        int iValue = 0;

        System.out.print("Enter student marks (0-100): ");
        iValue = sc.nextInt();

        Logic obj = new Logic();                                   // Object creation
        obj.displayGrade(iValue);                                  // Method call

        sc.close();
    }   
}

/////////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 95     Output : Grade: A
//  Input : 85     Output : Grade: B
//  Input : 75     Output : Grade: C
//  Input : 65     Output : Grade: C
//  Input : 22     Output : FAIL
//  Input : 105    Output : Invalid Marks! Please enter marks between 0 to 100.
//
/////////////////////////////////////////////////////////////////////
