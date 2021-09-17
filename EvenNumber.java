package mywork;
import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
	
	//In code we find even number from 0 to 100
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your number to find Even number upto that:- ");
	int n= sc.nextInt();
	for( int i=0; i<=n; i++) {
		if(i % 2==0) {
			System.out.print(i+" ");
			
		}
		
	}
	}

}
