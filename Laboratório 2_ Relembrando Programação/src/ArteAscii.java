import java.util.Scanner;

public class ArteAscii {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int numero = scan.nextInt();
		int numero2 = numero;
		int numero3 = numero;
		int linhas = numero;
		
		while(linhas > 0) {
			while(numero2 > 0) {
			System.out.print("*");
			numero2 = numero2 -1;
			}
			
			linhas = linhas - 1;
			numero3 = numero3 -1;
			numero2 = numero3;
			System.out.println();
		}
		
		linhas = numero;
		numero3 = 1;
		while(linhas > 0) {
			while(numero2 < numero3) {
				System.out.print("*");
				numero2 = numero2 +1;
			}
			
			linhas = linhas -1;
			numero3 = numero3 + 1;
			numero2 = 0;
			System.out.println();	
		}
		scan.close();
	}
}