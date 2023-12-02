import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        while(true){
        System.out.println("What is your move ?,To make a move enter rock,scissor,paper.To quit game enter quit ");
        String move = s.nextLine();
        if(move.equals( "quit")){
            break;
        }
        if(!move.equals("rock") && !move.equals("paper") && !move.equals("scissors")){
            System.out.println("enter valid move");
        }else{
            int rand = (int)(Math.random()*3);
            String opponentMove = " ";
            if(rand == 0){
                opponentMove = "rock";
    
            }else if( rand ==1){
                opponentMove = "paper";
            }else{
                opponentMove = "scissor";
            }
            System.out.println("Opponents Move "+opponentMove);
            if(move.equals (opponentMove)){
                System.out.println("Its a tie");
            }else if((move=="rock" && opponentMove == "scissor")|| (move =="scissor"&& opponentMove == "paper")||
             (move == "paper"&& opponentMove == "rock")){
                System.out.println("You Won!");
             }else{
                System.out.println("You Lost!");
             }
        }
    
    }
    
    System.out.println("Thank you for playing");
    s.close();
        }
}
