public class NonAttackingQueens{
	public int[][] board = {
							{0, 0, 0, 0, 0, 0, 0, 0},
							{0, 0, 0, 0, 0, 0, 0, 0},
							{0, 0, 0, 0, 0, 0, 0, 0},
							{0, 0, 0, 0, 0, 0, 0, 0},
							{0, 0, 0, 0, 0, 0, 0, 0},
							{0, 0, 0, 0, 0, 0, 0, 0},
							{0, 0, 0, 0, 0, 0, 0, 0},
							{0, 0, 0, 0, 0, 0, 0, 0}
						};

	public final int QUEEN = 9;
	// Queens indicated by 9's
	// Empty squares indicated by how many queens are attacking them (from 0 to 7)
	// A queen can only be placed on a square indicated by a 0

	public void solve(){



		

		// base case: current row = 7



		placeQueens(0);
			
	}

	private boolean placeQueens(int row){ // pass in row
		
		for(int col=0; col<8; col++){

			if(squareOpen(row, col)){
				addQueen(row, col);

				if(row == 7){
					return true;
				}

				else if(placeQueens(row+1)){
					return true;
				}

				else {
					removeQueen(row, col);
				}

			}

		}

		// If we can't place a queen in this row, return false
		return false;

	}

	private void addQueen(int row, int col){
		// Add queen
		board[row][col] = QUEEN;

		// Increment the squares it attacks...

		for(int i=0; i<8; i++){

			for(int j=0; j<8; j++){

				if(board[i][j] != QUEEN){

					// in the same row
					if(i == row){
						board[i][j]++;
					}

					// in the same column
					else if(j == col){
						board[i][j]++;
					}

					// on the same diagonals
					else if (row-col == i-j){
						board[i][j]++;
					}

					else if (row+col == i+j){
						board[i][j]++;
					}

				}

			}

		}

	}

	private void removeQueen(int row, int col){
		// Remove queen
		board[row][col] = 0;

		// Decrement the squares it attacked...

		for(int i=0; i<8; i++){

			for(int j=0; j<8; j++){

				if(board[i][j] != QUEEN){

					// in the same row
					if(i == row){
						board[i][j]--;
					}

					// in the same column
					else if(j == col){
						board[i][j]--;
					}

					// on the same diagonals
					else if (row-col == i-j){
						board[i][j]--;
					}

					else if (row+col == i+j){
						board[i][j]--;
					}

				}

			}

		}

	}

	private boolean squareOpen(int row, int col){
		return (board[row][col] == 0);
	}

	public String toString(){
		if(!placeQueens(0)){
			return "No solution\n";
		}
		else {
			String result = "";
			for(int i=0; i<8; i++){
				for(int j=0; j<8; j++){
					if(board[i][j]==QUEEN){
						result += "Q";
					}
					else {
						result += "X";
					}
				}

				result += "\n";
			}

			return result;
		}
	}
}