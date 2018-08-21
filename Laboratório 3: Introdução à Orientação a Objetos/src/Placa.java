public class Placa {
	String placa;
	int tipo;
	
	Placa(){
		placa = "";
		tipo = 0;
	}
	
	Placa(String placa, int tipo){
		this.placa = placa;
		this.tipo = tipo;
	}
	
	String getTipoString() {
		if(tipo == 1) {
			return "Normal";
		}
		if(tipo == 2) {
			return"Servico";
		}
		if(tipo == 3) {
			return "Oficial";
		}
		if(tipo == 4) {
			return "Auto Escola";
		}
		if(tipo == 5) {
			return "Prototipo";
		}
		if(tipo == 6) {
			return "Colecionador";
		}
		else {
			return "Outros";
		}
	}
	
	boolean temEstacionamentoLivre() {
		if(tipo == 2 || tipo == 3) {
			return true;
		}
		else {
			return false;
		}	
	}
	
	String getDescricao(){
		return "Placa: placa="
	+placa+ ", tipo=" +getTipoString()+
	", estacionamentoLivre="
	+temEstacionamentoLivre() + ".";
	}

}