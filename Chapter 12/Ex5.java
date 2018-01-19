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
		
		return result;
 	} 
	
	public static void main(String[] args){
		System.out.println(sum(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
	}
}