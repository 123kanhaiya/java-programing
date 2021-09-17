package mywork;
import java.util.Scanner;

public class TwoKaTable {

	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	
	System.out.println("Enter a number which you Want Table:- ");
	int n= sc.nextInt();
	for(int i=1; i<=10; i++) {
		System.out.println(n+" x "+i+" = "+ (n*i));
	}

	}

}
