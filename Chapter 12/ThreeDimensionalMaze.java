//******************************************************************** 
//  ThreeDimensionalMaze.java       Author: Benjamin Prud'homme // 
//  Represents a 3D maze of characters. The goal is to get from the 
//  top left corner of the bottom level to the bottom right of the
//  upper level, following a path of 1s. 
//********************************************************************
public class ThreeDimensionalMaze {
	private final int TRIED = 3;  
	private final int PATH = 7;
   	
	private int[][][] grid = {
								{ // floor 0
									{1,1,1,0,1,1,0,0,0,1,1,1,1},                            
									{1,0,1,1,1,0,1,1,1,1,0,0,1},                            
									{0,0,0,0,1,0,1,0,1,0,1,0,0},                            
									{1,1,1,0,1,1,1,0,1,0,1,1,1},
									{1,0,1,0,0,0,0,1,1,1,0,0,1},                            
									{1,0,1,1,1,1,1,1,0,1,1,1,1},                            
									{1,0,0,0,0,0,0,0,0,0,0,0,0},                            
									{1,1,1,1,1,1,1,1,1,1,1,1,1} 
								},
								{ // floor 1
									{1,1,1,0,1,1,0,0,0,1,1,1,1},                            
									{1,0,1,1,1,0,1,1,1,1,0,0,1},                            
									{0,0,0,0,1,0,1,0,1,0,1,0,0},                            
									{1,1,1,0,1,1,1,0,1,0,1,1,1},
									{1,0,1,0,0,0,0,1,1,1,0,0,1},                            
									{1,0,1,1,1,1,1,1,0,1,1,1,1},                            
									{1,0,0,0,0,0,0,0,0,0,0,0,0},                            
									{1,1,1,1,1,1,1,1,1,1,1,1,1} 
								}
							};
	
	 //----------------------------------------------------------------   
	 //  Attempts to recursively traverse the maze. Inserts special   
	 //  characters indicating locations that have been tried and that   
	 //  eventually become part of the solution.   
	 //----------------------------------------------------------------   
	 public boolean traverse (int floor, int row, int column){      
	 	boolean done = false;
      	if (valid (floor, row, column)){         
			grid[floor][row][column] = TRIED;  // this cell has been tried
			
			if(floor == grid.length-1 && row == grid[0].length-1 && column == grid[0][0].length-1)
				done = true;  // the maze is solved         
			else{            
				done = traverse (floor, row+1, column);     // back            
				if (!done)               
					done = traverse (floor, row, column+1);  // right            
				if (!done)               
					done = traverse (floor, row-1, column);  // forward            
				if (!done)               
					done = traverse (floor, row, column-1);  // left
				if (!done)               
					done = traverse (floor-1, row, column);  // down
				if (!done)               
					done = traverse (floor+1, row, column);  // up         
			}
         if (done)  // this location is part of the final path            
		 	grid[floor][row][column] = PATH;      
		}      
		return done;   
	}
	
   	//----------------------------------------------------------------   
	//  Determines if a specific location is valid.   
	//----------------------------------------------------------------   
	private boolean valid (int floor, int row, int column){      
		boolean result = false;
		// check if cell is in the bounds of the matrix      
		if (floor >= 0 && floor < grid.length && row >= 0 && row < grid[floor].length && column >= 0 && column < grid[floor][row].length)
         // check if cell is not blocked and not previously tried         
		 if (grid[floor][row][column] == 1)
		 	result = true;
      	
		return result;   
	}
	
   	//----------------------------------------------------------------   
  	//  Returns the maze as a string.   
   	//----------------------------------------------------------------   
   	public String toString(){      
   		String result = "\n";      
		for(int floor=0; floor < grid.length; floor++){
			result += "Level " + floor + ":\n";
			for (int row=0; row < grid[floor].length; row++){         
				for (int column=0; column < grid[floor][row].length; column++)            
					result += grid[floor][row][column] + "";         
				result += "\n";      
			}
		}
      	return result;   
	} 
}
