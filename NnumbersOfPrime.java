package test;

import java.util.Scanner;

public class NnumbersOfPrime {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the num");
		int n = input.nextInt();
		for(int i=2;i<n;i++) {
			boolean prime=true;
		
		
		for(int j=2;j<i;j++){
			if(i%j==0) {
				
				prime=false;
				break;
			}
		}
		
			if(prime) {
				System.out.println(i+"it is prime");
			}
		}
	}
			}
