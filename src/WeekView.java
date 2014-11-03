import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;


public class WeekView extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WeekView frame = new WeekView();
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
	public WeekView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Monday");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(25, 40, 61, 16);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("tuesday");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(100, 40, 61, 16);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Wednesday");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(175, 40, 71, 16);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("Thursday");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(260, 40, 61, 16);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("Friday");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBounds(335, 40, 61, 16);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("Saturday");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setBounds(405, 40, 61, 16);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("Sunday");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setBounds(480, 40, 61, 16);
		contentPane.add(label_5);
	}

}
