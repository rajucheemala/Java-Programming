package inheritance;

public class Cse extends Student{
	private int unix;
	private int java;
	private int python;
	private int dbms;
	public Cse() {
		
	}
	public Cse(int studentId,String studentName,int unix,int java,int python,int dbms) {
		setstudentId(studentId);
		setstudentName(studentName);
		this.unix = unix;
		this.java = java;
		this.python = python;
		this.dbms = dbms;
		
	}
	public void setunix(int unix) {
		this.unix = unix;
	}
	public void setjava(int java) {
		this.java = java;
	}
	public void setpython(int python) {
		this.python = python;
	}
	public void setdbms(int dbms) {
		this.dbms = dbms;
	}
	public int getunix() {
		return unix;
	}
	public int getjava() {
		return java;
	}
	public int getpython() {
		return python;
	}
	public int getdbms() {
		return dbms;
	}
	public float getPercentage() {
		return (unix + java + python + dbms)/4.0f;		
		
	}
	@Override
	public String toString() {
		return "Cse [studentId=" + getstudentId() + ", studentName= " + getstudentName() + ", unix=" + unix + ", java=" + java + ", python=" + python + ", dbms=" + dbms + ", getPercentage()="
				+ getPercentage() + "]";
	}
}