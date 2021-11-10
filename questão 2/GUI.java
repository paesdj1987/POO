package q2_Prova_C;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTable;

public class GUI {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JPanel bt_curso = new JPanel();
		tabbedPane.addTab("Curso", null, bt_curso, null);
		bt_curso.setLayout(null);
		
		JButton bt_novoCurso = new JButton("Salvar Novo Curso");
		bt_novoCurso.setBounds(282, 33, 127, 21);
		bt_curso.add(bt_novoCurso);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(164, 84, 97, 21);
		bt_curso.add(comboBox);
		
		JLabel lblNewLabel = new JLabel("Add Disciplina");
		lblNewLabel.setBounds(26, 88, 97, 13);
		bt_curso.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Digite o nome do Curso");
		lblNewLabel_1.setBounds(26, 37, 107, 13);
		bt_curso.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(164, 34, 96, 20);
		bt_curso.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Listas da Disciplina do Curso");
		lblNewLabel_2.setBounds(26, 155, 140, 13);
		bt_curso.add(lblNewLabel_2);
		
		JList list = new JList();
		list.setBounds(164, 136, 97, 54);
		bt_curso.add(list);
		
		JPanel bt_disciplina = new JPanel();
		tabbedPane.addTab("Disciplina", null, bt_disciplina, null);
		bt_disciplina.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Criar Disciplina:");
		lblNewLabel_3.setBounds(28, 35, 82, 13);
		bt_disciplina.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Salvar Cria\u00E7\u00E3o");
		btnNewButton.setBounds(281, 31, 123, 21);
		bt_disciplina.add(btnNewButton);
		
		textField_1 = new JTextField();
		textField_1.setBounds(137, 32, 117, 19);
		bt_disciplina.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Digite o nome");
		lblNewLabel_4.setBounds(163, 10, 70, 13);
		bt_disciplina.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Disciplinas criadas");
		lblNewLabel_5.setBounds(28, 63, 103, 13);
		bt_disciplina.add(lblNewLabel_5);
		
		JList list_1 = new JList();
		list_1.setBounds(194, 150, -36, -51);
		bt_disciplina.add(list_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(137, 59, 117, 21);
		bt_disciplina.add(comboBox_1);
		
		JLabel lblNewLabel_6 = new JLabel("Remover Disciplina");
		lblNewLabel_6.setBounds(28, 94, 103, 13);
		bt_disciplina.add(lblNewLabel_6);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(137, 90, 117, 21);
		bt_disciplina.add(comboBox_2);
		
		JButton btnNewButton_1 = new JButton("Salvar Remo\u00E7\u00E3o");
		btnNewButton_1.setBounds(281, 90, 123, 21);
		bt_disciplina.add(btnNewButton_1);
		
		JLabel lblNewLabel_7 = new JLabel("Alterar Disciplina");
		lblNewLabel_7.setBounds(28, 133, 82, 13);
		bt_disciplina.add(lblNewLabel_7);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(137, 129, 117, 21);
		bt_disciplina.add(comboBox_3);
		
		JLabel lblNewLabel_8 = new JLabel("Digite novo nome");
		lblNewLabel_8.setBounds(28, 167, 82, 13);
		bt_disciplina.add(lblNewLabel_8);
		
		textField_2 = new JTextField();
		textField_2.setBounds(137, 164, 117, 19);
		bt_disciplina.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("Salvar Novo Nome");
		btnNewButton_2.setBounds(281, 163, 123, 21);
		bt_disciplina.add(btnNewButton_2);
		
		JPanel bt_aluno = new JPanel();
		tabbedPane.addTab("Aluno", null, bt_aluno, null);
		bt_aluno.setLayout(null);
		
		JLabel lblNewLabel_9 = new JLabel("Criar Nome Aluno");
		lblNewLabel_9.setBounds(24, 28, 92, 13);
		bt_aluno.add(lblNewLabel_9);
		
		textField_3 = new JTextField();
		textField_3.setBounds(126, 25, 124, 19);
		bt_aluno.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton_3 = new JButton("Salvar");
		btnNewButton_3.setBounds(283, 24, 85, 21);
		bt_aluno.add(btnNewButton_3);
		
		JLabel lblNewLabel_10 = new JLabel("Inserir Aluno No Curso");
		lblNewLabel_10.setBounds(24, 75, 109, 13);
		bt_aluno.add(lblNewLabel_10);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(143, 71, 107, 21);
		bt_aluno.add(comboBox_4);
		
		JButton btnNewButton_4 = new JButton("Salvar");
		btnNewButton_4.setBounds(283, 71, 85, 21);
		bt_aluno.add(btnNewButton_4);
		
		JLabel lblNewLabel_11 = new JLabel("Disciplinas Cadastradas");
		lblNewLabel_11.setBounds(24, 121, 109, 13);
		bt_aluno.add(lblNewLabel_11);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setBounds(143, 117, 107, 21);
		bt_aluno.add(comboBox_5);
		
		JLabel lblNewLabel_12 = new JLabel("Notas");
		lblNewLabel_12.setBounds(23, 161, 45, 13);
		bt_aluno.add(lblNewLabel_12);
		
		textField_4 = new JTextField();
		textField_4.setBounds(72, 158, 45, 19);
		bt_aluno.add(textField_4);
		textField_4.setColumns(10);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setBounds(143, 157, 107, 21);
		bt_aluno.add(comboBox_6);
		
		JLabel lblNewLabel_13 = new JLabel("Disciplina");
		lblNewLabel_13.setBounds(174, 182, 45, 13);
		bt_aluno.add(lblNewLabel_13);
		
		JButton btnNewButton_5 = new JButton("Salvar");
		btnNewButton_5.setBounds(283, 157, 85, 21);
		bt_aluno.add(btnNewButton_5);
		
		JPanel bt_professor = new JPanel();
		tabbedPane.addTab("Professor", null, bt_professor, null);
		bt_professor.setLayout(null);
		
		JLabel lblNewLabel_14 = new JLabel("Criar nome do Professor");
		lblNewLabel_14.setBounds(24, 33, 118, 13);
		bt_professor.add(lblNewLabel_14);
		
		textField_5 = new JTextField();
		textField_5.setBounds(145, 30, 145, 19);
		bt_professor.add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnNewButton_6 = new JButton("Salvar");
		btnNewButton_6.setBounds(318, 29, 85, 21);
		bt_professor.add(btnNewButton_6);
		
		JLabel lblNewLabel_15 = new JLabel("Inserir Professor na Disciplina");
		lblNewLabel_15.setBounds(10, 79, 141, 13);
		bt_professor.add(lblNewLabel_15);
		
		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setBounds(161, 75, 118, 21);
		bt_professor.add(comboBox_7);
		
		JButton btnNewButton_7 = new JButton("Salvar");
		btnNewButton_7.setBounds(318, 75, 85, 21);
		bt_professor.add(btnNewButton_7);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Listagem", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel_16 = new JLabel("Listar Alunos");
		lblNewLabel_16.setBounds(10, 47, 98, 13);
		panel.add(lblNewLabel_16);
		
		JComboBox comboBox_8 = new JComboBox();
		comboBox_8.setBounds(128, 43, 124, 21);
		panel.add(comboBox_8);
		
		JLabel lblNewLabel_17 = new JLabel("Listar alunos do Curso");
		lblNewLabel_17.setBounds(10, 109, 115, 13);
		panel.add(lblNewLabel_17);
		
		JComboBox comboBox_9 = new JComboBox();
		comboBox_9.setBounds(128, 105, 124, 21);
		panel.add(comboBox_9);
		
		JComboBox comboBox_10 = new JComboBox();
		comboBox_10.setBounds(278, 105, 129, 21);
		panel.add(comboBox_10);
		
		JLabel lblNewLabel_18 = new JLabel("Lista de Cursos");
		lblNewLabel_18.setBounds(148, 90, 78, 13);
		panel.add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("Lista de Alunos");
		lblNewLabel_19.setBounds(307, 90, 78, 13);
		panel.add(lblNewLabel_19);
		
		JLabel lblNewLabel_20 = new JLabel("Notas");
		lblNewLabel_20.setBounds(10, 158, 45, 13);
		panel.add(lblNewLabel_20);
		
		JComboBox comboBox_11 = new JComboBox();
		comboBox_11.setBounds(65, 154, 124, 21);
		panel.add(comboBox_11);
		
		JLabel lblNewLabel_21 = new JLabel("Disciplina");
		lblNewLabel_21.setBounds(105, 132, 52, 21);
		panel.add(lblNewLabel_21);
		
		JList list_2 = new JList();
		list_2.setBounds(204, 136, 97, 54);
		panel.add(list_2);
	}
}
