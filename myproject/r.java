package myproject;
import java.util.*;
class r
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            String[] availableOptions = {"rock", "paper", "scissor"};
            String computerMove = availableOptions[new Random().nextInt(availableOptions.length)];
            System.out.println("------Computer has chosen its move------");
            System.out.println();
            System.out.println("-----------NOW IT'S YOUR CHOICE-----------");
            System.out.println();
            String userMove;
            while (true)
            {
                System.out.println("ENTER THE CORRECT CHOICE FROM THE AVAILABLE OPTIONS---ROCK---PAPER---SCISSOR---");
                System.out.println("----Enter your choice----:");
                userMove = sc.nextLine().toLowerCase();
                // Asking user to enter the choice:
                if(userMove.equals("rock") || userMove.equals("paper") || userMove.equals("scissor"))
                {
                    break;
                }
                // If user enters an invalid option:
                else
                {
                    System.out.println();
                    System.out.println("Please enter a valid move.");  
                }
            }
            // Displaying computer's choice:
            System.out.println("Computer's choice: " + computerMove);
            // Comparing the computer's and user's choices:
            // When it's a tie:
            if (userMove.equals(computerMove))
            {
                System.out.println("--> IT'S A TIE");
            }
            else if (userMove.equals("rock"))
            {
                if (computerMove.equals("scissor"))
                {
                    System.out.println("--> CONGRATULATIONS! YOU WIN");
                }
                else if (computerMove.equals("paper"))
                {
                    System.out.println("Computer wins...");
                    System.out.println("SORRY! BETTER LUCK NEXT TIME");
                }
            }
            else if (userMove.equals("paper"))
            {
                if (computerMove.equals("rock"))
                {
                    System.out.println("--> CONGRATULATIONS! YOU WIN");
                }
                else if (computerMove.equals("scissor"))
                {
                    System.out.println("Computer wins...");
                    System.out.println("SORRY! BETTER LUCK NEXT TIME");
                }
            }
            else if (userMove.equals("scissor"))
            {
                if (computerMove.equals("paper"))
                {
                    System.out.println("--> CONGRATULATIONS! YOU WIN");
                }
                else if (computerMove.equals("rock"))
                {
                    System.out.println("Computer wins....");
                    System.out.println("SORRY! BETTER LUCK NEXT TIME");
                }
            }
        }
    }
}
