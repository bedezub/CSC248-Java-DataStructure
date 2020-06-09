public class ListApp {
    
    public static void main(String args[]) {
        
        LinkedList pandemicList = new LinkedList();
        
        pandemicList.addLast(new Pandemic("Malaysia", 1000000, 30000, 21000, 100));
        pandemicList.addLast(new Pandemic("Indonesia", 2200000, 40000, 22000, 100));
        
        Node data = (Node)pandemicList.getFirst();
        Node next = (Node)pandemicList.getFirst();
        pandemicList.test(data, next);
        
        /*
        Pandemic data = (Pandemic)pandemicList.getFirst();
        int totalPopulation=0;
        while(data != null) {
            
            if(data.getCountry().charAt(0) == 'M') {
                if(data.getPopulation() >= 1000000 && data.getPopulation() <= 1500000) {
                    totalPopulation = totalPopulation + data.getPopulation();

                }
            }
            data = (Pandemic)pandemicList.getNext();
        }
        
        System.out.println("Total population of the data found is " + totalPopulation);
        */
        
    }
}