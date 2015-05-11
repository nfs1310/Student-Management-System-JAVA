package frame;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class MyLoginPanel extends JFrame {

	String names[] = { "", "ADMIN", "STUDENT" };
	String get[] = { new String(names[0]), new String(names[1]),
			new String(names[2]) };
	
	JComboBox cbox;
	String str3;
	JPasswordField pass;
	
	Color LightGray = new Color(211, 211, 211);					//buttons
	Color FireBrick = new Color(178, 34, 34);
	Color MistyRose = new Color(225, 250, 205); 				// **
	Color OldLace = new Color(253, 245, 230); 					// *** suits very well

	private static String USERNAME_1 = "ADMIN";
	private static String PASSWORD_1 = "omi";
	private static String USERNAME_2 = "STUDENT";
	private static String PASSWORD_2 = "salman";
	
	JLabel texture;

	public MyLoginPanel() {
		setLayout(null);

		setTitle("...:: LOGIN PANEL ::...");
		setSize(650, 350);
		//setLocation(600, 250);
		setLocationRelativeTo(null);

		Container cont = getContentPane();
		cont.setBackground(OldLace);

		JButton login = new JButton("LOGIN");									//Login Button
		login.setBounds(275, 200, 120, 40);
		add(login);
		login.setBackground(LightGray);
		login.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String user = get[cbox.getSelectedIndex()];
				;
				String ps = pass.getText();
				if (user.equals(USERNAME_1)) {
					if (ps.equals(PASSWORD_1)) {
						//JOptionPane.showMessageDialog(null, "Logging in as "+ user);
						new MyAdminPanel(user);
						dispose();
					} else {
						JOptionPane.showMessageDialog(null,"PASSCODE Mismatch for " + user);
						pass.setText("");
					}
				} else if (user.equals(USERNAME_2)) {
					if (ps.equals(PASSWORD_2)) {
						//JOptionPane.showMessageDialog(null, "Logging in as "+ user);
						new MyStudentPanel(user);
						dispose();
					} else {
						JOptionPane.showMessageDialog(null,"PASSCODE Mismatch for " + user);
						pass.setText("");
					}
				} else {
					JOptionPane.showMessageDialog(null,"Put the info's correctly !!! ");
				}

			}
		});
		login.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent arg0) {}
			public void mouseEntered(MouseEvent arg0) {
				texture = new JLabel("Logging in the System...!!!");
				add(texture);
				texture.setBounds(200,270,150,30);
				texture.setBackground(MistyRose);
			}
			public void mouseExited(MouseEvent arg){
				texture.setText(null);
			}
			public void mousePressed(MouseEvent arg0) {}
			public void mouseReleased(MouseEvent arg0) {}
			});
		login.addKeyListener(new KeyListener(){

			@Override
			public void keyPressed(KeyEvent arg0) {
				String user = get[cbox.getSelectedIndex()];
				;
				String ps = pass.getText();
				if (user.equals(USERNAME_1)) {
					if (ps.equals(PASSWORD_1)) {
						//JOptionPane.showMessageDialog(null, "Logging in as "+ user);
						new MyAdminPanel(user);
						dispose();
					} else {
						JOptionPane.showMessageDialog(null,"PASSCODE Mismatch for " + user);
						pass.setText("");
					}
				} else if (user.equals(USERNAME_2)) {
					if (ps.equals(PASSWORD_2)) {
						//JOptionPane.showMessageDialog(null, "Logging in as "+ user);
						new MyStudentPanel(user);
						dispose();
					} else {
						JOptionPane.showMessageDialog(null,"PASSCODE Mismatch for " + user);
						pass.setText("");
					}
				} else {
					JOptionPane.showMessageDialog(null,"Put the info's correctly !!! ");
				}
				
			}

			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyTyped(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		JButton cancel = new JButton("CANCEL");									//CANCEL Button
		cancel.setBounds(480, 260, 150, 40);
		add(cancel);
		cancel.setBackground(LightGray);
		cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);

			}
		});
		cancel.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent arg0) {}
			public void mouseEntered(MouseEvent arg0) {
				texture = new JLabel("EXITs from the System...!!!");
				add(texture);
				texture.setBounds(200,270,150,30);
				texture.setBackground(MistyRose);
			}
			public void mouseExited(MouseEvent arg){
				texture.setText(null);
			}
			public void mousePressed(MouseEvent arg0) {}
			public void mouseReleased(MouseEvent arg0) {}
			});
		

		
		JButton info = new JButton("");											//InFO Button
		info.setBounds(35,250,50,50);
		ImageIcon img1 = new ImageIcon("info.jpg");
		info.setBackground(OldLace);
		info.setIcon(img1);
		add(info);
		info.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				new MyLoginHint();
				
			}});
		info.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent arg0) {}
			public void mouseEntered(MouseEvent arg0) {
				texture = new JLabel("HELP / Information...!!!");
				add(texture);
				texture.setBounds(200,270,150,30);
				texture.setBackground(MistyRose);
			}
			public void mouseExited(MouseEvent arg){
				texture.setText(null);
			}
			public void mousePressed(MouseEvent arg0) {}
			public void mouseReleased(MouseEvent arg0) {}
			});

		JLabel lbl1 = new JLabel();
		lbl1.setBounds(35, 70, 150, 100);
		ImageIcon img2 = new ImageIcon("log2.jpg");
		lbl1.setIcon(img2);
		add(lbl1);

		JLabel lbl2 = new JLabel("USERNAME: ");
		lbl2.setBounds(150, 60, 100, 100);
		add(lbl2);

		cbox = new JComboBox(names);
		cbox.setBounds(250, 100, 120, 20);
		add(cbox);
		cbox.setBackground(MistyRose);
		cbox.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e) {}
			public void mouseEntered(MouseEvent e) {
				texture = new JLabel("Defines ADMIN or STUDENT");
				add(texture);
				texture.setBounds(200,270,250,30);
				texture.setBackground(MistyRose);
			}
			public void mouseExited(MouseEvent e) {
				texture.setText(null);
			}
			public void mousePressed(MouseEvent e) {}
			public void mouseReleased(MouseEvent e) {}
			});

		JLabel lbl3 = new JLabel("PASSCODE: ");
		lbl3.setBounds(150, 110, 100, 100);
		add(lbl3);

		pass = new JPasswordField();
		pass.setBounds(250, 150, 180, 25);
		add(pass);
		pass.setBackground(MistyRose);
		pass.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e) {}
			public void mouseEntered(MouseEvent e) {
				texture = new JLabel("Enter the Secret Code as per UserName");
				add(texture);
				texture.setBounds(200,270,250,30);
				texture.setBackground(MistyRose);
			}
			public void mouseExited(MouseEvent e) {
				texture.setText(null);
			}
			public void mousePressed(MouseEvent e) {}
			public void mouseReleased(MouseEvent e) {}
			});

		setResizable(false);
		setVisible(true);
	}
}