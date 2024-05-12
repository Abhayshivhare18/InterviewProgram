package prm;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Student {
	public String name;
	public String subject;
	public Double marks;
	public String result;
	
	Student(String name, String subject, Double marks){
		this.name=name;
		this.subject=subject;
		this.marks=marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getMarks() {
		return marks;
	}
	public void setMarks(Double marks) {
		this.marks = marks;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", subject=" + subject + ", marks=" + marks + ", result=" + result + "]";
	}

	public static void main(String[] ar) {
		List <Student> studentList = new ArrayList < > ();
		studentList.add(new Student("Ram", "maths",85.5));
		studentList.add(new Student("Pranav", "maths",34.0));
		studentList.add(new Student("Vibin", "maths",92.0));
		studentList.add(new Student("Nikhil", "maths",30.0));
		studentList.add(new Student("Sushil", "science",60.0));
		
		studentList=studentList.stream()
				.map(s->
				{
					s.setResult(s.getMarks()<35?"fail":"pass");
			return s;
			}).toList();
		
		}
	
	

}
