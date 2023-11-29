public class Dog extends Animal{
    public void voice(){
        System.out.println("Dog is barking");
    }
    public void eat(String food){
        this.setFood(food);
        if (food.equals("Grass")) {
            System.out.println("Dog isn`t satisfied!");
        }else if (food.equals("Meat") || food.equals("Bone")) {
            System.out.println("Dog is happy");
        }else System.out.println("Dog does not know what it is");
    }
}
