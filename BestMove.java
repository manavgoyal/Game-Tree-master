public class BestMove
{
    

    /**
     * This function provides a value between the two extremities of the number line, that
     * represents the strength of a given move after analyzing the current board with respect 
     * to the current player.

     * @param colour is the colour of the chip 
     * @param currentboard is the current state of the GameBoard
     * @return double that provides the strength of the move
     */
    public double strengthEval(int colour, GameBoard currentboard){return 0.0;}

    /**
     * This function evaluates the best move for the player, using the strengthEval function * and implements alpha-beta pruning and returns an object that holds this optimal move. 
     * @param depth the depth to which strengthEval goes to check
     * @param alpha
     * @param beta
     * @param color the color of the player
     * @param color2 the color of the opposite player
     * @param currentBoard current state of the GameBoard
     * @return an Object[] holding the move
     */
    private Object[] PieceMover(int depth, double alpha, double beta, int color, int color2, GameBoard currentboard){ return new Object[1] ; }
}