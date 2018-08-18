public class Motor {
	int tipo;
	double capacidade;
	int potencia;

	Motor(){
		tipo = 0;
		capacidade = 0.0;
		potencia = 0;
	}
	
	Motor(int tipo, double capacidade, int potencia){
		this.tipo = tipo;
		this.capacidade = capacidade;
		this.potencia = potencia;
	}
	
	String getTipoString(){
		if(tipo == 1) {
			return "Gasolina";
		}
		if(tipo == 2) {
			return "Alcool";
		}
		if(tipo == 3) {
			return "Flex";
		}
		if(tipo == 4) {
			return "Diesel";
		}
		if(tipo == 5) {
			return "Eletrico";
		}
		else {
			return "Outros";
		}
	}
	
	String getDescricao() {
		return "Motor: tipo=" +getTipoString()+
				", capacidade=" +capacidade+ "L"+
				", potencia=" +potencia+
				"CV.";
	}
	
}