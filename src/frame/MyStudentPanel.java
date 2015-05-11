package frame;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyStudentPanel extends JFrame {
	
	JLabel pic1;
	JLabel pic2;
	
	Color OldLace = new Color(253, 245, 230);
	Color LightGray = new Color(211,211,211);
	
	public MyStudentPanel(String logger){
		setLayout(null);
		
		setTitle(" ~~~ STUDENT PANEL ~~~ ");
		setSize(850, 650);		//(width, height)
		//setLocation(500, 200);	//(x, y)
		setLocationRelativeTo(null);
		
		Container cont = getContentPane();
		cont.setBackground(OldLace);
		
		JLabel txtTtl = new JLabel();
		Font font = new Font("Times New Roman", Font.BOLD, 26);
		txtTtl.setFont(font);
		txtTtl.setForeground(Color.DARK_GRAY);
		txtTtl.setText("STUDENT PANEL");
		txtTtl.setBounds(300, 10, 500,60);
		add(txtTtl);
		
		JLabel txt1 = new JLabel("( " + logger +" )");
		txt1.setBounds(720, 50, 250, 40);
		add(txt1);
		
		JButton logout = new JButton("logout");
		logout.setBounds(700,20,100,30);
		logout.setBackground(LightGray);
		add(logout);
		logout.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				new MyLoginPanel();
				dispose();
				
			}});
		logout.addMouseListener(new MouseListener(){
			public void mouseClicked(MouseEvent arg0) {}
			public void mouseEntered(MouseEvent arg0) {
				ImageIcon img2 = new ImageIcon("logout.PNG");
				pic1.setIcon(img2);
			}
			public void mouseExited(MouseEvent arg){
				pic1.setIcon(null);
			}
			public void mousePressed(MouseEvent arg0) {}
			public void mouseReleased(MouseEvent arg0) {}
			});
		
		pic1 = new JLabel();
		pic1.setBounds(500,155,300,200);
		add(pic1);
		
		JButton result = new JButton("RESULT");
		result.setBounds(30,100,160,50);
		result.setBackground(LightGray);
		result.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				new MyStudentResult();
				
			}
			
		});
		add(result);
		result.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
			public void mouseEntered(MouseEvent e) {
				ImageIcon img1 = new ImageIcon("result.jpg");
				pic2.setIcon(img1);
				
				
			}
			public void mouseExited(MouseEvent e) {
				pic2.setIcon(null);
				
			}
			public void mousePressed(MouseEvent e) {
				
			}
			public void mouseReleased(MouseEvent e) {
				
			}
			
		});
		
		pic2 = new JLabel();
		pic2.setBounds(400,125,400,300);
		add(pic2);
		
		
		setResizable(false);
		setVisible(true);
	}
}
