import java.util.Scanner;

public class ValorExpoente {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numero = scan.nextInt();
		int expoente = 1;
		int soma = 2;
		
		while(soma <= numero) {
			soma = soma + (int) Math.pow(2, expoente + 1);
			expoente = expoente + 1;
		}
		System.out.println(expoente);
		scan.close();
	}
}
