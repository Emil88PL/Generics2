public class App {
    public static void main(String[] args) throws Exception {
        
        
       MyGenericClass <Integer, Integer> myInt = new MyGenericClass<>(1, 2);
       MyGenericClass <Double, Double> myDouble = new MyGenericClass<>(3.14, 4.20);
       MyGenericClass <Character, Character> myCharacter = new MyGenericClass<>('@', 'A');
       MyGenericClass <String, Integer> myString = new MyGenericClass<>("Hello!", 99);

       System.out.println(myInt.getX());
       System.out.println(myInt.getY());

       System.out.println(myDouble.getX());
       System.out.println(myDouble.getY());

       System.out.println(myCharacter.getX());
       System.out.println(myCharacter.getY());

      System.out.println( myString.getX());
      System.out.println( myString.getY());


    }
}
