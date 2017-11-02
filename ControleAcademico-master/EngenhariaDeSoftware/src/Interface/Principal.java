package Interface;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

import Dao.PrincipalDao;
import Model.Aluno;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JTextField textField_Login;
	private JPasswordField textField_Senha;
	private JLabel lblLogin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		textField_Login = new JTextField();
		textField_Login.setForeground(Color.BLACK);
		textField_Login.setColumns(10);
		
		textField_Senha = new JPasswordField();
		textField_Senha.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha");
		
		lblLogin = new JLabel("Login");
		
		final JButton btnEntrar = new JButton("Entrar");
		
		btnEntrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int nome = Integer.parseInt(textField_Login.getText());
				String psd = textField_Senha.getText();
				PrincipalDao pd = new PrincipalDao();
				
				if(pd.buscarLoginAluno(nome, psd)) {
					LoginAluno la = new LoginAluno();
					la.setA(pd.getAluno());
					la.setVisible(true);
					Principal.this.setVisible(false);
					Principal.this.dispose();
				}else {
					if(pd.buscarLoginAdmin(nome, psd)) {
						Admin ad = new Admin();
						ad.setVisible(true);
						Principal.this.setVisible(false);
						Principal.this.dispose();
					}
					
				}
				
			}
		});
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(176)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(textField_Login, Alignment.LEADING)
						.addComponent(textField_Senha, Alignment.LEADING))
					.addGap(162))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addGap(201)
					.addComponent(lblSenha, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(193))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addGap(203)
					.addComponent(lblLogin, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(196))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addGap(188)
					.addComponent(btnEntrar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(173))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addGap(68)
					.addComponent(lblLogin, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_Login, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblSenha)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_Senha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnEntrar)
					.addGap(51))
		);
		contentPane.setLayout(gl_contentPane);
	}
}

