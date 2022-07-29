
public class App {

	public static void main(String[] args) {
		
		AsteriskLogger astLogger = new AsteriskLogger();
		SpacedLogger spcLogger = new SpacedLogger();
		
		astLogger.Log("New Log Here");
		astLogger.Error("No Data Found");
		
		spcLogger.Log("Spaced Log Here");
		spcLogger.Error("No Data To Log");

	}

}
