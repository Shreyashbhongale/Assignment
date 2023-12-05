import java.util.Scanner;
import java.lang.Math;

public class Trianglee {
     public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("put the value of 1st side =");
	double x = sc.nextDouble();

	System.out.println("put the value of 2nd side =");
	double y = sc.nextDouble();

	double h = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
	System.out.println("Lenth of hypotenuse =" + h);

	}}