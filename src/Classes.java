
public class Classes {

	public static void main(String[] args) {
		StringBuilder name = new StringBuilder();
		StringBuilder name2 = new StringBuilder();
		
		Student student1 = new Student();
	/*	student1.firstName = "Tom"; // this was broken when the data in Student class becamse encapsulated
		student1.lastName = "Smith";
		student1.gradeLevel = 12;	
		student1.phoneNumber = "970 123-4567"; */
		student1.introduction();
		
		Student student2 = new Student("Sammy", "Jones");
		student2.introduction();
		
		Student student3 = new Student("Tom","Riddle", "303 321-7654", 11);
		student3.introduction();

	}

}
