import java.util.Scanner;

public class Exponent {
    public static void main(String[] args)
    {
        int base, expNum = userInput();
        int product = exp(base, expNum);
        System.out.println("The product of " + base + " raised to the " + expNum + " power is " + product); 
    }

    public static int exp(int base, int expon)
    {
        int product =  base;
        for (int i = 1; i < expon; i++)
        {
            product *= base;
        }
        return product;
    }

    public static void userInput()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number as a base to the exponent: ");
        int base = input.nextInt();

        System.out.print("Enter a number as the exponent to the base number: ");
        int expNum = input.nextInt();

        return base, expNum;    
    }
}