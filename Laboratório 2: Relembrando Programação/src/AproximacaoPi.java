import java.util.Scanner;

public class AproximacaoPi {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numero = scan.nextInt();
		
		int i = 1;
		double formulaAtual = 3.000000;
		
		System.out.printf("%.6f", formulaAtual);
		System.out.println();
		
		while(i < numero) {
			double denominador = (double) (i*2) * (i*2 + 1) * (i * 2 + 2);
			
			formulaAtual = formulaAtual + Math.pow(-1, i + 1) * (4 / denominador);
			i = i + 1;
			System.out.printf("%.6f", formulaAtual);
			System.out.println();
		}
		scan.close();
		
		
	}
}
