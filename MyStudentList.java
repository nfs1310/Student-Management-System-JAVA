package code;

import java.io.*;
import java.util.*;

public class MyStudentList extends Hashtable implements Serializable {
	public String name;

	public Vector sort() {
		Set sKeys = this.keySet();
		Vector temp = new Vector(sKeys);
		Collections.sort(temp);

		Vector sorted = new Vector();

		for (int a = 0; a < temp.size(); a++) {
			sorted.add(this.get(temp.elementAt(a)));
		}

		return sorted;
	}
}