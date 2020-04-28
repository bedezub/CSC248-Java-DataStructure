import javax.swing.*;

public class QueueApp {
    
    public static void main() {
        
        Number n = new Number(10);
        Number n1 = new Number(20);
        Number n2 = new Number(30);
        Number n3 = new Number(40);
        Number n4 = new Number(50);
        
        Queue theQueue = new Queue();
        Queue tempQueue = new Queue();
        
        theQueue.enqueue(n);
        theQueue.enqueue(n1);
        theQueue.enqueue(n2);
        theQueue.enqueue(n3);
        theQueue.enqueue(n4);
        
        System.out.println("Data in the queue: ");
        while(!theQueue.isEmpty()) {
            
            Number data = (Number) theQueue.dequeue();
            System.out.println(data);
            tempQueue.enqueue(data);
        }
        
        int avg, count=0, sum=0, min=999999, max=-99999;
        while(!tempQueue.isEmpty()) {
            
            Number data = (Number) tempQueue.dequeue();
            theQueue.enqueue(data);
            count++;
            
            int no = data.getNum();
            
            sum = sum + no;
            
            if(no > max) {
                
                max = no;
            } 
            
            if (no < min){
                
                min = no;
            }
        }      
        
        avg = sum/count;
        
        System.out.println("\nThere are " + count + "items in theQueue");
        System.out.println("\nThe sum  is " + sum);
        System.out.println("\nThe average is " + avg);
        System.out.println("\nThe maximum number is " + max);
        System.out.println("\nThe minimum number is " + min);
    }
}