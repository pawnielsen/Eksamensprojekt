package GUI;
import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JEditorPane;



public class CreateEvents extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateEvents frame = new CreateEvents();
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
	
	
	
	public CreateEvents() {
		
		String[]month = {"Month" ,"January", "Febuary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		String[]day = {"Day", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"}; 
		String[]timeHour = {"Hour", "07.00", "08.00", "09.00", "10.00", "11.00", "12.00", "13.00", "14.00", "15.00", "16.00","17.00", "18.00", "19.00", "20.00", "21.00", "22.00", "23.00", "24.00"};
		String[]timeMinute = {"Minute", "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18",
		"19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36","37","38","39","40","41","42","43","44","45","46","47","48","49","50","51","52","53",
		"54","55","56","57","58","59"};
		String[]durationHours = {"Hours", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18","19", "20", "21", "22", "23", "24"};
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 800, 1000);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEventName = new JLabel("Event Name");
		lblEventName.setBounds(76, 104, 85, 16);
		contentPane.add(lblEventName);
		
		textField = new JTextField();
		textField.setBounds(184, 99, 184, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblStart = new JLabel("Choose day");
		lblStart.setBounds(76, 181, 78, 16);
		contentPane.add(lblStart);
		
		JLabel lblStart_1 = new JLabel("Start");
		lblStart_1.setBounds(76, 220, 61, 16);
		contentPane.add(lblStart_1);
		
		JLabel lblDuration = new JLabel("Duration");
		lblDuration.setBounds(76, 265, 61, 16);
		contentPane.add(lblDuration);
		
		JComboBox comboBox = new JComboBox(timeHour);
		comboBox.setToolTipText("Hour");
		comboBox.setBounds(184, 217, 90, 27);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox(timeMinute);
		comboBox_1.setToolTipText("Minute");
		comboBox_1.setBounds(286, 217, 99, 27);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox(day);
		comboBox_2.setBounds(184, 178, 184, 27);
		contentPane.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox(durationHours);
		comboBox_3.setBounds(184, 262, 90, 27);
		contentPane.add(comboBox_3);
		
		JComboBox comboBox_4 = new JComboBox(timeMinute);
		comboBox_4.setBounds(286, 262, 99, 27);
		contentPane.add(comboBox_4);
		
		JLabel lblLocation = new JLabel("Location");
		lblLocation.setBounds(76, 314, 61, 16);
		contentPane.add(lblLocation);
		
		textField_1 = new JTextField();
		textField_1.setBounds(184, 309, 184, 28);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNotes = new JLabel("Invite");
		lblNotes.setBounds(75, 366, 61, 16);
		contentPane.add(lblNotes);
		
		textField_2 = new JTextField();
		textField_2.setBounds(184, 361, 184, 28);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNotes_1 = new JLabel("Notes");
		lblNotes_1.setBounds(76, 416, 61, 16);
		contentPane.add(lblNotes_1);
		
		JLabel lblChooseMonth = new JLabel("Choose Month");
		lblChooseMonth.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		lblChooseMonth.setBounds(76, 143, 99, 16);
		contentPane.add(lblChooseMonth);
		
		JComboBox comboBox_5 = new JComboBox(month);
		comboBox_5.setBounds(182, 139, 184, 27);
		contentPane.add(comboBox_5);
		
		JLabel lblNewLabel = new JLabel("Create new event");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lblNewLabel.setBounds(76, 47, 184, 16);
		contentPane.add(lblNewLabel);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCancel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			dispose();
			}
		});
		btnCancel.setBounds(143, 541, 117, 29);
		contentPane.add(btnCancel);
		
		
		//Button which lets you create a new event
		JButton btnCreateEvent = new JButton("Create event");
		btnCreateEvent.setBounds(268, 541, 117, 29);
		contentPane.add(btnCreateEvent);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(184, 406, 184, 123);
		contentPane.add(editorPane);
		
		
	}
}
