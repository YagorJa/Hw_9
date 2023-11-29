public abstract class Animal {
 private String food;

 public String getFood() {
  return food;
 }

 public void setFood(String food) {
  this.food = food;
 }

 public void voice(){}
 public void eat(String food){
  this.food = food;
 }
}