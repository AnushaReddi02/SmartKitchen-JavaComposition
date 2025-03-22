public class SmartKitchen {

    private CoffeeMaker brewMaster;
    private Refrigirator iceBox;
    private DishWasher dishWasher;

   public SmartKitchen(){
        brewMaster = new CoffeeMaker();
        iceBox = new Refrigirator();
        dishWasher = new DishWasher();
   }

   // Method1

//    public CoffeMaker getBrewMaster() {
//        return brewMaster;   //returns a CoffeMaker object.
//    }
//
//    public Refrigirator getIceBox() {
//        return iceBox;  //returns a Refrigirator object.
//
//
//    }
//
//    public DishWasher getDishWasher() {
//        return dishWasher;  //returns a Refrigirator object.

    //Method2

    public void setKitchenState(boolean startCoffeMaker,boolean activateRef,boolean startDishWasher){
        brewMaster.setHasWorkToDo(startCoffeMaker);
        iceBox.setHasWorkToDo(activateRef);
        dishWasher.setHasWorkToDo(startDishWasher);
    }

    public void doKitchenWork(){
       brewMaster.brewCoffee();
       iceBox.orderFood();
       dishWasher.doDishes();

    }
}

class CoffeeMaker{

    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee(){
        if(hasWorkToDo){
           System.out.println("Brewing the coffee!");
           hasWorkToDo = false;
        }
    }
}

class Refrigirator{

    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood(){
        if(hasWorkToDo){
            System.out.println("Ordering Food!");
            hasWorkToDo = false;
        }
    }
}

class DishWasher{

    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes(){
        if(hasWorkToDo){
            System.out.println("Washing the dishes!");
            hasWorkToDo = false;
        }
    }
}
