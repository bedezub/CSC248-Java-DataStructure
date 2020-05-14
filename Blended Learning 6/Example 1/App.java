import java.util.*;

public class App {
    
    public static void main() {
        
        ArrayList<String> strList = new ArrayList<String>();
        
        System.out.println("Message 1: " + strList.size()); strList.add("T");
        strList.add("E");
        strList.add(1,"T");
        strList.add("O");
        strList.add("N");
        strList.add("E");
        strList.add(2, "S");
        System.out.println("Message 2: " + strList.indexOf("O")); System.out.println("Message 3: " + strList.size()); System.out.println("Message 4: ");
        for(int x=0; x<strList.size(); x++) 
            System.out.print(strList.get(x) + " ");
            
        strList.set(3, "G");
        strList.remove("E");
        strList.remove(1);
        System.out.println("\nMessage 5: " + strList.size()); System.out.println("Message 6: ");
        
        for(int i=0; i<strList.size(); i++) 
            System.out.print(strList.get(i) + " ");

    }
}