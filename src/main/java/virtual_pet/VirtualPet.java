package virtual_pet;

public class VirtualPet {
    private int desireToPlay = 40;
    private int desireToEat = 20;
    private int desireToDrink = 30;
    private int desireToSleep = 5;

    public void tick() {
        desireToPlay = desireToPlay + 7;
        desireToEat = desireToEat + 9;
        desireToDrink = desireToDrink + 3;
        desireToSleep = desireToSleep + 6;

    }

    public int play() {
        desireToPlay = desireToPlay - 15;
        return desireToPlay;
    }

    public int getHunger() {
    return desireToEat;
    }

    public int getThirst() {
        return desireToDrink;

    }

    void getBoredom() {

    }

    void getPlay() {

    }

   public int getDesireToPlay() {
        return desireToPlay;
    }

    public int getTiredness() {
        return desireToSleep;
    }
}

