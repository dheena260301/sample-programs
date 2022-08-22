package test;

public class Armstrong {

	public static void main(String[] args) {
		
       int num1=153;
       int num2=num1;
       int arm=0;
       
       do {
    	  int rem=num1%10;
    	  arm=arm+(rem*rem*rem);
    	  num1=num1/10;
       }while(num1>0);
    	  if(num2==arm) {
    		  System.out.println("given number is armstrong number");
    	  }else {
    		  System.out.println("not armstrong number");
    	  }
	}
    	  

}
