import java.util.Scanner;

public class TimeFutebol {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int vetorA[] = new int[100];
		int vetorB[] = new int[100];
		int i = 0;
		int numeroVitorias = 0;
		int numeroDerrotas = 0;
		int numeroEmpates = 0;
		
		int numero = scan.nextInt();
		
		while(numero != -1) {
			vetorA[i] = numero;
			numero = scan.nextInt();
			i++;
		}
		int j = i;
		i = 0;
		numero = scan.nextInt();
		
		while(numero != -1) {
			vetorB[i] = numero;
			numero = scan.nextInt();
			i++;
		}
		i = 0;
		
		while(i < j) {
			if(vetorA[i] > vetorB[i]) {
				numeroVitorias++;
			}
			if(vetorA[i] < vetorB[i]) {
				numeroDerrotas++;
			}
			if(vetorA[i] == vetorB[i]){
				numeroEmpates++;
			}
			i++;
		}
		
		System.out.printf("%d %d %d", numeroVitorias, numeroEmpates, numeroDerrotas);
	}
}
