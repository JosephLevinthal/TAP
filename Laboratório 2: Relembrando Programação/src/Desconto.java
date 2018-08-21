/* Aluno: Joseph Viana Levinthal de Oliveira
 * Matrícula: 21553691
 */

import java.util.Scanner;

public class Desconto {
	public static void main(String[] args) {
		float precofinal = 0;
		Scanner scan = new Scanner(System.in);
		float preco = scan.nextFloat();
		
		if(preco < 200){
			System.out.printf("%.2f", preco);
		}
		else {
			float precoDesconto = (preco * 5) / 100;
			precofinal = preco - precoDesconto;
			System.out.printf("%.2f", precofinal);
		}	
	}
}
