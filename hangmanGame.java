import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


import java.io.File;
import java.io.FileNotFoundException;;
public class hangmanGame{
    public static void main(String [] args) throws FileNotFoundException{
       
        Scanner keyboard = new Scanner(System.in);
        System.out.println("1 or 2 players?");
        String players = keyboard.nextLine();
        String word1;
        if(players.equals("1")){
        Scanner s = new Scanner(new File("words.txt"));
        List<String> word = new ArrayList<>();
        while(s.hasNext()){
            word.add(s.nextLine());
            
        }
        Random random = new Random();

        word1 = word.get(random.nextInt(word.size()));
    }else{
        System.out.println("Player1, please enter your word:");
        word1 = keyboard.nextLine();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("Ready for player2! good luck!");

    }
        
    
        List<Character> playerGuesses = new ArrayList<>();
        int wrongCount =0;
        while(true){
           
            printHangedMan(wrongCount);
            if(wrongCount >=6){
                System.out.println("You Lose!");
                System.out.println("the word was:"+word1);
                break;
            }
            printWordState(word1,playerGuesses);
            if(!getPlayerGuess(keyboard, word1, playerGuesses)){
                wrongCount++;
            }
            if( printWordState(word1, playerGuesses)){
                System.out.println("You win!");
                break;
            }
            System.out.println("Please enter your guess for the word:");
            if(keyboard.nextLine().equals(word1)){
                System.out.println("You win!");
                break;
            }else{
                System.out.println("Nope! Try again.");
            }
        }
        
     
        
    }

    private static boolean printWordState(String word1, List<Character> playerGuesses){
        int correctCount =0;
        for(int i=0;i<word1.length(); i++){
            if(playerGuesses.contains(word1.charAt(i))){
                System.out.print(word1.charAt(i));
                correctCount++;
            }else{
                System.out.print("-");
            }
        }
        System.out.println();
        return (word1.length() == correctCount);
    }
    private static boolean getPlayerGuess(Scanner keyboard, String word1, List<Character>playerGuesses){
        System.out.println("Please enter a letter :");
        String letterGuess = keyboard.nextLine();
        playerGuesses.add(letterGuess.charAt(0));
       return word1.contains(letterGuess);
    }
    private static void printHangedMan(Integer wrongCount){
        System.out.println("-------");
        System.out.println(" |     |");
        if(wrongCount>=1){
            System.out.println(" O");
        } if(wrongCount >=2){
            System.out.print("\\ ");
            if(wrongCount >= 3) {
                System.out.println("/");
            }
            else{
                System.out.println("");
            }
        }
        if(wrongCount >= 4){
            System.out.println(" |");
        }
        if(wrongCount >=5){
            System.out.print("/ ");
            if(wrongCount >=6){
                System.out.println("\\");
            } else{
                System.out.println("");
            }
           
    }
    System.out.println("");
    System.out.println("");
    
    }

    
    }
