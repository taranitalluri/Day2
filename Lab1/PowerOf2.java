package DAY2;
import java.util.*;
public class PowerOf2 {
	static boolean isPowerOfTwo(int n){
        if (n == 0)
            return false;
        while (n != 1){
            if (n % 2 != 0)
                return false;
            n = n / 2;
        }
        return true;
    }
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number : ");
		n=sc.nextInt();
		if(isPowerOfTwo(n)) {
			System.out.println(n+" is power of 2");
		}else {
			System.out.println(n+" is not power of 2");
		}
		// TODO Auto-generated method stub

	}

}
