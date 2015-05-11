package frame;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyStudentResult extends JFrame {
	
	Color OldLace = new Color(253, 245, 230);
	Color LightGray = new Color(211,211,211);
	
	public MyStudentResult() {
		setLayout(null);
		setTitle(" ~~~ STUDENT PANEL ~~~ ");
		setSize(500,400);
		//setLocation(650, 250);
		setLocationRelativeTo(null);
		
		Container cont = getContentPane();
		cont.setBackground(OldLace);
		
		JButton ok = new JButton("OK");
		ok.setBounds(190,300,120,40);
		ok.setBackground(LightGray);
		add(ok);
		ok.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				
			}
			
		});
		
		setResizable(false);
		setVisible(true);
	}

}
