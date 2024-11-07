public class LaunchGame{
    public static void main(String[] args) {
        TicTacToe t=new TicTacToe();
        HumanPlayer p1=new HumanPlayer("Arshu", 'X');
        AIPlayer p2=new AIPlayer("KingKong(ak)", 'O');

       Player cp;
       cp=p1;
       while(true){
        System.out.println(cp.name+" turn ");
        cp.makeMove();
        t.dispBoard();
        if(TicTacToe.checkColWin() || TicTacToe.checkRowWin()|| TicTacToe.checkDiagWin()){
              System.out.println(cp.name+" has Won ");
              break;
        }
        else if(TicTacToe.checkDraw()){
            System.out.println("Game is a Draw");
            break;
        }
        else{
             if(cp==p1){
                 cp=p2;
 
             }
             else{
                 cp=p1;
             }
         }
 
       }
      
    }
}