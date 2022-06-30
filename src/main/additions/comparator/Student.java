package main.additions.comparator;

/**
 * @author aqccj
 *
 */
public class Student implements Comparable<Student> {

	private int id;
	
	private String name;
	
	
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

    @Override
    public int compareTo(Student otherStudent) {
    	System.out.println("Other "+otherStudent.getName());
    	System.out.println("Current "+getName());
    	System.out.println(Integer.compare( otherStudent.getId(), getId()));
        return Integer.compare( otherStudent.getId(), getId());
    }

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
    
    
	
}
