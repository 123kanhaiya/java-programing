package mywork;
import java.util.Scanner;
public class SimpleIntrest {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("find simple interest here");
		System.out.println("enter principal :-");
		int P=sc.nextInt();
		System.out.println("enter rate :- ");
		int R = sc.nextInt();
		System.out.println("enter total time year:- ");
		int T =sc.nextInt();
		System.out.println("simple intrest of your amount is :-");
		System.out.println((P*R*T)/100);
		

	}

}
