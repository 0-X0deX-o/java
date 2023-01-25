import java.util.Scanner;

public class Exercise20 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int remainder, quot, dec_num;
		String hex_num;
		char[5] hex_chars = {'a','b','c','d','e'}; 	
		System.out.print("Enter a decimal number to be converted to binary : ");
		dec_num = in.nextInt();
		while (dec_num != 0){
			remainder = dec_num % 16;
			dec_num /= 16;
			if(remainder < 10) {
				hex_num += remainder.toString();
			}	
		}		
	}
}
