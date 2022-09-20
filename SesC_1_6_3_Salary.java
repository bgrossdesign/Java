package com.company.CSE110_SesC_Ch1;
// everything in java is an object like in real life: Car, Hairbrush, Scanner
// object classes start with a 'C'apital letter
// You can interact with objects
    // 'C'ar > drive
    // 'B'rush > brush hair
    // 'S'canner > scans
// scanner is an object

import java.util.Scanner;

public class SesC_1_6_3_Salary {
    public static void main (String [] args)
    {
        int wage;

        Scanner scnr = new Scanner(System.in); // keyboard - Scanner is just scanning something
        wage = scnr.nextInt();

        System.out.print("Salary is");
        System.out.println(wage * 40 *50);
    }
}

/*  The syntax for outputting the double myFloat with two digits after the decimal point is
System.out.printf("%.2f", myFloat); */
