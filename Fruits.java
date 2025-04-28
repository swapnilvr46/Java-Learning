public class Fruits {
    String name;
    String type;
    String colour;
    String vitamin;
    String flavour;

    Fruits(String name, String type, String colour, String vitamin, String flavour) {
        this.name = name;
        this.type = type;
        this.colour = colour;
        this.vitamin = vitamin;
        this.flavour = flavour;
    }

    void StartedBuddingStage() {

        System.out.println("Fruits Begins with Budding Process");
    }

    void StartedFloweringStage() {

        System.out.println("Fruits Begins with Flowering Process");
    }

    void StartedDevlopingStage() {
        System.out.println("Fruits Begins with Development Process");
    }

    void ReadyForConsume() {
        System.out.println("Fruit is  ready to eat");
    }

    void fruitDetails() {
        System.out.println("Fruit Name: " + name);
        System.out.println("Fruit Type: " + type);
        System.out.println("Fruit colour: " + colour);
        System.out.println("Fruit vitamin: " + vitamin);
        System.out.println("Fruit flavour: " + flavour);
    }

    public static void main(String[] args) {
        System.out.println(" Which fruits are you looking for ? ");
        Fruits apple = new Fruits("Apple", "all season", "red", "vitamin C", "sweet and mild sour");
        Fruits blackberry = new Fruits("blackberry", "monsoon season", "blackpurple", "vitamin c & a", "sour");
        Fruits watermelon = new Fruits("watermelon", "summer season", "green and red", "vitamin c & a", "Sweet");
        apple.fruitDetails();
        apple.ReadyForConsume();
        watermelon.fruitDetails();
        watermelon.ReadyForConsume();
    }
}
