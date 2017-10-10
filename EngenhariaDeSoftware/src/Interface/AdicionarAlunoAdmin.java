package Interface;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Dao.AlunoDao;
import Model.Aluno;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;

public class AdicionarAlunoAdmin extends JFrame {

	private JPanel contentPane;
	private JTextField cpf;
	private JTextField dt_nasc;
	private JTextField dt_ing;
	private JTextField endereco;
	private JTextField nome;
	private JTextField matricula;
	private JTextField curso;
	private JTextField periodo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdicionarAlunoAdmin frame = new AdicionarAlunoAdmin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AdicionarAlunoAdmin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 420);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel CadastrarAluno = new JLabel("Cadastrar Aluno");
		CadastrarAluno.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblNome = new JLabel("Nome:");
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o:");
		
		JLabel lblCpf = new JLabel("CPF:");
		
		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento:");
		
		JLabel lblDataDeIngresso = new JLabel("Data de Ingress\u00E3o:");
		
		cpf = new JTextField();
		cpf.setColumns(10);
		
		dt_nasc = new JTextField();
		dt_nasc.setColumns(10);
		
		dt_ing = new JTextField();
		dt_ing.setColumns(10);
		
		endereco = new JTextField();
		endereco.setColumns(10);
		
		nome = new JTextField();
		nome.setColumns(10);
		
		JLabel lblMatrcula = new JLabel("Matr\u00EDcula:");
		
		matricula = new JTextField();
		matricula.setEditable(false);
		matricula.setColumns(10);
		
		JLabel lblCurso = new JLabel("Curso:");
		
		curso = new JTextField();
		curso.setColumns(10);
		
		JLabel lblPerodo = new JLabel("Per\u00EDodo:");
		
		periodo = new JTextField();
		periodo.setColumns(10);
		
		JButton cadastroMatricula_botao = new JButton("Confirmar");
		
		cadastroMatricula_botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				AlunoDao alunodao = new AlunoDao();
				
				int id=0;
				String Vcpf = cpf.getText();
				String Vdta_nasc = dt_nasc.getText();
				String Vdta_ing = dt_ing.getText();
				String Vendereco = endereco.getText();
				String Vnome = nome.getText();
				int Vmatricula = Integer.parseInt(matricula.getText());
				String Vcurso = curso.getText();
				String Vperiodo = periodo.getText();
				
				Aluno aluno = new Aluno(id,Vnome,Vendereco,Vcpf,Vdta_nasc,Vdta_ing,Vcurso,Vperiodo,Vmatricula);
				
				alunodao.inserir(aluno);
				
				JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso!");
				
			}
		});
		
		
		
		JButton matriculaVoltar_botao = new JButton("Voltar");
		matriculaVoltar_botao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
			
			
			
			
    
			
			
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(300)
							.addComponent(CadastrarAluno)
							.addPreferredGap(ComponentPlacement.RELATED, 233, Short.MAX_VALUE)
							.addComponent(matriculaVoltar_botao))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblDataDeIngresso)
								.addComponent(lblNome)
								.addComponent(lblEndereo)
								.addComponent(lblCpf)
								.addComponent(lblDataDeNascimento)
								.addComponent(lblCurso)
								.addComponent(lblPerodo))
							.addGap(34)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(periodo)
								.addComponent(curso)
								.addComponent(nome, GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
								.addComponent(endereco)
								.addComponent(cpf)
								.addComponent(dt_nasc)
								.addComponent(dt_ing))
							.addGap(30)
							.addComponent(lblMatrcula)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(matricula, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(332)
							.addComponent(cadastroMatricula_botao)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(CadastrarAluno)
						.addComponent(matriculaVoltar_botao))
					.addGap(33)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNome)
						.addComponent(nome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblMatrcula)
						.addComponent(matricula, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEndereo)
						.addComponent(endereco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCpf)
						.addComponent(cpf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDataDeNascimento)
						.addComponent(dt_nasc, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDataDeIngresso)
						.addComponent(dt_ing, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCurso)
						.addComponent(curso, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPerodo)
						.addComponent(periodo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(cadastroMatricula_botao)
					.addContainerGap(14, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}

}
