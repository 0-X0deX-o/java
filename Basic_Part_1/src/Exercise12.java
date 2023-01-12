/*
 take user input of three numbers and return the average
*/ 

import java.util.Scanner;

public class Exercise12
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("This program takes three numbers from user input and returns the average of the three");
        System.out.print("Enter the first number: ");
        int one = input.nextInt();

        System.out.print("Enter the second number: ");
        int two = input.nextInt();

        System.out.print("Enter the third number: ");
        int three = input.nextInt();
        System.out.println();
        System.out.println("The average of " + one + ", " + two + " and " + three + " = " + ((one + two + three)/(3)));
        System.out.println();
    }
}