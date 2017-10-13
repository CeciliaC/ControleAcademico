package Interface;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Dao.AlunoDao;
import Dao.FuncionarioDao;
import Model.Aluno;
import Model.Funcionario;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTabbedPane;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ListModel;

public class Admin extends JFrame {
	AlunoDao aluno = new AlunoDao();
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin frame = new Admin();
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
	public Admin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 420);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(20, 27, 754, 344);

		JPanel Aluno = new JPanel();
		tabbedPane.addTab("Aluno", null, Aluno, null);

		// METODO LISTAR ALUNO
		
		 final JList list = new JList();

		List<Aluno> alunos = null;
		try {
			alunos = aluno.listar();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

		list.setListData(alunos.toArray());

		JButton adicionaraluno_botao = new JButton("Adicionar Aluno");
		
		
//REMOVER ALUNO
		JButton removeraluno_botao = new JButton("Remover Aluno");
		removeraluno_botao.addActionListener(new ActionListener() {

			
			@Override
			public void actionPerformed(ActionEvent e) {
				
					try {
						aluno.remove((Model.Aluno) list.getSelectedValue());
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				
				JOptionPane.showMessageDialog(null, "Aluno removido com sucesso!");
				
				List<Aluno> alunos = null;
				try {
					alunos = aluno.listar();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}

				list.setListData(alunos.toArray());
				
				
				
			}
			
		});
		
		
		
		
		
		
		GroupLayout gl_Aluno = new GroupLayout(Aluno);
		gl_Aluno.setHorizontalGroup(gl_Aluno.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Aluno.createSequentialGroup().addGroup(gl_Aluno.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Aluno.createSequentialGroup().addContainerGap().addComponent(list,
								GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE))
						.addGroup(gl_Aluno.createSequentialGroup().addGap(211).addComponent(adicionaraluno_botao)
								.addGap(64).addComponent(removeraluno_botao)))
						.addContainerGap()));
		gl_Aluno.setVerticalGroup(
				gl_Aluno.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Aluno.createSequentialGroup().addContainerGap()
								.addComponent(list, GroupLayout.PREFERRED_SIZE, 267, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addGroup(gl_Aluno.createParallelGroup(Alignment.BASELINE)
										.addComponent(adicionaraluno_botao).addComponent(removeraluno_botao))
								.addContainerGap(15, Short.MAX_VALUE)));
		Aluno.setLayout(gl_Aluno);

		JPanel Funcionário = new JPanel();
		tabbedPane.addTab("Funcionário", null, Funcionário, null);

		// METODO LISTAR FUNCIONARIO
		final FuncionarioDao funcionariolistar = new FuncionarioDao();
		final JList list_1 = new JList();

		List<Funcionario> funcionarios = null;
		try {
			funcionarios = funcionariolistar.listar();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

		list_1.setListData(funcionarios.toArray());

		JButton adicionarfuncionario_botao = new JButton("Adicionar Funcion\u00E1rio");
// REMOVER FUNCIONARIO
		JButton removerfuncionario_botao = new JButton("Remover Funcion\u00E1rio");
		
		removerfuncionario_botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
					
					try {
						funcionariolistar.remove( (Funcionario) list_1.getSelectedValue());
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				
				JOptionPane.showMessageDialog(null, "Funcionario removido com sucesso!");
				
				List<Funcionario> funcionarios = null;
				try {
					funcionarios = funcionariolistar.listar();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}

				list_1.setListData(funcionarios.toArray());
				
				
				
			}
			
		
		});
		
		
		
		
		
		
		
		GroupLayout gl_Funcionário = new GroupLayout(Funcionário);
		gl_Funcionário.setHorizontalGroup(gl_Funcionário.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Funcionário.createSequentialGroup()
						.addGroup(gl_Funcionário.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_Funcionário.createSequentialGroup().addContainerGap().addComponent(list_1,
										GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE))
								.addGroup(gl_Funcionário.createSequentialGroup().addGap(246)
										.addComponent(adicionarfuncionario_botao).addGap(31)
										.addComponent(removerfuncionario_botao)))
						.addContainerGap()));
		gl_Funcionário.setVerticalGroup(gl_Funcionário.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Funcionário.createSequentialGroup().addContainerGap()
						.addComponent(list_1, GroupLayout.PREFERRED_SIZE, 276, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addGroup(gl_Funcionário.createParallelGroup(Alignment.BASELINE)
								.addComponent(adicionarfuncionario_botao).addComponent(removerfuncionario_botao))
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		Funcionário.setLayout(gl_Funcionário);
		contentPane.add(tabbedPane);

		JButton voltar_botao = new JButton("Voltar");
		voltar_botao.setBounds(685, 11, 89, 23);
		contentPane.add(voltar_botao);
		voltar_botao.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Principal p = new Principal();
				p.setVisible(true);
				Admin.this.setVisible(false);
				Admin.this.dispose();
				// TODO Auto-generated method stub

			}
		});
		adicionaraluno_botao.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				AdicionarAlunoAdmin aaa = new AdicionarAlunoAdmin();
				aaa.setVisible(true);
				Admin.this.setVisible(false);
				Admin.this.dispose();
			}
		});
	}
}
