import java.util.Random;
import java.util.Scanner;

public class DragonCave {
    public static void main(String[] args) {

        Scanner playerInput = new Scanner(System.in);
        Random rand = new Random();
        int door = rand.nextInt(2)+1;
        System.out.println("You are in a land full of dragons. In front of you,");
        System.out.println("you see two caves.In one cave, the dragon is friendly");
        System.out.println("and will share his treasure with you. the other dragon");
        System.out.println("is greedy and hungry and will eat you on sight.");
        System.out.println("Which cave will you go into? (1 or 2) \n");

        String chosenDoorString = playerInput.next();
        int chosenDoorNumber =0;

        try {
            //Check if user input is valid
            chosenDoorNumber = Integer.parseInt(chosenDoorString);

            System.out.println("\nIt is dark and spooky...");
            System.out.println("A large dragon jumps out in front of you! He opens his jaws and...");

            //Check chosen door
            if(door==chosenDoorNumber){
                System.out.println("Breaths fire to show you all of his treasure...");
                System.out.println("You take the treasure and become happily rich!");
            }else {
                System.out.println("Gobbles you down in one bite!");
            }
        }catch (Exception e){
            System.out.println("User Bad Input!");
        }

    }
}
