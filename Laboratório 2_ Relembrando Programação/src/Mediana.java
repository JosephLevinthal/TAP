import java.util.Scanner;

public class Mediana {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numero = scan.nextInt();
		int vetor[] = new int[100];
		int numeroElementos = 0;
		float mediana;
		
		while(numero != -1) {
			vetor[numeroElementos] = numero;
			numeroElementos++;
			numero = scan.nextInt();
		}	
		
	//meio par
		if((int)(numeroElementos) % 2 == 0) {
			mediana = (vetor[(numeroElementos/2) - 1]) + (vetor[(numeroElementos/2)]);
			mediana = mediana / 2;
		}
	//meio impar
		else {
			mediana = vetor[numeroElementos / 2];
		}
		System.out.printf("%.1f", mediana);
		
		scan.close();
	}
}
