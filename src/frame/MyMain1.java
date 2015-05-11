package frame;

import java.io.IOException;
import java.util.Scanner;

import code.MyStudent;
import code.MyQuery;



public class MyMain1 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		System.out.println("LOADING System Files....");
		
		//new MyAdCourse();
		//new MyLoginPanel();
		//new MyAdminPanel("NFS");
		//new MyStudentPanel("SALMAN");
		//new MyStuInfo();
		//new MyLoginHint();
		//new MyStudentList ();
		//new MyStudentResult();
		//new MyCourseList();
		new MySearchStudent("011111020");
	
		
		/*System.out.println ("Enter an ID to search....\n");
		Scanner sc = new Scanner(System.in);
		String search = sc.nextLine();
		
		MyStudent st1 = new MyStudent();
		st1 = Query.selectStudent(search);
	
		System.out.println("Student Info :~_~: " + st1.getId());
		System.out.println("Student Info :~_~: " + st1.getName());*/
		/*System.out.println("Student Info :~_~: " + st1.getLastName());
		System.out.println("Student Info :~_~: " + st1.getEmail());*/
		
		/*System.out.println("Enter ID: ");
		Scanner scan = new Scanner(System.in);
		new MySearchStudent(scan.nextLine());*/

	}

}
