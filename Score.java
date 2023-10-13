package quizGame;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Score extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Score frame = new Score(0);
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
	public Score(int score) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 535, 453);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0, 80));
		panel.setBounds(0, 0, 519, 415);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lbltext = new JLabel("Your Score is : "+score);
		lbltext.setForeground(new Color(255, 255, 0));
		lbltext.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 35));
		lbltext.setBounds(97, 46, 285, 52);
		panel.add(lbltext);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(ABORT);
			}
		});
		btnExit.setForeground(new Color(255, 255, 255));
		btnExit.setBackground(new Color(220, 20, 60));
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnExit.setBounds(197, 354, 89, 33);
		panel.add(btnExit);
		
		JLabel lblImg = new JLabel("");
		lblImg.setBounds(0, 0, 519, 415);
		contentPane.add(lblImg);
		ImageIcon icon1 = (new ImageIcon(Score.class.getResource("/img/images/img2.jpg")));
		Image img1 = icon1.getImage();
		Image imgScale = img1.getScaledInstance(lblImg.getWidth(), lblImg.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon scaledIcon = new ImageIcon(imgScale);
		lblImg.setIcon(scaledIcon);
		
	}
}
