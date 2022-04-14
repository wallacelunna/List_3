package List_3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.EventQueue;
public class Eleicao extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	float candidatoA=0, candidatoB=0, nulo=0, branco=0, totalvotos = 0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Eleicao frame = new Eleicao();
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
	public Eleicao() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ELEI\u00C7\u00C3O");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(181, 11, 64, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Lula - 13");
		lblNewLabel_1.setBounds(41, 59, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Bolsonaro - 25");
		lblNewLabel_2.setBounds(41, 84, 78, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Voto em Branco - 1");
		lblNewLabel_3.setBounds(41, 109, 99, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Anular Voto - 2");
		lblNewLabel_4.setBounds(41, 134, 99, 14);
		contentPane.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(181, 170, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Voto");
		lblNewLabel_5.setBounds(137, 173, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("Confirmar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int Voto= Integer.parseInt(textField.getText());
				switch (Voto)
				{
				case 13:
					candidatoA++;
					JOptionPane.showMessageDialog(null,"Voto registrado com sucesso", "Eleição",JOptionPane.INFORMATION_MESSAGE);
					break;
				case 25:
					candidatoB++;
					JOptionPane.showMessageDialog(null,"Voto registrado com sucesso", "Eleição",JOptionPane.INFORMATION_MESSAGE);
					break;
				case 1:
					nulo++;
					JOptionPane.showMessageDialog(null,"Voto registrado com sucesso", "Eleição",JOptionPane.INFORMATION_MESSAGE);
					break;
				case 2:
					branco++;
					JOptionPane.showMessageDialog(null,"Voto registrado com sucesso", "Eleição",JOptionPane.INFORMATION_MESSAGE);
					break;
				default:
					JOptionPane.showMessageDialog(null,"Digite um número válido", "Eleição",JOptionPane.ERROR_MESSAGE);
				}
				textField.setText("");
				textField.setFocusable(isEnabled());
			}
		});
		btnNewButton.setBounds(97, 212, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField.setFocusable(isEnabled());
			}
		});
		
		btnNewButton_1.setBounds(266, 212, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Apurar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				totalvotos= candidatoA+candidatoB+nulo+branco;
				if (candidatoA > candidatoB) {
					//quem ganhou foi o candidato A
					float result=(candidatoA/totalvotos)*100;
					JOptionPane.showMessageDialog(null, "Candidato Vencedor: Lula, com "+ result + " %","Resultado",JOptionPane.INFORMATION_MESSAGE);
				}
				else if (candidatoB >candidatoA) {
					float result=(candidatoB/totalvotos)*100;
					JOptionPane.showMessageDialog(null, "Candidato Vencedor: Bolsonaro, com "+ result + " %","Resultado",JOptionPane.INFORMATION_MESSAGE);
				}
					
				else
					JOptionPane.showMessageDialog(null, "Empate entre os dois candidatos "+ candidatoB/totalvotos*100 +  "%","Resultado",JOptionPane.INFORMATION_MESSAGE);
			}
		
		});
		btnNewButton_2.setBounds(335, 55, 89, 23);
		contentPane.add(btnNewButton_2);
		
  
	}
}
