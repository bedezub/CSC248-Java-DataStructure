import javax.swing.*;

public class StackApp {
    
    public static void main(String args[]) {
        System.out.println();
        Stack theStack = new Stack();
        Stack tempStack = new Stack();
        
        for(int i=0; i<5; i++) {
            
            String eId = JOptionPane.showInputDialog("Enter employee id");
            String eName = JOptionPane.showInputDialog("Enter employee name");
            String eAge = JOptionPane.showInputDialog("Enter age");
            String eSalary = JOptionPane.showInputDialog("Enter salary");
            int age = Integer.parseInt(eAge);
            double salary = Double.parseDouble(eSalary);
            Employee emp = new Employee(eId, eName, age, salary);
            theStack.push(emp);
        }
        
        // to display all the employees in the stack
        Object data;
        Employee E;
        
        while(!theStack.isEmpty()) {
            
            data = theStack.pop();
            E = (Employee) data;
            System.out.println(E.toString());
            tempStack.push(E);
        }
        
        // to display all the data from temporary stack into original stack
        while(!tempStack.isEmpty()) {
            
            data = tempStack.pop();
            E = (Employee) data;
            theStack.push(E);
        }
        
        int numAge=0, num2000=0;
        while(!theStack.isEmpty()) {
            
            data = theStack.pop();
            
            E = (Employee) data;
            if(E.getAge() > 40) {
                
                numAge++;
            }
            
            if(E.getSalary() > 2000) {
                
                num2000++;
            }
        }
        
        System.out.println("The number of employee that their age is above 40 = " + numAge);
        System.out.println("The number of employee that salary > 2000 = " + num2000);
        
        double maxSalary = -9999.99, minSalary = 9999.99;
        while(!tempStack.isEmpty()) {
            
            data = tempStack.pop();
            E = (Employee) data;
            
            if(E.getSalary() > maxSalary) {
                maxSalary = E.getSalary();
            } else {
                minSalary = E.getSalary();
            }
            
            theStack.push(E);
            System.out.println("The maximum salary =" + maxSalary);
            System.out.println("The minimum salary = " + minSalary);
        }
    }
}