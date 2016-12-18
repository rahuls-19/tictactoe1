package tictactoe;
import java.util.Scanner;
public class Tictactoe {
public static Scanner scan;
public static char [][]board = new char[3][3];
public static char turn = 'X';
public static int row,col,count=0;
public static boolean rex = true;
    public static void main(String[] args) {
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                board[i][j]='_';
            }
        }
     play();   
    }
    public static void  printboard(){
        for(int i=0;i<3;i++){
            System.out.println();
            for(int  j=0;j<3;j++){
                if(j==0)
                       System.out.print(" | ");
                System.out.print(board[i][j] + " | ");
            }
         System.out.println();      
        }
    }
    public static void play(){
        printboard();
        System.out.println("please enter row and col number  ");
        while(rex && count <=9)
        { scan = new Scanner(System.in);
          row = scan.nextInt()-1;
          col = scan.nextInt()-1;
          if(board[row][col]=='_')
                board[row][col]=turn;
          else
              System.out.println("please move a valid turn ");
          printboard();
          if(gameover()){
              rex = false;
              System.out.println("GameOver " + turn + " wins " );
          }
          else
        System.out.println("please enter row and col number  ");
            if(turn == 'X')
                turn = 'O';
            else
                turn = 'X';
            count++;
        }
        if(count == 10)
        System.out.println("Game Draw");
    }
    public static boolean gameover(){
        if(board[0][0]== 'X' && board[0][1]== 'X' && board[0][2] == 'X' ||
                board[1][0]== 'X' && board[1][1]== 'X' && board[1][2] == 'X'||
                board[2][0]== 'X' && board[2][1]== 'X' && board[2][2] == 'X'||
                board[0][0]== 'X' && board[1][1]== 'X' && board[2][2] == 'X'||
                board[0][0]== 'X' && board[1][0]== 'X' && board[2][0] == 'X'||
                board[0][1]== 'X' && board[1][1]== 'X' && board[2][1] == 'X'||
                board[0][2]== 'X' && board[1][2]== 'X' && board[2][2] == 'X'){
            return true;
        }
         if(board[0][0]== 'O' && board[0][1]== 'O' && board[0][2] == 'O' ||
                board[1][0]== 'O' && board[1][1]== 'O' && board[1][2] == 'O'||
                board[2][0]== 'O' && board[2][1]== 'O' && board[2][2] == 'O'||
                board[0][0]== 'O' && board[1][1]== 'O' && board[2][2] == 'O'||
                board[0][0]== 'O' && board[1][0]== 'O' && board[2][0] == 'O'||
                board[0][1]== 'O' && board[1][1]== 'O' && board[2][1] == 'O'||
                board[0][2]== 'O' && board[1][2]== 'O' && board[2][2] == 'O'){
            return true;
        }
        return false;
    }
    
}
