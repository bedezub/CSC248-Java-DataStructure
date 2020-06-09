import java.util.ArrayList;

public class KuihList {
    
    public static void main(String args[]) {
        
        ArrayList list = new ArrayList();
        list.add(new Perfume(276, 350.80, "EDP", "CK"));
        list.add(new Perfume(167, 208.00, "EDC", "CD"));
        list.add(0, new Perfume(186, 400.70, "EDT", "CD"));
        list.add(new Perfume(222, 530.60, "P", "D&G"));
        
        for(int i=0; i<list.size(); i++) {
            
            Perfume pf = (Perfume)list.get(i);
            System.out.println(pf.toString());
        }
        
        list.set(3, new Perfume(276, 389.70, "EDP", "V"));
        list.add(2, new Perfume(331, 238.50, "EDC", "CK"));
        list.remove(1);
        
        System.out.println("Size is " + list.size());
        
        for(int i=0; i<list.size(); i++) {
            
            Perfume pf = (Perfume)list.get(i);
            System.out.println(pf.toString());
        }
        
        // Calculate total price
        double average = 0.00, sum = 0.00;
        for(int x=0; x<perfumeList.size(); x++) {
            
            Perfume pf = (Perfume)perfumeList.get(x);
            sum = sum + pf.getPrice();
        }
        
        average = sum/list.size();
        
        System.out.println("Average price of all perfumes is RM" + average);
        
        
        // Display details of perfume price more than average
        System.out.println("Price of perfume more than average");
        for(int i=0; i<perfumeList.size(); i++) {
            
            Perfume pf = (Perfume)perfumeList.get(i);
            if(pf.getPrice() > average) {
                
                System.out.println(pf.toString());
            }
        }
    }
}