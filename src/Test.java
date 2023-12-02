public class Test {
    public static void main(String[] args) {
    Rabbit rabbit = new Rabbit();
    Tiger tiger = new Tiger();
    Dog dog = Dog.dogBorn();
        dog.eat(FoodType.BONE);
        dog.voice();

        tiger.eat(FoodType.MEAT);
        tiger.voice();

        rabbit.eat(FoodType.CARROT);
    }

}
