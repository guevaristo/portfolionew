package portfolio;

import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Tabuada extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tabuada frame = new Tabuada();
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
	public Tabuada() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);


		int x = 1;
		int y = 0;
		int result = 0;
		String mostrar = "";
		while (x <= 10) {
			while (y < 10) {
				y = y + 1;
				result = x * y;
				mostrar = mostrar + "\n" + x + " x " + y + " = " + result;
			}
			JOptionPane.showMessageDialog(null, "Tabuada do " + x + mostrar);
			y = 0;
			x = x + 1;
			mostrar = "";
		}
	}
	}


