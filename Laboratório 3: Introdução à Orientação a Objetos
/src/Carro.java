public class Carro {
	String marca;
	String modelo;
	Proprietario proprietario;
	Placa placa;
	Motor motor;
	
	Carro(String marca, String modelo, Proprietario proprietario, Placa placa, Motor motor){
		this.marca = marca;
		this.modelo = modelo;
		this.proprietario = proprietario;
		this.placa = placa;
		this.motor = motor;
	}
	
	String getDescricao() {
		return "Carro " +marca+
				"/" +modelo+
				". Proprietario: nome=" +proprietario.nome+
				", cnh=" +proprietario.cnh+
				", anoNascimento=" + proprietario.anoNascimento+
				". Placa: placa=" +placa.placa+
				", tipo=" +placa.getTipoString()+
				", estacionamentoLivre=" +placa.temEstacionamentoLivre() +
				". Motor: tipo=" +motor.getTipoString()+
				", capacidade=" +motor.capacidade+"L"+
				", potencia=" +motor.potencia +"CV.";
	}
}
