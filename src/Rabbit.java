public class Rabbit extends Animal{
    private final String rabbit = "Rabbit";
    public void voice(){
        System.out.println( rabbit + " is whispering");
    }
    public void eat(String food){
        this.setFood(food);
        if (food.equals("Meat") || food.equals("Bone")) {
            System.out.println(rabbit + " isn`t satisfied!");
        }else if (food.equals("Grass") || food.equals("Carrot")) {
            System.out.println(rabbit + " is happy");
        }else System.out.println(rabbit + " does not know what it is");
    }
}
