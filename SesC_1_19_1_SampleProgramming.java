package com.company.CSE110_SesC_Ch1;

import java.util.Scanner;

public class SesC_1_19_1_SampleProgramming
{
    public static void main(String[] args) {
        int wage = 20;

        Scanner scnr = new Scanner(System.in);
        wage = scnr.nextInt();

        System.out.print("Annual pay is ");
        System.out.println(wage * 40 * 50);
    }
}
