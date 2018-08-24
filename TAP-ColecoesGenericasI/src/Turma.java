import java.util.ArrayList;
import java.util.Iterator;
public class Turma {
	String 	disciplina;
	int ano;
	int semestre;
	Professor professor;
	ArrayList<Aluno> alunos;
	
	Turma(String disciplina, int ano, int semestre, Professor professor) {
		this.disciplina = disciplina;
		this.ano = ano;
		this.semestre = semestre;
		this.professor = professor;
		alunos = new ArrayList<Aluno>();
	}
	void addAluno(Aluno aluno) {
		Iterator<Aluno> iterator = alunos.iterator();
		while(iterator.hasNext()) {
			Aluno Alunoatual = iterator.next();
			if(aluno.matricula == Alunoatual.matricula){
				return;
			}
		}
		alunos.add(aluno);
	}
	Aluno getAluno(int matricula) {
		Iterator<Aluno> iterator = alunos.iterator();
		while(iterator.hasNext()) {
			Aluno Alunoatual = iterator.next();
			if(Alunoatual.matricula == matricula) {
				return Alunoatual;
			}
		}
		return null;
	}	
	double getMediaIdade() {
		int Media = 0;
		int cont = 0;
		Iterator<Aluno> iterator = alunos.iterator();
		while(iterator.hasNext()) {
			Aluno Alunoatual = iterator.next();
			Media = Media + Alunoatual.getIdade();
			cont ++;
		}
		return Media/cont;
	}
	String getDescricao() {
		int cont = 1;
		String descricao = ("Turma " + disciplina + " - " + ano + "/" + semestre + " (" + professor.getDescricao() + "):\n");
		Iterator<Aluno> iterator = alunos.iterator();
		while(iterator.hasNext()) {
			Aluno Alunoatual = iterator.next();
			descricao = descricao + "  - Aluno " + cont +": " + Alunoatual.getDescricao()+ "\n";
			cont ++;
		}
		return descricao;	
	}
}