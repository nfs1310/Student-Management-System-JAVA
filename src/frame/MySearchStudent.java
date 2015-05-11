package frame;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

import code.MyStudent;
import code.MyQuery;

public class MySearchStudent extends JFrame {		
	
	Color OldLace = new Color(253, 245, 230);
	Color MistyRose = new Color(225, 250, 205);
	
	public MySearchStudent(String id){
		System.out.println("\t\tID: " + id);

		setLayout(null);
		
		Container cont = getContentPane();			
		cont.setBackground(OldLace);
		
		setTitle(" >> SEARCH RESULT << ");
		setSize(350, 250);
		//setLocation(750, 300);
		setLocationRelativeTo(null);
		
		MyStudent srch_st = new MyStudent();
		srch_st = MyQuery.selectStudent(id);
		
		/*System.out.println ("ID:\t" + srch_st.getId() +
		"\nNAME:\t" + srch_st.getName());*/
		
		String info = "ID:\t" + srch_st.getId() +
						"NAME:\t" + srch_st.getName();
		
		JTextArea txt = new JTextArea(info);
		txt.setBounds(30, 10, 300, 100);
		txt.setEditable(false);
		txt.setBackground(OldLace);
		add(txt);

		JButton out = new JButton("OK");
		out.setBounds(120, 150, 80, 40);
		out.setBackground(MistyRose);
		add(out);
		out.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
			
		setVisible(true);
		
	}

		
	}


