package spr_b3;

public class Student {
	String name;
	int count;
	public Student (String n, int c) {
		name = n;
		count = c;
	}
	/**ReturnsthenameofthisStudent. */ 
	public String getName() {
		return name;
	}
	/**ReturnsthenumberoftimesthisStudenthasmissedclass. */ 
	public int getAbsenceCount(){ 
		return count;
	}
	// There may be instance variables, constructors, and methods that are not shown. 
}
