public class Proprietario {
	String nome;
	int cnh;
	int anoNascimento;
	
	Proprietario(){
			nome = "";
			cnh = 0;
			anoNascimento = 0;
		}
		
		Proprietario(String nome, int cnh, int anoNascimento){
			this.nome = nome;
			this.cnh = cnh;
			this.anoNascimento = anoNascimento;
		}
		
		int getIdade(int anoReferencia) {
			return anoReferencia - anoNascimento;
		}
		
		String getDescricao() {
			return "Proprietario: nome=" 
		+nome+ ", cnh=" +cnh+ ", anoNascimento=" +anoNascimento+ ".";
		}
	}
