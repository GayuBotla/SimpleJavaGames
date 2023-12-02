import java.util.*;

public class tictactoe {
    public static void main(String []args){
        char [][] board = new char [3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                board[i][j] = '-';
            }
        }
        Scanner s = new Scanner(System.in);
        System.out.println("player1 enter your name :");
        String p1 = s.nextLine();
        System.out.println("player2 enter your name:");
        String p2 = s.nextLine();
        int row =0;
        int col =0;
        boolean player1 = true;
        boolean gameEnded = false;
        while(!gameEnded){
            drawBoard(board);
        
            if(player1){
                System.out.println(p1+"'s turn(x)");
            }else{
                System.out.println(p2+"'s turn(o)");
            }
            char symbol ='-';
            if(player1){
                symbol = 'x';
            }else {
                symbol ='o';
            }
            while(true){
                System.out.println("enter the row (0,1,2)");
                row = s.nextInt();
                System.out.println("enter the col (0,1,2)");
                col = s.nextInt();
                if(row<0||col<0||col>2||row>2){
                    System.out.println("please enter it properly, it is out of bounds");
                }else if(board[row][col]!= '-'){
                    System.out.println("it was already filled ");
                }else{
                    break;
                }
            }
                board[row][col]= symbol;
                if(hasWon(board)=='x'){
                    System.out.println(p1+"'s has won");
                  
                    gameEnded = true;
                }else if(hasWon(board)=='o'){
                    System.out.println(p2+"'s has won");
                    gameEnded = true;
                }else{
                    if(hasTied(board)){
                    System.out.println("its a tie");
                    gameEnded = true;
                    }else{
                        player1 =! player1;
                    }
                }
            
                
            }
        

//end of the game print board
     drawBoard(board);
     s.close();
    }
    public static void drawBoard(char[][] board){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
    public static char hasWon(char[][] board ){
        for(int i=0;i<3;i++){
            if(board[i][0]==board[i][1] && board[i][1]== board[i][2]&& board[i][0] !='-'){
                return board[i][0];
            }
            }
            for(int j=0;j<3;j++){
                if(board[0][j]==board[1][j] && board[1][j] == board[2][j] && board[0][j]!='-'){
                    return board[0][j];
                }
                }
                //diagonals
                if(board[0][0]== board[1][1] &&  board[1][1]== board[2][2]&& board[1][1]!='-'){
                    return board[0][0];

                }
                if(board[0][2]==board[1][1 ]&& board[1][1]== board[2][0]&& board[0][2]!='-'){
                    return board[0][2];
                }
                    return '-';
            }

            public static boolean hasTied(char [][] board){
                for(int i=0;i<3;i++){
                    for(int j=0;j<3;j++){
                        if(board[i][j]=='-' ){
                            return false;
                        }
                        
                    }
                }
                return true;
            }
        

    
    
}
