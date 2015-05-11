package frame;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MyLoginHint extends JFrame {
	
	Color OldLace = new Color(253, 245, 230);
	Color MistyRose = new Color(225, 250, 205);

	public MyLoginHint(){
		setLayout(null);
		
		Container cont = getContentPane();
		cont.setBackground(OldLace);
		
		setTitle(" >> HINTS << ");
		setSize(350, 250);
		//setLocation(750, 300);
		setLocationRelativeTo(null);
		String info = "\tYOU CAN ENTER THIS\n\tPROGRAM ONLY IF YOU ARE\n\tA REGISTERED MEMBER...\nPassCode:\nADMIN = omi\nSTUDENT = salman";

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
