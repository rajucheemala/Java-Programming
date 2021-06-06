package inheritance;

public class Student {
	private int studentId;
	private String studentName;
	public Student() {
		
	}
	public Student(int studentId,String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	public void setstudentId(int studentId) {
		this.studentId = studentId;
	}
	public void setstudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getstudentId() {
		return studentId;
	}
	public String getstudentName() {
		return studentName;
	}

}
