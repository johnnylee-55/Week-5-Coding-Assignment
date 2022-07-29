
public class SpacedLogger implements Logger{
	
	public void Log(String string) {
		spacedString(string);
		
	}
	
	public void Error(String string) {
		System.out.print("ERROR: ");
		spacedString(string);
		
	}
	
	public void spacedString(String string) {
		for (int i = 0; i < string.length(); i++) {
			System.out.print(string.charAt(i) + " ");
		}
		System.out.print("\n");
	}

}
