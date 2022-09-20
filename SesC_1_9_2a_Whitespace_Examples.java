package com.company.CSE110_SesC_Ch1;

import java.util.Scanner;

/*  GOOD USE OF WHITESPACE  */

public class SesC_1_9_2a_Whitespace_Examples {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int myFirstVar;     // Aligned comments yield less
        int yetAnotherVar;  // visual clutter
        int thirdVar;

        // Above blank line separtes variable declarations from the rest
        System.out.print("Enter a number: ");
        myFirstVar = scnr.nextInt();

        // Above the blank line separtes user input statements from the rest
        yetAnotherVar   = myFirstVar;         // Aligned = operators
        thirdVar        = yetAnotherVar + 1;
        // Also notice the single-space on left and rifht of + and =
        // (except when aligning the seconf = with the first =)

        System.out.println("Final value is " + thirdVar);
        // Single-space on each side of +
    }
}

/*  BAD US OF WHITEPSACE    */
/*import  java.util.Scanner;
* public static void main(String[] args) {
* Scanner scnr = new Scanner(System.in);int numPeople;int totalOuncesPasta;
* System.out.println("Enter number of people:");
* numPeople = scnr.nextInt(); totalOuncesPasta = numPeople * 3;
* System.out.println("Cook "+totalOuncesPasta+" ounces of pasta.");}}
* */
