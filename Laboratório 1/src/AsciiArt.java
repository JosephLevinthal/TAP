import java.util.Scanner;

public class AsciiArt {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int emBranco = 0;
		
		scan.close();

		for(int numeroDeLinhas = 0; numeroDeLinhas <number; numeroDeLinhas++) {
			
			for(int i = 0; i<number-numeroDeLinhas; i++) {
				System.out.print("*");	
			}
			for(int i=0; i<emBranco; i++){
				System.out.print(" ");
			}
			for(int i=0; i<number-numeroDeLinhas; i++) {
				System.out.print("*");
			}
			System.out.println("");
			emBranco = emBranco + 2;
		}
	}
}
