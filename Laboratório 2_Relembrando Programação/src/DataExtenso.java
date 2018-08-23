import java.util.Scanner;

public class DataExtenso {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String data = scan.nextLine();
		
		String stringDia = data.substring(0, 2);
		String stringMes = data.substring(2, 4);
		String stringAno = data.substring(4, 8);
		
		int intDia = Integer.parseInt(stringDia);
		int intMes = Integer.parseInt(stringMes);
		int intAno = Integer.parseInt(stringAno);
		
		String novaStringMes = "";
		
		switch (intMes)
		{
		case 01:
			novaStringMes = "janeiro";
		break;
		case 02:
			novaStringMes = "fevereiro";
		break;
		case 03:
			novaStringMes = "março";
		break;
		case 04:
			novaStringMes = "abril";
		break;
		case 05:
			novaStringMes = "maio";
		break;
		case 06:
			novaStringMes = "junho";
		break;
		case 07:
			novaStringMes = "julho";
		break;
		//não dá o case 08 e 09
		
		case 10:
			novaStringMes = "outubro";
		break;
		case 11:
			novaStringMes = "novembro";
		break;
		case 12:
			novaStringMes = "dezembro";
		break;
		}
		System.out.printf("%d de %s de %d", intDia, novaStringMes, intAno);
		scan.close();
	}
}
