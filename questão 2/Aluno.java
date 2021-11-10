package q2_Prova_C;


import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

public class Aluno {

	public String nome;
	private Curso cursoMat;
	private Set<Disciplina> disciplinasM;
	public Set<Disciplina> disciplinasF;
	public HashMap<Disciplina, Float> disciplinasFinalizadas;	
	private Boolean isAluno;
	private Aluno primeiro;
	private Aluno ultimo;
	private Aluno proximo;
	private int tamanho;

	
	public Aluno() {
	}
	
	public Aluno(String nome) {
		this.nome = nome;
	}
	
	public Aluno(Curso cursoMat, String nome) {
		this.nome = nome;
		this.cursoMat = cursoMat;
		this.isAluno = false;
		this.disciplinasF = new HashSet<>();
		this.disciplinasM = new HashSet<>();
		this.disciplinasFinalizadas = new HashMap<>();
		this.disciplinasF.add((Disciplina) cursoMat.disciplinas);
		cursoMat.adicionarAluno(this);
	}
	
	public Aluno(String nomeAluno, Double nota) {
		// TODO Auto-generated constructor stub
	}

	public void lancamentoNotas(Disciplina disciplina, Float nota) {
		this.disciplinasM.remove(disciplina);
		this.disciplinasF.remove(disciplina);	
		this.disciplinasFinalizadas.put(disciplina, nota);
		

		if (this.disciplinasF.isEmpty()) {
			this.isAluno = true;
			this.cursoMat.exAlunos.append(this.nome + ", ");
			this.cursoMat.alunos.remove(this);
		}
	}
	
	


	public Aluno getPrimeiro() {
		return primeiro;
	}

	public void setPrimeiro(Aluno primeiro) {
		this.primeiro = primeiro;
	}

	public Aluno getUltimo() {
		return ultimo;
	}

	public void setUltimo(Aluno ultimo) {
		this.ultimo = ultimo;
	}

	public Aluno getProximo() {
		return proximo;
	}

	public void setProximo(Aluno proximo) {
		this.proximo = proximo;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public void alunoNaDisciplina(Disciplina disciplina) {
		this.disciplinasM.add(disciplina);
	}
	
	public void remover(String nomeAluno) {

		Aluno anterior = null;
		Aluno atual = this.primeiro;
		for (int i = 0; i < this.getTamanho(); i++) {
			if (atual.getNomeAluno().equalsIgnoreCase(nomeAluno)) {
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

	private String getNomeAluno() {
		// TODO Auto-generated method stub
		return null;
	}

	public Aluno get(int posicao) {

		Aluno atual = this.get(posicao);

		for (int i = 0; i < posicao; i++) {
			if (atual.getProximo() != null) {
				atual = (Aluno) atual.getProximo();
			}
		}
		return atual;

	}
}
