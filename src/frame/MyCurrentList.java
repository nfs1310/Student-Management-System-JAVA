package frame;

import java.awt.Color;
import java.awt.Container;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;

import code.MyStudent;
import code.MyStudentList;

public class MyCurrentList extends JFrame {

	Color OldLace = new Color(253, 245, 230);
	Color LightGray = new Color(211, 211, 211);
	Color MistyRose = new Color(225, 250, 205);

	MyStudentList list;

	public MyCurrentList() throws IOException {

		System.out.println("\n\nLoading Current Student List.....\n");
		setTitle(" |'~~~' | CURRENT LIST |'~~~' | ");
		setSize(550, 450); // (width, height)
		setLocation(400, 120); // (x, y)

		Container cont = getContentPane();
		cont.setBackground(OldLace);
		try {
			FileInputStream in = new FileInputStream("record.txt");
			ObjectInputStream oin = new ObjectInputStream(in);

			list = (MyStudentList) oin.readObject();

			oin.close();
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("\nError Reading File.......//MyCurrentList\\");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		String colName[] = { "ID", "Name", "Father", "Mother", "Gender",
				"Address", "Subject", "Course" };
		
		Vector vect = list.sort();
		Object[][] data = new Object[vect.size()][3];

		for (int a = 0; a < vect.size(); a++) {
			MyStudent temp = (MyStudent) vect.elementAt(a);
			data[a][0] = temp.getId();
			data[a][1] = temp.getName();
			data[a][2] = temp.getFather();
			data[a][3] = temp.getMother();
			data[a][4] = temp.getGender();
			data[a][5] = temp.getAddress();
			data[a][6] = temp.getSubject();
			data[a][7] = temp.getCourse();
		}

		JTable tbl = new JTable(data, colName);
		tbl.setEnabled(false);
		add(tbl);
		tbl.setBounds(20, 100, 500, 250);
		tbl.setBackground(MistyRose);
		/*JPanel pnl = new JPanel();
		int ver = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		int hor = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
		JScrollPane jsp = new JScrollPane(tbl, ver, hor);
		pnl.add(jsp);
		add(pnl);*/

		setVisible(true);
	}
	

}
