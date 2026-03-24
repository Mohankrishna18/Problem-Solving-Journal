package Day5;

interface Vehicle{
    void start();
}
class Car implements Vehicle{
    @Override
    public void start(){
        System.out.println("Car started ...");

}}

class Bike implements Vehicle{
    @Override
    public void start(){
        System.out.println("Bike Started....");
    }
}
public class Problem1 {
 
    public static void main(String[] args){
        Vehicle car = new Car();
        Vehicle bike = new Bike();

        car.start();
        bike.start();
    }
}
