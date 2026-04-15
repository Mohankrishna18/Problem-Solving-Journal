package Day21;

//abstract class
abstract class Shape{
    abstract double area();
}

// Circle subclass
class Circle extends Shape{
    double radius;
    Circle(double radius){
        this.radius = radius;
    }
    @Override
    double area(){
        return Math.PI * radius * radius;
    }
}

//Rectangle subclass
class Rectangle extends Shape{
    double length,width;

    Rectangle(double length,double width){
        this.length = length;
        this.width = width;
    }
    double area(){
        return length * width;
    }
}
// Driver class
public class AbstractClass {
    public static void main(String[] args){
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(2,2);

        System.out.println("Circle area : "+circle.area());
        System.out.println("Rectangle area : "+ rectangle.area());
    }
}
    
