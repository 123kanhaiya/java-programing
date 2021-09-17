package mywork;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your first number:- ");
	int n =sc.nextInt();
	System.out.println("Enter your operation:- ");
	char o= sc.next().charAt(0);
	System.out.println("Enter your Second number:- ");
	int m =sc.nextInt();
	
	if(o=='+') {
		System.out.println("ans:- "+(n+m));
	}
	if(o=='-') {
		System.out.println("ans:- "+(n-m));
	}
	if(o=='*') {
		System.out.println("ans:- "+(n*m));
	}
	if(o=='/') {
		System.out.println("ans:- "+(n/m));
	}
	}

}
