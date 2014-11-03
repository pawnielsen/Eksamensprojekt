import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import java.awt.Color;
import java.awt.Font;


public class WeekView extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTable table_3;
	private JTable table_4;
	private JTable table_5;
	private JTable table_6;
	private JTable table_7;
	private JTable table_8;
	private JTable table_9;
	private JTable table_10;
	private JTable table_11;

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
		setBounds(100, 1500, 1440, 1000);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Monday");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(121, 41, 90, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblTuesday = new JLabel("Tuesday");
		lblTuesday.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblTuesday.setHorizontalAlignment(SwingConstants.CENTER);
		lblTuesday.setBounds(204, 41, 90, 16);
		contentPane.add(lblTuesday);
		
		JLabel label_1 = new JLabel("Wednesday");
		label_1.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(288, 41, 90, 16);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("Thursday");
		label_2.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(378, 41, 90, 16);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("Friday");
		label_3.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBounds(466, 41, 90, 16);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("Saturday");
		label_4.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setBounds(557, 41, 90, 16);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("Sunday");
		label_5.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setBounds(645, 41, 90, 16);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("07.00");
		label_6.setBounds(53, 70, 61, 16);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("08.00");
		label_7.setBounds(53, 110, 61, 16);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("09.00");
		label_8.setBounds(53, 150, 61, 16);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("10.00");
		label_9.setBounds(53, 190, 61, 16);
		contentPane.add(label_9);
		
		JLabel label_10 = new JLabel("11.00");
		label_10.setBounds(53, 230, 61, 16);
		contentPane.add(label_10);
		
		JLabel label_11 = new JLabel("12.00");
		label_11.setBounds(53, 270, 61, 16);
		contentPane.add(label_11);
		
		JLabel label_12 = new JLabel("13.00");
		label_12.setBounds(53, 310, 61, 16);
		contentPane.add(label_12);
		
		JLabel label_13 = new JLabel("14.00");
		label_13.setBounds(53, 350, 61, 16);
		contentPane.add(label_13);
		
		JLabel label_14 = new JLabel("15.00");
		label_14.setBounds(53, 390, 61, 16);
		contentPane.add(label_14);
		
		JLabel label_15 = new JLabel("16.00");
		label_15.setBounds(53, 430, 61, 16);
		contentPane.add(label_15);
		
		JLabel label_16 = new JLabel("17.00");
		label_16.setBounds(53, 470, 61, 16);
		contentPane.add(label_16);
		
		JLabel label_17 = new JLabel("18.00");
		label_17.setBounds(53, 510, 61, 16);
		contentPane.add(label_17);
		
		JLabel label_18 = new JLabel("19.00");
		label_18.setBounds(53, 550, 61, 16);
		contentPane.add(label_18);
		
		JLabel label_19 = new JLabel("20.00");
		label_19.setBounds(53, 590, 61, 16);
		contentPane.add(label_19);
		
		JLabel label_20 = new JLabel("21.00");
		label_20.setBounds(53, 630, 61, 16);
		contentPane.add(label_20);
		
		JLabel label_21 = new JLabel("22.00");
		label_21.setBounds(53, 670, 61, 16);
		contentPane.add(label_21);
		
		JLabel label_22 = new JLabel("23.00");
		label_22.setBounds(53, 710, 61, 16);
		contentPane.add(label_22);
		
		JLabel label_23 = new JLabel("24.00");
		label_23.setBounds(53, 750, 61, 16);
		contentPane.add(label_23);
		
		String[] daysMonday = {"Monday"};
		Object[][] eventsMonday = {
			    {"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"}, {"Fri"}, {"Fri"},{"Fri"}, {"Fri"}
			};
		String[] daysTuesday = {"Tuesday"};
		Object[][] eventsTuesday = {
			    {"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"}, {"Fri"}, {"Fri"},{"Fri"}, {"Fri"}
			};
		String[] daysWednesday = {"Wednesday"};
		Object[][] eventsWednesday = {
			    {"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"}, {"Fri"}, {"Fri"},{"Fri"}, {"Fri"}
			};
		String[] daysThursday = {"Thursday"};
		Object[][] eventsThursday = {
			    {"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"}, {"Fri"}, {"Fri"},{"Fri"}, {"Fri"}
			};
		String[] daysFriday = {"Friday"};
		Object[][] eventsFriday = {
			    {"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"}, {"Fri"}, {"Fri"},{"Fri"}, {"Fri"}
			};
		String[] daysSaturday = {"Saturday"};
		Object[][] eventsSaturday = {
			    {"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"}, {"Fri"}, {"Fri"},{"Fri"}, {"Fri"}
			};
		String[] daysSunday = {"Sunday"};
		Object[][] eventsSunday = {
			    {"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"}, {"Fri"}, {"Fri"},{"Fri"}, {"Fri"}
			};
		
		table_3 = new JTable(eventsMonday, daysMonday);
		table_3.setForeground(Color.GRAY);
		table_3.setBounds(140, 60, 90, 720);
		table_3.setRowHeight(40);
		table_3.setAlignmentY(TOP_ALIGNMENT);
		contentPane.add(table_3);
		
		table_6 = new JTable(eventsTuesday, daysTuesday);
		table_6.setForeground(Color.GRAY);
		table_6.setBounds(230, 60, 90, 720);
		table_6.setRowHeight(40);
		table_6.setAlignmentY(TOP_ALIGNMENT);
		contentPane.add(table_6);
		
		table_7 = new JTable(eventsWednesday, daysWednesday);
		table_7.setForeground(Color.GRAY);
		table_7.setBounds(320, 60, 90, 720);
		table_7.setRowHeight(40);
		table_7.setAlignmentY(TOP_ALIGNMENT);
		contentPane.add(table_7);
		
		table_8 = new JTable(eventsThursday, daysThursday);
		table_8.setForeground(Color.GRAY);
		table_8.setBounds(410, 60, 90, 720);
		table_8.setRowHeight(40);
		table_8.setAlignmentY(TOP_ALIGNMENT);
		contentPane.add(table_8);
		
		table_9 = new JTable(eventsFriday, daysFriday);
		table_9.setForeground(Color.GRAY);
		table_9.setBounds(500, 60, 90, 720);
		table_9.setRowHeight(40);
		table_9.setAlignmentY(TOP_ALIGNMENT);
		contentPane.add(table_9);
		
		table_10 = new JTable(eventsSaturday, daysSaturday);
		table_10.setForeground(Color.GRAY);
		table_10.setBounds(590, 60, 90, 720);
		table_10.setRowHeight(40);
		table_10.setAlignmentY(TOP_ALIGNMENT);
		contentPane.add(table_10);
		
		table_11 = new JTable(eventsSunday, daysSunday);
		table_11.setForeground(Color.GRAY);
		table_11.setBounds(679, 60, 90, 720);
		table_11.setRowHeight(40);
		table_11.setAlignmentY(TOP_ALIGNMENT);
		contentPane.add(table_11);
		

		
		
		
		
	}
}