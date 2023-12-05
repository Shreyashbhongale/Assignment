import java.util.Scanner;
import java.lang.Math;

public class Calculator {
     public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("put the value of 1st No =");
	double x = sc.nextInt();

	System.out.println("put the value of 2nd No =");
	double y = sc.nextInt();

	System.out.println("put the operator (+ , - , * , /): ");
	char o = sc.next().charAt(0);

	double r = 0;	

	if(o == '+') {
		r = x + y;
	} else if ( o == '-') {
		r = x - y;
	} else if ( o == '*') {
		r = x * y;
	} else if ( o == '/') {
		r = x / y;
	} 
		System.out.println("Result = " + r);
	

}}

	