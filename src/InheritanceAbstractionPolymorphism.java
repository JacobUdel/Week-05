
public class InheritanceAbstractionPolymorphism {
	public static void main(String[] args) {
		Employee salary = new SaleryEmployee("Tom", "Sawyer", 2500.00);
		Employee hourly = new HourlyEmployee("Tim", "Smith", 15.0, 75.5);
		Employee manager = new Manager("Bob", "Lincoln", 4500.0, 15.5);
		
		System.out.println(salary.calculatePay());
		System.out.println(hourly.calculatePay());
		System.out.println(manager.calculatePay());
	}

}
