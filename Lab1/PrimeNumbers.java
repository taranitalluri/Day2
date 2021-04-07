package DAY2;
import java.util.*;
public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 int n,c;
		 System.out.println("Enter the number :");
		 n=sc.nextInt();
		 System.out.println("Prime numbers are :-");    
		 for(int i=2;i<=n;i++){
			 c=0;
		     for(int j=1;j<=i;j++){
		    	 if(i%j==0){
		    		 c++;
		    	 }
		     }
		     if(c==2){
		          System.out.print(i+" ");
		     }
		 }

	}

}
