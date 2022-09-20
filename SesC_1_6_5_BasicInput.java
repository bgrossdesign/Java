package com.company.CSE110_SesC_Ch1;

import java.util.Scanner;

public class SesC_1_6_5_BasicInput
{
    public static void main(String[] args)
    {
        int numUsers;

        numUsers = 20;

        Scanner scnr = new Scanner(System.in);
        numUsers = scnr.nextInt();

        System.out.print("Salary is");
        System.out.println(numUsers * 40 *50);
    }
}
