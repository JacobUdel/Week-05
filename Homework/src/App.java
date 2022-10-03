
public class App {

	public static void main(String[] args) {
		Logger astLogger = new AsteriskLogger();
		Logger spaceLogger = new SpacedLogger();
		astLogger.Log("Hello");
		System.out.println();
		astLogger.Error("Danger, Will Robinson!");
		System.out.println();
		spaceLogger.Log("Hello");
		System.out.println();
		spaceLogger.Error("Danger, Will Robinson!");
		

	}

}
