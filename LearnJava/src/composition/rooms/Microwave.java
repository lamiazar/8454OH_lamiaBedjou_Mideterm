package composition.rooms;

public class Microwave
{
    int timer;
    String color;
    String Manufacture;
    Oven oven;

    public Microwave(int timer, String color, String manufacture, Oven oven) {
        this.timer = timer;
        this.color = color;
        Manufacture = manufacture;
        this.oven = oven;
    }
    public Oven getOven(){
        return oven;
    }
    public void cookFood(){
        String[] food={"salmon","scrambledEggs","poachedEggs","macAndcheese"};
        for (String choice:food){
            System.out.println("\t" + choice);
    }}
    public void cook(){
        System.out.println("my microwave can cook  :");
        cookFood();
    }

        public void preHeat(){
            System.out.println("my microwave can preheat food");
        }

}
