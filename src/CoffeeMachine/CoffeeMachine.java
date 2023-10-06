package CoffeeMachine;

public class CoffeeMachine {
        private String name;


        public CoffeeMachine (String name){
            this.name = name;


        }

        public String getName()  {
            return name;
        }
        public Cup serve(String name, String size){
            Cup cup = new Cup(size);
            System.out.println(cup.getSize());
            return cup;
        }
    }


