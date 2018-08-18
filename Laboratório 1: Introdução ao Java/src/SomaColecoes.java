import java.util.Scanner;

public class SomaColecoes {
  public static void main(String[] args) {
	  
    Scanner scan = new Scanner(System.in);
    
    int numero_anterior = 0;
    int soma = 0;
    int numero = scan.nextInt();
    
    String respostas = "";
    
    while(!(numero_anterior == -1 && numero == -1)) {
      if(numero == -1){
        respostas += soma + "\n";
        soma = 0;
        
      } else {
    	  
        soma = soma + numero;
      }
      numero_anterior = numero;
      numero = scan.nextInt();
    }
    scan.close();
    System.out.println(respostas);
  }
}