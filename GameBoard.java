/* GameBoard.java */
 
public class GameBoard{
/**
 *  Checks whether a given move is legal or not.
 *  Returns a boolean specifying that validity.
 */
	private Chip[][] board = new Chip[8][8];

	public Chip accessCell(int x, int y) {
		try {
			return board[x][y];
		}
		catch (NullPointerException e){
			return board[0][0];
		}
  }

  
}