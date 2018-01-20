import java.util.Scanner;

public class RecursivePalindromeTestDriver {
	
	public static boolean test(String input){	
		
		String cleanString = input.toLowerCase().replaceAll("[^a-z]", "");
		int length = cleanString.length();
			
		if(length == 1){
			return true;
		}
		else {
			if(cleanString.charAt(0) == cleanString.charAt(length-1)){
				if(length == 2){
					return true;
				}
				else {
					return test(cleanString.substring(1, length-1));
				}
			}
		}
		return false;
		
		
	}
	
	public static void main(String[] args){
		String another = "y";
		Scanner in = new Scanner(System.in);
		while(another.equalsIgnoreCase("y")){
			System.out.print("Enter a potential palindrome: ");
			if(test(in.nextLine())){
				System.out.println("That string IS a palindrome.");
			}
			else {
				System.out.println("That string is NOT a palindrome.");
			}
			
			System.out.print("Test another palindrome (y/n)? ");
			another = in.nextLine();
		}
		
	}
}