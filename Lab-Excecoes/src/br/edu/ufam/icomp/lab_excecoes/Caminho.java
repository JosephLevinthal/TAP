package br.edu.ufam.icomp.lab_excecoes;

public class Caminho {
	private Coordenada[] caminho;
	private int tamanho;

	public Caminho(int tamanhoMaximo){
		caminho = new Coordenada[tamanhoMaximo];		
		tamanho = 0;
	}
	public int tamanho(){
		return tamanho;
	}
	
	public void addCoordenada(Coordenada coordenada) throws TamanhoMaximoExcedidoException, DistanciaEntrePontosExcedidaException{
		if(tamanho >= caminho.length) throw new TamanhoMaximoExcedidoException();
		if(tamanho>0? caminho[tamanho-1].distancia(coordenada)> 15.0:false) throw new DistanciaEntrePontosExcedidaException();
		
		caminho[tamanho] = coordenada;
		tamanho++;
	}
	
	public void reset(){
		caminho = new Coordenada[caminho.length];
		tamanho = 0;
		
	}
	@Override
	public String toString(){
		StringBuilder builder = new StringBuilder();
		builder.append("Dados do caminho:").append("\n")
		.append("   - Quantidade de pontos: ").append(tamanho).append("\n")
		.append("   - Pontos:").append("\n");
		for(int i=0; i<tamanho; i++){
			builder.append("    -> ").append(caminho[i]).append("\n");
		}
		return builder.toString();
	}	
}
