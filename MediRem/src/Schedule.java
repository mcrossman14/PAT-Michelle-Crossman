import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextPane;
import javax.swing.JLabel;

public class Schedule {

	private JFrame frame;
	private String txtmedsName;
	private String txtUseMeds;
	private String txtDosage;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Schedule window = new Schedule();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}



	/**
	 * Create the application.
	 */
	public Schedule(String txtmedsName, String txtUseMeds, String txtDosage) {
		this.txtmedsName = txtmedsName;
		this.txtUseMeds = txtUseMeds;
		this.txtDosage = txtDosage;
		initialize();
	}

	public Schedule() {
		// TODO Auto-generated constructor stub
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
		
		JButton btnAddSchedule = new JButton("Add Schedule");
		btnAddSchedule.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frame.dispose();
				new AddSchedule();
			}
		});
		btnAddSchedule.setBounds(10, 72, 124, 23);
		frame.getContentPane().add(btnAddSchedule);
		
		JButton btnSporadic = new JButton("Sporadic");
		btnSporadic.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new MedSummary(txtmedsName, txtUseMeds, txtDosage);
				frame.dispose();
				
				
			}
		});
		btnSporadic.setBounds(10, 132, 124, 23);
		frame.getContentPane().add(btnSporadic);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(10, 11, 89, 23);
		frame.getContentPane().add(btnBack);
		
	}
}