public class QueueApp {
    
    public static void main(String args[]) {
        
        Queue Q1 = new Queue();
        
        Q1.enqueue("Kangar");
        Q1.enqueue("Ipoh");
        Q1.enqueue("Johor Bharu");
        Q1.enqueue("Kota Bharu");
        Q1.enqueue("Melaka");
        Q1.enqueue("Kuantan");
        Q1.enqueue("Alor Setar");
        
        Object capital = Q1.dequeue();
        while(!Q1.isEmpty()) {
            capital = Q1.dequeue();
            
            System.out.println(capital.toString());
        }
    }
}