public class TicTacToe {
    static char[][] board;
    public TicTacToe(){
        board=new char[3][3];
        displayInit();
    }
    void displayInit(){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                board[i][j]=' ';
            }
        }
    }
    void dispBoard(){
        System.out.println("--------------");
        for(int i=0;i<3;i++){
            System.out.print(" | ");
            for(int j=0;j<3;j++){
                System.out.print(board[i][j]+" | ");
            }
           
            System.out.println();
            System.out.println("--------------");
        }
    }
    static void placeMark(int row,int col,char mark){
        if(row<=2&&col<=2){
            board[row][col]=mark;

        }
        else{
            System.out.println("Invalid Position........");
        }
    }
    static boolean checkColWin(){
        for(int j=0;j<3;j++){
            if(board[0][j]!=' ' && board[0][j]==board[1][j]&&board[1][j]==board[2][j]){
                return true;
            }
           

        }
        return false;
    }
    static boolean checkRowWin(){
        for(int i=0;i<3;i++){
            if(board[i][0]!=' '&&board[i][0]==board[i][1]&&board[i][1]==board[i][2]){
                return true;
            }

        }
        return false;
    }
    static boolean checkDiagWin(){
        if(board[0][0]!=' '&&board[0][0]==board[1][1]&&board[1][1]==board[2][2]||board[0][2]!=' '&&board[0][2]==board[1][1]&&board[1][1]==board[2][0]){
            return true;
        }
        return false;
    }
    static boolean checkDraw(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(board[i][j]==' '){
                    return false;
                }
            }
        }
        return true;
    }
}
