package Capgeminiday8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

//import jdk.internal.misc.FileSystemOption;

class Student implements Comparable<Student> {
	private int id;
	private String name;
	private String contact;
	private String mail;
	private String bloodgroup;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getBloodgroup() {
		return bloodgroup;
	}

	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}

	public Student(int id, String name, String contact, String mail, String bloodgroup) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
		this.mail = mail;
		this.bloodgroup = bloodgroup;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", contact=" + contact + ", mail=" + mail + ", bloodgroup="
				+ bloodgroup + "]";
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if (this.id > getId())
			return -1;
		else
			return 1;
//		return 0;
	}

}

public class StudentCollections {

	public static void main(String[] args) {
//		 TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Set<Student> s = new HashSet<Student>();
		for (int i = 0; i < 3; i++)
			s.add(new Student(sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.next()));
		List<Student> l = new ArrayList<Student>(s);
		Collections.sort((List<Student>) l);
		l.forEach(System.out::println);
	}

}
