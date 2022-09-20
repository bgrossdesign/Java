package com.company.CSE110_SesC_Ch1;

import java.util.Scanner;

public class SesC_1_6_4_BasicInput_Identify_Variables
{
        public static void main(String[] args)
        {
            int numCars;
            // Identifying Variables: numCars & wage for variables
            // in this scenario wage is better

            Scanner scnr = new Scanner(System.in);
            numCars = scnr.nextInt();

            System.out.print("Salary is");
            System.out.println(numCars * 40 *50);
        }
}
