import java.util.Random;

public class BlurbGenerator {
	public static String newBlurb(int length){	
		int whatzits = length;
		
		if(whatzits <= 0){
			return newWhoozit();
		}
		else {
			return newWhoozit() + newWhatzit() + newBlurb(whatzits-1);
			// blurb = whoozit + (k)whatzit; (k>0)
			// whoozit = x + (n)y; (n>=0)
			// whatzit = q + z/d + whoozit = q + z/d + x + (n)y; (n>=0)
			
			// unique part of a whatzit = q + z/d
			// blurb = whoozit + (k)(unique part of a whatzit + whoozit) (k>0)
		}
		
	}
	
	public static String newWhoozit(){
		String whoozit = "x";
		
		Random numberOfYsRandom = new Random();
		int numberOfYs = numberOfYsRandom.nextInt(11);
		
		for(int i=0; i<numberOfYs; i++){
				whoozit += "y";
		}
		
		return whoozit;
	}
	
	public static String newWhatzit(){
		String whatzit = "q";
		
		Random secondCharacterRandom = new Random();
		int secondCharacter = secondCharacterRandom.nextInt(2);
		
		if(secondCharacter == 0){
			whatzit += "z";
		}
		else {
			whatzit += "d";
		}
		
		return whatzit;
		
	}
	
	public static void main(String[] args){
		System.out.println(newBlurb(3));
	}
}