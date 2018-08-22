import java.util.Scanner;

public class OperacoesString {
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		String frase = scan.nextLine();
		
		int tamanhoFrase = frase.length();
		System.out.println(tamanhoFrase); //OK
		
		String primeiroCaracter = frase.substring(0, 1);
		System.out.println(primeiroCaracter); //OK
		
		String ultimoCaracter = frase.substring(frase.length() - 1);
		System.out.println(ultimoCaracter); //OK
		
		String maiuscula = frase.substring(0, frase.length());
		System.out.println(maiuscula.toUpperCase()); //OK
		
		String minuscula = frase.substring(0, frase.length());
		System.out.println(minuscula.toLowerCase()); //OK
		
		String aPorE = frase.substring(0, frase.length());
		System.out.println(aPorE.replaceAll("a", "e")); //OK
		
		int posicao = 0;
		
		while(posicao + 1 <= frase.length()) {
			System.out.print(frase.substring(posicao, posicao + 1));
			posicao = posicao + 2;
		}
		
		System.out.println();
		
		int contarVogais = 0;
        minuscula = frase.toLowerCase();
        
        for (int i = 0; i < minuscula.length(); i++){
            char c = minuscula.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                contarVogais++;
        }
        System.out.println(contarVogais);
		scan.close();
	}
}
