package DAY2;

import java.util.Scanner;

public class Fibonacci {
	public static void fibonacciIterative(int n) {
		int n1=0, n2=1, n3; 
		System.out.print(n1+" "+n2+" ");
		for(int i=2;i<n;++i)    
		 {    
		  n3=n1+n2;    
		  System.out.print(n3+" ");  
		  n1=n2;    
		  n2=n3;    
		 }
	}
	public static int fibonacciRecursion(int n){
		if(n == 0){
			return 0;
		}
		if(n == 1 || n == 2){
				return 1;
		}
		return fibonacciRecursion(n-2) + fibonacciRecursion(n-1);
	}
	public static void main(String[] args) {
		int n;
		System.out.println("enter number : ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.print("Iterative : ");
		fibonacciIterative(n);
		System.out.print("\nRecursive : ");
		for(int i=0;i<n;i++) {
			System.out.print(fibonacciRecursion(i)+" ");
		}
		
		// TODO Auto-generated method stub

	}

}
