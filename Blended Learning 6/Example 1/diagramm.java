public class diagramm {
    
    public static void main() {
        
        Node tail = null;
        Node head = null;
        
        // Insert at front isEmpty()
        Node node = new Node("[C]");
        head = node;
        //System.out.println("Head: " + head + " Tail: " + tail);
        if (tail == null) {
            tail = head; 
        }
        System.out.println(head);
        //System.out.println("Head: " + head + " Tail: " + tail);
        
        // Insert At back 
        tail.next = new Node("[O]"); 
        tail = tail.next;
        System.out.println(head + " " + head.next);
        //System.out.println("Head: " + head + " Tail: " + tail);
        
        // Insert At back 
        tail.next = new Node("[V]"); 
        tail = tail.next;
                //System.out.println("Head: " + head + " Head Next: " + head.next + " Tail: " + tail);
        System.out.println(head + " " + head.next + " " + head.next.next);
        // Insert at front
        node = new Node("[I]"); 
        node.next = head.next; 
        head.next = node;
        System.out.println(head + " " + head.next + " " + head.next.next + " " + head.next.next.next);
        //System.out.println("Head: " + head + " Head Next: " + head.next + " Tail: " + tail);
        // insert at front
        node = new Node("[D]"); 
        node.next = head.next; 
        head.next = node;
        System.out.println(head + " " + head.next + " " + head.next.next + " " + head.next.next.next + " " + head.next.next.next.next);
        //System.out.println("Head: " + head + " Head Next: " + head.next + " Head Next Next " +head.next.next + " Tail: " + tail);
        
        node = new Node("[19]"); 
        node.next = head;
        head = node;
        System.out.println(head + " " + head.next + " " + head.next.next + " " + head.next.next.next + " " + head.next.next.next.next + " " +head.next.next.next.next.next);
        //System.out.println("Head: " + head + " Head Next: " + head.next + " Head Next Next " +head.next.next + " Head Next Next " +head.next.next.next +  " Head Next Next " +head.next.next.next.next + " Tail: " + tail);
    }
}