package portfolio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;

public class principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					principal frame = new principal();
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
	public principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 669, 353);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("MEMORIA");
		btnNewButton.setFont(new Font("WritersFont", Font.PLAIN, 18));
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JogoDaMemoria jogo = new JogoDaMemoria();
				jogo.setVisible(true);
				
				
			}
		});
		btnNewButton.setBounds(21, 154, 124, 96);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("IMC");
		btnNewButton_1.setFont(new Font("WritersFont", Font.PLAIN, 28));
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBackground(Color.ORANGE);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CalculoIMC calculo = new CalculoIMC();
				calculo.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(21, 35, 124, 96);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("MEDIA");
		btnNewButton_2.setFont(new Font("WritersFont", Font.PLAIN, 24));
		btnNewButton_2.setBackground(Color.ORANGE);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CalculoMedia2 calc = new CalculoMedia2();
				calc.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(335, 37, 114, 94);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("SOBRE");
		btnNewButton_3.setFont(new Font("WritersFont", Font.PLAIN, 21));
		btnNewButton_3.setBackground(Color.ORANGE);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sobre sobre = new Sobre();
				sobre.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(335, 155, 114, 93);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("0 X 0 ");
		btnNewButton_4.setFont(new Font("WritersFont", Font.PLAIN, 27));
		btnNewButton_4.setBackground(Color.ORANGE);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tabuada conta = new Tabuada();
				conta.setVisible(false);
			}
		});
		btnNewButton_4.setBounds(175, 36, 124, 96);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("JokenPo");
		btnNewButton_5.setBackground(Color.ORANGE);
		btnNewButton_5.setFont(new Font("WritersFont", Font.PLAIN, 22));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PedraPapelTesoura jokenpo = new PedraPapelTesoura();
				jokenpo.setVisible(true);
			}
		});
		btnNewButton_5.setBounds(175, 153, 124, 96);
		contentPane.add(btnNewButton_5);
	}

}
