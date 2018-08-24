import java.util.Scanner;

public class AproximacaoSeno {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double angulo = scan.nextDouble();
		int numeroSerie = scan.nextInt();
		
		double radiano = Math.toRadians(angulo);
		
		 System.out.printf("%.10f",radiano);
	     System.out.println();
		
		double denominador = 3.0;
		int i = 0;
		int j = 1;
		
		double radiano_original = radiano;

		while(i < numeroSerie - 1){
		      if(j % 2 == 0){
		    	 radiano = radiano + (Math.pow(radiano_original, denominador)/fatorial(denominador));
		    	 j++;
		      } 
		      else {
		    	 radiano = radiano - (Math.pow(radiano_original, denominador)/fatorial(denominador)); 
		    	 j++;
		      }
		      System.out.printf("%.10f",radiano);
		      System.out.println();
		      denominador = denominador + 2;
		      i++;
		    }
		scan.close();
		
		}
	public static double fatorial(double num) {
		if (num <=1 )  return 1;
		else  return num * fatorial(num - 1);
	}	
}