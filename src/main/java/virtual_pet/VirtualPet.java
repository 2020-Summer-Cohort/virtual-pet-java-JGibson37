package virtual_pet;

public class VirtualPet {
    private int desireToPlay = 40;
    private int desireToEat = 20;
    private int desireToDrink = 30;
    private int desireToSleep = 5;

    public void tick() {
        desireToPlay = desireToPlay + 6;
        desireToEat = desireToEat + 6;
        desireToDrink = desireToDrink + 6;
        desireToSleep = desireToSleep + 6;

    }

    public int play() {
        desireToPlay = desireToPlay - 25;
        desireToSleep = desireToSleep + 4;
        return desireToPlay;
    }

    public int getHunger() {
        return desireToEat;
    }

    public int eat() {
        desireToEat = desireToEat - 30;
        desireToDrink = desireToDrink + 3;
        return desireToEat;
    }

    public int getThirst() {
        return desireToDrink;

    }

    public int drink() {
        desireToDrink = desireToDrink - 22;
        desireToEat = desireToEat + 2;
        return desireToDrink;
    }

    public int getDesireToPlay() {
        return desireToPlay;
    }

    public int getTiredness() {
        return desireToSleep;
    }

    public int rest() {
        desireToSleep = desireToSleep - 30;
        desireToPlay = desireToPlay + 10;
        return desireToSleep;
    }
}

