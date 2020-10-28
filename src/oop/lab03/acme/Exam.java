package oop.lab03.acme;

import java.util.Arrays;

public class Exam {
	private int id;
	private int maxStudents;
	private int registeredStudents;
	private String courseName;
	private Professor professor;
	private ExamRoom room;
	private Student[] students;
	
	public Exam(int id, int maxStudents, int registeredStudents, String courseName, Professor professor, ExamRoom room, Student[] students) {
		this.id=id;
		this.maxStudents=maxStudents;
		this.registeredStudents=registeredStudents;
		this.courseName=courseName;
		this.professor=professor;
		this.room=room;
		this.students=students;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMaxStudents() {
		return maxStudents;
	}

	public void setMaxStudents(int maxStudents) {
		this.maxStudents = maxStudents;
	}

	public int getRegisteredStudents() {
		return registeredStudents;
	}

	public void setRegisteredStudents(int registeredStudents) {
		this.registeredStudents = registeredStudents;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public ExamRoom getRoom() {
		return room;
	}

	public void setRoom(ExamRoom room) {
		this.room = room;
	}

	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}
	
	public void registerStudent(Student student) {
		if(this.registeredStudents<this.maxStudents) {
			this.students[this.registeredStudents]=student;
			this.registeredStudents++;
		}
	}

	public String toString() {
		return "Exam [id=" + id + ", maxStudents=" + maxStudents + ", registeredStudents=" + registeredStudents
				+ ", courseName=" + courseName + ", professor=" + professor + ", room=" + room + ", students="
				+ Arrays.toString(students) + "]";
	}
	
	
	
	
	
}
