package oop.lab03.acme;

public class Professor implements User {
	
	private int id;
	private String name;
	private String surname;
	private String password;
	private String[] courses;

	public Professor(int id, String name, String surname, String password, String[] courses) {
		this.setId(id);
		this.name=name;
		this.surname=surname;
		this.password=password;
		this.courses=courses;
	}
	
	public void replaceCourse(String course, int index) {
		this.courses[index]=course;
	}
	
	public void replaceAllCourses(String[] courses) {
		this.courses=courses;
	}
	
	public String getUsername() {

		return name+"."+surname;
	}

	
	public String getPassword() {

		return password;
	}

	
	public String getDescription() {

		return this.toString();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
