package Day22;

interface Vehical{
  void start();
  void stop();
}

class Car implements Vehical{
    @Override
    public void start(){
        System.out.println("Car started...");
    }
    @Override
    public void stop(){
        System.out.println("Car stopped...");

    }
}
class Bike implements Vehical{
    @Override
    public void start(){
        System.out.println("Bike started...");
    }
    @Override
    public void stop(){
        System.out.println("Bike stopped");
    }
}
public class InterfacePolymorphismExample {
    public static void main(String[] args){
    Vehical car = new Car();
    car.start();
    car.stop();
    Vehical bike = new Bike();
    bike.start();
    bike.stop();
    }
}
