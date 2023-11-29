public class Dog extends Animal{
    public void voice(){
        System.out.println("Dog is barking");
    }
    public void eat(FoodType food) {
        this.setFood(food);
        if (food == FoodType.GRASS) {
            System.out.println("Dog isn't satisfied!");
        } else if (food == FoodType.MEAT || food == FoodType.BONE) {
            System.out.println("Dog is happy");
        } else {
            System.out.println("Dog does not know what it is");
        }
    }
}
