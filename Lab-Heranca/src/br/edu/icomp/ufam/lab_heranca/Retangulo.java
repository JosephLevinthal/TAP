package br.edu.icomp.ufam.lab_heranca;

public class Retangulo extends FormaGeometrica{
	public double largura;
	public double altura;
	
	
	public Retangulo(int posX, int posY, double largura, double altura) {
		super(posX, posY);
		this.largura = largura;
		this.altura = altura;
	}
	
	public double getArea(){
		double area = altura* largura;
		return area;
	}
	public double getPerimetro(){
		double perimetro = 2*(altura+largura);
		return perimetro;
	}
	
	public String toString(){
		return "Retângulo na " +getPosString()+ 
				" com largura de " +largura+ "cm e altura de " +altura+ "cm "
				+ "(área=" +getArea()+ "cm2, perímetro=" +getPerimetro()+ "cm)";
		
	}
	
}

