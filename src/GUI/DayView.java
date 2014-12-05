package GUI;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTable;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class DayView extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private String[] daysTodays;
	private Object[][] eventsTodays;
	private JTable table_2;



	/**
	 * Create the frame.
	 * 
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DayView frame = new DayView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public DayView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 1000);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
		
		JLabel lblFunctions = new JLabel("Todays View");
		lblFunctions.setHorizontalAlignment(SwingConstants.CENTER);
		lblFunctions.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lblFunctions.setBounds(557, 88, 155, 16);
		contentPane.add(lblFunctions);
		
		//Sends you back til Week View
		JButton btnBackToWeak = new JButton("Week View");
		btnBackToWeak.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				WeekView wV = new WeekView();
				wV.setVisible(true);
				dispose();
			}
		});
		btnBackToWeak.setBounds(557, 117, 112, 29);
		contentPane.add(btnBackToWeak);
		
		
		//Sends you to 'CreateEvents'
		JButton btnCreateEvent = new JButton("Create event");
		btnCreateEvent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCreateEvent.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			CreateEvents event = new CreateEvents();
			event.setVisible(true);
			}
		});
		btnCreateEvent.setBounds(557, 158, 112, 29);
		contentPane.add(btnCreateEvent);
		
		//Exits the program
			JButton btnExit = new JButton("Exit");
			btnExit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
		btnExit.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			System.exit(0);
			}
		});
		btnExit.setBounds(557, 198, 112, 29);
		contentPane.add(btnExit);
		
		
		//Jtable for DayView
		String[] columnNames = {"Activity"};
		daysTodays = new String[] {"Today"};
		 Object[][] data = {
			    {"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"},{"Fri"},
			};
		 table_2 = new JTable (data,columnNames);
			table_2.setBounds(140, 60, 400, 720);
			table_2.setRowHeight(40);
			contentPane.add(table_2);
			

	
		
	}
}

