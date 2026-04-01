package Day13;

// Outer class
class Outer{
    String message = "Hello from outer class";

    // Inner class
    class Inner{
        void printMessage(){
            // Inner class can directly access outer class fields
        System.out.println(message);
        }
    }
}
public class Problem1 {
    public static void main(String[] args){
          // Step 1: Create an object of Outer
        Outer outer = new Outer();

        // Step 2: Create an object of Inner using Outer object
        Outer.Inner inner = outer.new Inner();
         // Step 3: Call the method of Inner class
        inner.printMessage();

    }
}
