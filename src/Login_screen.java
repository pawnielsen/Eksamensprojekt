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


public class Login_screen extends JFrame {

	private JPanel contentPane;
	private JTextField txtBrugernavn;
	private JLabel lblUsername;
	private JPasswordField passwordField;
	private JLabel lblPassword;
	private JButton btnExit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_screen frame = new Login_screen();
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
	public Login_screen() {
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
		btnLogin.setBounds(246, 197, 117, 29);
		contentPane.add(btnLogin);
		
		lblUsername = new JLabel("Username");
		lblUsername.setBounds(124, 110, 95, 16);
		contentPane.add(lblUsername);
		
		passwordField = new JPasswordField();
		passwordField.setToolTipText("12345678");
		passwordField.setBounds(231, 144, 134, 28);
		contentPane.add(passwordField);
		
		lblPassword = new JLabel("Password");
		lblPassword.setBounds(125, 150, 61, 16);
		contentPane.add(lblPassword);
		
		btnExit = new JButton("Exit ");
		btnExit.setBounds(101, 197, 117, 29);
		contentPane.add(btnExit);
		
		JLabel lblCbsCalendar = new JLabel("CBS CALENDAR");
		lblCbsCalendar.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		lblCbsCalendar.setBounds(32, 46, 240, 28);
		contentPane.add(lblCbsCalendar);
	}
}
