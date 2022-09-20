package com.company.CSE110_SesC_Ch1;

public class SesC_1_6_9_VariableOutput_TwoStatements
{
    public static void main(String[] args)
    {
        int numUsers;

        numUsers = 100;

        System.out.println("What is the number of users?");
            System.out.print(numUsers);     //OptionA
            System.out.println(numUsers);   //OptionB
        System.out.print("Thankyou, goodbye!");
    }
}
