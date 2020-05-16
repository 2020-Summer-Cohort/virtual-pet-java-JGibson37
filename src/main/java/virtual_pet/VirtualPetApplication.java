package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        VirtualPet virtualPet = new VirtualPet();
        boolean gameRun = true;
        while (gameRun) {

            System.out.println("What would you like Nightmare to do?");
            System.out.println("1. Play:" + " Desire Level: " + virtualPet.getDesireToPlay());
            System.out.println("2. Eat:" + " Hunger Level: " + virtualPet.getHunger());
            System.out.println("3. Drink:" + " Thirst Level: " + virtualPet.getThirst());
            System.out.println("4. Rest: " + " Tiredness Level: " + virtualPet.getTiredness());
            System.out.println("5. Look at Nightmare.");
            System.out.println("0. Quit interacting with Nightmare.");

            int getAction = input.nextInt();
            if (getAction == 0) {
                gameRun = false;
                break;
            } else if (getAction == 1) {
                virtualPet.play();
                System.out.println("You played with Nightmare. Her desire to play is lowered.");
            } else if (getAction == 2) {
                virtualPet.eat();
                System.out.println("Nightmare ate her favorite carrots. She is less hungry.");
            } else if (getAction == 3) {
                virtualPet.drink();
                System.out.println("Nightmare drank some water. She is less thirsty.");
            } else if (getAction == 4) {
                virtualPet.rest();
                System.out.println("Nightmare got some rest. She feels refreshed.");
            } else if (getAction == 5) {
                System.out.println("Nightmare's skin is white, while her mane and tail are purple. /n" +
                        "she has a picture of a cup of Java on her flank.");
            }
            virtualPet.tick();
        }
    }
}
