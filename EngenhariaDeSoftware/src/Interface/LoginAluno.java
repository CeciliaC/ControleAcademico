package Interface;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

import org.eclipse.wb.swing.FocusTraversalOnArray;

import Dao.LoginAlunoDao;

public class LoginAluno extends JFrame {

	private JPanel contentPane;
	private JTextField txtAluno;
	private JTextField txtAgronegcio;
	private JTextField textField_1;
	private JTextField txtAv;
	private JTextField textField;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginAluno frame = new LoginAluno();
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
	public LoginAluno() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 420);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNome = new JLabel("Nome:");
		
		txtAluno = new JTextField();
		txtAluno.setEditable(false);
		txtAluno.setColumns(10);
		
		txtAgronegcio = new JTextField();
		txtAgronegcio.setText("Agroneg\u00F3cio");
		txtAgronegcio.setEditable(false);
		txtAgronegcio.setColumns(10);
		
		JLabel lblCurso = new JLabel("Curso:");
		
		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento: ");
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o:");
		
		textField_1 = new JTextField();
		textField_1.setText("11/09/1991");
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		
		txtAv = new JTextField();
		txtAv.setText("Av. 1");
		txtAv.setEditable(false);
		txtAv.setColumns(10);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		
		JPanel Novo_Torpedo = new JPanel();
		tabbedPane.addTab("Novo Torpedo", null, Novo_Torpedo, null);
		
		JTextArea textArea = new JTextArea();
		
		JLabel lblPara = new JLabel("Para:");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblAssunto = new JLabel("Assunto:");
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JButton btnEnviar = new JButton("Enviar");
		GroupLayout gl_Novo_Torpedo = new GroupLayout(Novo_Torpedo);
		gl_Novo_Torpedo.setHorizontalGroup(
			gl_Novo_Torpedo.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Novo_Torpedo.createSequentialGroup()
					.addGroup(gl_Novo_Torpedo.createParallelGroup(Alignment.LEADING)
						.addComponent(textArea, GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
						.addGroup(gl_Novo_Torpedo.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblPara)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 231, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblAssunto)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_2, GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)))
					.addContainerGap())
				.addGroup(gl_Novo_Torpedo.createSequentialGroup()
					.addGap(242)
					.addComponent(btnEnviar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(268))
		);
		gl_Novo_Torpedo.setVerticalGroup(
			gl_Novo_Torpedo.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Novo_Torpedo.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_Novo_Torpedo.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPara)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblAssunto))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textArea, GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnEnviar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(5))
		);
		Novo_Torpedo.setLayout(gl_Novo_Torpedo);
		
		JPanel Caixa_de_Entrada = new JPanel();
		tabbedPane.addTab("Caixa de Entrada", null, Caixa_de_Entrada, null);
		GridBagLayout gbl_Caixa_de_Entrada = new GridBagLayout();
		gbl_Caixa_de_Entrada.columnWidths = new int[]{220, 464, 0};
		gbl_Caixa_de_Entrada.rowHeights = new int[]{14, 190, 0};
		gbl_Caixa_de_Entrada.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_Caixa_de_Entrada.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		Caixa_de_Entrada.setLayout(gbl_Caixa_de_Entrada);
		
		JLabel lblUsurios = new JLabel("Recebidas de:");
		GridBagConstraints gbc_lblUsurios = new GridBagConstraints();
		gbc_lblUsurios.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblUsurios.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsurios.gridx = 0;
		gbc_lblUsurios.gridy = 0;
		Caixa_de_Entrada.add(lblUsurios, gbc_lblUsurios);
		
		JTextArea textArea_1 = new JTextArea();
		GridBagConstraints gbc_textArea_1 = new GridBagConstraints();
		gbc_textArea_1.fill = GridBagConstraints.BOTH;
		gbc_textArea_1.gridheight = 2;
		gbc_textArea_1.gridx = 1;
		gbc_textArea_1.gridy = 0;
		Caixa_de_Entrada.add(textArea_1, gbc_textArea_1);
		
		JList list = new JList();
		GridBagConstraints gbc_list = new GridBagConstraints();
		gbc_list.fill = GridBagConstraints.BOTH;
		gbc_list.insets = new Insets(0, 0, 0, 5);
		gbc_list.gridx = 0;
		gbc_list.gridy = 1;
		Caixa_de_Entrada.add(list, gbc_list);
		
		JPanel Caixa_de_Saida = new JPanel();
		tabbedPane.addTab("Caixa de Saída", null, Caixa_de_Saida, null);
		GridBagLayout gbl_Caixa_de_Saida = new GridBagLayout();
		gbl_Caixa_de_Saida.columnWidths = new int[]{220, 472, 0};
		gbl_Caixa_de_Saida.rowHeights = new int[]{14, 190, 0};
		gbl_Caixa_de_Saida.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_Caixa_de_Saida.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		Caixa_de_Saida.setLayout(gbl_Caixa_de_Saida);
		
		JLabel lblEnviadasPara = new JLabel("Enviadas Para:");
		GridBagConstraints gbc_lblEnviadasPara = new GridBagConstraints();
		gbc_lblEnviadasPara.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblEnviadasPara.insets = new Insets(0, 0, 5, 5);
		gbc_lblEnviadasPara.gridx = 0;
		gbc_lblEnviadasPara.gridy = 0;
		Caixa_de_Saida.add(lblEnviadasPara, gbc_lblEnviadasPara);
		
		JTextArea textArea_2 = new JTextArea();
		GridBagConstraints gbc_textArea_2 = new GridBagConstraints();
		gbc_textArea_2.fill = GridBagConstraints.BOTH;
		gbc_textArea_2.gridheight = 2;
		gbc_textArea_2.gridx = 1;
		gbc_textArea_2.gridy = 0;
		Caixa_de_Saida.add(textArea_2, gbc_textArea_2);
		
		JList list_1 = new JList();
		GridBagConstraints gbc_list_1 = new GridBagConstraints();
		gbc_list_1.fill = GridBagConstraints.BOTH;
		gbc_list_1.insets = new Insets(0, 0, 0, 5);
		gbc_list_1.gridx = 0;
		gbc_list_1.gridy = 1;
		Caixa_de_Saida.add(list_1, gbc_list_1);
		
		JPanel panel = new JPanel();
		
		JList list_2 = new JList();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(15)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(31)
							.addComponent(txtAluno, GroupLayout.PREFERRED_SIZE, 386, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNome, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblCurso)
							.addComponent(txtAgronegcio, GroupLayout.PREFERRED_SIZE, 385, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(49)
							.addComponent(txtAv, GroupLayout.PREFERRED_SIZE, 368, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblEndereo, GroupLayout.PREFERRED_SIZE, 392, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblDataDeNascimento)
							.addGap(1)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)))
					.addGap(28)
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addContainerGap(77, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 558, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(list_2, GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(13)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(txtAluno, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(3)
									.addComponent(lblNome)))
							.addGap(6)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(3)
									.addComponent(lblCurso))
								.addComponent(txtAgronegcio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(6)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(3)
									.addComponent(lblDataDeNascimento))
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(8)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(txtAv, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(3)
									.addComponent(lblEndereo))))
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 242, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(28)
							.addComponent(list_2, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		
		JButton Situacao_Academica = new JButton("");
		Situacao_Academica.setIcon(new ImageIcon("C:\\Users\\Pedro\\Desktop\\hathathat.png"));
		Situacao_Academica.setSelectedIcon(new ImageIcon("C:\\Users\\Pedro\\Desktop\\college-512.png"));
		
		JButton Matricula = new JButton("");
		Matricula.setSelectedIcon(new ImageIcon("C:\\Users\\Pedro\\Desktop\\cracha.png"));
		Matricula.setIcon(new ImageIcon("C:\\Users\\Pedro\\Desktop\\cracha.png"));
		
		JLabel lblNewLabel = new JLabel("Situa\u00E7\u00E3o Acad\u00EAmica");
		
		JLabel lblMatrcula = new JLabel("Matr\u00EDcula");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(18)
							.addComponent(lblNewLabel))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(36)
							.addComponent(Situacao_Academica, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblMatrcula)
							.addGap(35))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(Matricula, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
							.addGap(18))))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(Matricula, 0, 0, Short.MAX_VALUE)
						.addComponent(Situacao_Academica, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblMatrcula)
						.addComponent(lblNewLabel))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
		contentPane.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{txtAv, lblNome, txtAluno, lblCurso, txtAgronegcio, lblDataDeNascimento, textField_1, lblEndereo, textArea, lblPara, textField, lblAssunto, textField_2, btnEnviar}));
		
		LoginAlunoDao lad = new LoginAlunoDao();
		LoginAluno.this.preencherPerfil(lad.getNome(), "", "");
		
		Situacao_Academica.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				SitucaoAcademica as = new SitucaoAcademica();
				as.setVisible(true);
				LoginAluno.this.setVisible(false);
				LoginAluno.this.dispose();
			}
		});
		Matricula.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Matricula m = new Matricula();
				m.setVisible(true);
				LoginAluno.this.setVisible(false);
				LoginAluno.this.dispose();
			}
		});
		
	}
	public void preencherPerfil(String nome, String curso, String endereco) {
		txtAluno.setText(nome);
	}
	
}
