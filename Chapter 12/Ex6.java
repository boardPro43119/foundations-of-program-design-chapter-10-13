public class Ex6 {
	
	public static int factorial(int num){ 
	    int result;
		
		if(num == 1){
			result = 1;
		}
		else{
			result = num * factorial(num-1);
		}
		
		return result;
 	} 
	
	public static void main(String[] args){
		System.out.println(factorial(Integer.parseInt(args[0])));
	}
}