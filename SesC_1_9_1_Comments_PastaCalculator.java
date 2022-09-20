package com.company.CSE110_SesC_Ch1;

/* Lines 3-9 = Multi-line Comment
    This program claculates the amount of pasta to cook,
    given the number of pepole eating.

    Author: Andrea Giada
    Date    May 30, 2017
 */

/*
 * Author: Paula Dean
 * Date: 2012
 * Address: Sourthern Georgia, USA
 */

import java.util.Scanner; /* single line comment */

public class SesC_1_9_1_Comments_PastaCalculator
{
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        int numPeople;          // Number of people that will be eating, Input 2 (Erick & I) + ENTER//
        int totalOuncesPasta;   // Total ounces of pasta to serve numPeople

        // Get number of people
        System.out.println("Enter number of people: ");
        numPeople = scnr.nextInt();

        // Calculate and print total ounces of pasta
        totalOuncesPasta = numPeople * 3;   // Typical ounces per person
        System.out.println("Cook " + totalOuncesPasta + " ounces of pasta.");
    }
}
