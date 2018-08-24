import java.util.Scanner;

public class VolumeCombustivel {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int r = scan.nextInt();
		int nC = scan.nextInt();
		
		if(nC < 0 || h < 0 || r < 0) {
			double volumeTotal = -1.000;
			System.out.println(volumeTotal);
		}
		else {
			if(r > nC) {
				double volumeTotal = (1.0/3.0) * Math.PI * Math.pow(nC, 2) * (3*r-nC);
				System.out.printf("%.3f", volumeTotal);
				}
			else {
				if(h - r > nC) {
					double volumeTotal = (2.0/3.0) * Math.PI * Math.pow(r, 3) + Math.PI * Math.pow(r, 2) * (nC - r);
					System.out.printf("%.3f", volumeTotal);
					}
				else {
					if(nC <= h) {
						double volumeTotal = (4.0/3.0) * Math.PI * Math.pow(r, 3) + Math.PI * Math.pow(r, 2) * (h - 2*r) - (1.0/3.0) * Math.PI * Math.pow((h - nC), 2) * (3 * r - h + nC);
						System.out.printf("%.3f", volumeTotal);
						}
					}	
				}
			}
		scan.close();
		}
	}
