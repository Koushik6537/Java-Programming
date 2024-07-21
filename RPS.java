import java.util.*;

public class RPS {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int games=0;
        int userWins=0;
        int computerWins=0;

        System.out.println("!!!!!----------ROCK PAPER SCISSORS==========!!!!!");
        System.out.println("Let's play and win against me.");
        System.out.println("Choose:\n0-ROCK\n1=PAPER\n2-SCISSORS\n");

        while(games<5){
            int computerChoice = random.nextInt(3);
            
            System.out.print("Enter your choice: ");
            int userChoice = scanner.nextInt();
            
            if(userChoice==computerChoice){
                System.out.println("It's a DRAW!!!\n");
            }else if((computerChoice==2 && userChoice==0)||(computerChoice==0 && userChoice==1)||(computerChoice==1 && userChoice==2)){
                System.out.println("YOU WON!!!\n");
                switch(userChoice){
                    case 0:
                        System.out.println("Your move was ROCK\n");
                        break;
                    case 1:
                        System.out.println("Your move was PAPER\n");
                        break;
                    case 2:
                        System.out.println("Your move was SCISSORS\n");
                        break;
                    default:
                        System.out.println("Invalid choice!!");
                        break;
                }
                userWins++;
            }else{
                System.out.println("COMPUTER WON\n");
                computerWins++;
            }
            switch(computerChoice){
                case 0:
                    System.out.println("Computer's move was ROCK\n");
                    break;
                case 1:
                    System.out.println("Computer's move was PAPER\n");
                    break;
                case 2:
                    System.out.println("Computer's move was SCISSORS\n");
                    break;
                default:
                    System.out.println("Error occurred!!");
                    break;
            }
            games++;
        }
        if(computerWins>userWins){
            System.out.println("Sorry,computer won the match.");
        } else if(computerWins==userWins){
            System.out.println("It's a DRAW!!!\n");
        }else{
            System.out.println("You won the match.");
        }
    }
}

