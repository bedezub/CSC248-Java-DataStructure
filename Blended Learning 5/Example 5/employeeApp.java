import java.util.*;
import javax.swing.JOptionPane;

public class employeeApp {

    public static void main() {

        Employee E = new Employee();
        LinkList list = new LinkList();

        for(int i=0; i<5; i++) {

            String eID= JOptionPane.showInputDialog("Enter employee id");
            int epmID = Integer.parseInt(eID);
            String eName = JOptionPane.showInputDialog("Enter name");
            String eDepart = JOptionPane.showInputDialog("Enter department");
            String ePos = JOptionPane.showInputDialog("Enter position");
            String ePerformance = JOptionPane.showInputDialog("Enter performance");
            double ePerform = Double.parseDouble(ePerformance);

            E = new Employee(epmID, eName, ePos, eDepart, ePerform);
            list.insertAtFront(E);
        }

        Object data = list.getFirst();
        while(data != null) {

            E = (Employee) data;
            System.out.println(E.toString());
            data = list.getNext();
        }

        int counterIT = 0, counter80 = 0, indMax = 0;
        double maxPerform = 0.0;
        Object ObjectMax = null;
        data = list.getFirst();
        while(data != null) {

            E = (Employee) data;
            if(E.getPerformance() > maxPerform) {
                maxPerform = E.getPerformance();
                ObjectMax = E;
            }

            if(E.getDepart().equals("IT")) {

                counterIT++;
            }

            if(E.getPerformance() >= 80) {

                counter80++;
            }
            
            data = list.getNext();
        }

        System.out.println("The best employee is:");
        System.out.println(ObjectMax.toString());
        System.out.println("There are " + counterIT + " employee (s) of IT Department");
        System.out.println("There are " + counter80 + " employee (s) whose get the 80 and above of the performance");
    }
}