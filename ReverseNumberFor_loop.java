package Day_6_Assignment;

public class ReverseNumberFor_loop {

		// java program to print the element of an array in reverse order
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			int a[] = new int[] {1,2,3,4,5};
			    System.out.println("original array:");
			
			for (int i=0; i<a.length; i++) {
			    System.out.println(a[i]+"");
			}
			  System.out.println();
			    System.out.println("Array in reverse order:");
			
			for (int i=a.length-1;i>=0;i--) {
				System.out.println(a[i]+"");
			}
		}
	}
	


