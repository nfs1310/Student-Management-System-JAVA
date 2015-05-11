package code;

import java.io.Serializable;

public class MyStudent implements Serializable {

	public String name;
	public String father;
	public String mother;
	public String address;
	public String gender;
	public String course;
	public String subject;
	public String id;

	public MyStudent() {
		this.name = "";
		this.father = "";
		this.mother = "";
		this.address = "";
		this.gender = "";
		this.course = "";
		this.subject = "";
		this.id = "";
	}

	public MyStudent(String id, String name, String father, String mother, String address,
			String gender, String course, String subject) {
		this.name = name;
		this.father = father;
		this.mother = mother;
		this.address = address;
		this.gender = gender;
		this.course = course;
		this.subject = subject;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFather() {
		return father;
	}

	public void setFather(String father) {
		this.father = father;
	}

	public String getMother() {
		return mother;
	}

	public void setMother(String mother) {
		this.mother = mother;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String toString() {
		return "NAME:\t" + name + "\nFather:\t" + father + "\nMother:\t"
				+ mother + "\nAddress:\t" + address + "\nGender:\t" + gender
				+ "\nCourse:\t" + course + "\nSubject:\t" + subject
				+ "\nId No.:\t" + id;
	}

}
