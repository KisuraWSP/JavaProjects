//This program takes two Inputs and returns the Sum
import java.util.Scanner;

public class SumAB {
	public static int Sum(int a , int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("enter number 1:");
		int num1 = s.nextInt();
		System.out.print("enter number 2:");
		int num2 = s.nextInt();
		
		System.out.println(num1+"+"+num2+"="+Sum(num1,num2));
	}

}
