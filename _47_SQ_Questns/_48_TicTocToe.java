package DsaProgress._47_SQ_Questns;

import java.util.Scanner;

public class _48_TicTocToe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[][] board = new char[3][3];
        for (int row = 0; row < board.length; row++){
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = ' ';
            }
        }
        boolean gameOver = false;
        char player = 'X';

        while(!gameOver){
            print(board);
            System.out.print("Player "+player+" Enter : ");
            int row = in.nextInt();
            int col = in.nextInt();
            System.out.println();
            if(board[row][col] == ' '){
                board[row][col] = player;
                gameOver = haveWon(board, player);
                if(gameOver){
                    System.out.println("Congratulations Player "+player+" have won the game");
                }
//                player = (player == 'X') ? '0' : 'X';


                if(player == 'X'){
                    player = '0';
                }else{
                    player = 'X';
                }


            }else{
                System.out.println("Invalid move try again");
            }
        }
        print(board);
    }
    private static boolean haveWon(char[][] board, char player){
        // check row wise
        for (int row = 0; row < board.length; row++){
            if(board[row][0] == player && board[row][1] == player && board[row][2] == player){
                return true;
            }
        }
        // check column wise
        for (int col = 0; col < board.length; col++){
            if(board[0][col] == player && board[1][col] == player && board[2][col] == player){
                return true;
            }
        }
        // diagonal check
        if(board[0][0] == player && board[1][1] == player && board[2][2] == player){
            return true;
        }
        if(board[0][2] == player && board[1][1] == player && board[2][0] == player){
            return true;
        }
        return false;
    }

    private static void print(char[][] board){
        for (int row = 0; row < board.length; row++){
            for (int col = 0; col < board[row].length; col++) {
                System.out.print(board[row][col]+" |");
            }
            System.out.println();
        }
    }
}
