import java.util.*;
class Vowel {
	public static void main(String args[]) {
	char ch;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter any character");
	ch = scan.next().charAt(0);
	if(ch=='A' || ch=='a' || ch=='E' || ch=='e' || ch=='I' || ch=='i' || ch=='O' || ch=='o' || ch=='U' || ch=='u')
	{
	System.out.println("Vowel");
	}
	else
	{
	System.out.println("Not Vowel");
	}
	}
}