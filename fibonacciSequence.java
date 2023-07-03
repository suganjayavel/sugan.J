package javarecall;

public class fibonacciSequence {
	    public static void main(String[] args) {
	        int n1 = 0;
	        int n2 = 1;

	        System.out.println("Fibonacci sequence from 0 to 100:");
	        System.out.print(n1 + " ");

	        while (n2 <= 100) {
	            System.out.print(n2 + " ");

	            int n3 = n1 + n2;
	            n1 = n2;
	            n2 = n3;
	        }
	    }
	}
 