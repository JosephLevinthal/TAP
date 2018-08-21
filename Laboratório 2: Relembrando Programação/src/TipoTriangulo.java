import java.util.Scanner;

public class TipoTriangulo {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      float lado1 = scan.nextFloat();
      float lado2 = scan.nextFloat();
      float lado3 = scan.nextFloat();
      
      if((lado1+lado2)<=lado3 || (lado1+lado3)<=lado2 || (lado2+lado3)<=lado1 ||
    		  lado1<0 || lado2<0 || lado3<0){
        
        System.out.printf("invalido");
        
      } else {
      if(lado1==lado2 && lado1==lado3 && lado3==lado2){
        
        System.out.println("equilatero");
        
      } else {
      if(lado1==lado2 || lado1==lado3 || lado3==lado2){
        
        System.out.println("isosceles");
        
      } else {
        System.out.println("escaleno");
      }
      }
      }
      scan.close();
    }
}