import java.util.Scanner;
import java.lang.Math;

public class Compound {
     public static void main (String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("Put the Principal amount = ");
	double p = sc.nextDouble();
	
	System.out.println("Put the intrest rate = ");
	double i = sc.nextDouble();

	System.out.println("Put the time period = ");
	double t = sc.nextDouble();

	double x = p*(Math.pow( 1+i/100, t));
	System.out.println("output = " + x);


}}