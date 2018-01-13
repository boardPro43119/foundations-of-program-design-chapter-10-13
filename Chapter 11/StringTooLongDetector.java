import java.util.Scanner;

public class StringTooLongDetector {
	public static void main(String[] args) throws StringTooLongException{
		StringTooLongException tooLong = new StringTooLongException("String is longer than 20 characters.");
		
		Scanner in = new Scanner(System.in);
		boolean running = true;
		String lastEntry;
		
		while(running){
			System.out.print("Enter a string (DONE to quit): ");
			lastEntry = in.next();
			try{ 
				if(lastEntry.length()>20){
					throw tooLong;
				}
				if(lastEntry.equals("DONE")){
					running = false;
				}
			} catch(StringTooLongException exception){
				System.out.println("String must be 20 characters or less");
			}
			
		}
	}
}