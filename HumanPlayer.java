import java.util.*;
public class HumanPlayer extends Player {
    

    public HumanPlayer(String name,char mark){
        this.name=name;
        this.mark=mark;
    }
    public void makeMove(){
        Scanner sc=new Scanner(System.in);
        int row,col;
        do{
            System.out.println("Enter Row and Col : ");
             row=sc.nextInt();
             col=sc.nextInt();
        }while(!isValidMove(row, col));
        TicTacToe.placeMark(row, col, mark);
      
    }
   
}
