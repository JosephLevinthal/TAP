public class CarroMain {
	public static void main(String[] args) {
		
	Proprietario proprietario1 = new Proprietario();
	proprietario1.anoNascimento = 1;
	proprietario1.cnh = 7668207;
	proprietario1.nome = "Joseph Levinthal";
	
	Placa placa1 = new Placa();
	placa1.placa = "OAT-3966";
	placa1.tipo = 6;
	

    Motor motor1 = new Motor();
    
    Carro carro1 = new Carro("DeLorean", "SUV", proprietario1,
placa1, motor1);

	System.out.println(placa1.getDescricao());
	System.out.println(proprietario1.getDescricao());
	
	
	}
}
