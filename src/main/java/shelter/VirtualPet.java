package shelter;

public class VirtualPet {
    private String petName;
    private String petDescription;
    private int hunger;
    private int thirst;
    private int happiness;

    public VirtualPet(int hunger, int thirst, int happiness, String petName, String petDescription) {
        this.hunger = hunger;
        this.thirst = thirst;
        this.happiness = happiness;
        this.petName = petName;
        this.petDescription = petDescription;
    }

    public String getPetName() {
        return petName;
    }

    public String getPetDescription() {
        return petDescription;
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int getHappiness() {
        return happiness;
    }

    public void feedPet () {
        hunger = hunger - 4;
        thirst++;
    }

    public void waterPet () {
        thirst = thirst - 3;
        hunger++;
    }

    public void playWithPet () {
        happiness = happiness + 5;
        hunger++;
        thirst++;
    }

    public void tick() {
        hunger++;
        thirst++;
        happiness--;
    }


}
