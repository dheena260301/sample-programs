package test;
import java.util.Scanner;
public class Factorial {
 
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i,f=1;
		int n=s.nextInt();
		
		for(i=1;i<=n;i++) {
		f=f*i;
		}
System.out.print("factorial of the given num is" +f);
	}

}
