import java.util.Scanner;

public class VolumeCombustivel {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int H = scan.nextInt();
		int h = scan.nextInt();
		int r = scan.nextInt();
		
		if(H < 0 || h < 0 || r < 0) {
			double volumeTotal = -1.000;
			System.out.println(volumeTotal);
		}
		else {
			if(h < r) {
				double volumeTotal = (((1/3) * Math.PI * Math.pow(h, 2)) * (3 * r - h));
				System.out.printf("%.3f", volumeTotal);
				}
			else {
				if(h < H - r) {
					double volumeTotal = (2/3) * Math.PI * Math.pow(r, 3) + Math.PI * Math.pow(r, 2) * (h - r);
					System.out.printf("%.3f", volumeTotal);
					}
				else {
					if(h <= H) {
						double volumeTotal = ((4/3) * Math.PI * Math.pow(r, 3)) + Math.PI * Math.pow(r, 2) * (H - 2 * r) - (1/3) * Math.PI * (Math.pow((H - h), 2) * (3 * r - H + h));
						System.out.printf("%.3f", volumeTotal);
						}
					}	
				}
			}
		scan.close();
		}
	}
