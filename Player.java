abstract class Player {
    String name;
    char mark;

    abstract void makeMove();
    boolean isValidMove(int row,int col){
        if(row<3 && col<3){
            if(TicTacToe.board[row][col]==' '){
                return true;
            }
        }
        return false;
    }
}
