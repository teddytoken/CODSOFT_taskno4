package quizGame;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JTabbedPane;
import javax.swing.Timer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Game extends JFrame {

	private JPanel contentPane;
	JTabbedPane tabbedPane;
	public static int timer = 150;
	ButtonGroup groupOpt;
	private int start = 1;
	JLabel lblOutput_1;
	JLabel lblExp_1;
	public static int score = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Game frame = new Game();
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
	public Game() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(90, 10, 890, 663);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 876, 626);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_01 = new JPanel();
		panel_01.setBackground(new Color(0, 0, 0));
		panel_01.setBounds(0, 0, 876, 68);
		panel.add(panel_01);
		panel_01.setLayout(null);
		
		JPanel panel_02 = new JPanel();
		panel_02.setBackground(new Color(192, 192, 192));
		panel_02.setBounds(0, 68, 152, 558);
		panel.add(panel_02);
		
		JPanel panel_q1 = new JPanel();
		panel_q1.setBackground(new Color(255, 215, 0));
		panel_q1.setBounds(0, 41, 152, 27);
		panel_q1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(0);
			}
		});
		panel_02.setLayout(null);
		panel_02.add(panel_q1);
		panel_q1.setLayout(null);
		
		JLabel lblQues1 = new JLabel("Question 1");
		lblQues1.setFont(new Font("Century", Font.BOLD, 20));
		lblQues1.setBounds(10, 0, 121, 25);
		panel_q1.add(lblQues1);
		
		JPanel panel_q2 = new JPanel();
		panel_q2.setBackground(new Color(255, 215, 0));
		panel_q2.setBounds(0, 89, 152, 27);
		panel_q2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(1);
			}
		});
		panel_02.add(panel_q2);
		panel_q2.setLayout(null);
		
		JLabel lblQues2 = new JLabel("Question 2");
		lblQues2.setFont(new Font("Century", Font.BOLD, 20));
		lblQues2.setBounds(10, 0, 121, 25);
		panel_q2.add(lblQues2);
		
		JPanel panel_q3 = new JPanel();
		panel_q3.setBackground(new Color(255, 215, 0));
		panel_q3.setBounds(0, 139, 152, 27);
		panel_q3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(2);
			}
		});
		panel_02.add(panel_q3);
		panel_q3.setLayout(null);
		
		JLabel lblQues3 = new JLabel("Question 3");
		lblQues3.setFont(new Font("Century", Font.BOLD, 20));
		lblQues3.setBounds(10, 0, 121, 25);
		panel_q3.add(lblQues3);
		
		JPanel panel_q4 = new JPanel();
		panel_q4.setBackground(new Color(255, 215, 0));
		panel_q4.setBounds(0, 186, 152, 27);
		panel_q4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(3);
			}
		});
		panel_02.add(panel_q4);
		panel_q4.setLayout(null);
		
		JLabel lblQues4 = new JLabel("Question 4");
		lblQues4.setFont(new Font("Century", Font.BOLD, 20));
		lblQues4.setBounds(10, 0, 121, 25);
		panel_q4.add(lblQues4);
		
		JPanel panel_q5 = new JPanel();
		panel_q5.setBackground(new Color(255, 215, 0));
		panel_q5.setBounds(0, 236, 152, 27);
		panel_q5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(4);
			}
		});
		panel_02.add(panel_q5);
		panel_q5.setLayout(null);
		
		JLabel lblQues5 = new JLabel("Question 5");
		lblQues5.setFont(new Font("Century", Font.BOLD, 20));
		lblQues5.setBounds(10, 0, 121, 25);
		panel_q5.add(lblQues5);
		
		JPanel panel_q6 = new JPanel();
		panel_q6.setBackground(new Color(255, 215, 0));
		panel_q6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(5);
			}
		});
		panel_q6.setBounds(0, 286, 152, 27);
		panel_02.add(panel_q6);
		panel_q6.setLayout(null);
		
		JLabel lblQues6 = new JLabel("Question 6");
		lblQues6.setFont(new Font("Century", Font.BOLD, 20));
		lblQues6.setBounds(10, 0, 121, 25);
		panel_q6.add(lblQues6);
		
		JPanel panel_q7 = new JPanel();
		panel_q7.setBackground(new Color(255, 215, 0));
		panel_q7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(6);
			}
		});
		panel_q7.setBounds(0, 339, 152, 27);
		panel_02.add(panel_q7);
		panel_q7.setLayout(null);
		
		JLabel lblQues7 = new JLabel("Question 7");
		lblQues7.setFont(new Font("Century", Font.BOLD, 20));
		lblQues7.setBounds(10, 0, 121, 25);
		panel_q7.add(lblQues7);
		
		JPanel panel_q8 = new JPanel();
		panel_q8.setBackground(new Color(255, 215, 0));
		panel_q8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(7);
			}
		});
		panel_q8.setBounds(0, 389, 152, 27);
		panel_02.add(panel_q8);
		panel_q8.setLayout(null);
		
		JLabel lblQues8 = new JLabel("Question 8");
		lblQues8.setFont(new Font("Century", Font.BOLD, 20));
		lblQues8.setBounds(10, 0, 121, 25);
		panel_q8.add(lblQues8);
		
		JPanel panel_q9 = new JPanel();
		panel_q9.setBackground(new Color(255, 215, 0));
		panel_q9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(8);
			}
		});
		panel_q9.setBounds(0, 439, 152, 27);
		panel_02.add(panel_q9);
		panel_q9.setLayout(null);
		
		JLabel lblQues9 = new JLabel("Question 9");
		lblQues9.setFont(new Font("Century", Font.BOLD, 20));
		lblQues9.setBounds(10, 0, 121, 25);
		panel_q9.add(lblQues9);
		
		JPanel panel_q10 = new JPanel();
		panel_q10.setBackground(new Color(255, 215, 0));
		panel_q10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(9);
			}
		});
		panel_q10.setBounds(0, 491, 152, 27);
		panel_02.add(panel_q10);
		panel_q10.setLayout(null);
		
		JLabel lblQues10 = new JLabel("Question 10");
		lblQues10.setFont(new Font("Century", Font.BOLD, 20));
		lblQues10.setBounds(10, 0, 121, 25);
		panel_q10.add(lblQues10);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(153, 42, 723, 584);
		panel.add(tabbedPane);
		
		JPanel panel_no1 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_no1, null);
		panel_no1.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(72, 61, 139));
		panel_1.setBounds(0, 0, 718, 556);
		panel_no1.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_10_1 = new JPanel();
		panel_10_1.setLayout(null);
		panel_10_1.setBackground(new Color(72, 61, 139));
		panel_10_1.setBounds(0, 0, 718, 556);
		panel_1.add(panel_10_1);
		
		JCheckBox chckbx4 = new JCheckBox("Bjarne Stroustrup");
		chckbx4.setBounds(83, 276, 220, 28);
		panel_10_1.add(chckbx4);
		chckbx4.setForeground(new Color(255, 255, 0));
		chckbx4.setBackground(new Color(72, 61, 139));
		chckbx4.setFont(new Font("Tahoma", Font.PLAIN, 22));
		
		JCheckBox chckbx3 = new JCheckBox("Dennis Ritchie");
		chckbx3.setBounds(83, 225, 220, 28);
		panel_10_1.add(chckbx3);
		chckbx3.setForeground(new Color(255, 255, 0));
		chckbx3.setBackground(new Color(72, 61, 139));
		chckbx3.setFont(new Font("Tahoma", Font.PLAIN, 22));
		
		JCheckBox chckbx2 = new JCheckBox("James Gosling");
		chckbx2.setBounds(83, 173, 220, 28);
		panel_10_1.add(chckbx2);
		chckbx2.setForeground(new Color(255, 255, 0));
		chckbx2.setBackground(new Color(72, 61, 139));
		chckbx2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		
		JCheckBox chckbx1 = new JCheckBox("Guido van Rossum");
		chckbx1.setBounds(83, 121, 220, 28);
		panel_10_1.add(chckbx1);
		chckbx1.setForeground(new Color(255, 255, 0));
		chckbx1.setBackground(new Color(72, 61, 139));
		chckbx1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		
		groupOpt = new ButtonGroup();
		groupOpt.add(chckbx1);
		groupOpt.add(chckbx2);
		groupOpt.add(chckbx3);
		groupOpt.add(chckbx4);
		
		JButton btnCheck = new JButton("CHECK");
		btnCheck.setFont(new Font("Century", Font.BOLD, 20));
		btnCheck.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(chckbx1.isSelected()) {
					lblOutput_1.setText("Wrong answer!!");
				}
				else if(chckbx2.isSelected()) {
					lblOutput_1.setText("Right answer!!");
				}
				else if(chckbx3.isSelected()) {
					lblOutput_1.setText("Wrong answer!!");
				}
				else {
					lblOutput_1.setText("Wrong answer!!");
				}
				lblExp_1.setText("<html>Java programming was developed by James Gosling at Sun Microsystems in 1995.<br> James Gosling is well known as the father of Java.</html>");
			}
		});
		btnCheck.setBounds(195, 493, 118, 33);
		panel_10_1.add(btnCheck);
		
		lblOutput_1 = new JLabel("");
		lblOutput_1.setForeground(new Color(240, 255, 255));
		lblOutput_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblOutput_1.setBounds(195, 351, 246, 33);
		panel_10_1.add(lblOutput_1);
		
		lblExp_1 = new JLabel("");
		lblExp_1.setForeground(new Color(240, 255, 255));
		lblExp_1.setFont(new Font("Perpetua", Font.BOLD | Font.ITALIC, 20));
		lblExp_1.setBounds(25, 413, 657, 56);
		panel_10_1.add(lblExp_1);
		
		JLabel lblLabel1 = new JLabel("Who invented Java Programming ?");
		lblLabel1.setBounds(41, 55, 484, 36);
		panel_10_1.add(lblLabel1);
		lblLabel1.setForeground(new Color(255, 255, 255));
		lblLabel1.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 25));
		
		JButton btnNext = new JButton("NEXT");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(1);
				if(chckbx2.isSelected()) {
					score += 10;
				}else {
					score += 0;
				}
			}
		});
		btnNext.setFont(new Font("Century", Font.BOLD, 20));
		btnNext.setBounds(459, 493, 118, 33);
		panel_10_1.add(btnNext);
		
		JPanel panel_no2 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_no2, null);
		panel_no2.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(154, 205, 50));
		panel_2.setBounds(0, 0, 718, 556);
		panel_no2.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblLabel2 = new JLabel("Which one of the following is not a Java feature?");
		lblLabel2.setBackground(new Color(154, 205, 50));
		lblLabel2.setForeground(Color.WHITE);
		lblLabel2.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 25));
		lblLabel2.setBounds(36, 58, 632, 36);
		panel_2.add(lblLabel2);
		
		JCheckBox chckbx2_1 = new JCheckBox("Object-oriented");
		chckbx2_1.setForeground(new Color(0, 0, 128));
		chckbx2_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		chckbx2_1.setBackground(new Color(154, 205, 50));
		chckbx2_1.setBounds(76, 122, 220, 28);
		panel_2.add(chckbx2_1);
		
		JCheckBox chckbx2_2 = new JCheckBox("Use of pointers");
		chckbx2_2.setForeground(new Color(0, 0, 128));
		chckbx2_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		chckbx2_2.setBackground(new Color(154, 205, 50));
		chckbx2_2.setBounds(76, 171, 220, 28);
		panel_2.add(chckbx2_2);
		
		JCheckBox chckbx2_3 = new JCheckBox("Portable");
		chckbx2_3.setForeground(new Color(0, 0, 128));
		chckbx2_3.setFont(new Font("Tahoma", Font.PLAIN, 22));
		chckbx2_3.setBackground(new Color(154, 205, 50));
		chckbx2_3.setBounds(76, 221, 163, 28);
		panel_2.add(chckbx2_3);
		
		JCheckBox chckbx2_4 = new JCheckBox("Dynamic and extensible");
		chckbx2_4.setForeground(new Color(0, 0, 128));
		chckbx2_4.setFont(new Font("Tahoma", Font.PLAIN, 22));
		chckbx2_4.setBackground(new Color(154, 205, 50));
		chckbx2_4.setBounds(76, 268, 260, 28);
		panel_2.add(chckbx2_4);
		
		JLabel lblOutput2 = new JLabel("");
		lblOutput2.setBackground(new Color(154, 205, 50));
		lblOutput2.setForeground(new Color(240, 255, 255));
		lblOutput2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblOutput2.setBounds(207, 347, 246, 33);
		panel_2.add(lblOutput2);
		
		JLabel lblExp2 = new JLabel("");
		lblExp2.setBackground(new Color(154, 205, 50));
		lblExp2.setForeground(new Color(240, 255, 255));
		lblExp2.setFont(new Font("Perpetua", Font.BOLD | Font.ITALIC, 20));
		lblExp2.setBounds(36, 391, 657, 56);
		panel_2.add(lblExp2);
		
		groupOpt = new ButtonGroup();
		groupOpt.add(chckbx2_1);
		groupOpt.add(chckbx2_2);
		groupOpt.add(chckbx2_3);
		groupOpt.add(chckbx2_4);
		
		JButton btnCheck2 = new JButton("CHECK");
		btnCheck2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(chckbx2_1.isSelected()) {
					lblOutput2.setText("Wrong answer!!");
				}
				else if(chckbx2_2.isSelected()) {
					lblOutput2.setText("Right answer!!");
				}
				else if(chckbx2_3.isSelected()) {
					lblOutput2.setText("Wrong answer!!");
				}
				else {
					lblOutput2.setText("Wrong answer!!");
				}
				lblExp2.setText("<html>Pointers is not a Java feature. Java provides an efficient abstraction layer for developing without using a pointer in Java.</html>");
			}
		});
		btnCheck2.setFont(new Font("Century", Font.BOLD, 20));
		btnCheck2.setBounds(149, 499, 118, 33);
		panel_2.add(btnCheck2);
		
		JLabel lblOutput_2 = new JLabel("");
		lblOutput_2.setForeground(new Color(240, 255, 255));
		lblOutput_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblOutput_2.setBounds(207, 335, 246, 33);
		panel_2.add(lblOutput_2);
		
		JLabel lblExp_2 = new JLabel("");
		lblExp_2.setForeground(new Color(240, 255, 255));
		lblExp_2.setFont(new Font("Perpetua", Font.BOLD | Font.ITALIC, 20));
		lblExp_2.setBounds(36, 404, 657, 56);
		panel_2.add(lblExp_2);
		
		JButton btnNext2 = new JButton("NEXT");
		btnNext2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(2);
				if(chckbx2_2.isSelected()) {
					score += 10;
				}else {
					score += 0;
				}
			}
		});
		btnNext2.setFont(new Font("Century", Font.BOLD, 20));
		btnNext2.setBounds(439, 499, 118, 33);
		panel_2.add(btnNext2);
		
		JPanel panel_no3 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_no3, null);
		panel_no3.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(240, 128, 128));
		panel_3.setBounds(0, 0, 718, 556);
		panel_no3.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblLabel3 = new JLabel("<html>Which environment variable is used to set the java<br> path?</html>");
		lblLabel3.setForeground(Color.WHITE);
		lblLabel3.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 25));
		lblLabel3.setBackground(new Color(240, 128, 128));
		lblLabel3.setBounds(31, 57, 644, 74);
		panel_3.add(lblLabel3);
		
		JCheckBox chckbx3_1 = new JCheckBox("JAVA_HOME");
		chckbx3_1.setForeground(Color.YELLOW);
		chckbx3_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		chckbx3_1.setBackground(new Color(240, 128, 128));
		chckbx3_1.setBounds(67, 156, 220, 28);
		panel_3.add(chckbx3_1);
		
		JCheckBox chckbx3_2 = new JCheckBox("JavaPATH");
		chckbx3_2.setForeground(Color.YELLOW);
		chckbx3_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		chckbx3_2.setBackground(new Color(240, 128, 128));
		chckbx3_2.setBounds(67, 205, 220, 28);
		panel_3.add(chckbx3_2);
		
		JCheckBox chckbx3_3 = new JCheckBox("JAVA");
		chckbx3_3.setForeground(Color.YELLOW);
		chckbx3_3.setFont(new Font("Tahoma", Font.PLAIN, 22));
		chckbx3_3.setBackground(new Color(240, 128, 128));
		chckbx3_3.setBounds(67, 255, 220, 28);
		panel_3.add(chckbx3_3);
		
		JCheckBox chckbx3_4 = new JCheckBox("MAVEN_Path");
		chckbx3_4.setForeground(Color.YELLOW);
		chckbx3_4.setFont(new Font("Tahoma", Font.PLAIN, 22));
		chckbx3_4.setBackground(new Color(240, 128, 128));
		chckbx3_4.setBounds(67, 306, 220, 28);
		panel_3.add(chckbx3_4);
		
		JLabel lblOutput_3 = new JLabel("");
		lblOutput_3.setForeground(new Color(240, 255, 255));
		lblOutput_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblOutput_3.setBounds(214, 364, 246, 33);
		panel_3.add(lblOutput_3);
		
		JLabel lblExp_3 = new JLabel("");
		lblExp_3.setForeground(new Color(240, 255, 255));
		lblExp_3.setFont(new Font("Perpetua", Font.BOLD | Font.ITALIC, 20));
		lblExp_3.setBounds(54, 402, 526, 41);
		panel_3.add(lblExp_3);
		
		JButton btnCheck3 = new JButton("CHECK");
		btnCheck3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbx3_1.isSelected()) {
					lblOutput_3.setText("Right answer!!");
				}
				else if(chckbx3_2.isSelected()) {
					lblOutput_3.setText("Wrong answer!!");
				}
				else if(chckbx3_3.isSelected()) {
					lblOutput_3.setText("Wrong answer!!");
				}
				else {
					lblOutput_3.setText("Wrong answer!!");
				}
				lblExp_3.setText("JAVA_HOME is used to store a path to the java installation.");
			}
		});
		btnCheck3.setFont(new Font("Century", Font.BOLD, 20));
		btnCheck3.setBounds(160, 493, 118, 33);
		panel_3.add(btnCheck3);
		
		JButton btnNext3 = new JButton("NEXT");
		btnNext3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(3);
				if(chckbx3_1.isSelected()) {
					score += 10;
				}else {
					score += 0;
				}
			}
		});
		btnNext3.setFont(new Font("Century", Font.BOLD, 20));
		btnNext3.setBounds(445, 493, 118, 33);
		panel_3.add(btnNext3);
		
		JPanel panel_no4 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_no4, null);
		panel_no4.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(199, 21, 133));
		panel_4.setBounds(0, 0, 718, 556);
		panel_no4.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblLabel4 = new JLabel("<html>Which of the following is a type of polymorphism <br>in Java Programming?</html>");
		lblLabel4.setForeground(Color.WHITE);
		lblLabel4.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 25));
		lblLabel4.setBackground(new Color(199, 21, 133));
		lblLabel4.setBounds(35, 41, 644, 90);
		panel_4.add(lblLabel4);
		
		JCheckBox chckbx4_1 = new JCheckBox("Multiple polymorphism");
		chckbx4_1.setForeground(Color.YELLOW);
		chckbx4_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		chckbx4_1.setBackground(new Color(199, 21, 133));
		chckbx4_1.setBounds(71, 151, 288, 28);
		panel_4.add(chckbx4_1);
		
		JCheckBox chckbx4_2 = new JCheckBox("Compile time polymorphism");
		chckbx4_2.setForeground(Color.YELLOW);
		chckbx4_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		chckbx4_2.setBackground(new Color(199, 21, 133));
		chckbx4_2.setBounds(71, 205, 316, 28);
		panel_4.add(chckbx4_2);
		
		JCheckBox chckbx4_3 = new JCheckBox("Multilevel polymorphism");
		chckbx4_3.setForeground(Color.YELLOW);
		chckbx4_3.setFont(new Font("Tahoma", Font.PLAIN, 22));
		chckbx4_3.setBackground(new Color(199, 21, 133));
		chckbx4_3.setBounds(71, 262, 264, 28);
		panel_4.add(chckbx4_3);
		
		JCheckBox chckbx4_4 = new JCheckBox("Execution time polymorphism");
		chckbx4_4.setForeground(Color.YELLOW);
		chckbx4_4.setFont(new Font("Tahoma", Font.PLAIN, 22));
		chckbx4_4.setBackground(new Color(199, 21, 133));
		chckbx4_4.setBounds(71, 314, 316, 28);
		panel_4.add(chckbx4_4);
		
		JLabel lblOutput_4 = new JLabel("");
		lblOutput_4.setForeground(new Color(240, 255, 255));
		lblOutput_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblOutput_4.setBounds(210, 378, 246, 33);
		panel_4.add(lblOutput_4);
		
		JLabel lblExp_4 = new JLabel("");
		lblExp_4.setForeground(new Color(240, 255, 255));
		lblExp_4.setFont(new Font("Perpetua", Font.BOLD | Font.ITALIC, 20));
		lblExp_4.setBounds(32, 422, 657, 70);
		panel_4.add(lblExp_4);
		
		JButton btnCheck4 = new JButton("CHECK");
		btnCheck4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbx4_1.isSelected()) {
					lblOutput_4.setText("Wrong answer!!");
					score =+ 0;	
				}
				else if(chckbx4_2.isSelected()) {
					lblOutput_4.setText("Right answer!!");
					score =+ 10;	
				}
				else if(chckbx4_3.isSelected()) {
					lblOutput_4.setText("Wrong answer!!");
					score =+ 0;	
				}
				else {
					lblOutput_4.setText("Wrong answer!!");
					score =+ 0;	
				}
				lblExp_4.setText("<html>There are two types of polymorphism in Java. Compile time polymorphism<br>(overloading) and runtime polymorphism(overriding).</html>");
			}
		});
		btnCheck4.setFont(new Font("Century", Font.BOLD, 20));
		btnCheck4.setBounds(162, 503, 118, 33);
		panel_4.add(btnCheck4);
		
		JButton btnNext4 = new JButton("NEXT");
		btnNext4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(4);
				if(chckbx4_2.isSelected()) {
					score += 10;
				}else {
					score += 0;
				}
			}
		});
		btnNext4.setFont(new Font("Century", Font.BOLD, 20));
		btnNext4.setBounds(443, 503, 118, 33);
		panel_4.add(btnNext4);
		
		JPanel panel_no5 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_no5, null);
		panel_no5.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(70, 130, 180));
		panel_5.setBounds(0, 0, 718, 556);
		panel_no5.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblLabel5 = new JLabel("What is truncation in Java?");
		lblLabel5.setForeground(Color.WHITE);
		lblLabel5.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 25));
		lblLabel5.setBackground(new Color(70, 130, 180));
		lblLabel5.setBounds(42, 38, 377, 69);
		panel_5.add(lblLabel5);
		
		JCheckBox chckbx5_1 = new JCheckBox("Floating-point value assigned to a Floating-type");
		chckbx5_1.setForeground(Color.YELLOW);
		chckbx5_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		chckbx5_1.setBackground(new Color(70, 130, 180));
		chckbx5_1.setBounds(75, 114, 497, 28);
		panel_5.add(chckbx5_1);
		
		JCheckBox chckbx5_2 = new JCheckBox("Floating-point value assigned to an integer type");
		chckbx5_2.setForeground(Color.YELLOW);
		chckbx5_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		chckbx5_2.setBackground(new Color(70, 130, 180));
		chckbx5_2.setBounds(75, 168, 497, 28);
		panel_5.add(chckbx5_2);
		
		JCheckBox chckbx5_3 = new JCheckBox("Integer value assigned to floating type");
		chckbx5_3.setForeground(Color.YELLOW);
		chckbx5_3.setFont(new Font("Tahoma", Font.PLAIN, 22));
		chckbx5_3.setBackground(new Color(70, 130, 180));
		chckbx5_3.setBounds(75, 223, 414, 28);
		panel_5.add(chckbx5_3);
		
		JCheckBox chckbx5_4 = new JCheckBox("Floating value assigned to floating type");
		chckbx5_4.setForeground(Color.YELLOW);
		chckbx5_4.setFont(new Font("Tahoma", Font.PLAIN, 22));
		chckbx5_4.setBackground(new Color(70, 130, 180));
		chckbx5_4.setBounds(75, 277, 414, 28);
		panel_5.add(chckbx5_4);
		
		JLabel lblOutput_5 = new JLabel("");
		lblOutput_5.setForeground(new Color(240, 255, 255));
		lblOutput_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblOutput_5.setBounds(188, 352, 246, 33);
		panel_5.add(lblOutput_5);
		
		JLabel lblExp_5 = new JLabel("");
		lblExp_5.setForeground(new Color(240, 255, 255));
		lblExp_5.setFont(new Font("Perpetua", Font.BOLD | Font.ITALIC, 20));
		lblExp_5.setBounds(57, 396, 155, 56);
		panel_5.add(lblExp_5);
		
		JButton btnCheck5 = new JButton("CHECK");
		btnCheck5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbx5_1.isSelected()) {
					lblOutput_5.setText("Wrong answer!!");
				}
				else if(chckbx5_2.isSelected()) {
					lblOutput_5.setText("Right answer!!");
				}
				else if(chckbx5_3.isSelected()) {
					lblOutput_5.setText("Wrong answer!!");
				}
				else {
					lblOutput_5.setText("Wrong answer!!");
				}
				lblExp_5.setText("None.");
			}
		});
		btnCheck5.setFont(new Font("Century", Font.BOLD, 20));
		btnCheck5.setBounds(165, 500, 118, 33);
		panel_5.add(btnCheck5);
		
		JButton btnNext5 = new JButton("NEXT");
		btnNext5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(5);
				if(chckbx5_2.isSelected()) {
					score += 10;
				}else {
					score += 0;
				}
			}
		});
		btnNext5.setFont(new Font("Century", Font.BOLD, 20));
		btnNext5.setBounds(432, 500, 118, 33);
		panel_5.add(btnNext5);
		
		JPanel panel_no6 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_no6, null);
		panel_no6.setLayout(null);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(0, 139, 139));
		panel_6.setBounds(0, 0, 718, 556);
		panel_no6.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblLabel6 = new JLabel("<html>Which exception is thrown when java is out of <br>memory?</html>");
		lblLabel6.setForeground(Color.WHITE);
		lblLabel6.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 25));
		lblLabel6.setBackground(new Color(0, 139, 139));
		lblLabel6.setBounds(32, 39, 644, 90);
		panel_6.add(lblLabel6);
		
		JCheckBox chckbx6_1 = new JCheckBox("MemoryError");
		chckbx6_1.setForeground(Color.YELLOW);
		chckbx6_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		chckbx6_1.setBackground(new Color(0, 139, 139));
		chckbx6_1.setBounds(71, 146, 497, 28);
		panel_6.add(chckbx6_1);
		
		JCheckBox chckbx6_2 = new JCheckBox("OutOfMemoryError");
		chckbx6_2.setForeground(Color.YELLOW);
		chckbx6_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		chckbx6_2.setBackground(new Color(0, 139, 139));
		chckbx6_2.setBounds(71, 200, 497, 28);
		panel_6.add(chckbx6_2);
		
		JCheckBox chckbx6_3 = new JCheckBox("MemoryOutOfBoundsException");
		chckbx6_3.setForeground(Color.YELLOW);
		chckbx6_3.setFont(new Font("Tahoma", Font.PLAIN, 22));
		chckbx6_3.setBackground(new Color(0, 139, 139));
		chckbx6_3.setBounds(71, 255, 497, 28);
		panel_6.add(chckbx6_3);
		
		JCheckBox chckbx6_4 = new JCheckBox("MemoryFullException");
		chckbx6_4.setForeground(Color.YELLOW);
		chckbx6_4.setFont(new Font("Tahoma", Font.PLAIN, 22));
		chckbx6_4.setBackground(new Color(0, 139, 139));
		chckbx6_4.setBounds(71, 311, 497, 28);
		panel_6.add(chckbx6_4);
		
		JLabel lblOutput_6 = new JLabel("");
		lblOutput_6.setForeground(new Color(240, 255, 255));
		lblOutput_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblOutput_6.setBounds(216, 367, 246, 33);
		panel_6.add(lblOutput_6);
		
		JLabel lblExp_6 = new JLabel("");
		lblExp_6.setForeground(new Color(240, 255, 255));
		lblExp_6.setFont(new Font("Perpetua", Font.BOLD | Font.ITALIC, 20));
		lblExp_6.setBounds(32, 411, 657, 70);
		panel_6.add(lblExp_6);
		
		JButton btnCheck6 = new JButton("CHECK");
		btnCheck6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbx6_1.isSelected()) {
					lblOutput_6.setText("Wrong answer!!");
				}
				else if(chckbx6_2.isSelected()) {
					lblOutput_6.setText("Right answer!!");
				}
				else if(chckbx6_3.isSelected()) {
					lblOutput_6.setText("Wrong answer!!");
				}
				else {
					lblOutput_6.setText("Wrong answer!!");
				}
				lblExp_6.setText("<html>The Xms flag has no default value, and Xmx typically has a default value of 256MB.<br> A common use for these flags is when you encounter a java.lang.OutOfMemoryError.</html>");
			}
		});
		btnCheck6.setFont(new Font("Century", Font.BOLD, 20));
		btnCheck6.setBounds(178, 499, 118, 33);
		panel_6.add(btnCheck6);
		
		JButton btnNext6 = new JButton("NEXT");
		btnNext6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(6);
				if(chckbx6_2.isSelected()) {
					score += 10;
				}else {
					score += 0;
				}
			}
		});
		btnNext6.setFont(new Font("Century", Font.BOLD, 20));
		btnNext6.setBounds(428, 499, 118, 33);
		panel_6.add(btnNext6);
		
		JPanel panel_no7 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_no7, null);
		panel_no7.setLayout(null);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(255, 20, 147));
		panel_7.setBounds(0, 0, 718, 556);
		panel_no7.add(panel_7);
		panel_7.setLayout(null);
		
		JLabel lblLabel7 = new JLabel("Which of these are selection statements in Java?");
		lblLabel7.setForeground(Color.WHITE);
		lblLabel7.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 25));
		lblLabel7.setBackground(new Color(255, 20, 147));
		lblLabel7.setBounds(48, 40, 617, 67);
		panel_7.add(lblLabel7);
		
		JCheckBox chckbx7_1 = new JCheckBox("break");
		chckbx7_1.setForeground(new Color(0, 0, 128));
		chckbx7_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		chckbx7_1.setBackground(new Color(255, 20, 147));
		chckbx7_1.setBounds(87, 126, 121, 28);
		panel_7.add(chckbx7_1);
		
		JCheckBox chckbx7_2 = new JCheckBox("continue");
		chckbx7_2.setForeground(new Color(0, 0, 128));
		chckbx7_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		chckbx7_2.setBackground(new Color(255, 20, 147));
		chckbx7_2.setBounds(87, 171, 135, 28);
		panel_7.add(chckbx7_2);
		
		JCheckBox chckbx7_3 = new JCheckBox("if()");
		chckbx7_3.setForeground(new Color(0, 0, 128));
		chckbx7_3.setFont(new Font("Tahoma", Font.PLAIN, 22));
		chckbx7_3.setBackground(new Color(255, 20, 147));
		chckbx7_3.setBounds(87, 219, 101, 28);
		panel_7.add(chckbx7_3);
		
		JCheckBox chckbx7_4 = new JCheckBox("for()");
		chckbx7_4.setForeground(new Color(0, 0, 128));
		chckbx7_4.setFont(new Font("Tahoma", Font.PLAIN, 22));
		chckbx7_4.setBackground(new Color(255, 20, 147));
		chckbx7_4.setBounds(87, 269, 93, 28);
		panel_7.add(chckbx7_4);
		
		JLabel lblOutput_7 = new JLabel("");
		lblOutput_7.setForeground(new Color(240, 255, 255));
		lblOutput_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblOutput_7.setBounds(170, 341, 246, 33);
		panel_7.add(lblOutput_7);
		
		JLabel lblExp_7 = new JLabel("");
		lblExp_7.setForeground(new Color(240, 255, 255));
		lblExp_7.setFont(new Font("Perpetua", Font.BOLD | Font.ITALIC, 20));
		lblExp_7.setBounds(35, 387, 657, 56);
		panel_7.add(lblExp_7);
		
		JButton btnCheck7 = new JButton("CHECK");
		btnCheck7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbx7_1.isSelected()) {
					lblOutput_7.setText("Wrong answer!!");
				}
				else if(chckbx7_2.isSelected()) {
					lblOutput_7.setText("Wrong answer!!");
				}
				else if(chckbx7_3.isSelected()) {
					lblOutput_7.setText("Right answer!!");
				}
				else {
					lblOutput_7.setText("Wrong answer!!");
				}
				lblExp_7.setText("Continue and break are jump statements, and for is a looping statement.");
			}
		});
		btnCheck7.setFont(new Font("Century", Font.BOLD, 20));
		btnCheck7.setBounds(194, 490, 118, 33);
		panel_7.add(btnCheck7);
		
		JButton btnNext7 = new JButton("NEXT");
		btnNext7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(7);
				if(chckbx7_3.isSelected()) {
					score += 10;
				}else {
					score += 0;
				}
			}
		});
		btnNext7.setFont(new Font("Century", Font.BOLD, 20));
		btnNext7.setBounds(414, 490, 118, 33);
		panel_7.add(btnNext7);
		
		JPanel panel_no8 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_no8, null);
		panel_no8.setLayout(null);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(128, 128, 128));
		panel_8.setBounds(0, 0, 718, 556);
		panel_no8.add(panel_8);
		panel_8.setLayout(null);
		
		JLabel lblLabel8 = new JLabel("<html>Which of these keywords is used to define interfaces <br>in Java?</html>");
		lblLabel8.setForeground(Color.WHITE);
		lblLabel8.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 25));
		lblLabel8.setBackground(new Color(128, 128, 128));
		lblLabel8.setBounds(30, 28, 664, 109);
		panel_8.add(lblLabel8);
		
		JCheckBox chckbx8_1 = new JCheckBox("interface");
		chckbx8_1.setForeground(new Color(0, 0, 128));
		chckbx8_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		chckbx8_1.setBackground(new Color(128, 128, 128));
		chckbx8_1.setBounds(69, 149, 220, 28);
		panel_8.add(chckbx8_1);
		
		JCheckBox chckbx8_2 = new JCheckBox("Intf");
		chckbx8_2.setForeground(new Color(0, 0, 128));
		chckbx8_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		chckbx8_2.setBackground(new Color(128, 128, 128));
		chckbx8_2.setBounds(69, 202, 220, 28);
		panel_8.add(chckbx8_2);
		
		JCheckBox chckbx8_3 = new JCheckBox("intf");
		chckbx8_3.setForeground(new Color(0, 0, 128));
		chckbx8_3.setFont(new Font("Tahoma", Font.PLAIN, 22));
		chckbx8_3.setBackground(new Color(128, 128, 128));
		chckbx8_3.setBounds(69, 255, 220, 28);
		panel_8.add(chckbx8_3);
		
		JCheckBox chckbx8_4 = new JCheckBox("Interface");
		chckbx8_4.setForeground(new Color(0, 0, 128));
		chckbx8_4.setFont(new Font("Tahoma", Font.PLAIN, 22));
		chckbx8_4.setBackground(new Color(128, 128, 128));
		chckbx8_4.setBounds(69, 311, 220, 28);
		panel_8.add(chckbx8_4);
		
		JLabel lblOutput_8 = new JLabel("");
		lblOutput_8.setForeground(new Color(240, 255, 255));
		lblOutput_8.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblOutput_8.setBounds(192, 361, 246, 33);
		panel_8.add(lblOutput_8);
		
		JLabel lblExp_8 = new JLabel("");
		lblExp_8.setForeground(new Color(240, 255, 255));
		lblExp_8.setFont(new Font("Perpetua", Font.BOLD | Font.ITALIC, 20));
		lblExp_8.setBounds(30, 415, 657, 56);
		panel_8.add(lblExp_8);
		
		JButton btnCheck_8 = new JButton("CHECK");
		btnCheck_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbx8_1.isSelected()) {
					lblOutput_8.setText("Right answer!!");
				}
				else if(chckbx8_2.isSelected()) {
					lblOutput_8.setText("Wrong answer!!");
				}
				else if(chckbx8_3.isSelected()) {
					lblOutput_8.setText("Wrong answer!!");
				}
				else {
					lblOutput_8.setText("Wrong answer!!");
				}
				lblExp_8.setText("interface keyword is used to define interfaces in Java.");
			}
		});
		btnCheck_8.setFont(new Font("Century", Font.BOLD, 20));
		btnCheck_8.setBounds(192, 500, 118, 33);
		panel_8.add(btnCheck_8);
		
		JButton btnNext8 = new JButton("NEXT");
		btnNext8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(8);
				if(chckbx8_1.isSelected()) {
					score += 10;
				}else {
					score += 0;
				}
			}
		});
		btnNext8.setFont(new Font("Century", Font.BOLD, 20));
		btnNext8.setBounds(421, 500, 118, 33);
		panel_8.add(btnNext8);
		
		JPanel panel_no9 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_no9, null);
		panel_no9.setLayout(null);
		
		JPanel panel_9 = new JPanel();
		panel_9.setLayout(null);
		panel_9.setBackground(new Color(219, 112, 147));
		panel_9.setBounds(0, 0, 718, 556);
		panel_no9.add(panel_9);
		
		JLabel lblLabel9 = new JLabel("<html>Which of the following is a superclass of every class<br> in Java?</html>");
		lblLabel9.setForeground(Color.WHITE);
		lblLabel9.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 25));
		lblLabel9.setBackground(new Color(219, 112, 147));
		lblLabel9.setBounds(27, 37, 664, 109);
		panel_9.add(lblLabel9);
		
		JCheckBox chckbx9_1 = new JCheckBox("ArrayList");
		chckbx9_1.setForeground(new Color(0, 0, 128));
		chckbx9_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		chckbx9_1.setBackground(new Color(219, 112, 147));
		chckbx9_1.setBounds(64, 153, 220, 28);
		panel_9.add(chckbx9_1);
		
		JCheckBox chckbx9_2 = new JCheckBox("Abstract class");
		chckbx9_2.setForeground(new Color(0, 0, 128));
		chckbx9_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		chckbx9_2.setBackground(new Color(219, 112, 147));
		chckbx9_2.setBounds(64, 214, 220, 28);
		panel_9.add(chckbx9_2);
		
		JCheckBox chckbx9_3 = new JCheckBox("Object class");
		chckbx9_3.setForeground(new Color(0, 0, 128));
		chckbx9_3.setFont(new Font("Tahoma", Font.PLAIN, 22));
		chckbx9_3.setBackground(new Color(219, 112, 147));
		chckbx9_3.setBounds(64, 274, 220, 28);
		panel_9.add(chckbx9_3);
		
		JCheckBox chckbx9_4 = new JCheckBox("String");
		chckbx9_4.setForeground(new Color(0, 0, 128));
		chckbx9_4.setFont(new Font("Tahoma", Font.PLAIN, 22));
		chckbx9_4.setBackground(new Color(219, 112, 147));
		chckbx9_4.setBounds(64, 332, 220, 28);
		panel_9.add(chckbx9_4);
		
		JLabel lblOutput_9 = new JLabel("");
		lblOutput_9.setForeground(new Color(240, 255, 255));
		lblOutput_9.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblOutput_9.setBounds(183, 383, 246, 33);
		panel_9.add(lblOutput_9);
		
		JLabel lblExp_9 = new JLabel("");
		lblExp_9.setForeground(new Color(240, 255, 255));
		lblExp_9.setFont(new Font("Perpetua", Font.BOLD | Font.ITALIC, 20));
		lblExp_9.setBounds(27, 427, 657, 42);
		panel_9.add(lblExp_9);
		
		JButton btnCheck9 = new JButton("CHECK");
		btnCheck9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbx9_1.isSelected()) {
					lblOutput_9.setText("Wrong answer!!");
				}
				else if(chckbx9_2.isSelected()) {
					lblOutput_9.setText("Wrong answer!!");
				}
				else if(chckbx9_3.isSelected()) {
					lblOutput_9.setText("Right answer!!");
				}
				else {
					lblOutput_9.setText("Wrong answer!!");
				}
				lblExp_9.setText("Object class is superclass of every class in Java.");
			}
		});
		btnCheck9.setFont(new Font("Century", Font.BOLD, 20));
		btnCheck9.setBounds(183, 492, 118, 33);
		panel_9.add(btnCheck9);
		
		JButton btnNext9 = new JButton("NEXT");
		btnNext9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(9);
				if(chckbx9_3.isSelected()) {
					score += 10;
				}else {
					score += 0;
				}
			}
		});
		btnNext9.setFont(new Font("Century", Font.BOLD, 20));
		btnNext9.setBounds(391, 492, 118, 33);
		panel_9.add(btnNext9);
		
		JPanel panel_no10 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_no10, null);
		panel_no10.setLayout(null);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(new Color(102, 205, 170));
		panel_10.setBounds(0, 0, 718, 556);
		panel_no10.add(panel_10);
		panel_10.setLayout(null);
		
		JLabel lblLabel10 = new JLabel("<html>What is the numerical range of a char data type<br> in Java?</html>");
		lblLabel10.setForeground(Color.WHITE);
		lblLabel10.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 25));
		lblLabel10.setBackground(new Color(102, 205, 170));
		lblLabel10.setBounds(26, 29, 664, 109);
		panel_10.add(lblLabel10);
		
		JCheckBox chckbx10_1 = new JCheckBox("0 to 32767");
		chckbx10_1.setForeground(new Color(0, 0, 128));
		chckbx10_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		chckbx10_1.setBackground(new Color(102, 205, 170));
		chckbx10_1.setBounds(71, 145, 220, 28);
		panel_10.add(chckbx10_1);
		
		JCheckBox chckbx10_2 = new JCheckBox("-128 to 127");
		chckbx10_2.setForeground(new Color(0, 0, 128));
		chckbx10_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		chckbx10_2.setBackground(new Color(102, 205, 170));
		chckbx10_2.setBounds(71, 196, 220, 28);
		panel_10.add(chckbx10_2);
		
		JCheckBox chckbx10_3 = new JCheckBox("0 to 65535");
		chckbx10_3.setForeground(new Color(0, 0, 128));
		chckbx10_3.setFont(new Font("Tahoma", Font.PLAIN, 22));
		chckbx10_3.setBackground(new Color(102, 205, 170));
		chckbx10_3.setBounds(71, 248, 220, 28);
		panel_10.add(chckbx10_3);
		
		JCheckBox chckbx10_4 = new JCheckBox("0 to 256");
		chckbx10_4.setForeground(new Color(0, 0, 128));
		chckbx10_4.setFont(new Font("Tahoma", Font.PLAIN, 22));
		chckbx10_4.setBackground(new Color(102, 205, 170));
		chckbx10_4.setBounds(71, 307, 220, 28);
		panel_10.add(chckbx10_4);
		
		JLabel lblOutput_10 = new JLabel("");
		lblOutput_10.setForeground(new Color(240, 255, 255));
		lblOutput_10.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblOutput_10.setBounds(202, 360, 246, 33);
		panel_10.add(lblOutput_10);
		
		JLabel lblExp_10 = new JLabel("");
		lblExp_10.setForeground(new Color(240, 255, 255));
		lblExp_10.setFont(new Font("Perpetua", Font.BOLD | Font.ITALIC, 20));
		lblExp_10.setBounds(26, 404, 657, 56);
		panel_10.add(lblExp_10);
		
		JButton btnCheck10 = new JButton("CHECK");
		btnCheck10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbx10_1.isSelected()) {
					lblOutput_10.setText("Right answer!!");
				}
				else if(chckbx10_2.isSelected()) {
					lblOutput_10.setText("Wrong answer!!");
				}
				else if(chckbx10_3.isSelected()) {
					lblOutput_10.setText("Wrong answer!!");
				}
				else {
					lblOutput_10.setText("Wrong answer!!");
				}
				lblExp_10.setText("Char occupies 16-bit in memory, so it supports 2^16 i.e. from 0 to 65535.");
			}
		});
		btnCheck10.setFont(new Font("Century", Font.BOLD, 20));
		btnCheck10.setBounds(155, 488, 118, 33);
		panel_10.add(btnCheck10);
		
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbx10_1.isSelected()) {
					score += 10;
				}else {
					score += 0;
				}
				Score s = new Score(score);
				s.setVisible(true);
			}
		});
		btnSubmit.setFont(new Font("Century", Font.BOLD, 20));
		btnSubmit.setBounds(407, 488, 132, 33);
		panel_10.add(btnSubmit);
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		
		String time = "Time left - " + timer + " seconds";
		g.setColor(Color.RED);
		g.setFont(new Font("Tahoma", Font.BOLD, 25));
		
		if(timer >  0) {
			g.drawString(time, 550, 80);
		}else {
			g.drawString("Times Up!!", 550, 80);		
		}
		timer--;

		
		try {
			Thread.sleep(1000);
			repaint();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
