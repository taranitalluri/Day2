package DAY2;
import java.util.*;
public class IncreasingOrder {
	public static boolean increasingOrderOfDigits(int num) {
		boolean flag=false;
		int currentDigit = num % 10;
	       num = num/10;
	       while(num>0){
	           if(currentDigit <= num % 10){
	               flag = true;
	               break;
	           }
	           currentDigit = num % 10;
	           num = num/10;
	       }
	       return flag;
	}

	public static void main(String[] args) {
		int num;
	       Scanner sc = new Scanner(System.in);
	       System.out.println("Enter a number : ");
	       num = sc.nextInt();
	       if(increasingOrderOfDigits(num)){
	           System.out.println("Digits are not in increasing order.");
	       }else{
	           System.out.println("Digits are in increasing order.");
	       }

	}

}
