package inheritance;

public class Demo {package inheritance;

public class Student {
	private int studentId;					//101
	private String studentName;				// Arun
	
	public Student() {}
	
	public Student(int studentId,String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		
	}
	//								101
	public void setStudentId(int studentId) {
		this.studentId = studentId;				//101
	}
	public void setStudentName(String studentName) { // Arun
		this.studentName = studentName;				// Arun
	}

	public int getStudentID() {
		return studentId;
	}
	public String  getStudentName() {
		return studentName;
	}
}
package inheritance;

public class DEPT_CSE extends Student {
	private int unix,data_structures,java,computerOrginzation;
	
	public DEPT_CSE() {
		
	}
	//						101,			"Arun",		75,			78,					74,		85
	public DEPT_CSE(int studentId,String studentName,int unix,int data_structures,int java,int computerOrginzation) {
		
		setStudentId(studentId);		// setStudentId(101)
		setStudentName(studentName);
		this.unix = unix;
		this.data_structures = data_structures;
		this.java = java;
		this.computerOrginzation = computerOrginzation;
	}
	
	public void setUnix(int unix) {
		this.unix = unix;
	}
	public void setData_Structures(int data_Structures) {
		this.data_structures = data_Structures;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public void setComputer_Organization(int computer_Organization) {
		this.computerOrginzation = computer_Organization;
	}
	
	public int getUnix() {
		return unix;
	}
	
	public int getData_Structures() {
		return this.data_structures ;
	}
From Sreeja Talentsprint to Everyone:  01:04 PM
public int getJava() {
		return this.java ;
	}
	public int getComputer_Organization() {
		return this.computerOrginzation;
	}
	
	public float getPercentage() {
		return (unix + data_structures + java + computerOrginzation)/4.0f;
	}

	@Override
	public String toString() {
		return "DEPT_CSE [StudentID = " + getStudentID()  + ", StudentName =" + getStudentName()+", Unix = " + unix + ", data_structures=" + data_structures + ", java=" + java
				+ ", computerOrginzation=" + computerOrginzation + ", Percentage()=" + getPercentage() + "]";
	}
	
	
}
package inheritance;

public class StudentInfo {
	public static void main(String[] args) {
		DEPT_CSE cse1 = new DEPT_CSE(101,"Arun",75,78,74,85);
		DEPT_CSE cse2 = new DEPT_CSE(102,"Ravi",85,78,74,85);
		DEPT_CSE cse3 = new DEPT_CSE(103,"Ram",65,70,74,85);
		DEPT_CSE cse4 = new DEPT_CSE(104,"Dinesh",65,58,74,85);
		
		DEPT_ECE ece1 = new DEPT_ECE(201,"Varun",87,74,89,74,78);
		DEPT_ECE ece3 = new DEPT_ECE(202,"Ruhi",80,74,89,74,78);
		DEPT_ECE ece2 = new DEPT_ECE(203,"Swathi",84,54,89,74,78);
		
		
		System.out.println(cse1);
		System.out.println(cse2);
		System.out.println(cse3);
		System.out.println(cse4);
		System.out.println("------------------------------------------------------------------------");
		System.out.println(ece1);
		System.out.println(ece3);
		System.out.println(ece2);
	}

}


}
