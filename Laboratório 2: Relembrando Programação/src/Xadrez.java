import java.util.Scanner;

public class Xadrez {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int numero = scan.nextInt();
		int numero2 = numero;
		int linhas = numero;
		
		while(linhas > 0) {
			while((numero2 > 0) && (linhas > 0)){
				System.out.print("* ");
				numero2 = numero2 -1;
			}
			System.out.println();
			numero2 = numero;
			linhas = linhas-1;
			
			while((numero2 > 0) && (linhas > 0)) {
				System.out.print(" *");
				numero2 = numero2 -1;
			}
			System.out.println();
			numero2 = numero;
			linhas = linhas-1;
		}
		scan.close();
	}
}
