package CoffeeMachine;

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
        public Cup serve(String name, String size){
            Cup cup = new Cup(this.name= name, this.size = size);
            System.out.println(cup.getName() + cup.getSize());
            return cup;
        }
    }


