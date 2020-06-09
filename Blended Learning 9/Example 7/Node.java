import javax.swing.*;

    public class Node {
   
    public Object data;
    public Node next;
    
    public Node(Object obj) {
        data = obj;
    }    
    
    public Object getData()
    {
        return data;
    }

    public void setData(int d)
    {
        data = d;
    }

    public Node getNext()
    {
        return next;
    }
}
    
