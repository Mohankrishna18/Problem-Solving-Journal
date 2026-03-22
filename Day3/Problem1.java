class Rectangle{
int length;
int breadth;

Rectangle(){
    length = 1;
    breadth = 1;
}
Rectangle(int l, int b){
length = l;
breadth = b;
}
int area(){
    return length*breadth;
}
}
public class Problem1{
    public static void main(String[] args){
        Rectangle rt1 = new Rectangle();
        Rectangle rt2 = new Rectangle(10,20);
        System.out.println(rt1.area());
        System.out.println(rt2.area());
    }
}