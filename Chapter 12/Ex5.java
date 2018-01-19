<<<<<<< HEAD
public class Ex5 {
	
	public static int sum(int startNum, int endNum){ 
	    int result;
		
		int midpoint = (startNum+endNum)/2;
		
		if(startNum == endNum){
			result = startNum;
		}
		else {
			result = sum(startNum, midpoint) + sum(midpoint+1, endNum);
		}
=======
public class Ex6 {
	
	public static int factorial(int num){ 
	    int result;
		
		
>>>>>>> c8a231074650902fe9827c04b1ce5def0275b48f
		
		return result;
 	} 
	
	public static void main(String[] args){
<<<<<<< HEAD
		System.out.println(sum(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
=======
		System.out.println(sum(Integer.parseInt(args[0])));
>>>>>>> c8a231074650902fe9827c04b1ce5def0275b48f
	}
}