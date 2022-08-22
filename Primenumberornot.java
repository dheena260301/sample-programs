package test;

import java.util.Scanner;

public class Primenumberornot {

	public static void main(String[] args) {
		Scanner num=new Scanner(System.in);
	System.out.println("enter the value");
		int n=num.nextInt();
		boolean prime=true;
		for(int i=2;i<n;i++){
			if(n%i==0) {
				
				prime=false;
				break;
			}
		}
			if(prime) {
				System.out.println("it is prime");
			}else {
				System.out.println("not a prime");
			}
			}
		}
	

