/* Aluno: Joseph Viana Levinthal de Oliveira
 * Matrícula: 21553691
 */

import java.util.Scanner;

public class SomaColecao {
	public static void main(String[] args) {
		int total = 0;
		Scanner scan = new Scanner(System.in);
		int numeros = 0;
		
		while (numeros != -1){
				numeros = scan.nextInt();
				total = total + numeros;
			}
		total = total + 1;
		System.out.println(total);
	}
}
