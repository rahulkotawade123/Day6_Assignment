package Day_6_Assignment;
import java.util.Scanner;
public class RverseNumber_WhileLoop {
/**
 * Reverse Number Enter Input
 */
	  int Digit=0;
    static int rev =0; 
	public void  Reverse() {
	while (Digit != 0);
	Digit = rev%10;
		rev = rev*10 + Digit;
		System.out.println("Reverse Number Enter:"+rev);
	}
    public static void main (String []args) {
	Scanner sc = new Scanner(System.in);
     rev = sc.nextInt();       

    }
}
