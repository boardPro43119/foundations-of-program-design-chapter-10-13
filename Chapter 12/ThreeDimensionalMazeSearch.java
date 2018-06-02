//********************************************************************
//  ThreeDimensionalMazeSearch.java       Author: Benjamin Prud'homme
//
//  A version of the MazeSearch program in Chapter 12 with a 3D maze.
//********************************************************************
public class ThreeDimensionalMazeSearch {   
	//----------------------------------------------------------------   
	//  Creates a new maze, prints its original form, attempts to   
	//  solve it, and prints out its final form.   
	//----------------------------------------------------------------   
	public static void main (String[] args){      
		ThreeDimensionalMaze labyrinth = new ThreeDimensionalMaze();
      	
		System.out.println (labyrinth);
      	
		if (labyrinth.traverse (0, 0, 0))
			System.out.println ("The maze was successfully traversed!");   
			   
		else         
			System.out.println ("There is no possible path.");
      
	  	System.out.println (labyrinth);   
	
	} 
}