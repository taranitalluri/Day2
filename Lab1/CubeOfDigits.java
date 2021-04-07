package DAY2;

import java.util.Scanner;
public class CubeOfDigits {
	public static int sumOfCubeOfDigits(int number) {
		int sum=0;
		while (number != 0)
        {
            int remainder = number % 10;
            sum += Math.pow(remainder, 3);
            number /= 10;
        }
        return sum;
	}
	public static void main(String[] args) {
		int number, originalNumber, remainder, sum = 0;
		System.out.println("enter number : ");
		Scanner sc=new Scanner(System.in);
		number=sc.nextInt();
        System.out.println("sum of cubes of digits : "+sumOfCubeOfDigits(number));
	}

}
