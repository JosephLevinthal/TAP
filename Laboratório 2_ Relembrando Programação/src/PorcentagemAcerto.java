import java.util.Scanner;

public class PorcentagemAcerto {
	public static void main(String[] args) {
		
		int vetorNota[] = new int[100];
		int vetorGabarito[] = new int[100];
		
		int i = 0;
		int nElementos = 0;
		int acertos = 0;
		Scanner scan = new Scanner(System.in);
		
		int numeroNota = scan.nextInt();
		
		while(numeroNota != -1) {
			vetorNota[i] = numeroNota;
			i ++;
			numeroNota = scan.nextInt();
		}
		
		nElementos = i;
		i = 0;
		numeroNota = scan.nextInt();
		
		while(numeroNota != -1) {
			vetorGabarito[i] = numeroNota;
			if(vetorNota[i] == vetorGabarito[i]) {
				acertos ++;
				i ++;
				numeroNota = scan.nextInt();
			}
			else {
				i++;
				numeroNota = scan.nextInt();
			}
		}
		System.out.printf("%.2f", (acertos * 100.0) / nElementos);
		scan.close();
	}
}
