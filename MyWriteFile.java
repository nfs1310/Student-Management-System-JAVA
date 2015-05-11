package code;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MyWriteFile {

	MyStudent read, write = new MyStudent();
	MyStudentList list = new MyStudentList();

	public MyWriteFile(String name, String father, String mother,
			String address, String gender, String course, String subject,
			String id) throws IOException, ClassNotFoundException {

		write.name = name;
		write.father = father;
		write.mother = mother;
		write.address = address;
		write.gender = gender;
		write.gender = course;
		write.gender = subject;
		write.id = id;
		list.put(id, write);

		try {
			FileInputStream in = new FileInputStream("record.txt");
			ObjectInputStream oin = new ObjectInputStream(in);

			read = (MyStudent) oin.readObject();

			oin.close();
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("\nError Reading File.......//MyReadFile\\");
		}

		try {
			FileOutputStream out = new FileOutputStream("record.txt");
			ObjectOutputStream oout = new ObjectOutputStream(out);

			oout.writeObject(write);

			out.close();
			oout.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("\nError Writing to File.......//MyWriteFile\\");
		}

	}

}
