import java.util.Scanner;

public class OperacoesInteiros {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numero = scan.nextInt();
		int vetor[] = new int[100];
		int i = 0;
		int quantidadeElementos = 0;
		int quantidadePares = 0;
		int quantidadeImpares = 0;
		int soma = 0;
		int maior = numero;
		int menor = numero;
		
		
		while(true) {
			
		//diferente de -1
		if(numero != -1) {
			vetor[i] = numero;
			i ++;
			quantidadeElementos ++;
			if(numero % 2 == 0) {
				quantidadePares++;
				soma = soma + numero;
			}
			else {
				quantidadeImpares++;
				soma = soma + numero;
			}
			if(numero > maior) {
				maior = numero;
			}
			if(numero < menor) {
				menor = numero;
			}
			
			numero = scan.nextInt();	
		}
		//se for -1
		else {
		double media = (double)((double)soma / (double) quantidadeElementos);
		System.out.println(quantidadeElementos);
		System.out.println(quantidadePares);
		System.out.println(quantidadeImpares);
		System.out.println(soma);
		System.out.printf("%.2f", media);
		System.out.println();
		System.out.println(maior);
		System.out.println(menor);
		
		media = 0;
		i = 0;
		quantidadeElementos = 0;
		quantidadePares = 0;
		quantidadeImpares = 0;
		soma = 0;
		
		numero = scan.nextInt();
		maior = numero;
		menor = numero;
		
		if(numero == -1) {
			break;
		}
		
		}
		}
		scan.close();
	}
}
