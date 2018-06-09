import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;

public class RouteCalculator {

	public static void main(String[] args){

		int num;
		ArrayList<City> cities = new ArrayList<City>();

		String currentCityName;
		int currentX, currentY;

		Scanner in = new Scanner(System.in);

		System.out.print("Enter the number of cities: ");
		num = in.nextInt();

		for(int i=0; i<num; i++){

			System.out.println("Enter city " + (i+1) + ": ");
			in.nextLine();
			currentCityName = in.nextLine();
			System.out.println("Enter the x coordinate: ");
			currentX = in.nextInt();
			System.out.println("Enter the y coordinate: ");
			currentY = in.nextInt();

			cities.add(new City(currentCityName, currentX, currentY));
		}

		printRoutes(num, cities, new ArrayList<City>());

	}

	public static void printRoutes (int numCities, ArrayList<City> cities, ArrayList<City> currentRoute){

		ArrayList<City> tempCities = cities;
		ArrayList<City> tempRoute = currentRoute;

		if(currentRoute.size()==0){
			currentRoute.add(cities.get(0));
			currentRoute.add(cities.get(cities.size()-1));
		}

		if(numCities==2){3

			double totalDistance = 0.0;

			System.out.print(currentRoute.get(0).getName() + " ");

			for(int i=1; i<currentRoute.size(); i++){
				System.out.print(currentRoute.get(i).getName() + " ");
				totalDistance += Math.sqrt(Math.pow(currentRoute.get(i).getXCoordinate()-currentRoute.get(i-1).getXCoordinate(), 2)+Math.pow(currentRoute.get(i).getYCoordinate()-Math.pow(currentRoute.get(i-1).getYCoordinate(), 2), 2));
			}

			System.out.print("(distance " + totalDistance + ")\n");

		}
		
		else {

			for(int i=1; i<numCities-1; i++){

			tempCities = new ArrayList<City>();
			tempRoute = new ArrayList<City>();

			for(int j=0; j<cities.size(); j++){
				tempCities.add(cities.get(j));
			}

			for(int j=0; j<currentRoute.size(); j++){
				tempRoute.add(currentRoute.get(j));
			}

			tempRoute.add(currentRoute.size()-1, tempCities.get(i));
			tempCities.remove(i);

			printRoutes(numCities-1, tempCities, tempRoute);

			}

		}
		

	}
}