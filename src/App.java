public class App {
    public static void main(String[] args) throws Exception {
        
        
       MyGenericClass <Integer> myInt = new MyGenericClass<>(1);
       MyGenericClass <Double> myDouble = new MyGenericClass<>(3.14);
       MyGenericClass <Character> myCharacter = new MyGenericClass<>('@');
       MyGenericClass <String> myString = new MyGenericClass<>("Hello!");

       System.out.println(myInt.getValue());
       System.out.println(myDouble.getValue());
       System.out.println(myCharacter.getValue());
      System.out.println( myString.getValue());
       
    }

}





    //  Player player = new Player();
    //     Enemy enemy = new Enemy();
    //     Item item = new Item();
    //     Tree tree = new Tree();

    //     draw(player);
    //     draw(enemy);
    //     draw(item);
    //     draw(tree);
    // }

    // public static <T> void draw(T x) {
    //     x.draw();
    // }
