package Day11;

// Final variable example
class Constant{
    public final double PI =3.2122;
    public final void showMessage(){
        System.out.println("This is the final method in Constants.");
    }
}
class ExtendedConstanct extends Constant{

    //This will cause a compile-time error
   // @Override
   // public void showMessage(){
    // System.out.println("Trying to override...");
    //}
}
public class Problem1 {
    public static void main(String[] args){
        Constant cs = new Constant();

           // Access final variable
        System.out.println("Value of PI: " + cs.PI);

        //  Uncommenting this line will cause error: cannot assign a value to final variable PI
        // cs.PI = 3.14;

        // Call final method
        cs.showMessage();

    }
    
}
