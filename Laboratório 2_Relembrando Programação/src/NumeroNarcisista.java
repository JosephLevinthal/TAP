import java.util.Scanner;

public class NumeroNarcisista {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero = scan.nextInt();
		
		int digitos = 0;
		
		while(numero != 0) {
			numero = numero / 10;
			digitos ++;
		}
		
		int numeroSemModificar = numero;
		
		
		int res = 0;
		int div = 0;
		
		while(numero > 0 ) {
			res = numero % 10;
			numero = numero / 10;
			div += Math.pow(res,  digitos);
		}
		
		if(numeroSemModificar == div) {
			System.out.println("SIM");
		}
		else {
			System.out.println("NÃO");
		}
		
		scan.close();
	}
}

