package codingpractice;
import java.util.Scanner;
public class Diffrenceoddeven {

	public static void main(String[] args) {
	Scanner sc= new Scanner (System.in);
	int x = sc.nextInt();
	String n=String.valueOf(x);
	int even =0;
	int odd =0;
	for(int i =0 ; i<n.length(); i++) {
		if(i%2==0) {
			even+=(int) (n.charAt(i));
		}   else {
			odd+=(int) n.charAt(i);
		}
	System.out.println(odd-even);		
		
	}

	}

}
