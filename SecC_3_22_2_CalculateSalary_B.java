package com.company.CSE110_SesC_Ch3;
/*

MY CODE
import java.util.Scanner;

public class ShowMarriedNames {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String firstName1;
      String lastName1;
      String firstName2;
      String lastName2;
      String firstNames;
      String lastNames;
      // FIXME: Declare lastName

      System.out.println("What is the first person's first name?");
      firstName1 = scnr.nextLine();
      System.out.println("What is the first person's last name?");
      lastName1  = scnr.nextLine();

      System.out.println("What is the second person's first name?");
      firstName2 = scnr.nextLine();
      System.out.println("What is the second person's last name?");
      lastName2  = scnr.nextLine();

      System.out.println("Here are some common married-couple names:");
      System.out.println(firstName1 + " " + lastName1 + " and " +
                         firstName2 + " " + lastName2);

      firstNames = firstName1 + " and " + firstName2;
      System.out.println(firstNames + " " + lastName1);
      System.out.println(firstNames + " " + lastName2);

      // FIXME: Use lastName variable similarly to firstNames variable
      lastNames = lastName1 + "-" + lastName2;
      System.out.println(firstNames + " " + lastNames);

      lastNames = lastName2 + "-" + lastName1;
      System.out.println(firstNames + " " + lastNames);

      // FIXME: Print two more options that abut the last names
      // SmithJones and JonesSmith
      lastNames = lastName1 + lastName2;
      System.out.println(firstNames + " " + lastNames);

      lastNames = lastName2 + lastName1;
      System.out.println(firstNames + " " + lastNames);
   }
}

//INPUT
Pat
Smith
Kelly
Jones

// Solution
import java.util.Scanner;

public class ShowMarriedNames {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String firstName1;
      String lastName1;
      String firstName2;
      String lastName2;
      String firstNames;
      String lastName;

      System.out.println("What is the first person's first name?");
      firstName1 = scnr.nextLine();
      System.out.println("What is the first person's last name?");
      lastName1  = scnr.nextLine();

      System.out.println("What is the second person's first name?");
      firstName2 = scnr.nextLine();
      System.out.println("What is the second person's last name?");
      lastName2  = scnr.nextLine();

      System.out.println("Here are some common married-couple names:");
      System.out.println(firstName1 + " " + lastName1 + " and " +
                         firstName2 + " " + lastName2);

      firstNames = firstName1 + " and " + firstName2;
      System.out.println(firstNames + " " + lastName1);
      System.out.println(firstNames + " " + lastName2);

      lastName = lastName1 + "-" + lastName2;
      System.out.println(firstNames + " " + lastName);

      lastName = lastName2 + "-" + lastName1;
      System.out.println(firstNames + " " + lastName);

      lastName = lastName1 + lastName2;
      System.out.println(firstNames + " " + lastName);

      lastName = lastName2 + lastName1;
      System.out.println(firstNames + " " + lastName);
   }
}

// OUTPUT
What is the first person's first name?
What is the first person's last name?
What is the second person's first name?
What is the second person's last name?
Here are some common married-couple names:
Pat Smith and Kelly Jones
Pat and Kelly Smith
Pat and Kelly Jones
Pat and Kelly Smith-Jones
Pat and Kelly Jones-Smith
Pat and Kelly SmithJones
Pat and Kelly JonesSmith
 */
public class SecC_3_22_2_CalculateSalary_B {

}
