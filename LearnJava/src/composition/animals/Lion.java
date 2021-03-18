package composition.animals;

public class Lion {
    Double weight;
    int age;
    int hoursOfsleep;

    public Lion(Double weight, int age, int hoursOfsleep) {
        this.weight = weight;
        this.age = age;
        this.hoursOfsleep = hoursOfsleep;
    }

    public void HoursSleep(){
        System.out.println("the lion sleeps "+hoursOfsleep+" a day");
    }

    public void eat(){
        System.out.println("lions eat a lot of meat");
    }
}

