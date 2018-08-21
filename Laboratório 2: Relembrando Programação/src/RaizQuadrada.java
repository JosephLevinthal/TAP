import java.util.Scanner;

public class RaizQuadrada {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero = scan.nextInt();
		scan.close();
		
		System.out.printf("%.4f\n", Math.sqrt(numero));
	}
}
