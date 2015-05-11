package frame;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class MyStuInfo extends JFrame {
	
	Color LightGray = new Color(211,211,211);
	Color OldLace = new Color(253, 245, 230);
	Color MistyRose = new Color(225, 250, 205);
	
	String course[] = { "", "B.Sc.", "M.Sc." };
	String get_course[] = { new String(course[0]), new String(course[1]),
			new String(course[2]) };
	
	String subject[] = { "", "CSE", "EEE", "CTE", "BBA", "Economics" };
	String get_sub[] = { new String(subject[0]), new String(subject[1]),
			new String(subject[2]), new String(subject[3]), new String(subject[4]), new String(subject[5]) };
	
	String name, father, mother, address, gender,corse, sub, id;
	
	JComboBox coursebox, subjectbox;
	
	JTextField fld1, fld2, fld3, fld4, fld5, fld6;
	
	ButtonGroup grp;
	JRadioButton male, female;
	
	public MyStuInfo(){

		setLayout(null);
		
		setTitle ("-_-_- || STUDENT INFORMATION || -_-_-");
		setSize(500, 550);		//(width, height)
		//setLocation(430, 130);	//(x, y)
		setLocationRelativeTo(null);
		
		Container cont = getContentPane();
		cont.setBackground(OldLace);
		
		JLabel intro = new JLabel("Please Fill Up The Following Form");
		add(intro);
		intro.setBounds(150,5,200,30);
		
		JLabel txt1 = new JLabel("Student's Name: ");
		add(txt1);
		txt1.setBounds(25,60,150,20);
		fld1 = new JTextField("", 50);
		add(fld1);
		fld1.setBounds(145,60,260,20);
		fld1.setBackground(MistyRose);
		
		JLabel txt2 = new JLabel("Father's Name: ");
		add(txt2);
		txt2.setBounds(25,100,150,20);
		fld2 = new JTextField("", 50);
		add(fld2);
		fld2.setBounds(145,100,260,20);
		fld2.setBackground(MistyRose);
		
		JLabel txt3 = new JLabel("Mother's Name: ");
		add(txt3);
		txt3.setBounds(25,140,150,20);
		fld3 = new JTextField("", 50);
		add(fld3);
		fld3.setBounds(145,140,260,20);
		fld3.setBackground(MistyRose);
		
		JLabel txt4 = new JLabel("ADDRESS: ");
		add(txt4);
		txt4.setBounds(25,180,150,20);
		fld4 = new JTextField("", 20);
		add(fld4);
		fld4.setBounds(145,180,260,40);
		fld4.setBackground(MistyRose);
		
		JLabel txt5 = new JLabel("Gender: ");
		add(txt5);
		txt5.setBounds(25,250,150,20);
		
		grp = new ButtonGroup();
		male = new JRadioButton("MALE");
		grp.add(male); 
		male.setBounds(145, 250, 60,20);
		add(male);
		male.setBackground(MistyRose);
		male.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {

				gender = "MALE";
				
			}});
		female = new JRadioButton("FEMALE");
		grp.add(female);
		female.setBounds(275, 250, 70,20);
		female.setBackground(MistyRose);
		add(female);
		female.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {

				gender = "FEMALE";
				
			}});
		
		JLabel txt6 = new JLabel("Subject: ");
		add(txt6);
		txt6.setBounds(25,290,150,20);
		subjectbox = new JComboBox(subject);
		add(subjectbox);
		subjectbox.setBounds(145, 290, 90, 20);
		subjectbox.setMaximumRowCount(6);
		subjectbox.setBackground(MistyRose);
		
		
		JLabel txt7 = new JLabel("Course: ");
		add(txt7);
		txt7.setBounds(260,290,150,20);
		coursebox = new JComboBox(course);
		add(coursebox);
		coursebox.setBounds(320, 290, 90, 20);
		coursebox.setMaximumRowCount(3);
		coursebox.setBackground(MistyRose);
		
		JLabel txt8 = new JLabel("ID No.: ");
		add(txt8);
		txt8.setBounds(25,330,150,20);
		fld6 = new JTextField("", 50);
		add(fld6);
		fld6.setBounds(145,330,260,20);
		fld6.setBackground(MistyRose);
				
		
		JButton add = new JButton("ADD");
		add(add);
		add.setBackground(LightGray);
		add.setBounds(90,400,120,40);
		add.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {

				name = fld1.getText().toUpperCase();
				father = fld2.getText().toUpperCase();
				mother = fld3.getText().toUpperCase();
				address = fld4.getText().toUpperCase();
				corse = get_course[coursebox.getSelectedIndex()].toUpperCase();
				sub = get_sub[subjectbox.getSelectedIndex()].toUpperCase();
				id = fld6.getText();
				
				System.out.println("\n");
				System.out.println("NAME:\t" + name + 
						"\nFather:\t" + father +
						"\nMother:\t" + mother +
						"\nAddress:\t" + address+
						"\nGender:\t" + gender+
						"\nCourse:\t" + corse +
						"\nSubject:\t" + sub+
						"\nId No.:\t" + id );
				
				JOptionPane.showMessageDialog(null, "Student Added Succesfully......");
				
				fld1.setText("");
				fld2.setText("");
				fld3.setText("");
				fld4.setText("");
				fld6.setText("");
				coursebox.setSelectedIndex(0);
				subjectbox.setSelectedIndex(0);
				
			}});
		
		JButton cancel = new JButton("CANCEL");
		add(cancel);
		cancel.setBackground(LightGray);
		cancel.setBounds(250,400,120,40);
		cancel.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				
			}});
		
		setResizable(false);
		setVisible(true);
		
	}


}
