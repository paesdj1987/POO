package q2_Prova_C;

import java.util.Collection;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public abstract class Curso {

	private String nomeCurso;
	public Set<Disciplina> disciplinas;
	public HashSet<Aluno> alunos;
	public StringBuilder exAlunos = new StringBuilder();
	
	
	public Curso(String nome) {
		this.nomeCurso = nomeCurso;
	}

	public Curso(String nome, Set<Disciplina> disciplinas) {
		this.nomeCurso = nomeCurso;
		this.disciplinas = disciplinas;
		this.alunos = new HashSet<>();
	}
	
	
	public void adicionarAluno(Aluno aluno) {
		this.alunos.add(aluno);
	}
	
	public void removerAluno(Aluno aluno) {
		this.alunos.removeAll((Collection<?>) aluno);
	}
	
	public void adicionarDisciplinas(HashSet<Disciplina> disciplinas) {
		this.disciplinas.addAll(disciplinas);
	}

	public void removerDisciplinas(HashSet<Disciplina> disciplinas) {
		this.disciplinas.removeAll(disciplinas);		
	}

	

	public String listarAlunos() {
		StringBuilder a = new StringBuilder();
		for (Aluno aluno : alunos) {
			String linha = String.format("%s: \n Disciplinas restantes: %s\n Disciplinas cursadas: %s \n",
					aluno.nome.toUpperCase(), aluno.disciplinasF.toString(),
					aluno.disciplinasFinalizadas.keySet().toString());
			a.append(linha);
		}
		return a.toString();
	}

}
