import javax.swing.*;
public class employeeApp {
    
    public static void main() {
        
        Employee E = new Employee();
        Queue theQueue = new Queue();
        Queue tempQueue = new Queue();
        
        for(int i=0; i<5; i++) {
            
            int eID = Integer.parseInt(JOptionPane.showInputDialog("Enter ID: "));
            String eName = JOptionPane.showInputDialog("Enter name: ");
            String eDepart = JOptionPane.showInputDialog("Enter department: ");
            String ePos = JOptionPane.showInputDialog("Enter position: ");
            Double ePerform = Double.parseDouble(JOptionPane.showInputDialog("Enter performance: "));
            
            E = new Employee(eID, eName, eDepart, ePos, ePerform);
            
            theQueue.enqueue(E);
        }
        
        while(!theQueue.isEmpty()) {
            
            E = (Employee)theQueue.dequeue();
            
            System.out.println(E.toString());
            tempQueue.enqueue(E);
        }
        
        int counterIT=0, counter80=0;
        double maxPerform=0.0;
        
        Employee bestEmployee=null;
        while(!tempQueue.isEmpty()) {
            
            E = (Employee)tempQueue.dequeue();
            
            if(E.getPerformance() > maxPerform) {
                
                maxPerform = E.getPerformance();
                bestEmployee = E;
            }
            
            if(E.getDepart().equalsIgnoreCase("IT")) {
                counterIT++;
            }
            
            if(E.getPerformance() >= 80) {
                counter80++;
            }
            
            theQueue.enqueue(E);
        }
        
        System.out.println("The best employee is: " + bestEmployee.toString());
        System.out.println("There are " + counterIT + " employee(s) of the IT Department");
        System.out.println("There are " + counter80 + " employee(s) whose get the 80 and above of the performance");
    }
}