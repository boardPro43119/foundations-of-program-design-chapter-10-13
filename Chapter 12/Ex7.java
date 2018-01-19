public class Ex7 {
	
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
		System.out.println(reverseString(args[0]));
	}
}