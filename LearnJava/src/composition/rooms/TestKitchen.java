package composition.rooms;

public class TestKitchen {
    public static void main(String[] args) {

    Fridge fridge=new Fridge("black","LG",2,60,100);
    Oven oven=new Oven(370,"samsung",true,true);
    Microwave microwave=new Microwave(40,"black","lG",oven);
    Swiffer swiffer=new Swiffer(true,"LG",100,true);
    Dishwasher dishwasher=new Dishwasher(60,30,true);

    Kitchen kitchenApp=new Kitchen(fridge,oven,microwave,dishwasher,swiffer,"kitchenAPP");

       System.out.println(kitchenApp.microwave.getOven().heatTime());
        kitchenApp.microwave.cook();
//        kitchenApp.fridge.addItems();
//        kitchenApp.oven.heatTime();
//          kitchenApp.swiffer.mapFloor();
//        kitchenApp.dishwacher.addDish();
//        kitchenApp.swiffer.mapFloor();

}}
