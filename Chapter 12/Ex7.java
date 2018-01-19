public class Ex7 {
	
<<<<<<< HEAD
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
=======
	public static int reverseString(String str){ 
	    String result;
		
		if(str.length() == 1){
			result += str;
		}
		else{
			result += str.charAt(str.length());
			str -= str.charAt(str.length());
			reverseString(str);
		}
>>>>>>> c8a231074650902fe9827c04b1ce5def0275b48f
 	} 
	
	public static void main(String[] args){
		System.out.println(reverseString(args[0]));
	}
}