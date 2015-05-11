package code;

import java.sql.ResultSet;

public class MyQuery {

	public static void Insert_std(MyStudent student) {
		try {
			MyConnectDatabase dbconn = new MyConnectDatabase();

			String command = "INSERT INTO students values ('" + student.getId()
					+ "', '" + student.getName() + "', '" + student.getFather()
					+ "', '" + student.getMother() + "', '"
					+ student.getAddress() + "', '" + student.getGender()
					+ "', '" + student.getCourse() + "', '"
					+ student.getSubject() + "')";

			dbconn.insertStat(command);
			dbconn.closeConnection();
		} catch (Exception e) {
			System.err.println("Cannot Insert.. " + e);
			e.printStackTrace(System.err);
		}
	}

	public static void Update_std(MyStudent student) {
		try {
			MyConnectDatabase dbconn = new MyConnectDatabase();
			String command = "UPDATE students set std_id = '" + student.getId()
					+ "', '" + student.getName() + "', '" + student.getFather()
					+ "', '" + student.getMother() + "', '"
					+ student.getAddress() + "', '" + student.getGender()
					+ "', '" + student.getCourse() + "', '"
					+ student.getSubject() + "')";
			dbconn.updateStat(command);
			dbconn.closeConnection();
		} catch (Exception e) {
			System.err.println("Cannot Update.. " + e);
			e.printStackTrace(System.err);
		}
	}

	public static void Del_std(MyStudent student) {// (String id){
		try {
			MyConnectDatabase dbconn = new MyConnectDatabase();
			String command = "DELETE FROM students where std_id = '"
					+ student.getId() + "'";// +id+"'";//
			dbconn.deleteStat(command);
			dbconn.closeConnection();
		} catch (Exception e) {
			System.err.println("Cannot Update.. " + e);
			e.printStackTrace(System.err);
		}
	}

	public static MyStudent selectStudent(String stdId) {
		try {
			MyStudent st = new MyStudent();
			MyConnectDatabase dbconn = new MyConnectDatabase();
			String command = "SELECT * FROM students where std_id = '" + stdId
					+ "'";
			ResultSet rs = dbconn.queryStat(command);
			while (rs.next()) {
				st.setId(rs.getString("id"));
				st.setName(rs.getString("name"));
				st.setFather(rs.getString("father"));
				st.setMother(rs.getString("mother"));
				st.setAddress(rs.getString("address"));
				st.setGender(rs.getString("gender"));
				st.setCourse(rs.getString("address"));
				st.setSubject(rs.getString("address"));
			}
			dbconn.closeStatement();
			dbconn.closeConnection();
			return st;
		} catch (Exception e) {
			System.err.println("Cannot Select.. " + e);
			e.printStackTrace(System.err);
			return null;
		}
	}

}
