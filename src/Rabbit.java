public class Rabbit extends Animal{
    public void voice() {
        System.out.println("Rabbit is whispering");
    }

    public void eat(FoodType food) {
        super.setFood(food);
        if (food == FoodType.MEAT || food == FoodType.BONE) {
            System.out.println("Rabbit isn't satisfied!");
        } else if (food == FoodType.GRASS || food == FoodType.CARROT) {
            System.out.println("Rabbit is happy");
        } else {
            System.out.println("Rabbit does not know what it is");
        }
    }
}
