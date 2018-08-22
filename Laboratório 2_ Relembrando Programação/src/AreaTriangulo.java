import java.util.Scanner;

public class AreaTriangulo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int lado1 = scan.nextInt();
		int lado2 = scan.nextInt();
		int lado3 = scan.nextInt();
		scan.close();
		
		float s = (lado1 + lado2 + lado3) / 2;
		float A = (float) Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
		
		if((lado1+lado2)<=lado3 || (lado1+lado3)<=lado2 || (lado2+lado3)<=lado1 ||
	    		  lado1<0 || lado2<0 || lado3<0){
	        System.out.printf("Triangulo invalido");
	        }
		
		else {
			System.out.printf("%.2f", A);
		}
	}
}
