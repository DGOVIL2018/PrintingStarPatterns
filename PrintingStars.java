import java.util.Scanner;

public class PrintingStars {

	public static void main (String[] args) {

	Scanner input = new Scanner(System.in);  //create a variable named input of the Scanner type
	System.out.print("Enter a positive integer n: ");  //prompt user for the size of the star pattern
	int n = input.nextInt();   //assign the user input into the variable named n, which will serve as a parameter in the program
	Stars1(n);  // call the Stars1 function
	Stars2(n);  // call the Stars2 function






}

	public static void Stars1(int n) {   //define the function named Stars1
		int i, j;
		for (i = 1; i <= n; i++) {
		
			for (j = 1; j <= i; j++) {
				System.out.print("*");
				 		 }
			System.out.println();		
		}

}

	public static void Stars2(int n) {   //define the function named Stars2
		System.out.println();
		for (int x = 1; x <= n; x++) {
		for (int k = n; k >= x; k--) {
			System.out.print("*");
					     } 
		
		System.out.println();
					     }

} 

}