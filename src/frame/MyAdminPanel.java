package frame;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class MyAdminPanel extends JFrame {
	
	Color OldLace = new Color(253, 245, 230);
	Color LightGray = new Color(211,211,211);
	Color MistyRose = new Color(225, 250, 205); 				// **
	
	JLabel pic1;
	JLabel pic2;
	JLabel pic3;
	JLabel pic4;
	//JLabel pic5;
	
	JLabel texture;
	
	public MyAdminPanel(String logger){
		setLayout(null);
		
		setTitle(" ~~~ ADMIN PANEL ~~~ ");
		setSize(850, 650);		//(width, height)
		//setLocation(500, 200);	//(x, y)
		setLocationRelativeTo(null);
		
		Container cont = getContentPane();
		cont.setBackground(OldLace);
		
		JLabel txtTtl = new JLabel();
		Font font = new Font("Times New Roman", Font.BOLD, 26);
		txtTtl.setFont(font);
		txtTtl.setForeground(Color.DARK_GRAY);
		txtTtl.setText("ADMIN PANEL");
		txtTtl.setBounds(300, 10, 500,60);
		add(txtTtl);
		
		JLabel txt1 = new JLabel("( " + logger +" )");
		txt1.setBounds(720, 50, 250, 40);
		add(txt1);
		
		JButton logout = new JButton("LogOut");							//logout button
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
				pic2.setIcon(img2);
			}
			public void mouseExited(MouseEvent arg){
				pic2.setIcon(null);
			}
			public void mousePressed(MouseEvent arg0) {}
			public void mouseReleased(MouseEvent arg0) {}
			});
		
		JButton add = new JButton("ADD STUDENT");					//add button
		add.setBounds(30,100,160,50);
		add.setBackground(LightGray);
		add(add);
		add.addMouseListener(new MouseListener(){
			
			public void mouseClicked(MouseEvent arg0) {}
			public void mouseEntered(MouseEvent arg0) {
				ImageIcon img1 = new ImageIcon("Student.GIF");
				pic1.setIcon(img1);
			}
			public void mouseExited(MouseEvent arg0) {
				pic1.setIcon(null);
			}
			public void mousePressed(MouseEvent arg0) {	}
			public void mouseReleased(MouseEvent arg0) {}
			});
		add.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				new MyStuInfo();
				
			}});
		

		
		JButton view = new JButton("STUDENT LIST");					//view button
		view.setBounds(30,250,160,50);
		view.setBackground(LightGray);
		add(view);
		view.addMouseListener(new MouseListener(){
			public void mouseClicked(MouseEvent arg0) {}
			public void mouseEntered(MouseEvent arg0) {
				ImageIcon img2 = new ImageIcon("list.GIF");
				pic2.setIcon(img2);
			}
			public void mouseExited(MouseEvent arg0) {
				pic2.setIcon(null);
			}
			public void mousePressed(MouseEvent arg0) {	}
			public void mouseReleased(MouseEvent arg0) {}
		});
		view.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				new MyStudentList();
				
			}});
		
		JButton course = new JButton("ADD COURSE");							//add course button
		course.setBounds(30,325,160,50);
		course.setBackground(LightGray);
		add(course);
		course.addMouseListener(new MouseListener(){
			public void mouseClicked(MouseEvent arg0) {}
			public void mouseEntered(MouseEvent arg0) {
				ImageIcon img3 = new ImageIcon("Course.JPG");
				pic3.setIcon(img3);
			}
			public void mouseExited(MouseEvent arg0) {
				pic3.setIcon(null);
			}
			public void mousePressed(MouseEvent arg0) {	}
			public void mouseReleased(MouseEvent arg0) {}
		});
		course.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				new MyAdCourse();
				
			}
		});
		
		JButton edit = new JButton("EDIT STUDENT");								//edit button
		edit.setBounds(30,400,160,50);
		edit.setBackground(LightGray);
		add(edit);
		edit.addMouseListener(new MouseListener(){
			public void mouseClicked(MouseEvent arg0) {}
			public void mouseEntered(MouseEvent arg0) {
				ImageIcon img4 = new ImageIcon("edit.JPG");
				pic4.setIcon(img4);
			}
			public void mouseExited(MouseEvent arg0) {
				pic4.setIcon(null);
			}
			public void mousePressed(MouseEvent arg0) {	}
			public void mouseReleased(MouseEvent arg0) {}
		});
		edit.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}}
		);
		
		JButton search = new JButton ("SEARCH");			//search button
		search.setBounds(30,175,160,50);
		search.setBackground(LightGray);
		add(search);
		search.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				String srch_id = JOptionPane.showInputDialog("Enter an ID to search...");
				System.out.println("Entered ID: " + srch_id);
				new MySearchStudent(srch_id);
				
			}});

		pic1 = new JLabel();
		pic1.setBounds(550,120,150,90);
		add(pic1);
		
		pic2 = new JLabel();
		pic2.setBounds(500,155,300,200);
		add(pic2);
		
		pic3= new JLabel();
		pic3.setBounds(500,200,300,120);
		add(pic3);
		
		pic4= new JLabel();
		pic4.setBounds(500,245,300,160);
		add(pic4);
		
		/*pic5 = new JLabel();
		pic5.setBounds(30,20,300,200);
		add(pic5);
		ImageIcon img5 = new ImageIcon("admin.jpg");
		pic5.setIcon(img5);*/
		
		setResizable(false);
		setVisible(true);

	}

}

