public class Tiger extends Animal {
    private final String tiger = "Tiger";

    public void voice() {
        System.out.println(tiger + " is roaring");
    }

    public void eat(String food) {
        this.setFood(food);
        if (food.equals("Grass")) {
            System.out.println(tiger + " isn`t satisfied!");
        } else if (food.equals("Meat") || food.equals("Bone")) {
            System.out.println(tiger + " is happy");
        } else System.out.println(tiger + " does not know what it is");
    }
}
