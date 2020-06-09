public class Employee {

    
    private String employID;
    private String empName;
    private int eAge;
    private double salary;

    public Employee(String employID, String empName, int eAge, double salary) {
        
        this.employID=employID;
        this.empName=empName;
        this.eAge = eAge;
        this.salary = salary;
    }
   
    public String getID() {
        
        return employID;
    }
    
    public String getName() {
        
        return empName;
    }
    
    public int getAge() {
        
        return eAge;
    }
    
    public double getSalary() {
        
        return salary;
    }

    
    public String toString() {
        
        return ("\nID: " + employID + "\nName: " + empName + "\nAge: " + eAge + "\nSalary: " + salary);
    }
}