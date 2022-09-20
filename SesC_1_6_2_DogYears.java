package com.company.CSE110_SesC_Ch1;

import java.util.Scanner;

public class SesC_1_6_2_DogYears
{
    public static void main(String [] args)
    {
        Scanner scnr = new Scanner(System.in);
        int dogYears;
        int humanYears;

        System.out.println("How many human years has your dog been alive?");

        dogYears = scnr.nextInt();
        // 'scnr.nextInt()' retrieve input form user
        // (Compile, type age after question, + ENTER, your answer is generated!
        // example: 9
        // example answer/output: A 9 year old dog is about the same age as a 63 year old  human.
        humanYears = 7 * dogYears;

        System.out.print("A ");
        System.out.print(dogYears);
        System.out.print(" year old dog is about the same age as a ");
        System.out.print(humanYears);
        System.out.println(" year old  human.");
    }
}
