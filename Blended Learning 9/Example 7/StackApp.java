import javax.swing.*;

public class StackApp {
    
    public static void main(String args[]) {
        System.out.println();
        Stack myStack = new Stack();
        Stack tempStack = new Stack();
        String num;
        
        // push data into stack
        for(int i=0; i<3; i++) {
            
            num = JOptionPane.showInputDialog("Enter a number");
            myStack.push(num);
        }
        
        int count=0, sum=0, min=9999, max=-9999;
        
        while(!myStack.isEmpty()) {
            
            Object data = myStack.pop();
            count++;
            int no = Integer.parseInt(data.toString());
            sum = sum + no;
            if(no > max) {
                max = no;
            }
            
            if(no < min) {
                min = no;
            }
            tempStack.push(data);
        }
        double average = sum/count;
        
        JOptionPane.showMessageDialog(null, "There are " + count + " items in the stack");
        JOptionPane.showMessageDialog(null, "The sum of all items in the stack is " + sum);
        JOptionPane.showMessageDialog(null, "The minimum is " + min);
        JOptionPane.showMessageDialog(null, "The maximum is " + max);
    }
}