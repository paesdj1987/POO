package q2_Prova_C;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Locale;

public class Disciplina {

	private String codigo;
	private String sigla;
	private String nome;
	private HashSet<AlunoAula> aula;
	private String docente;
	private int cargaHoraria;
	private HashSet<Aluno> aluno;
	private HashSet<Professor> professor;
	


	public Disciplina(String codigo, String sigla, String nome, HashSet<AlunoAula> aulas, String docente) {
		this.codigo = codigo;
		this.sigla = sigla;
		this.nome = nome;
		this.aula = aula;
		this.docente = docente;
	}
	
	public Disciplina(String codigo, String sigla, String nome, int cargaHoraria, String docente) {
		this.codigo = codigo;
		this.sigla = sigla;
		this.nome = nome;
		this.cargaHoraria = cargaHoraria;
		this.docente = docente;
	}

	public Disciplina(String codigo2, String sigla2, String nome2, String string, int i) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return this.sigla;
	}

	
}
