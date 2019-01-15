import java.util.*;   // so that we can use Scanner

public class ScannerAddNumbers {
    public static void main(String[] args) {
       Scanner consoleInput = new Scanner(System.in);
       System.out.print("Please type two numbers: ");
        int num1 = consoleInput.nextInt();
        int num2 = consoleInput.nextInt();
        int add = num1 + num2;
        System.out.println("The addition is " + add);
    }}
