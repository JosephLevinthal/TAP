import java.util.Scanner;

public class Media {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float numero1 = scan.nextFloat();
		float numero2 = scan.nextFloat();
		float numero3 = scan.nextFloat();
		scan.close();
		
		float media = (numero1 + numero2 + numero3) / 3;
		System.out.printf("%.2f\n", media);
	}
}
