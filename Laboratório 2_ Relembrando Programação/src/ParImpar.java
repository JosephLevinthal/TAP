import java.util.Scanner;

public class ParImpar {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int numero = scan.nextInt();
		
		while(numero != -1) {
			if(numero % 2 == 0) {
				System.out.println("PAR");
				numero = scan.nextInt();	
			}
			else {
				System.out.println("IMPAR");
				numero = scan.nextInt();
			}
		}
		scan.close();
	}
}
