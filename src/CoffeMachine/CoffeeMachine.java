package CoffeMachine;

public class CoffeeMachine {
    private String name;
    private  String size;

    public CoffeeMachine (String name, String size){
        this.name = name;
        this.size = size;

    }
    public String getSize() {
        return size;
    }
    public String getName()  {
        return name;
    }
    public Cup serve(CoffeeMachine coffeeMachine){
        Cup cup = new Cup(name, size);
        System.out.println(cup.getName() + cup.getSize());
        return cup;
    }
}
