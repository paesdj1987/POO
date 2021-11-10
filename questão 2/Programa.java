package q2_Prova_C;

import java.util.Scanner;

import questão2_prova.Aluno;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class Programa {

	public static void main(String[] args, Object addAll) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		List<Curso> curso = new ArrayList<>();
		List<Disciplina> disciplina = new ArrayList<>();
		List<Aluno> aluno = new ArrayList<>();
		List<Professor> professor = new ArrayList<>();

		int n = 0;

		do {
			System.out.println("Digite uma das opções: ");
			System.out.println("1 - Cadastrar Curso: ");
			System.out.println("2 - Cadastrar Disicplina");
			System.out.println("3 - Cadastrar Aluno");
			System.out.println("4 - Cadastrar Professor");
			System.out.println("5 - Inserir Disciplina no curso");
			System.out.println("6 - Inserir Aluno no Curso");
			System.out.println("7 - Inserir Aluno na Disciplina");
			System.out.println("8 - Inserir Professor na Disciplina");
			System.out.println("9 - Remover Disciplina do Curso");
			System.out.println("10 - Remover Aluno");


			System.out.println("");

			System.out.print("Digite aqui sua opção: ");
			n = Integer.parseInt(sc.nextLine());

			if (n == 1) {

				System.out.print("Digite o nome: ");
				sc.nextLine();
				String nomeCurso = sc.nextLine();

			} else if (n == 2) {

				System.out.print("Digite quantas disciplinas deseja cadastrar: ");
				int x = Integer.parseInt(sc.nextLine());

				for (int i = 0; i <= x; i++) {

					System.out.print("Digite o nome da Disciplina: ");
					String nomeDisciplina = sc.nextLine();
					System.out.print("Digite a sigla da Disciplina: ");
					String sigla = sc.nextLine();
					System.out.print("Digite o codigo da Disciplina: ");
					String codigo = sc.nextLine();
					System.out.print("Digite a carga horária da Disciplina: ");
					int cargaHoraria = sc.nextInt();
					System.out.print("Digite o nome do docente: ");
					String nomeProfessor = sc.nextLine();

					Disciplina c1 = new Disciplina("Análise de Sistemas", "Programação Orientada a Objetos", "INF008",
							"202102008", 80);

					disciplina.addAll((Collection<? extends Disciplina>) new Disciplina(codigo, sigla, nomeDisciplina,
							cargaHoraria, nomeProfessor));

				}
			} else if (n == 3) {

				System.out.print("Digite quantos alunos deseja cadastrar: ");
				int x = Integer.parseInt(sc.nextLine());

				for (int i = 0; i <= x; i++) {

					System.out.print("Digite o nome do Aluno: ");
					sc.nextLine();
					String nomeAluno = sc.nextLine();
					System.out.print("Digite a nota final do Aluno: ");
					Double nota = sc.nextDouble();

					aluno.add(new Aluno(nomeAluno, nota));
				}
			} else if (n == 4) {

				System.out.print("Digite quantos professores deseja cadastrar: ");
				int x = Integer.parseInt(sc.nextLine());

				for (int i = 0; i <= x; i++) {

					System.out.print("Digite o nome do Professor: ");
					sc.nextLine();
					String nomeProfessor = sc.nextLine();
					System.out.print("Digite o curso que o Professor será cadastrado: ");
					String cursoMat = sc.nextLine();
					System.out.print("Digite a disciplina que o Professor será cadastrado: ");
					String disciplinasLecionada = sc.nextLine();

					professor.add(new Professor(nomeProfessor, cursoMat, disciplinasLecionada));
				}
			} else if (n == 5) {

				HashSet<String> tags = new HashSet<String>();

				System.out.print("Insira a disciplina: ");
				String disciplinas = sc.nextLine();

				tags.add(disciplinas);

				for (String tag : tags) {
					System.out.println(tag + " - " + tag.hashCode());
				}

			} else if (n == 6) {

				System.out.println("-- Menu - Inserir Aluno no Curso --");

				HashSet<String> tags = new HashSet<String>();

				System.out.print("Insira o aluno que será inserido na Disciplina: ");
				String alunosCurso = sc.nextLine();

				tags.add(alunosCurso);

				for (String tag : tags) {
					System.out.println(tag + " - " + tag.hashCode());
				}

			} else if (n == 7) {

				HashSet<String> tags = new HashSet<String>();

				System.out.print("Insira o aluno que será inserido na Disciplina: ");
				String alunosDisciplina = sc.nextLine();

				tags.add(alunosDisciplina);

				for (String tag : tags) {
					System.out.println(tag + " - " + tag.hashCode());
				}

			} else if (n == 8) {
				System.out.println("8 - Inserir Professor na Disciplina");

				HashSet<String> tags = new HashSet<String>();

				System.out.print("Insira o aluno que será inserido na Disciplina: ");
				String professorNaDisciplina = sc.nextLine();

				tags.add(professorNaDisciplina);

				for (String tag : tags) {
					System.out.println(tag + " - " + tag.hashCode());
				}

			} else if (n == 9) {

				Aluno aluno = new Aluno();

				System.out.println("Tamanho: " + aluno.getTamanho());
				System.out.println("Primeiro: " + aluno.getPrimeiro().getNomeAluno());
				System.out.println("Último: " + aluno.getUltimo().getNomeAluno());

				for (int i = 0; i < aluno.getTamanho(); i++) {
					System.out.println(aluno.get(i).getNomeAluno());
				}

				System.out.println("Tamanho: " + aluno.getTamanho());
				for (int i = 0; i < aluno.getTamanho(); i++) {
					System.out.println(aluno.get(i).getNomeAluno());
				}

			} else if (n == 10) {

				
				 Professor professor = new Professor();
			 
				 System.out.println("Tamanho: " + professor.getTamanho());
				 System.out.println("Primeiro: " +
				 professor.getPrimeiro().getNomeProfessor()); System.out.println("Último: " +
				 professor.getUltimo().getNomeProfessor());
				  
				 for(int i=0; i < professor.getTamanho(); i++){
				 System.out.println(professor.get(i).getNomeProfessor()); }
				  
				 System.out.println("Tamanho: " + professor.getTamanho()); for(int i=0; i <
				 professor.getTamanho(); i++){
				 System.out.println(professor.get(i).getNomeProfessor()); }
				 
			}

		} while (n != 0);

		sc.close();

	}
}
