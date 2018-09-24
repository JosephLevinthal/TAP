package br.edu.ufam.icomp.lab_excecoes;

public class RoverMain {
	public static void main(String[] args){
		try {
			Caminho caminho1 = new Caminho(13);
			Coordenada coord12345 = new Coordenada(2,10,13);
		} catch (CoordenadaNegativaException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} catch (CoordenadaForaDosLimitesException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());

		} catch (DigitoInvalidoException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
}
