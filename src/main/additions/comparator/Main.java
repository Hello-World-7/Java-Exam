package main.additions.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		
		Student st1 = new Student(71, "John");
		Student st2 = new Student(22, "Set");
		Student st3 = new Student(43, "Alice");
		
		students.add(st2);
	    students.add(st1);	    
	    students.add(st3);
	    
	    System.out.println("Before Sorting : " + students);
	    Collections.sort(students);
	    System.out.println("After Sorting : " + students);
	}
}
