public class App {
    public static void main(String[] args) throws Exception {
        
        
       MyIntegerClass myInt = new MyIntegerClass(1);
       MyDoubleClass myDouble = new MyDoubleClass(3.14);
       MyCharacterClass myCharacter = new MyCharacterClass('@');
       MyStringClass myString = new MyStringClass("Hello!");

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
