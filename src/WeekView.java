import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTable;


public class WeekView extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;

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
		setBounds(100, 100, 800, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Monday");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(162, 44, 61, 16);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("tuesday");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(237, 44, 61, 16);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Wednesday");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(312, 44, 71, 16);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("Thursday");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(397, 44, 61, 16);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("Friday");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBounds(472, 44, 61, 16);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("Saturday");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setBounds(542, 44, 61, 16);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("Sunday");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setBounds(617, 44, 61, 16);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("06.00");
		label_6.setBounds(53, 90, 61, 16);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("07.00");
		label_7.setBounds(53, 110, 61, 16);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("08.00");
		label_8.setBounds(53, 158, 61, 16);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("09.00");
		label_9.setBounds(53, 186, 61, 16);
		contentPane.add(label_9);
		
		JLabel label_10 = new JLabel("10.00");
		label_10.setBounds(53, 222, 61, 16);
		contentPane.add(label_10);
		
		JLabel label_11 = new JLabel("11.00");
		label_11.setBounds(53, 254, 61, 16);
		contentPane.add(label_11);
		
		JLabel label_12 = new JLabel("12.00");
		label_12.setBounds(53, 290, 61, 16);
		contentPane.add(label_12);
		
		JLabel label_13 = new JLabel("13.00");
		label_13.setBounds(53, 328, 61, 16);
		contentPane.add(label_13);
		
		JLabel label_14 = new JLabel("14.00");
		label_14.setBounds(53, 356, 61, 16);
		contentPane.add(label_14);
		
		JLabel label_15 = new JLabel("15.00");
		label_15.setBounds(53, 384, 61, 16);
		contentPane.add(label_15);
		
		JLabel label_16 = new JLabel("16.00");
		label_16.setBounds(53, 417, 61, 16);
		contentPane.add(label_16);
		
		JLabel label_17 = new JLabel("17.00");
		label_17.setBounds(53, 452, 61, 16);
		contentPane.add(label_17);
		
		JLabel label_18 = new JLabel("18.00");
		label_18.setBounds(53, 482, 61, 16);
		contentPane.add(label_18);
		
		JLabel label_19 = new JLabel("19.00");
		label_19.setBounds(53, 510, 61, 16);
		contentPane.add(label_19);
		
		JLabel label_20 = new JLabel("20.00");
		label_20.setBounds(53, 542, 61, 16);
		contentPane.add(label_20);
		
		JLabel label_21 = new JLabel("21.00");
		label_21.setBounds(53, 580, 61, 16);
		contentPane.add(label_21);
		
		JLabel label_22 = new JLabel("22.00");
		label_22.setBounds(53, 618, 61, 16);
		contentPane.add(label_22);
		
		JLabel label_23 = new JLabel("23.00");
		label_23.setBounds(53, 656, 61, 16);
		contentPane.add(label_23);
		
		JLabel label_24 = new JLabel("24.00");
		label_24.setBounds(53, 692, 61, 16);
		contentPane.add(label_24);
		
		
	}
}
