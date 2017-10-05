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

public class NotasFrequencia extends JFrame {

	private JPanel trocar_cuso;
	private JTextField np1;
	private JTextField np2;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NotasFrequencia frame = new NotasFrequencia();
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
	public NotasFrequencia() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 420);
		trocar_cuso = new JPanel();
		trocar_cuso.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(trocar_cuso);
		
		JLabel disciplina = new JLabel("Disciplina ");
		disciplina.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		np1 = new JTextField();
		np1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nota Parcial 1 :");
		
		np2 = new JTextField();
		np2.setColumns(10);
		
		JLabel lblNotaParcial = new JLabel("Nota Parcial 2 :");
		
		JLabel lblFev = new JLabel("Fevereiro:");
		
		JLabel lblMar = new JLabel("Mar\u00E7o:");
		
		JLabel lblAbril = new JLabel("Abril:");
		
		JLabel lblMaio = new JLabel("Maio:");
		
		JLabel lblJunho = new JLabel("Junho:");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		JLabel lblAgosto = new JLabel("Agosto:");
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		
		JLabel lblSetembro = new JLabel("Setembro:");
		
		JLabel lblOutubro = new JLabel("Outubro:");
		
		JLabel lblNovembro = new JLabel("Novembro:");
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		GroupLayout gl_trocar_cuso = new GroupLayout(trocar_cuso);
		gl_trocar_cuso.setHorizontalGroup(
			gl_trocar_cuso.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_trocar_cuso.createSequentialGroup()
					.addGroup(gl_trocar_cuso.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_trocar_cuso.createSequentialGroup()
							.addGap(54)
							.addGroup(gl_trocar_cuso.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_trocar_cuso.createSequentialGroup()
									.addComponent(lblNotaParcial)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(np2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_trocar_cuso.createSequentialGroup()
									.addComponent(lblNewLabel)
									.addGap(35)
									.addComponent(np1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addGap(183)
							.addGroup(gl_trocar_cuso.createParallelGroup(Alignment.LEADING)
								.addComponent(lblFev)
								.addComponent(lblMar)
								.addComponent(lblAbril)
								.addComponent(lblMaio)
								.addComponent(lblJunho))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_trocar_cuso.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_trocar_cuso.createSequentialGroup()
									.addGroup(gl_trocar_cuso.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_trocar_cuso.createSequentialGroup()
											.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addGap(18)
											.addComponent(lblOutubro))
										.addGroup(gl_trocar_cuso.createSequentialGroup()
											.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addGap(18)
											.addComponent(lblNovembro))
										.addGroup(gl_trocar_cuso.createSequentialGroup()
											.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addGap(18)
											.addComponent(lblAgosto))
										.addGroup(gl_trocar_cuso.createSequentialGroup()
											.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addGap(18)
											.addComponent(lblSetembro)))
									.addGap(18)
									.addGroup(gl_trocar_cuso.createParallelGroup(Alignment.LEADING)
										.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
						.addGroup(gl_trocar_cuso.createSequentialGroup()
							.addGap(260)
							.addComponent(disciplina, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(28, Short.MAX_VALUE))
		);
		gl_trocar_cuso.setVerticalGroup(
			gl_trocar_cuso.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_trocar_cuso.createSequentialGroup()
					.addContainerGap()
					.addComponent(disciplina)
					.addGap(38)
					.addGroup(gl_trocar_cuso.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_trocar_cuso.createSequentialGroup()
							.addGroup(gl_trocar_cuso.createParallelGroup(Alignment.BASELINE)
								.addComponent(np1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel)
								.addComponent(lblFev)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblAgosto))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_trocar_cuso.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblMar)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblSetembro)))
						.addGroup(gl_trocar_cuso.createSequentialGroup()
							.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(8)
					.addGroup(gl_trocar_cuso.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNotaParcial)
						.addComponent(np2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblAbril)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblOutubro)
						.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_trocar_cuso.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblMaio)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNovembro)
						.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(13)
					.addGroup(gl_trocar_cuso.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblJunho)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(148, Short.MAX_VALUE))
		);
		trocar_cuso.setLayout(gl_trocar_cuso);
	}

}
