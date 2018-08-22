import java.util.Scanner;

public class IdadeUfam {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int anoTeclado = scan.nextInt();
		scan.close();
		int anoUFAM = anoTeclado - 1909;

		System.out.printf("A UFAM tem %d anos de fundacao", anoUFAM);
	}
}