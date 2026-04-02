package Day14;
import java.util.stream.*;
import java.util.*;

class NumberThread extends Thread{
  public void run(){
    for(int i = 0; i<= 5;i++){
      System.out.println("Number : "+i);
      try{
        Thread.sleep(500);  // pause for clarity
      }catch(InterruptedException e){
         e.printStackTrace();
    }
  }
}
}
class LetterThread extends Thread{
  public void run(){
    for(char c = 'A';c<='E';c++){
      System.out.println("Letter :"+c);
       try {
                Thread.sleep(500); // pause for clarity
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
  }
}
}
public class Problem1 {
    public static void main(String[] args){
       NumberThread t1 = new NumberThread();
       LetterThread t2 = new LetterThread();
    t1.start(); // starts Thread 1
        t2.start(); // starts Thread 2

    }
}
