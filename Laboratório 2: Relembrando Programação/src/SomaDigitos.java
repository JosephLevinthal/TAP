/* Nome: Joseph Viana Levinthal de Oliveira
 * Matrícula: 21553691
 */

import java.util.Scanner;

public class SomaDigitos {
	public static void main(String[] args) {
		int soma = 0;
		
		Scanner scan = new Scanner(System.in);
		int numero = scan.nextInt();
		while(numero > 0){
			soma = soma + numero % 10;
			numero = numero /10;
		}
		System.out.printf("%d", soma);
	}
}
