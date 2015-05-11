package frame;

import java.awt.Color;
import java.awt.Container;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JTable;
import javax.swing.JTextField;


public class MyAdCourse extends JFrame {
	
	Color OldLace = new Color(253, 245, 230);
	Color LightGray = new Color(211,211,211);
	Color MistyRose = new Color(225, 250, 205);
	
	String course[] = { "", "CSE-", "CSI-", "MATH-", "ENG-", "IPE-" };
	String get_course[] = { new String(course[0]), new String(course[1]),
			new String(course[2]), new String(course[3]), new String(course[4]), new String(course[5]) };
	
	String credit[] = { "", "1", "1.5", "3"};
	String get_credit[] = { new String(credit[0]), new String(credit[1]),
			new String(credit[2]), new String(credit[3])};
	
	JTextField fld1, fld2, fld3;
	JComboBox cbox1, cbox2;
	String str1, str2, str3, strcmb, str4;
	JTable tbl;
	
	int pos = 0;
	
	public MyAdCourse (){
		setLayout(null);
		
		setTitle("-_-_- || ADD NEW COURSE || -_-_-");
		setSize(450, 300);		//(width, height)
		//setLocation(400, 120);	//(x, y)
		setLocationRelativeTo(null);
		
		Container cont = getContentPane();
		cont.setBackground(OldLace);
		
		JLabel intro = new JLabel("Information For New Course");
		add(intro);
		intro.setBounds(150,5,200,30);
		
		JLabel txt1 = new JLabel("Course Name: ");
		add(txt1);
		txt1.setBounds(25,60,150,20);
		
		fld1 = new JTextField("", 50);
		add(fld1);
		fld1.setBounds(145,60,260,20);
		fld1.setBackground(MistyRose);
		
		JLabel txt2 = new JLabel("Course Code: ");
		add(txt2);
		txt2.setBounds(25,100,150,20);
		
		cbox1 = new JComboBox(course);
		cbox1.setBounds(145,100,80,20);
		cbox1.setBackground(MistyRose);
		add(cbox1);
		fld2 = new JTextField("", 50);
		add(fld2);
		fld2.setBounds(260,100,60,20);
		fld2.setBackground(MistyRose);
		
		JLabel txt3 = new JLabel("Credit: ");
		add(txt3);
		txt3.setBounds(25,140,150,20);
		
		cbox2 = new JComboBox(credit);
		cbox2.setBounds(145,140,80,20);
		cbox2.setBackground(MistyRose);
		add(cbox2);
		
		
		JButton add = new JButton("ADD");
		add.setBounds(100,210,100,30);
		add.setBackground(LightGray);
		add(add);
		add.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				str1 = fld1.getText().toUpperCase();
				str2 = get_course[cbox1.getSelectedIndex()];
				str3 = fld2.getText();
				strcmb = str2.concat(str3);
				str4 = get_credit[cbox2.getSelectedIndex()];
				
				System.out.println("COURSE:\t" + str1 +
									"\nCOURSE Code:\t" + strcmb +
									"\nCOURSE Credit:\t" + str4);
				
			}});
		
		JButton cancel = new JButton("CANCEL");
		cancel.setBounds(250,210,100,30);
		cancel.setBackground(LightGray);
		add(cancel);
		cancel.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				
			}});
		
		
		
		setVisible(true);
	}
}
