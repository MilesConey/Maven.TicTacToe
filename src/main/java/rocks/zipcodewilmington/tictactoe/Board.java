package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    private final Character[][] matrix; // creates a field matrix

    public Board(Character[][] matrix) { //creates board
         this.matrix = matrix;
    }

    public Boolean isInFavorOfX() { // looping through matrix, checking for 3 X's in a row
        for (int row = 0; row <= 2; row++) {
            for (int column = 0; column <= 2; column++) {
                if (matrix[0][column] == 'X' && matrix[1][column] =='X' && matrix[2][column] =='X'){
                    return true;
                }else if (matrix[row][0] == 'X' && matrix[row][1] =='X' && matrix[row][2] =='X'){
                    return true;
                }else if (matrix[0][0] == 'X' && matrix[1][1] == 'X' &&  matrix[2][2] == 'X'){
                    return true;
                } else if (matrix[2][0] == 'X' && matrix[1][1] == 'X' && matrix[0][2] == 'X'){
                    return true;
                }
            }
        }
        return false;
    }

    public Boolean isInFavorOfO() {   // looping through matrix, checking for 3 O's in a row
        for (int row = 0; row <= 2; row++) {
            for (int column = 0; column <=2; column++) {
                if(matrix[0][column] == 'O' && matrix[1][column] == 'O' && matrix[2][column] == 'O'){
                    return true;
                } else if (matrix[row][0] == 'O' && matrix[row][1] == 'O' && matrix[row][2] == 'O'){
                    return true;
                } else if (matrix[0][0] == 'O' && matrix[1][1] == 'O' && matrix[2][2] == 'O'){
                    return true;
                } else if ( matrix[2][0] =='O' && matrix [1][1] == 'O' && matrix[0][3] == 'O'){
                    return true;
                }

            }

        } return false;
    }

    public Boolean isTie() {
        return isInFavorOfO() == isInFavorOfX();
    }

    public String getWinner() {
        if(this.isInFavorOfX()){
            return "X";
        } else if(this.isInFavorOfO()){
            return "O";
        }
        return "";
    }
    }


