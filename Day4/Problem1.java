package Day4;

abstract class Shape{
    abstract double area();
}
class Circle extends Shape{
    double radius;
    Circle (double radius){
        this.radius = radius;
    }
    @Override
    double area(){
        return Math.PI * radius * radius;
    }
}
class Rectangle extends Shape{
    double length;
    double breadth;
    Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }
   @Override
   double area(){
    return length * breadth;
}
}
public class Problem1 {

    public static void main(String[] args){
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(10,20);

        System.out.println("Area of circle :"+circle.area());
        System.out.println("Area of Rectangle :"+ rectangle.area());

    }
    
}
