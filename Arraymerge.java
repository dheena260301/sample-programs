package test;

public class Arraymerge {

	public static void main(String[] args) {
		 int []a= {1,2,3,4,5};
		 int []b= {6,7,-8,-9,19};
		 int len=a.length+b.length;
		 int []c=new int[len];
		 
		 for(int i=0;i<a.length;i++) {
			 c[i]=a[i];
		 }
			 int j=0;
			 for(int i=a.length;i<c.length;i++) {
				 c[i]=b[j];
				 j++;
			 }
			 for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		 }

	}

}
