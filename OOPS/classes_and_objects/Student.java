package classes_and_objects;

public class Student {
	String name;
	public int age;
	private final int rollnum;
	private static int numstudents;
	
	public static int getNumStudents() {
		return numstudents;
	}
	
	public Student() {
		rollnum = 100;
		numstudents++;   //number of objects created
	}
	
	public void print() {
		System.out.println(name  + " " + rollnum );
	}
	
	public Student(String name, int rollnum) {
		this.name = name;
		this.rollnum = rollnum;
		numstudents++;     //number of objects created
	}
	
//	public void setRollNum(int rn) {
//		if(rn <= 0) {
//			return;
//		}		
//		rollnum = rn;
//	}
	public int getRollNum() {
		return rollnum; 
	}
}
