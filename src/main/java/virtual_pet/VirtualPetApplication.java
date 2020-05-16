package virtual_pet;

import java.util.Scanner;
/* Create main method that
    1.Implements a GameLoop   DONE
    2.Asks for user input     DONE
    3.Writes Outputs in the console
 */
public class VirtualPetApplication {

    public static void main(String[] args) {
        //Interact with a VirtualPet object in this method
        Scanner input = new Scanner(System.in);
        VirtualPet virtualPet = new VirtualPet();
        boolean gameRun = true;
        while (gameRun) {

            System.out.println("What would you like your Alicorn to do?");
            System.out.println("1. Play:" + " Desire Level: " + virtualPet.getDesireToPlay());
            System.out.println("2. Eat:" + " Hunger Level: " + virtualPet.getHunger());
            System.out.println("3. Drink:" + " Thirst Level: " + virtualPet.getThirst());
            System.out.println("4. Rest: " + " Tiredness Level: " + virtualPet.getTiredness());

            int getAction = input.nextInt();
            if (getAction == 0) {
                gameRun = false;
                break;
            } else if (getAction == 1) {
                virtualPet.play();
                System.out.println("You played with Alicorn!" + " Her desire to play is lowered.");

            } else if (getAction == 2) {
                System.out.println("Your Alicorn ate her favorite carrots. She is less hungry.");
            }
            virtualPet.tick();
        }
    }
}
