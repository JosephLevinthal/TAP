import java.util.Scanner;
public class NumeroNeperiano {
	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		int numero = scan.nextInt();
		double numeroNeperiano = 0.0;
		int i = 0;
		
		while(i < numero) {
			numeroNeperiano += 1.0/ (double) fatorial(i);
			i++;
		}
		System.out.printf("%.6f", numeroNeperiano);
		scan.close();
	}
	public static double fatorial(double num) {
		if (num <=1 )  return 1;
		else  return num * fatorial(num - 1);
	}	
}
		
		
		
		