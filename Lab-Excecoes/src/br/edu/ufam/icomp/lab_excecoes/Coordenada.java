package br.edu.ufam.icomp.lab_excecoes;

public class Coordenada {
	private int posX;
	private int posY;
	private int digito;
	
	public Coordenada(int posX, int posY, int digito) throws CoordenadaNegativaException, CoordenadaForaDosLimitesException, DigitoInvalidoException  {
		
	if ((posX < 0) || (posY < 0)) { throw new CoordenadaNegativaException(); }
	if ((posX < 0) || (posX > 30000) || (posY < 0) || (posY > 30000)) { throw new CoordenadaForaDosLimitesException(); }
	if (((posX + posY) % 10) != digito && (digito > 0) && (digito < 9)) { throw new DigitoInvalidoException(); }
	
	this.posX = posX;
	this.posY = posY;
	this.digito = digito;
	}
	
	public int getPosX(){
		return posX;
	}
	
	public int getPosY(){
		return posY;
	}
	
	public double distancia(Coordenada coordenada){
		double ponto = Math.sqrt(Math.pow(posX - coordenada.posX,2) + Math.pow(posY - coordenada.posY,2));
		return ponto;
	}
	@Override
	public String toString(){
		return posX + ",  " + posY;
	}
}
