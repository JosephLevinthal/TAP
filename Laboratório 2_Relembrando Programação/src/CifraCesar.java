import java.util.Scanner;

public class CifraCesar {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int deslocamento = scan.nextInt();
		String frase = scan.nextLine();
		char cCifrado;
		
		for (int i = 1; i < frase.length(); i++){
            char carac = frase.charAt(i);
            cCifrado = (char) (carac - 'a');
            cCifrado = (char) ((cCifrado + deslocamento) % 26);
            cCifrado += 'A';
            if(carac > 'z' || carac < 'a') {
            	cCifrado = carac;
            }
                System.out.print(cCifrado);
                scan.close();
		}
	}
}
