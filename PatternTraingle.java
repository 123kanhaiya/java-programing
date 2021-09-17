package mywork;

import java.util.Scanner;

public class PatternTraingle {

	public static void main(String[] args) {
	
		//Here a code by which we make Traingle Pattern in java 
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter number how many line you want:- ");
	int n= sc.nextInt();
	System.out.println("");
	for(int i=0; i<n; i++) {
		for(int j=0; j<=i; j++) {
			System.out.print("*");
		}
		System.out.println(" ");
		
	}
	System.out.println(" ");
	System.out.println(" ");
	System.out.println(" ");
	
	for(int k=n; k>0; k-- ) {
		for(int l=0; l<=k-1; l++) {
			System.out.print("*");
		}System.out.println("");
	}
	}

}
