import java.util.Scanner;

public class FaltasTrabalho {
	public static void main(String[] args) {
		
		int vetorFaltas[] = new int[100];
		Scanner scan = new Scanner(System.in);
		
		int numero = scan.nextInt();
		int i = 0;
		int faltasSegunda = 0;
		int faltasTerca = 0;
		int faltasQuarta = 0;
		int faltasQuinta = 0;
		int faltasSexta = 0;
		int faltasSabado = 0;
		
		while(numero != -1) {
			vetorFaltas[i] = numero;
			if(numero == 2) {
				faltasSegunda++;
			}
			if(numero == 3) {
				faltasTerca++;
			}
			if(numero == 4) {
				faltasQuarta++;
			}
			if(numero == 5) {
				faltasQuinta++;
			}
			if(numero == 6) {
				faltasSexta++;
			}
			if(numero == 7) {
				faltasSabado++;
			}
			numero = scan.nextInt();
			i++;
				}
			System.out.printf("%.1f", (float)(faltasSegunda * 100)/ i);
			System.out.printf(" %.1f", (float)(faltasTerca * 100)/ i);
			System.out.printf(" %.1f", (float)(faltasQuarta * 100)/ i);
			System.out.printf(" %.1f", (float)(faltasQuinta * 100)/ i);
			System.out.printf(" %.1f", (float)(faltasSexta * 100)/ i);
			System.out.printf(" %.1f", (float)(faltasSabado * 100)/ i);
			
			scan.close();
		}
	}
