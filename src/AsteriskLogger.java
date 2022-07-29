
public class AsteriskLogger implements Logger{
	
	public void Log(String string) {
		System.out.println("***" + string + "***");
		
	}
	
	public void Error(String string) {
		printStringAsteriskErrorBox(string);
				
	}
	
	private void printStringAsteriskErrorBox(String string) {
		for (int i = 1; i <= string.length() + 13; i++) {				// +13 for each character that isn't the input string
			System.out.print("*");
		}
		
		System.out.println("\n" + "***ERROR: " + string + "***");		// error message
		
		for (int i = 1; i <= string.length() + 13; i++) {				// bottom bounds of box
			System.out.print("*");
		}
		
		System.out.print("\n");
	}

}
