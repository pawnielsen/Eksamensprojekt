package GUI;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JRadioButton;


public class LoginScreen extends JFrame {

	

	//Private Labels, buttons and textfields for headlines at the LoginScreen
	private JPanel contentPane;
	private JTextField txtBrugernavn;
	private JLabel lblUsername;
	private JPasswordField passwordField;
	private JLabel lblPassword;
	private JButton btnExit;
	private JLabel lblWelcomeToCbs;
	private JLabel lblPleaseSignIn;

	
	public LoginScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtBrugernavn = new JTextField();
		txtBrugernavn.setText("Enter Username...");
		txtBrugernavn.setBounds(231, 104, 134, 28);
		contentPane.add(txtBrugernavn);
		txtBrugernavn.setColumns(10);
		
		JButton btnLogin = new JButton("Log-in");
		btnLogin.setBounds(279, 220, 117, 29);
		contentPane.add(btnLogin); 
		btnLogin.addMouseListener(new MouseAdapter() 
		{
			public void mouseClicked(MouseEvent e) 
			{
				dispose();
				WeekView frame = new WeekView();
				frame.setVisible(true);
			}
		});

		
		lblUsername = new JLabel("Username");
		lblUsername.setBounds(124, 110, 95, 16);
		contentPane.add(lblUsername);
		
		passwordField = new JPasswordField();
		passwordField.setToolTipText("1234");
		passwordField.setBounds(231, 144, 134, 28);
		contentPane.add(passwordField);
		
		lblPassword = new JLabel("Password");
		lblPassword.setBounds(125, 150, 61, 16);
		contentPane.add(lblPassword);
		
		btnExit = new JButton("Exit ");
		btnExit.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			System.exit(0);
		}
	});
		btnExit.setBounds(117, 220, 117, 29);
		contentPane.add(btnExit);
		dispose();

		
		JLabel lblCbsCalendar = new JLabel("CBS CALENDAR");
		lblCbsCalendar.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		lblCbsCalendar.setBounds(32, 17, 240, 28);
		contentPane.add(lblCbsCalendar);
		
		JRadioButton rdbtnRememberAccount = new JRadioButton("Remember account");
		rdbtnRememberAccount.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		rdbtnRememberAccount.setBounds(231, 184, 145, 23);
		contentPane.add(rdbtnRememberAccount);
		
		lblWelcomeToCbs = new JLabel("Welcome to CBS Calendar");
		lblWelcomeToCbs.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		lblWelcomeToCbs.setBounds(32, 57, 177, 16);
		contentPane.add(lblWelcomeToCbs);
		
		lblPleaseSignIn = new JLabel("Please sign in with your CBS account");
		lblPleaseSignIn.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		lblPleaseSignIn.setBounds(32, 75, 240, 16);
		contentPane.add(lblPleaseSignIn);
	}
}
