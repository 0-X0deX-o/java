import java.util.Random;

public class RandomFun
{
    public static void main(String[] args)
    {
        Random random = new Random();
        int myRandomNumber;

        myRandomNumber = random.nextInt();
        System.out.println("number is:\t" + myRandomNumber);

        myRandomNumber = random.nextInt(1000);
        System.out.println("0 through 999?\t" + myRandomNumber);

        //Shifting
        myRandomNumber = random.nextInt(1001);
        System.out.println("1 through 1000?\t" + myRandomNumber);
    }
}