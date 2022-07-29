
public class App {

	public static void main(String[] args) {
		
		AsteriskLogger astLogger = new AsteriskLogger();
		SpacedLogger spcLogger = new SpacedLogger();
		
		astLogger.Error("No Data to Log");
		
		spcLogger.Log("No Data Found");

	}

}
