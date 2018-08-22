/* Aluno: Joseph Viana Levinthal de Oliveira
 * Matrícula: 21553691
 */

import java.util.Scanner;

public class TanqueCombustivel {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double raio = scan.nextInt();
		double altura = scan.nextInt();
		int opcao = scan.nextInt();

		double volumeDaEsfera = (4.0/3.0) * Math.PI * Math.pow(raio, 3.0);
		double volumeDaCalota = (Math.PI / 3.0) * Math.pow(altura, 2.0) * (3 * raio - altura);
		double volumeDeComb = volumeDaEsfera - volumeDaCalota;
		
		if(opcao == 1){
			System.out.printf("%.4f",volumeDaCalota);
		}
		else {
			System.out.printf("%.4f",volumeDeComb);
		}
		scan.close();
	}	
}
