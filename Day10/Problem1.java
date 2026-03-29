package Day10;

class StaticAndInstanceMethods{
    // Static method: belongs to the class
    public static int Square(int x){
        return x * x;
    }

    // Instance method: belongs to an object
    public int Cube(int x){
    return x * x * x;
    }
}
public class Problem1{
    public static void main(String[] args){

          // Call static method directly using class name
        int sq = StaticAndInstanceMethods.Square(10);
        System.out.println("Static method : "+sq);

        // Call instance method using an object
        StaticAndInstanceMethods sim =  new StaticAndInstanceMethods();
        int cube = sim.Cube(20);
        System.out.println("Instance Method :" + cube);

    }
}