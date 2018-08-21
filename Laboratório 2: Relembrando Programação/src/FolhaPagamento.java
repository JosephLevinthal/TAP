import java.util.Scanner;


public class FolhaPagamento {
	public static void main(String[] args) {	
		Scanner scan = new Scanner(System.in);
		int valorHora = scan.nextInt();
		int horasTrabalhadas = scan.nextInt();
		
		double salarioBruto = (valorHora * horasTrabalhadas);
		System.out.printf("Salario Bruto: R$%.2f\n", salarioBruto);
		
		double impostoDeRenda = salarioBruto * 0.11;
		System.out.printf("IR: R$%.2f\n", impostoDeRenda);
		
		double inss = salarioBruto * 0.08;
		System.out.printf("INSS: R$%.2f\n", inss);
		
		double totalDescontos = impostoDeRenda + inss;
		System.out.printf("Total de descontos: R$%.2f\n", totalDescontos);
		
		double salarioLiquido = (salarioBruto - impostoDeRenda) - inss;
		System.out.printf("Salario Liquido: R$%.2f\n", salarioLiquido);
	}
}

