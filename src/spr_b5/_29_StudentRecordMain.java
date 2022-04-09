package spr_b5;

// Requires: StudentRecord.java
public class _29_StudentRecordMain {

	public static void main(String[] args) {

		int[] s1 = {50, 50, 20, 80, 53};
		int[] s2 = {20, 50, 50, 53, 80};
		int[] s3 = {20, 50, 50, 80};
		
		System.out.println(new StudentRecord(s1));
		System.out.println(new StudentRecord(s2));
		System.out.println(new StudentRecord(s3));
		
	}

}
