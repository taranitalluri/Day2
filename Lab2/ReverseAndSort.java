package DAY2;
import java.util.*;
public class ReverseAndSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the elements of array:");
		for(int i =0; i < n; i++) {
		a[i] = sc.nextInt();
		}
		ReverseAndSort obj = new ReverseAndSort();
		int[] arr = obj.getSorted(a, n);
		for(int data:arr) {
		System.out.println(data);
		}
		}
		public int[] getSorted(int[] a, int n) {
		int k =0;
		if(n % 2 == 0) {
		k = (n/2)-1;
		}
		else {
		k = n/2;
		}
		for(int i=0;i<n;i++) {
			a[i]=reverse(a[i]);
		}
		int temp =0;
		for(int i =0; i <= k; i++) {
		temp = a[i];
		a[i] = a[n-i-1];
		a[n-i-1] = temp;
		}
		for(int i =0; i < n ;i++) {
		for(int j =0; j < n; j++) {
		if(a[i] <a[j]) {
		temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		}
		}
		}
		return a;
		}
		public static int reverse(int num) {
			int  reversed = 0;

		    while(num != 0) {
		    
		      int digit = num % 10;
		        reversed = reversed * 10 + digit;
		        num /= 10;
		    }
		    return reversed;
		}
}



