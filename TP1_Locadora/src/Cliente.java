public class Cliente {
	String nome;
	int idade;
	
	Cliente(String nome, int idade){
		this.nome = nome;
		this.idade = idade;
	}	
	
	int getIdade() {
		return idade;
	}
	
	String getNome() {
		return nome;
	}	
	
	String getCliente() {
		return "Usu�rio cadastrado com sucesso:"
				+ "  Nome: " +nome+ "  / Idade: " +idade;
	}
}
