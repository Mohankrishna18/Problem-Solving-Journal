package Day1;
class Problem1{
    static{
        System.out.println("Static block executed.");
    }
    Problem1(){
        System.out.println("Constructor executed.");
    }
    public static void main(String[] args) {
        
        Problem1 d1 = new Problem1();
         Problem1 d2 = new Problem1();
    }
}
