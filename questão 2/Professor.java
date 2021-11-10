package q2_Prova_C;

import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

public class Professor {
	
	public String nomeProfessor;
	private Curso cursoMat;
	private Set<Disciplina> disciplinasLecionada;
	private Professor primeiro;
	private Professor ultimo;
	private Professor proximo;
	private int tamanho;
	
	
	
	
	public Professor getPrimeiro() {
		return primeiro;
	}
	public void setPrimeiro(Professor primeiro) {
		this.primeiro = primeiro;
	}
	public Professor getUltimo() {
		return ultimo;
	}
	public void setUltimo(Professor ultimo) {
		this.ultimo = ultimo;
	}
	public Professor getProximo() {
		return proximo;
	}
	public void setProximo(Professor proximo) {
		this.proximo = proximo;
	}
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	public Professor(String nomeProfessor, String cursoMat2, String disciplinasLecionada2) {
		// TODO Auto-generated constructor stub
	}
	public String getNomeProfessor() {
		return nomeProfessor;
	}
	public void setNome(String nomeProfessor) {
		this.nomeProfessor = nomeProfessor;
	}
	public Curso getCursoMat() {
		return cursoMat;
	}
	public void setCursoMat(Curso cursoMat) {
		this.cursoMat = cursoMat;
	}
	public Set<Disciplina> getDisciplinasLecionada() {
		return disciplinasLecionada;
	}
	public void setDisciplinasLecionada(Set<Disciplina> disciplinasLecionada) {
		this.disciplinasLecionada = disciplinasLecionada;
	}
	
	public void professorNaDisciplina(Disciplina disciplina) {
		this.disciplinasLecionada.add(disciplina);
	}
	
	public void remover(String nomeProfessor) {

		Professor anterior = null;
		Professor atual = this.primeiro;
		for (int i = 0; i < this.getTamanho(); i++) {
			if (atual.getNomeProfessor().equalsIgnoreCase(nomeProfessor)) {
				if (this.tamanho == 1) {
					this.primeiro = null;
					this.ultimo = null;
				} else if (atual == primeiro) {
					this.primeiro = atual.getProximo();
					atual.setProximo(null);
				} else if (atual == ultimo) {
					this.ultimo = anterior;
					anterior.setProximo(null);
				} else {
					anterior.setProximo(atual.getProximo());
					atual = null;
				}
				this.tamanho--;
				break;
			}
			anterior = atual;
			atual = atual.getProximo();
		}

	}

	public Professor get(int posicao) {

		Professor atual = this.get(posicao);

		for (int i = 0; i < posicao; i++) {
			if (atual.getProximo() != null) {
				atual = (Professor) atual.getProximo();
			}
		}
		return atual;
	}

}
