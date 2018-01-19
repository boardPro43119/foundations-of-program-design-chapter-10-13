import java.util.Scanner;

public class RecursivePalindromeTestDriver {
	
	public static String test(String input){
		int length = input.length();
		
		int firstHalfEnd;
		int secondHalfStart;
		
		String secondHalfReversed = "";
		
		if(input.length()%2 == 0){
			firstHalfEnd = length/2 - 1;
			secondHalfStart = length/2;
			
		}
		else{
			firstHalfEnd = length/2;
			secondHalfStart = firstHalfEnd;
		}	
			
		String firstHalf = input.substring(0, firstHalfEnd+1);
		String secondHalf = input.substring(secondHalfStart, length);
		
		//debugging
		System.out.println("First half: characters 0 to " + firstHalfEnd);
		System.out.println("Second half: characters " + secondHalfStart + " to " + length);
		System.out.println(firstHalf + "|" + secondHalf);

		if(firstHalf.equalsIgnoreCase(reverseString(secondHalf))){
			return "That string IS a palindrome.";
		}
		else{
			return "That string is NOT a palindrome.";
		}
	}
	
	public static String reverseString(String str){ 
	    String result = "";
		
		int length = str.length();
		
		if(length == 1){
			result = str;
		}
		else{
			result = str.charAt(length-1) + reverseString(str.substring(0, length-1));
		}
		
		return result;
 	}
	
	public static void main(String[] args){
		String another = "y";
		Scanner in = new Scanner(System.in);
		while(another.equalsIgnoreCase("y")){
			System.out.print("Enter a potential palindrome: ");
			System.out.println(test(in.nextLine()));
			
			System.out.print("Test another palindrome (y/n)? ");
			another = in.nextLine();
		}
		
	}
}