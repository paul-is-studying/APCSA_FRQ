package spr_b3;

import java.util.ArrayList;

// requires: SeatingChart.java, Student.java
public class _49_SeatingChartMain {

	public static void main(String[] args) {
		ArrayList<Student> roster = new ArrayList<Student>();
		roster.add(new Student("Karen", 3));
		roster.add(new Student("Liz", 1));
		roster.add(new Student("Paul", 4));
		roster.add(new Student("Lester", 1));
		roster.add(new Student("Henry", 5));
		roster.add(new Student("Renee",9));
		roster.add(new Student("Glen",2));
		roster.add(new Student("Fran",6));
		roster.add(new Student("David",1));
		roster.add(new Student("Danny",3));
		for(int i=0; i<roster.size(); i++) {
			System.out.println(roster.get(i).getName()+"," +roster.get(i).getAbsenceCount());
		}
		
		// (a)
		SeatingChart sc = new SeatingChart(roster, 3, 4);
		sc.print();
		
		// (b)
		int count = sc.removeAbsentStudents(4);
		sc.print();
		System.out.println("Number of students removed:"+count);
		
		
	}

}
