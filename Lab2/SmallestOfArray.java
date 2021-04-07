package DAY2;

import java.util.Scanner;

public class SmallestOfArray {
	public static int getSecondSmallest(int[] a, int n){  
		int temp;  
		for (int i = 0; i < n; i++)   {  
			for (int j = i + 1; j < n; j++)   {  
				if (a[i] > a[j])   {  
		                    temp = a[i];  
		                    a[i] = a[j];  
		                    a[j] = temp;  
		                }  
		            }  
		        }  
		return a[1];  
		}
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array : ");
		n=sc.nextInt();
		System.out.println("enter array elements : ");
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Smallest element in array is "+getSecondSmallest(arr, n));
		
		// TODO Auto-generated method stub

	}

}
