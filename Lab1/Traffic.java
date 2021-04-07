package DAY2;
import java.util.*;
public class Traffic {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your choice\nRED\nYELLOW\nGREEN");
		String choice=sc.nextLine();
		switch(choice) {
		case "RED":
			System.out.println("STOP");
			break;
		case "YELLOW":
			System.out.println("READY");
			break;
		case "GREEN":
			System.out.println("GO");
			break;
		default:
			System.out.println("enter correct choice");
			
		}
		// TODO Auto-generated method stub

	}

}
