import java.util.Scanner;
import java.util.Random;

class Game{
    public int userguess , pcinput , numberofguesses =0;

    public Game(){
        Random random = new Random();
        pcinput = random.nextInt(20);
    }
    public void userinput(int num){
        userguess = num;
    }

    public boolean isCorrectnumber(){
        if(userguess>pcinput){
            System.out.println("you have choosen bigger number");
            numberofguesses = numberofguesses + 1;
            return false;
        } else if (userguess<pcinput) {
            System.out.println("You have choosen smaller number");
            numberofguesses = numberofguesses +1;
            return false;
        }else {
            System.out.println("Youve guessed it right mate");
            numberofguesses = numberofguesses +1 ;
            return true;
        }
    }
}

public class TenetGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("WELCOME TO THE ENTER YOUR NUMBER GUESS GAME!");
        Game game = new Game();
        System.out.println("Guess number between 0 and 20: ");
        game.userinput(scanner.nextInt());

        while(!game.isCorrectnumber()){
            System.out.println("guess the number again");
            game.userinput(scanner.nextInt());
            game.isCorrectnumber();
        }
    }
}
