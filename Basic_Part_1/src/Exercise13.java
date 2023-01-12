import java.util.Scanner;

public class Exercise13
{
    public static void main(String[] args)
    {
        System.out.println("This program takes the 'width' and 'height' inputs from the user and returns the area and perimeter of a rectangle.");

        Scanner input = new Scanner(System.in);

        System.out.print("Width: ");
        double w = input.nextDouble();

        System.out.print("Height: ");
        double h = input.nextDouble();

        System.out.println("Width = " + w + " Height = " + h);
        System.out.print(w + ", " + h + '\n');
        System.out.println("Area is " + w + " * " + h + " = " + (w*h));
        System.out.println("Perimeter is 2 * (" + w + " + " + h + ") = " + (2*(w+h)));
    }
}