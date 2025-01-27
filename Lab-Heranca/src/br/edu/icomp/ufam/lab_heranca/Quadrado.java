package br.edu.icomp.ufam.lab_heranca;

public class Quadrado extends Retangulo {
	double lado;
	
	public Quadrado(int posX, int posY, double lado){
		super(posX,posY,lado,lado);
		this.lado = lado;
	}
	
	public String toString(){
		return "Quadrado na " +getPosString()+ 
		" com lado de " +lado+ "cm (área=" +getArea()+ 
		"cm2, perímetro=" +getPerimetro()+ "cm)";
	}
}
