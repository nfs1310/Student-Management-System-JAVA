package frame;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;

public class MyCourseList extends JFrame {
	
	JTable tbl;
	
	Color OldLace = new Color(253, 245, 230);
	Color LightGray = new Color(211,211,211);
	Color MistyRose = new Color(225, 250, 205);
	
	public MyCourseList(){
		setTitle("COURSE LIST");
		setSize(450, 350);
		setLocationRelativeTo(null);
	
		setLayout (new FlowLayout());
		
		Container cont = getContentPane();
		cont.setBackground(OldLace);
				
		String[] columnNames = {"NAME", "GENDER", "id"};
		Object[][] data = {
				{"UZAER", "MALE", "dfg"},
				{"TAJKIA", "FEMALE", "df"},
				{"MURAD", "MALE", "dfg"},
				{"fg", "dfg", "dfg"},
				{"ret", "fgh", "fgh"}
		};
		
		tbl = new JTable(data, columnNames);
		tbl.setEnabled(true);
		tbl.setPreferredScrollableViewportSize(new Dimension(400, 150));
		tbl.setBackground(MistyRose);
		
		add(tbl);
		
		JPanel pnl = new JPanel();
		int ver = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		int hor = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
		JScrollPane jsp = new JScrollPane(tbl, ver, hor);
		pnl.add(jsp);
		add(pnl);
		
		JButton del = new JButton("DELETE COURSE");
		//del.setBounds(100,815,130,30);
		del.setBackground(LightGray);
		add(del);
		del.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				int row = tbl.getSelectedRow();
				System.out.println("row number after pressing DELETE button: " + row);
			}
			});
		JButton ok = new JButton("OK");
		ok.setBackground(LightGray);
		add(ok);
		ok.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				
			}
			
		});
	
		setVisible(true);
	}

}
