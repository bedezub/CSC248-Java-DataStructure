import javax.swing.*;

public class QueueDataApp {
    
    public static void main(String args[]) {
        
        Queue theQueue = new Queue();
        System.out.println();
        
        for(int i=0; i<5; i++) {
            
            String number = JOptionPane.showInputDialog("Enter a number");
            theQueue.enqueue(number);
        }
        
        Object data = theQueue.getFront();
        System.out.println("FIRST DATA : " + data.toString());
        
        data = theQueue.getEnd();
        System.out.println("LAST DATA: " + data.toString());
        
        System.out.println("DATA IN THE QUEUE: ");
        while(!theQueue.isEmpty()) {
            
            System.out.println(theQueue.dequeue());
        }
    }
}