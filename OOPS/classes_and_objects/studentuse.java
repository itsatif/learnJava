package classes_and_objects;

public class studentuse {

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		s1.name = "Atif";
		s1.age = 25;
		s2.name = "Kabir";
		s2.age = 22;
		System.out.print(s1.name + "  : ");
		System.out.println(s1.age);
		System.out.print(s2.name + " : ");
		System.out.println(s2.age);
		//Student.numstudents = 50;
		//s1.setRollNum(14);
		//s2.setRollNum(20);
		System.out.println(s1.name + " " + s1.getRollNum());
		System.out.println(s2.name + " " + s2.getRollNum());
		Student s3 = new Student("Atif",25);
		s3.print();
		System.out.println(Student.getNumStudents());
	}

}
