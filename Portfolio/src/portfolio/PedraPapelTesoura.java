package portfolio;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.SwingConstants;

public class PedraPapelTesoura extends JFrame {

	private JPanel contentPane;
	private JLabel lblComputador;
	private JLabel lblVde;
	private JPanel panel;
	private JLabel lblVj;
	private JLabel lblVc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PedraPapelTesoura frame = new PedraPapelTesoura();
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
	public PedraPapelTesoura() {
		setResizable(false);
		setTitle("JOGO");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 673, 392);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.textHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnPedra = new JButton("");
		btnPedra.setToolTipText("PEDRA");
		btnPedra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jogador = 1;
				jogar();
			}
		});
		btnPedra.setIcon(new ImageIcon(PedraPapelTesoura.class.getResource("/icones/pedra.png")));
		btnPedra.setBounds(23, 67, 70, 70);
		contentPane.add(btnPedra);
		
		JButton btnPapel = new JButton("");
		btnPapel.setToolTipText("PAPEL");
		btnPapel.setIcon(new ImageIcon(PedraPapelTesoura.class.getResource("/icones/papel.png")));
		btnPapel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jogador = 2;
				jogar();
			}
		});
		btnPapel.setBounds(122, 67, 70, 70);
		contentPane.add(btnPapel);
		
		JButton btnTesoura = new JButton("");
		btnTesoura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jogador = 3;
				jogar();
			}
		});
		btnTesoura.setToolTipText("TESOURA");
		btnTesoura.setIcon(new ImageIcon(PedraPapelTesoura.class.getResource("/icones/tesoura.png")));
		btnTesoura.setBounds(217, 67, 70, 70);
		contentPane.add(btnTesoura);
		
		JLabel lblNewLabel = new JLabel("Jogada");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel.setBounds(120, 21, 128, 35);
		contentPane.add(lblNewLabel);
		
		lblComputador = new JLabel("");
		lblComputador.setBounds(122, 202, 70, 70);
		contentPane.add(lblComputador);
		
		JLabel lblComp = new JLabel("Computador");
		lblComp.setFont(new Font("Arial", Font.BOLD, 14));
		lblComp.setBounds(38, 167, 93, 35);
		contentPane.add(lblComp);
		
		JLabel lblScore = new JLabel("SCORE:");
		lblScore.setFont(new Font("Arial", Font.BOLD, 14));
		lblScore.setBounds(406, 32, 61, 14);
		contentPane.add(lblScore);
		
		//Painel de exibição
		panel = new JPanel();
		panel.setBackground(SystemColor.textHighlight);
		panel.setForeground(Color.BLACK);
		panel.setBounds(319, 56, 338, 167);
		contentPane.add(panel);
		panel.setLayout(null);
		
		//Label score do jogador
		lblVj = new JLabel("");
		lblVj.setBounds(21, 11, 172, 25);
		panel.add(lblVj);
		
		//Label score no Computador
		lblVc = new JLabel("");
		lblVc.setBounds(10, 71, 172, 25);
		panel.add(lblVc);
		
		//Label de exibição
		lblVde = new JLabel("");
		lblVde.setBounds(175, 130, 153, 26);
		panel.add(lblVde);
		
		
	}
	// Score do jogador e computador
	int jogador, sj, sc; 
	// JOGAR
	private void jogar(){
		//btnTesoura.setIcon(new ImageIcon(PedraPapelTesoura.class.getResource("/br/com/icons/tesoura.png")));
	
		int computador = (int) (Math.random() * 3 + 1);
		
		switch(computador){
		case 1:
			lblComputador.setIcon(new ImageIcon(PedraPapelTesoura.class.getResource("/icones/pedra.png")));
			break;
		case 2:
			lblComputador.setIcon(new ImageIcon(PedraPapelTesoura.class.getResource("/icones/papel.png")));
			break;
		case 3:
			lblComputador.setIcon(new ImageIcon(PedraPapelTesoura.class.getResource("/icones/tesoura.png")));
			break;
		}
		
		if (jogador == computador) {
			lblVde.setText("EMPATE"); 
		} else {
			if ((jogador == 3 && computador == 2) || (jogador == 1 && computador == 3) || (jogador == 2 && computador == 1)) {
				lblVde.setText("JOGADOR VENCEU");
				lblVj.setText("Pontos do Jogador: " + ++sj);
				
			} else {
				lblVde.setText("COMPUTADOR VENCEU");
				lblVc.setText("Pontos do Computador: " + ++sc);
			}	
	}
		if (sj == 3 && sj > sc) {
			JOptionPane.showMessageDialog(null, "JOGADOR GANHOU O JOGO");
		} else if (sc == 3 && sc > sj){
			JOptionPane.showMessageDialog(null, "COMPUTADOR GANHOU O JOGO");
		}else {
		}
		
} //Fim do game
}//Fim do codenn