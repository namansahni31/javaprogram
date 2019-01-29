import java.util.*;
public class Switch {
	public static void main(String args[]) {
   Scanner scan = new Scanner(System.in);
   System.out.println(" Enter the choice");
   char choice;
   while(choice!=6);
   switch(choice) {
   case 1:
   System.out.println("Enter two numbers for addition");
   int num1 = scan.nextInt();
   int num2 = scan.nextInt();
   int add = num1 + num2;
   System.out.prinln("Addition is :" +add);
   break;
   case 2:
   System.out.println("Enter two numbers for subtraction");
   int num1 = scan.nextInt();
   int num2 = scan.nextInt();
   int sub = num1 - num2;
   System.out.println("Subtraction is :" +sub);
   break;
   case 3:
   System.out.println("Enter two numbers for multiplication");
   int num1 = scan.nextInt();
   int num2 = scan.nextInt();
   int mul = num1 * num2;
   System.out.println("Multiplication is :" +mul);
   break;
   case 4:
   System.out.println("Enter two numbers for Division");
   int num1 = scan.nextInt();
   int num2 = scan.nextInt();
   int div = num1 / num2;
   System.out.println("Division is :" +div);
   break;
   case 5:
   System.out.println("Enter two numbers for Remainder");
   int num1 = scan.nextInt();
   int num2 = scan.nextInt();
   int rem = num1 % num2;
   System.out.println("Modulus is :" +rem);
   break;
   case 6:
   default :
   System.out.println("enter the correct choice");
   }
	}
}