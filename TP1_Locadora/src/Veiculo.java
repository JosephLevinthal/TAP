
public class Veiculo {
	int tipo;
	int nPassageiros;
	int bagagem;
	int cambio;
	int acessorios;
	float consumo;
	float preco;
	int possuiAr;
	

	Veiculo(int tipo, int nPassageiros, int bagagem, int cambio, int acessorios, float consumo, float preco, int possuiAr){
		this.tipo = tipo;
		this.nPassageiros = nPassageiros;
		this.bagagem = bagagem;
		this.cambio = cambio;
		this.acessorios = acessorios;
		this.consumo = consumo;
		this.preco = preco;
		this.possuiAr = possuiAr;
	}
	
	String getTipo() {
		if(tipo == 1) {
			return "Compacto";
		}
		if(tipo == 2) {
			return "Standard";
		}
		if(tipo == 3) {
			return "Grande";
		}
		if(tipo == 4) {
			return "Econômico";
		}
		if(tipo == 5) {
			return "Premium";
		}
		if(tipo == 6) {
			return "Minivan";
		}
		else {
			return "Outros";
		}
	}
	
	int getNPassageiros() {
		return nPassageiros;
	}
	
	int getBagagem() {
		return bagagem;
	}
	
	String getCambio() {
		if(cambio == 0) {
			return "Manual";
		}
		if(cambio == 1) {
			return "Automatico";
		}
		else {
			return "Outros";
		}
	}
	
	float getConsumo() {
		return consumo;
	}
	
	float getPreco() {
		return preco;
	}
	
	String getPossuiAr() {
		if(possuiAr == 0) {
			return "Não";
		}
		if(possuiAr == 1) {
			return "Sim";
		}
		else {
			return "Outros";
		}
	}
	
	String getVeiculo() {
		return "Veiculo cadastrado com sucesso!  Tipo: "+getTipo()+ " /  Número de passageiros: "+nPassageiros+ " / Bagagem: "+bagagem+ "L / Câmbio: "+getCambio()+ " / Consumo: "+consumo+ " / Ar condicionado: " +getPossuiAr()+" / Preço: "+preco+"(dia)";
	}
	
}
