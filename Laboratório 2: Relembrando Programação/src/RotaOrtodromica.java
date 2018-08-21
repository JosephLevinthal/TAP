/* Aluno: Joseph Viana Levinthal de Oliveira
 * Matrícula: 21553691
 */

import java.util.Scanner;

public class RotaOrtodromica {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int R = 6371;
		
		double t1 = scan.nextDouble();
		double g1 = scan.nextDouble();
		double t2 = scan.nextDouble();
		double g2 = scan.nextDouble();
		
		t1 = Math.toRadians(t1);
		t2 = Math.toRadians(t2);
		g1 = Math.toRadians(g1);
		g2 = Math.toRadians(g2);
						
		double arcosseno = Math.acos((Math.sin(t1) * Math.sin(t2)) + (Math.cos(t1) * Math.cos(t2) * Math.cos(g1 - g2)));
		double d = R * arcosseno;
		
		t1 = Math.toDegrees(t1);
		g1 = Math.toDegrees(g1);
		t2 = Math.toDegrees(t2);
		g2 = Math.toDegrees(g2);
		
		System.out.printf("A distancia entre os pontos (%.6f, %.6f) e (%.6f, %.6f) e de %.2f km", t1,g1,t2,g2,d);
	}
}
