public class Tiger extends Animal {
    public void voice() {
        System.out.println("Tiger is roaring");
    }

    public void eat(FoodType food) {
        super.setFood(food);
        if (food == FoodType.GRASS) {
            System.out.println("Tiger isn't satisfied!");
        } else if (food == FoodType.MEAT || food == FoodType.BONE) {
            System.out.println("Tiger is happy");
        } else {
            System.out.println("Tiger does not know what it is");
        }
    }
}
