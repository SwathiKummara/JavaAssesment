package Module8;
public class Lion implements Animal, Hunter, Carnivore {
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.place();
        lion.huntForFood();
        lion.liveInJungle();
        lion.eatMeat();
        System.out.println(lion.possessIntelligence());
    }

    public void place() {
        liveInJungle();
    }
    public void liveInJungle() {
        System.out.println("I am king of the jungle!");

    }

    public void eat() {
        eatMeat();
    }

    @Override
    public void eatMeat() {
        System.out.println("I like deer meat");
    }

    public boolean possessIntelligence() {
        return false;
    }

    @Override
    public void huntForFood() {
        System.out.println("My females hunt often");
    }
}
