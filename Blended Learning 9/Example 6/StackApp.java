import javax.swing.*;

public class StackApp {
    
    public static void main(String args[]) {
        System.out.println();
        Stack theStack = new Stack();
        Stack tempStack = new Stack();
        
        String num;
        for(int i=0; i<3; i++) {
            
            num = JOptionPane.showInputDialog("Enter a number");
            theStack.push(num);
        }
        
        Object data = null;
        System.out.println("DATA IN THE STACK : ");
        while(!theStack.isEmpty()) {
            
            data = theStack.pop();
            System.out.println(data);
            tempStack.push(data);
        }
    }
}