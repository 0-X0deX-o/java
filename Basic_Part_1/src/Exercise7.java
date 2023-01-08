import java.util.Scanner;

public class Exercise7
{
    public static void main(String[] args)
    {
        System.out.println("This program takes an integer from user input and returns a multiplication table from 1 to 10");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = input.nextInt();

        for (int i = 1; i < 11; i++)
        {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}