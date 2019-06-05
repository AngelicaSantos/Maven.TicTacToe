package rocks.zipcodewilmington.tictactoe;

import java.util.Arrays;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    Character[][] matrix;
    int row ;
    int column;

    public Board(Character[][] matrix) {
        this.matrix = matrix;

        for (int row=0; row<=matrix.length; row++)
        {
            Arrays.fill(matrix[row],' ');
        }

    }

    /**
     * This method will validate if the players move is allowed and return true if the move is completed.
     */

    public Boolean makeMove(char player, int row, int column)
    {
        if (row >=0 && row <=2 && column >=0 && column <=2) {

            if (matrix[row][column] != ' ')
                return false;

            else {
                matrix[row][column] = player;
                return true;
            }

            }
        return false;

    } // end of make move method




    public Boolean isInFavorOfX()




    public Boolean isInFavorOfO() {
        return null;
    }

    public Boolean isTie() {
        return null;
    }


    public String getWinner() {
        return null;
    }

}
