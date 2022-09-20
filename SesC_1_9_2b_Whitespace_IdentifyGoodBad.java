package com.company.CSE110_SesC_Ch1;

import java.util.Scanner;

public class SesC_1_9_2b_Whitespace_IdentifyGoodBad                 // Good use of whitespace
{                                                   // Good
    public static void main(String[] args){         // Good
        Scanner scnr = new Scanner(System.in);      // Good
        int userAge;                                // Good
        int currentDecade;                          // Good
        int    nextDecade;                          // BAD
        int nextMilestone;                          // Good

        System.out.println("Enter your age: ");     // Good
        userAge = scnr.nextInt();                   // Good

        currentDecade=userAge/10;                   // BAD
        nextDecade = currentDecade + 1;             // Good
            nextMilestone = nextDecade * 10;        // Bad
        System.out.println("Next big birthday is at " + nextMilestone); //GOOD
    }
}