import java.util.Scanner;

public class Calculation {
     public static void main (String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("put the 5 digit no. =");
	int n = sc.nextInt();

	int f = n / 10000;

	int s = n % 100;
	int nn = s / 10;

	System.out.println("Output = " + (f + nn));


}}
