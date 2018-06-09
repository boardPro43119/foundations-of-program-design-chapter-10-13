import java.util.Scanner;

public class BlurbChecker {

	public static boolean isBlurb(String s){
		int currentIndex = 0;
		char currentChar;

		boolean whoozitNext = true;
		boolean inWhoozit = false;
		int numWhatzits = 0;

		while(currentIndex<s.length()){
			currentChar = s.charAt(currentIndex);

			if(whoozitNext){
				if(!inWhoozit){
					if(currentChar != 'x'){
						return false;
					}
					else {
						inWhoozit = true;
					}
				}

				else {
					if(currentChar == 'q'){
						whoozitNext = false;
						inWhoozit = false;
						numWhatzits++;
					}
					else if(currentChar != 'y'){
						return false;
					}
				}
			
			}

			else {
				if(currentChar == 'x'){
					whoozitNext = true;
					inWhoozit = true;
				}
				else if(currentChar != 'z' && currentChar != 'd'){
					return false;
				}
			}

			currentIndex++;
		}

		if(numWhatzits == 0){
			return false;
		}
		else if(!inWhoozit){
			return false;
		}
		else{
			return true;
		}
	}

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String input;

		System.out.print("Enter a string: ");
		input = in.nextLine();

		if(isBlurb(input)){
			System.out.println("That string IS a valid Blurb.");
		}
		else {
			System.out.println("That string is NOT a valid Blurb.");
		}
	}

}