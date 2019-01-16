import java.util.*;
public class Operator {
	public static void main(String args[]) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter two numbers");
	double num1 = scan.nextDouble();
	double num2 = scan.nextDouble();
	System.out.println("enter the operator +,-,*/,%")
	char operator = scan.next().charAt(0);
	switch (operator)
	{
	case '+':
	Double sum = num1 + num2;
	System.out.println("sum is :" +sum);
	break;
	case '-':
	Double diff = num1 - num2;
	System.out.println("Difference is :" +diff);
	break;
	case '*':
	Double mul = num1 * num2;
	System.out.pritln("Multiplication is :" +mul);
	break;
	case '/':
	Double div = num1 / num2;
	System.out.println("Division is :" +div);
	break;
	case '%':
	Double rem = num1 % num2;
	System.out.println("Modulus is :" +rem);
	break;
	default:
	System.out.println("Enter right operator") 
	}
	}
}