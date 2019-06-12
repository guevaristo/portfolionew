package portfolio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.text.DecimalFormat;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculoMedia2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtNota1;
	private JTextField txtNota2;
	private JButton btnLimpar;
	private JLabel lblNewLabel;
	private JLabel lblMedia;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculoMedia2 frame = new CalculoMedia2();
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
	public CalculoMedia2() {
		setTitle("CalculoMedia");
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(CalculoMedia2.class.getResource("/icones/iconfinder_calculator_103862.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 362, 300);
		contentPane = new JPanel();
		contentPane.setToolTipText("calcular");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNota = new JLabel("Nota 1");
		lblNota.setBounds(23, 25, 48, 14);
		contentPane.add(lblNota);
		
		JLabel lblNota_1 = new JLabel("Nota 2");
		lblNota_1.setBounds(23, 72, 48, 14);
		contentPane.add(lblNota_1);
		
		txtNota1 = new JTextField();
		txtNota1.setBounds(71, 22, 96, 20);
		contentPane.add(txtNota1);
		txtNota1.setColumns(10);
		
		txtNota2 = new JTextField();
		txtNota2.setBounds(71, 69, 96, 20);
		contentPane.add(txtNota2);
		txtNota2.setColumns(10);
		
		JButton btnCalcular = new JButton("");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcular();
			}
		});
		btnCalcular.setIcon(new ImageIcon(CalculoMedia2.class.getResource("/icones/iconfinder_Calculater_78982.png")));
		btnCalcular.setBounds(28, 132, 128, 128);
		contentPane.add(btnCalcular);
		
		btnLimpar = new JButton("");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		btnLimpar.setToolTipText("limpar");
		btnLimpar.setIcon(new ImageIcon(CalculoMedia2.class.getResource("/icones/iconfinder_house-10_3940040.png")));
		btnLimpar.setBounds(193, 132, 128, 128);
		contentPane.add(btnLimpar);
		
		lblNewLabel = new JLabel("M\u00C9DIA");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(243, 25, 61, 14);
		contentPane.add(lblNewLabel);
		
		lblMedia = new JLabel("");
		lblMedia.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblMedia.setBounds(243, 58, 48, 14);
		contentPane.add(lblMedia);
	}
	
	// Método para Calcular a Média
	private void calcular() {
		//recurso Java para formatar casas decimais
		DecimalFormat formatador = new DecimalFormat("0.0");
		//criando variáveis
		double nota1, nota2, media;
		// a linha abaixo captura o conteúdo da caixa de texto, converte para o tipo Double, e armazena na variável (alt + shift + y > quebra linha automaticamente) >> . replace troca um caractere por outro 
		nota1 = Double.parseDouble(txtNota1.getText().replace(",", "."));
		nota2 = Double.parseDouble(txtNota2.getText().replace(",", "."));
		media = (nota1 + nota2) /2;
		lblMedia.setText(formatador.format(media));
		
		// showMessageDialog (caixa de mensagem)
		// null (tamanho padrão)
		// "TEXTO"
		// "TÍTULO"
		// ÍCONE
		
		if (media <5) {
		JOptionPane.showMessageDialog(null,"Reprovado!", "Status", JOptionPane.ERROR_MESSAGE);
		} else {
		JOptionPane.showMessageDialog(null, "Aprovado!","Status",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	// método para limpar os campos 
	private void limpar() {
		txtNota1.setText(null);
		txtNota2.setText(null);
		lblMedia.setText(null);
	}

		
}
