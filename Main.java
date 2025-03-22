public class Main {

    public static void main(String[] args){

        SmartKitchen kitchen = new SmartKitchen();

        // Method 1: Using getter methods to execute the work needed to be done

//        kitchen.getBrewMaster().setHasWorkToDo(true);
//        kitchen.getIceBox().setHasWorkToDo(true);
//        kitchen.getDishWasher().setHasWorkToDo(true);
//
//        kitchen.getDishWasher().doDishes();
//        kitchen.getIceBox().orderFood();
//        kitchen.getBrewMaster().brewCoffe();

        /* Method 2: Here we won't access the appliance directly
         We use doKitchenWork() which takes the responsibility to pass work to the appliances */

        kitchen.setKitchenState(true,false,true);
        kitchen.doKitchenWork();
    }
}
