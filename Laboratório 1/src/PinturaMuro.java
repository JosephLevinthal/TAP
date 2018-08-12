import java.util.Scanner;

public class PinturaMuro {
	
	public static void main(String[] args) {
		float preco = 36.0f;
		Scanner scan = new Scanner(System.in);
		float pintura = scan.nextFloat();
		
		double total = ((pintura * preco) + 100.0f);	
		System.out.printf("%.1f\n", total);
	}
}
