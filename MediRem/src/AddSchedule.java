import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;

public class AddSchedule {

	private JFrame frame;
	
	
	private String txtmedsName;
	private String txtUseMeds;
	private String txtDosage;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the application.
	 */
	
	public AddSchedule(String txtmedsName, String txtUseMeds, String txtDosage) {
		this.txtmedsName = txtmedsName;
		this.txtUseMeds = txtUseMeds;
		this.txtDosage = txtDosage;
		initialize();
	}
	public AddSchedule() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JButton btnHourly = new JButton("Hourly");
		btnHourly.setBounds(10, 35, 89, 23);
		frame.getContentPane().add(btnHourly);
		
		JButton btnDaily = new JButton("Daily");
		btnDaily.setBounds(10, 80, 89, 23);
		frame.getContentPane().add(btnDaily);
		
		JButton btnWeekly = new JButton("Weekly");
		btnWeekly.setBounds(10, 125, 89, 23);
		frame.getContentPane().add(btnWeekly);
	}

}
