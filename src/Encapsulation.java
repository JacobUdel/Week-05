
public class Encapsulation {
	public static void main(String[] args) {
		Student student = new Student();
		// student.firstName = "Sally"; // this will not work with encapsulated data
		student.setFirstName("Sally");
		// System.out.println(student.firstName);
		System.out.println(student.getFirstName());
		
		student.setPhoneNumber("123");
		student.introduction();
		
		
		Rectangle rec = new Rectangle(10.0, 15.0);
		System.out.println(rec.getArea());
		rec.setLength(10.00);
		System.out.println(rec.getArea());
		
		// Access Modifiers
		// Public accessable everywhere
		// Protedted accessable within the clasee, other classes in the package and any subclass
		// Private only accessable within the class itself 
		// No Modifier same as protected except not in a subclass in a different package
		
		
	}
}
