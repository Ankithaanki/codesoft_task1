import java.util.Random;
import java.util.Scanner;

public class Numbergame {
    public static void main(String arg[]){
        Scanner scanner= new Scanner(System.in);
        boolean game;
        do{
            num_game();
            System.out.println("Do you want to play again(True/False)");
            game=scanner.nextBoolean();
            }
            while(game);
            System.out.println("Thank you!");
        

        }
    public static void num_game(){
            Random ran = new Random();

            Scanner scanner = new Scanner(System.in);

            int random_num = ran.nextInt(100) + 1;
            //System.out.println("random " + random_num);
            int attempts=10;
            int count=0;
            for(int i=0;i<attempts;i++){
                System.out.println("Enter your guess number[1-100] : ");

                int playerguess =scanner.nextInt();
                count++;
                
                if(playerguess == random_num ){

                    System.out.println("Correct! You Win!");
                    System.out.println("It took you "+i +" tries");
                    System.out.println("Your score is "+(11-count)*10);
                    break;

                }
                else if(random_num > playerguess){

                    System.out.println("The number is higher.Guess again.");

                }
                else {

                    System.out.println("The number is Lower.Guess again.");

                }
            }
            if(count == attempts){
                System.out.println("You Lose");
                System.out.println("The number is "+ random_num);

            }

    }
}
