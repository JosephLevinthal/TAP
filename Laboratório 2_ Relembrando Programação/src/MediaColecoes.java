import java.util.Scanner;

public class MediaColecoes {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numero = scan.nextInt();
		double numeroDouble = (double)numero;
		double soma = 0.0;
		int a = 1;
		double n = 0.0;
		double media = (soma / n);
		
		while(a == 1) {
			if(numero == -1) {
				media = (soma / n);
				//System.out.println(soma);
				System.out.printf("%.2f", media);
				System.out.println();
				soma = 0.0;
				n = 0;
				numero = scan.nextInt();
				
				if(numero == -1) {
					break;
				}
			}
			//numero diferente de -1
			numeroDouble = (double)numero;
			soma = (soma + numeroDouble);
			n = n + 1.0;
			numero = scan.nextInt();
		}
		scan.close();
	}
}
