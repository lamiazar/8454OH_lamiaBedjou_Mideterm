package composition.animals;

public class AnimalAction {


    public static void main(String[] args) {


        Horse horse = new Horse("BLACK", "arabic", 300, 2);
        Lion lion = new Lion(300.4, 2, 8);
        Domestic domestic = new Domestic(8);
       Cat cat = new Cat(2, 233, "string", domestic);
       Animals animal=new Animals(lion,horse,cat);

       animal.lion.eat();
       animal.cat.getDomestic().makeSound();
       animal.horse.RunFast();


    }}
