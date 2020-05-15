package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        //Interact with a VirtualPet object in this method
        Scanner input = new Scanner(System.in);
        boolean gameRun = true;
        while (gameRun = true){
            System.out.println("What would you like to do with your pet?");
            int getAction=input.nextInt();
            if (getAction == 1){
                gameRun = false;
                break;
            }
        }
    }

}
