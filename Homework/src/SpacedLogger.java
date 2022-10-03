
public class SpacedLogger implements Logger {


	@Override
	public void Log(String log) {
		System.out.println(log.replaceAll(".(?=.)", "$0 "));
		
	}

	@Override
	public void Error(String error) {
		System.out.println("ERROR: " + error.replaceAll(".(?=.)", "$0 "));
		
	}

}
