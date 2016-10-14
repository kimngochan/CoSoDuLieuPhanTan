import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class ThiTracNghiem {

	private JFrame frame;
	private JTextField txtHThngThi;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ThiTracNghiem window = new ThiTracNghiem();
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
	public ThiTracNghiem() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		txtHThngThi = new JTextField();
		txtHThngThi.setHorizontalAlignment(SwingConstants.CENTER);
		txtHThngThi.setForeground(new Color(0, 51, 255));
		txtHThngThi.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtHThngThi.setText("H\u1EC6 TH\u1ED0NG THI TR\u1EAEC NGHI\u1EC6M TIN H\u1ECCC");
		frame.getContentPane().add(txtHThngThi, BorderLayout.NORTH);
		txtHThngThi.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setSelectedIcon(new ImageIcon("C:\\Users\\NGOC\\Pictures\\bg\\a.png"));
		btnNewButton.setBackground(new Color(127, 5, 50));
		frame.getContentPane().add(btnNewButton, BorderLayout.CENTER);
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(frame, "Hello World");
			}
		});
	}

}
