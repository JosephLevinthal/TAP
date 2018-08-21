import java.util.Scanner;

public class OperacoesInteiros {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero = scan.nextInt();
		
		int i;
		int vetor[] = new int[1000];
		
		for(i = 0; true; i++) {
			vetor[i] = numero;
			
			if(numero == -1) {
				System.out.println(vetor.length);
				numero = scan.nextInt();
				if(numero == -1) {
					break;
				}
			}
			
		}
		scan.close();
	}
}
