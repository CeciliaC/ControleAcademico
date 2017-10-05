package Interface;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

public class SitucaoAcademica extends JFrame {

	private JPanel contentPane;
	private JTextField nome;
	private JTextField matriculatextField;
	private JTextField cred_cursados;
	private JTextField cred_faltam;
	private JTextField pmg;
	private JTextField cred_exigidos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SitucaoAcademica frame = new SitucaoAcademica();
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
	public SitucaoAcademica() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 420);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblSituaoAcademica = new JLabel("Situa\u00E7\u00E3o Academica");
		lblSituaoAcademica.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblNewLabel = new JLabel("Nome :");
		
		nome = new JTextField();
		nome.setEnabled(false);
		nome.setColumns(10);
		
		JLabel matricula = new JLabel("Matricula :");
		
		matriculatextField = new JTextField();
		matriculatextField.setEnabled(false);
		matriculatextField.setColumns(10);
		
		JLabel lblCreditosCursados = new JLabel("Creditos cursados :");
		
		cred_cursados = new JTextField();
		cred_cursados.setEnabled(false);
		cred_cursados.setColumns(10);
		
		JLabel lblCreditosQueFaltam = new JLabel("Creditos que faltam :");
		
		cred_faltam = new JTextField();
		cred_faltam.setEnabled(false);
		cred_faltam.setColumns(10);
		
		JLabel lblPmg = new JLabel("PMG :");
		
		pmg = new JTextField();
		pmg.setEnabled(false);
		pmg.setColumns(10);
		
		JLabel lblCreditosExigidos = new JLabel("Creditos exigidos :");
		
		cred_exigidos = new JTextField();
		cred_exigidos.setEnabled(false);
		cred_exigidos.setColumns(10);
		
		JButton btnVoltar = new JButton("Voltar");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblSituaoAcademica)
							.addGap(166)
							.addComponent(btnVoltar))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(47)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(nome, GroupLayout.PREFERRED_SIZE, 264, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(matricula)
									.addGap(18)
									.addComponent(matriculatextField, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblCreditosQueFaltam, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblCreditosExigidos)
										.addComponent(lblPmg, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)))
								.addComponent(lblCreditosCursados))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(pmg, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(cred_cursados, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(cred_faltam, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(cred_exigidos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addGap(65))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnVoltar)
						.addComponent(lblSituaoAcademica))
					.addGap(71)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel)
								.addComponent(nome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(27)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(matricula)
								.addComponent(matriculatextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblCreditosCursados)
								.addComponent(cred_cursados, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(18)
									.addComponent(cred_faltam, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(21)
									.addComponent(lblCreditosQueFaltam)))))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblCreditosExigidos)
						.addComponent(cred_exigidos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(pmg, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPmg))
					.addContainerGap(119, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}

}
