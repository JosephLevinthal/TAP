package br.edu.ufam.icomp.lab_encapsulamento;

public class GISMain {
public static void main(String[] args) {
	Localizavel localizaveis[] = new Localizavel[]
			{
					new CarroLuxuoso("ABC1234"),
					new Celular(6, 13, 20),	
					};
	for(int i = 0; i < localizaveis.length; i++){
		System.out.println(localizaveis[i].getPosicao());
		}
	}
}