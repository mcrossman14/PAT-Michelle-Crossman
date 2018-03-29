import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;

public class AddMedication {

	private JFrame frame;
	private JTextField txtMedsName;
	private JTextField txtUseMeds;
	private JTextField txtDosage;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddMedication window = new AddMedication();
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
	public AddMedication() {
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
		
		JButton btnBack = new JButton("Back");
		btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				new MainScreen();
			}
		});
		btnBack.setBounds(10, 11, 89, 23);
		frame.getContentPane().add(btnBack);
		
		JLabel lblMedsName = new JLabel("Name of Medication");
		lblMedsName.setBounds(186, 15, 114, 14);
		frame.getContentPane().add(lblMedsName);
		
		txtMedsName = new JTextField();
		txtMedsName.setBounds(186, 40, 86, 20);
		frame.getContentPane().add(txtMedsName);
		txtMedsName.setColumns(10);
		
		JLabel lblReason = new JLabel("Reason");
		lblReason.setBounds(186, 71, 166, 14);
		frame.getContentPane().add(lblReason);
		
		txtUseMeds = new JTextField();
		txtUseMeds.setBounds(186, 96, 86, 20);
		frame.getContentPane().add(txtUseMeds);
		txtUseMeds.setColumns(10);
		
		JButton btnAdd = new JButton("Next");
		btnAdd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new Schedule(txtMedsName.getText(), txtUseMeds.getText(), txtDosage.getText());
				frame.dispose();
				
				
			}
		});
		btnAdd.setBounds(335, 227, 89, 23);
		frame.getContentPane().add(btnAdd);
		
		JLabel lblDosage = new JLabel("Dosage (mg)");
		lblDosage.setBounds(186, 127, 86, 14);
		frame.getContentPane().add(lblDosage);
		
		txtDosage = new JTextField();
		txtDosage.setBounds(186, 146, 86, 20);
		frame.getContentPane().add(txtDosage);
		txtDosage.setColumns(10);
	}
}