import java.util.Scanner;

public class SomaColecoes {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numero = scan.nextInt();
		int soma = 0;
		int a = 1;
		
		while(a == 1) {
			if(numero == -1) {
				System.out.println(soma);
				soma = 0;
				numero = scan.nextInt();
				if(numero == -1) {
					break;
				}
			}
			soma = soma + numero;
			numero = scan.nextInt();
		}
		scan.close();
	}
}
