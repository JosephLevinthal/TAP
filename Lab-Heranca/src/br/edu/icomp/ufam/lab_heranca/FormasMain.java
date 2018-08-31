package br.edu.icomp.ufam.lab_heranca;

import java.util.*;

public class FormasMain {
	public static void main(String[] args) {
		ArrayList<FormaGeometrica> vetorFormas = new ArrayList<>();
		
		vetorFormas.add(new Circulo (50,4,2));
		vetorFormas.add(new Retangulo(10, 5, 8, 9));
		vetorFormas.add(new Quadrado(10, 3, 1));
		
		for(FormaGeometrica forma:vetorFormas){
			System.out.println(forma);
		}
	}
}