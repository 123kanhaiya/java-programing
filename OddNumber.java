package mywork;
import java.util.Scanner;

public class OddNumber {

	public static void main(String[] args) {
		
		// Here we find Odd Number using code
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your number to find Even number upto that:- ");
	int n= sc.nextInt();	
	for(int i=0; i<=n; i++) {
		if(i%2!=0) {
			System.out.print(i+" ");
		}
			
	}

	}

}
