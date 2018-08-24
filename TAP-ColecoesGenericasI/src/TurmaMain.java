
public class TurmaMain {
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno();
		aluno1.nome = "Joseph";
		aluno1.matricula = 21553691;
		aluno1.anoNascimento = 1996;
		
		Professor professor1 = new Professor();
		professor1.nome = "Horacio";
		professor1.matricula = 2469;
		professor1.titulacao = "professor";
		
		String disciplina = "TAP";
		int ano = 2018;
		int semestre = 2;
		Professor professor = professor1;
		
		Turma turma1 = new Turma(disciplina, ano, semestre, professor);
		
		turma1.addAluno(aluno1);
	}
}
