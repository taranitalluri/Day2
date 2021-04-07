package DAY2;
import java.util.*;
public class NumbersDivisibleBy3And5 {
	public static int calculateSum(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(i%3==0||i%5==0) {
				sum+=i;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number : ");
		n=sc.nextInt();
		System.out.println(calculateSum(n));

	}

}
