package frame;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;


public class MyStudentList extends JFrame {

	Color OldLace = new Color(253, 245, 230);
	Color LightGray = new Color(211, 211, 211);
	Color MistyRose = new Color(225, 250, 205);
	
	JTable tbl;
	
	public MyStudentList(){

		setTitle("|~~~| CURRENT STUDENT LIST |~~~|");
		setLayout(new FlowLayout());
		setSize(600, 450);
		setLocationRelativeTo(null);
		
		Container cont = getContentPane();
		cont.setBackground(OldLace);
		
		String[] columnNames = { "ID", "NAME", "FATHER", "MOTHER", "ADDRESS", "GENDER", "SUBJECT"}; 
		Object[][] data = {
				{""}
				};
		tbl = new JTable(data, columnNames);
		tbl.setBackground(MistyRose);
		add(tbl);
		
		
		
		setVisible(true);
		
	}


	

}
