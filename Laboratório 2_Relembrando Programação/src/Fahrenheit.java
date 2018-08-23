import java.util.Scanner;

public class Fahrenheit {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero = scan.nextInt();
		scan.close();
		
		float fahrenheit = ((float)numero * 9 / 5) + 32;
		System.out.printf("%.1f", fahrenheit);
	}
}
