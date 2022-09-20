package com.company.CSE110_SesC_Ch1;

import java.util.Scanner;

public class SesC_1_6_11c_OutputTest6
{
    public static void main(String [] args)
    {
        int numMugs; // input 4 + ENTER

        Scanner scnr = new Scanner(System.in);
        numMugs = scnr.nextInt();

        System.out.println("Sam sold " + numMugs + " mugs.");
    }
}
