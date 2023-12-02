import java.util.*;
public class guessingGame {
    public static void main(String [] args){
        System.out.println("Welcome to Guessing Game!");
        Scanner s = new Scanner(System.in);
        int attempts = 0;
        Random random = new Random();
       int target = random.nextInt(100)+1;
       while(true){
        
            System.out.println("Enter the number to guess it should between range of 1 to 100");
            int number = s.nextInt();
            attempts++;
            if(number < target){
                System.out.println("your guess is too low");
            }else if(number > target){
                System.out.println("your guess is too high");
            }else{
                System.out.println("Congratualtions your guess is correct!");
                System.out.println("number of attempts"+attempts);
                break;
            }
        
    }
        s.close();
       

    }
}
