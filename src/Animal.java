public abstract class Animal {
 private FoodType food;

 public FoodType getFood() {
  return food;
 }

 public void setFood(FoodType food) {
  this.food = food;
 }

 public  void voice(){};

 public void eat(FoodType food) {
  this.setFood(food);
 }
}