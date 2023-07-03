package javarecall;

public class oddNumbers {

	public static void main(String[] args) {
		int a=100;
		int b=200;
		
		  System.out.println("Odd numbers between " + a + " to " + b + ":");

	    for(int i=a; i<=b; i++) {
			if(i % 2 !=0) {
				System.out.println(i);
			}
		}

	}

}
