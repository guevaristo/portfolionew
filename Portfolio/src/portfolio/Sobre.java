package portfolio;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dialog.ModalExclusionType;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Sobre extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Sobre dialog = new Sobre();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Sobre() {
		setBackground(SystemColor.infoText);
		setTitle("Sobre");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 434, 251);
		contentPanel.setBackground(SystemColor.textHighlight);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		{
			JLabel lblNomeGustavoEvaristo = new JLabel("Nome: Gustavo Evaristo");
			lblNomeGustavoEvaristo.setBounds(25, 11, 172, 20);
			lblNomeGustavoEvaristo.setHorizontalAlignment(SwingConstants.LEFT);
			lblNomeGustavoEvaristo.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNomeGustavoEvaristo.setForeground(SystemColor.text);
			contentPanel.add(lblNomeGustavoEvaristo);
		}
		
		JLabel lblIdadeAnos = new JLabel("Idade 18 Anos");
		lblIdadeAnos.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblIdadeAnos.setForeground(SystemColor.window);
		lblIdadeAnos.setBounds(25, 60, 172, 14);
		contentPanel.add(lblIdadeAnos);
		
		JLabel lblGneroMasculino = new JLabel("G\u00EAnero: Masculino");
		lblGneroMasculino.setForeground(SystemColor.text);
		lblGneroMasculino.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblGneroMasculino.setBounds(20, 117, 219, 14);
		contentPanel.add(lblGneroMasculino);
		
		JLabel lblCursoTcnicoEm = new JLabel("Curso: T\u00E9cnico em inform\u00E1tica, SENAC");
		lblCursoTcnicoEm.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCursoTcnicoEm.setForeground(SystemColor.text);
		lblCursoTcnicoEm.setBounds(25, 167, 273, 14);
		contentPanel.add(lblCursoTcnicoEm);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 251, 434, 10);
			buttonPane.setBackground(SystemColor.scrollbar);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane);
		}
	}
}
