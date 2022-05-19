package Day_6_Assignment;
import java.util.Scanner;
public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int n =sc.nextInt();
		if(prime(n)) {
			System.out.println(n+" is prime number");
		}else {
			System.out.println(n+" is not prime number");
		}
	}
			public static boolean prime(int n) {
				if(n<=1) {
					return false;
				}
				for (int i=2;i<Math.sqrt(n);i++) {
						int n1 = 0;
						if(n1%i==0) {
							return false;
						}
					}
					return true;
				}		
	}


