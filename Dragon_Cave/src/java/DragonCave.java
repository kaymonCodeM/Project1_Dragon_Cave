import java.io.InputStream;
import java.util.Random;
import java.util.Scanner;

public class DragonCave {


    private InputStream in = System.in;
    private int door = new Random().nextInt(2)+1;

    public void playDragonCave() {
        System.out.println("You are in a land full of dragons. In front of you,");
        System.out.println("you see two caves.In one cave, the dragon is friendly");
        System.out.println("and will share his treasure with you. the other dragon");
        System.out.println("is greedy and hungry and will eat you on sight.");
        System.out.println("Which cave will you go into? (1 or 2) \n");

        System.out.println(chooseDoor());
    }

    public String chooseDoor(){
        String result ="";
        Scanner playerInput = new Scanner(in);
        try {
            int chosenDoorNumber;
            //Check if user input is valid
            chosenDoorNumber = Integer.parseInt(playerInput.next());

            System.out.println("\nIt is dark and spooky...");
            System.out.println("A large dragon jumps out in front of you! He opens his jaws and...");

            //Check chosen door
            if(door==chosenDoorNumber){
                result +="Breaths fire to show you all of his treasure...\nYou take the treasure and become happily rich!\n";
            }else {
                result +="Gobbles you down in one bite!\n";
            }
        }catch (Exception e){
            result +="User Bad Input!\n";
        }
        return result;
    }

    public void setIn(InputStream in) {
        this.in = in;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    public int getDoor() {
        return door;
    }


     public static void main(String[] args) {
        DragonCave myGame = new DragonCave();
        myGame.playDragonCave();
    }
}
