package com.company.CSE110_SesC_Ch1;

import java.util.Scanner;

public class SesC_1_6_11d_MultipleUserInputs
{
    public static void main(String [] args)
    {
        Scanner scnr = new Scanner(System.in);

        int birthMonth;
        int birthYear;

        birthMonth = scnr.nextInt();
        birthYear = scnr.nextInt();

        System.out.println(birthMonth + "/" + birthYear);
    }
}