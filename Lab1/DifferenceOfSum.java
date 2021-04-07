package DAY2;
import java.util.*;
public class DifferenceOfSum {
	public static int calculateDifference(int n) {
		int s1, s2;
		s1=n*(n+1)/2;
		s2=n*(n+1)*((2*n)+1)/6;
		int d=s2-s1;
		return d;
	}
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number : ");
		n=sc.nextInt();
		System.out.println(calculateDifference(n));
		// TODO Auto-generated method stub

	}

}
