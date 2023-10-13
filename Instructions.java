package quizGame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Instructions extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Instructions frame = new Instructions();
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
	public Instructions() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 828, 547);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBackground(new Color(255, 228, 181));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblInstr = new JLabel("INSTRUCTIONS");
		lblInstr.setForeground(new Color(75, 0, 130));
		lblInstr.setFont(new Font("Sitka Text", Font.BOLD, 25));
		lblInstr.setBounds(278, 23, 218, 58);
		contentPane.add(lblInstr);
		
		JLabel lblNewLabel = new JLabel("Welcome ,");
		lblNewLabel.setForeground(new Color(128, 0, 128));
		lblNewLabel.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 35));
		lblNewLabel.setBounds(47, 103, 145, 37);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("to this Quiz game!!");
		lblNewLabel_1.setForeground(new Color(255, 20, 147));
		lblNewLabel_1.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 26));
		lblNewLabel_1.setBounds(196, 109, 218, 29);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("<html>Below are some of the instructions that you may require during the game :"
				+ "<br>"
				+ "<br> 1. The game is of 150 seconds."
				+ "<br> 2. You can choose any question and answer it accordingly."
				+ "<br> 3. You can leave any question and review it later."
				+ "<br> 4. Each question comprises of 5 marks. There is no negative marking."
				+ "<br> 5. All the best and enjoy the game!!!");
		lblNewLabel_2.setForeground(new Color(255, 20, 147));
		lblNewLabel_2.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 22));
		lblNewLabel_2.setBounds(57, 173, 707, 265);
		contentPane.add(lblNewLabel_2);
		
		JButton btnPlay = new JButton("PLAY");
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Game g = new Game();
				g.setVisible(true);
			}
		});
		btnPlay.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPlay.setBounds(229, 462, 89, 29);
		contentPane.add(btnPlay);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(ABORT);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnExit.setBounds(506, 462, 95, 29);
		contentPane.add(btnExit);
	}
}
