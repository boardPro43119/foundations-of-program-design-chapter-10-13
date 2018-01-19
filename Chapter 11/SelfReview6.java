public class SelfReview6 {
	public static void main(String[] args){
		try { 
		    int[] array = new int[4];
			array[5] = 0; 
		} 
		 catch (ArithmeticException exception) 
		 { 
		    System.out.println ("one caught"); 
		 } 
		 finally 
		 { 
		    System.out.println ("finally"); 
		 } 
		 System.out.println ("the end"); 
	}
}
 