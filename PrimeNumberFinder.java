package mywork;
import java.util.Scanner;
public class PrimeNumberFinder {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a number for find prime number:- ");
	int n= sc.nextInt();
	if(n==1) {
		System.out.println("it is not prime number");
		
	}
	if(n==2) {
		System.out.println("it is prime number");
		
	}
	for(int i=2; i<n; i++) {
		
		if(n%i==0) {
			System.out.println("it is not prime number");
			break;
		} 
			else;
				{
				System.out.println("it is prime number");
				break;
			}
	}
			
	}

	

}
