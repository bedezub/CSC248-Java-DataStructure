import java.util.*;

public class LinkApp {
    
    public static void main() {
        
        ArrayList sList = new ArrayList();
        ArrayList wordList = new ArrayList();
        
        sList.add("the cat and dog and mouse ate cheese");
        sList.add("the mouse on the house was lovely");        
        sList.add("the mouse on the jungle was dead");
        
        Object E = null;
        for(int x=0; x<sList.size(); x++) {
            
            E = (Object)sList.get(x);
            
            String strOrig = E.toString();
        	int intIndex = strOrig.indexOf("mouse");
        	if(intIndex == - 1) {
        	    
        	} else {
                    System.out.println(E.toString());
                }
        }
    }   
}