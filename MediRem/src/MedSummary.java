import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MedSummary {

	private JFrame frame;
	private String txtmedsName;
	private String txtUseMeds;
	private String txtDosage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MedSummary window = new MedSummary();
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
	
	public MedSummary(String txtmedsName, String txtUseMeds, String txtDosage) {
		this.txtmedsName = txtmedsName;
		this.txtUseMeds = txtUseMeds;
		this.txtDosage = txtDosage;
		initialize();
	}
	public MedSummary() {
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
		
		JLabel lblMedsName = new JLabel("");
		lblMedsName.setBounds(41, 51, 137, 23);
		frame.getContentPane().add(lblMedsName);
		lblMedsName.setText("Medication Name: " + txtmedsName);
		
		JLabel lblReason = new JLabel("");
		lblReason.setBounds(41, 85, 142, 39);
		frame.getContentPane().add(lblReason);
		lblReason.setText("Reason: " + txtUseMeds);
		
		JLabel lblDosage = new JLabel("");
		lblDosage.setBounds(41, 135, 92, 23);
		frame.getContentPane().add(lblDosage);
		lblDosage.setText("Dosage: " + txtDosage);
		
	}

}
