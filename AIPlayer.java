import java.util.Random;


public class AIPlayer extends Player {
    

    public AIPlayer(String name,char mark){
        this.name=name;
        this.mark=mark;
    }
    public void makeMove(){
       
        int row,col;
        do{
            System.out.println("Enter Row and Col : ");
             Random r=new Random();
             row=r.nextInt(3);
             col=r.nextInt(3);
        }while(!isValidMove(row, col));
        TicTacToe.placeMark(row, col, mark);
      
    }
  
}
