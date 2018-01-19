public class DocumentCodeValidator {
	public static void main(String[] args) throws InvalidDocumentCodeException{
		InvalidDocumentCodeException invalidLength =  new InvalidDocumentCodeException("Invalid code length");
		InvalidDocumentCodeException invalidStartingCharacter =  new InvalidDocumentCodeException("Invalid first character");
		
		int invalidCodes = 0;
		char firstCharacter;
		
		for(String code : args){

			firstCharacter = code.charAt(0);
			
			try {
				if(code.length() != 2){
					invalidCodes++;
					throw invalidLength;
				}
				
				else if(firstCharacter != 'U' && firstCharacter != 'C' && firstCharacter != 'P'){
					invalidCodes++;
					throw invalidStartingCharacter;
				}
			} catch(InvalidDocumentCodeException exception){
				System.out.println(exception.getMessage() + ": " + code);
			}
			
		}
		
		if(invalidCodes == 0){
			System.out.println("All codes valid");
		}
		else {
			System.out.println(invalidCodes + " invalid codes");
		}
	}
}