package test;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int count=input.nextInt();
		int n1=0,n2=1,n3;
		for(int i=1;i<=count;i++) {
			
		
		n3=n1+n2;
		System.out.println(n1);
		
		n1=n2;
		n2=n3;
	}

}
}