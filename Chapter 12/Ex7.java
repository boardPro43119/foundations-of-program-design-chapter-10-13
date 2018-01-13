public class Ex7 {
	
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
 	} 
	
	public static void main(String[] args){
		System.out.println(reverseString(args[0]));
	}
}