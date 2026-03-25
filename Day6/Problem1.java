package Day6;
import java.util.Scanner;

class Problem1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second numbers : ");
        int num2 = sc.nextInt();

        try{
            int result = num1/num2;
            System.out.println("Result : "+result);
        }catch(ArithmeticException  e){
            System.out.println("Division by zero is not allowed.");
        }


    }

}