import java.util.*;
public class Minutes {
	public static void main(String args[]) {
	System.out.println("Enter the minutes to be converted");
	Scanner scan =new Scanner(System.in);
	int minutes = scan.nextInt();
	int years=minutes/365;
	int months=minutes/30;
	int days=minutes/7;
	System.out.println("Years=" +years);
	System.out.println("Months=" +months);
	System.out.println("Days=" +days);
	}
}