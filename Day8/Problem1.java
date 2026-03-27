package Day8;

abstract class Employee{
    String name;
    Employee(String name){
        this.name = name;
    }
   abstract double calculateSalary();
}

class FullTimeEmployee extends Employee{
    double monthlySalary;
    FullTimeEmployee(String name, double monthlySalary){
        super(name);
        this.monthlySalary = monthlySalary;
    }
    @Override
    double calculateSalary(){
        return monthlySalary;
    }

}
class PartTimeEmployee extends Employee{
    double hourlyRate;
    int hoursworked;
    PartTimeEmployee(String name, double hourlyRate, int hoursworked){
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursworked = hoursworked;
    }
        @Override
        double calculateSalary(){
           return hourlyRate * hoursworked;
        }
}
public class Problem1 {

    public static void main(String[] args){
        Employee e1 = new FullTimeEmployee("Mohan",1245);
        Employee e2 = new PartTimeEmployee("Bob",200,3);

        System.out.println("full time employee :" + e1.calculateSalary());
        System.out.println("Part time employee : " + e2.calculateSalary());
    }
    
}
