package mywork;
import java.util.Scanner;

public class ConditionStatements {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		
		System.out.println("enter the value of x :-");
		
		int x = sc.nextInt();
		
		System.out.println("enter the value of y :-");
		
		int y = sc.nextInt();
		
		if(x<y) {
			System.out.println("x is less than y");
			
		}if(x>y) {
			System.out.println("x is grater than y");
		}else {
			System.out.println("x is equal to y");
		}

	}

}
