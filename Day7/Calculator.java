package Day7;

 class Cal {

    //overloaded method: sum of two integer
    int add(int a, int b){
        return a+b;
    }
    //Overloaded method : sum of two double
    double add(double a,double b){
        return a + b;
    }
    
    //Overloaded method : sum of three integer
    int add(int a, int b, int c){
        return a + b + c;
    }
}

public class Calculator{
    public static void main(String[] args){
        Cal cc = new Cal();

        int sumtwo = cc.add(1,2);
        double sumtwodouble = cc.add(1.0,2.2);
        int sumthree = cc.add(2,3,5);

        System.out.println("Sum of two integers: " +sumtwo);
        System.out.println("Sum of two double: " +sumtwodouble);
        System.out.println("Sum of three integers: " +sumthree);
    }

}