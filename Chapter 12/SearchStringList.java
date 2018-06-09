import java.util.Scanner;
import java.util.ArrayList;

public class SearchStringList {

	public static boolean searchStringList(ArrayList<String> list, String searchString, int comparisons){
		ArrayList<String> shrunkList = new ArrayList<String>();

		int midIndex = list.size()/2;

		if(list.size()==0){
			System.out.println("Search string couldn't be found (in " + comparisons + " comparisons)\n");
			return false;
		}
		if(list.get(midIndex).equals(searchString)){
			System.out.println("Search string found (in " + comparisons + " comparisons)\n");
			return true;
		}
		else {
			if(list.get(midIndex).compareTo(searchString) > 0){
				for(int i=0; i<midIndex; i++){
					shrunkList.add(list.get(i));
				}
			}
			else {
				for(int i=midIndex; i<list.size(); i++){
					shrunkList.add(list.get(i));
				}
			}
			return searchStringList(shrunkList, searchString, comparisons+1);
		}

	}

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String nextInput, searchString;
		int numStrings = 0;
		ArrayList<String> list = new ArrayList<String>();

		System.out.println("Enter a sorted list of strings (empty line to stop):");
		
		nextInput = in.nextLine();

		while(!nextInput.equals("")){
			numStrings++;
			list.add(nextInput);
			nextInput = in.nextLine();

		}

		System.out.print("Enter the string to search for: ");

		searchString = in.nextLine();

		System.out.println(numStrings + " strings entered\n");

		searchStringList(list, searchString, 1);

	}

}