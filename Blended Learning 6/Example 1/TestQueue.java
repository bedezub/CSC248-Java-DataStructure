public class TestQueue {
    
    public static void main(String args[]) {
        
        Number n = new Number(10);
        Number n1 = new Number(20);
        Number n2 = new Number(30);
        
        Queue Q = new Queue();
        
        Q.enqueue(n);
        Q.enqueue(n1);
        System.out.print(Q.dequeue() + "");
        Q.enqueue(n2);
        System.out.print(Q.dequeue() + "");
        System.out.print(Q.dequeue());
    }
}