public class testStack {
    
    public static void main() {
        
        Stack a = new Stack();
        Stack b = new Stack();
        Stack temp = new Stack();
        
        a.push("A216");
        a.push("B216");
        a.push("B216");
        a.push("A216");
        
        /* Method 1
        System.out.println(a.toString());
        while(!a.isEmpty()) {
            
            temp.push(a.pop());
        }
        
        while(!temp.isEmpty()) {
            
            a.insertAtBack(temp.pop());
        }
        System.out.println(a.toString());
        */
       /* Method 2
        System.out.println(a.toString());
        while(!a.isEmpty()) {
            temp.push(a.pop());
        }
        
        while(!temp.isEmpty()) {
            
            b.push(temp.pop());
        }
        
        while(!b.isEmpty()) {
            a.push(b.pop());
        }
        System.out.println(a.toString());
        */
       
       //Soalan 6d
       Stack evenTemp = new Stack();
       Stack oddTemp = new Stack();
       Stack reverse = new Stack();
       while(!a.isEmpty()) {
           
           Object val = a.pop();
           int num = Integer.parseInt(val.toString());
           
           if(num % 2 == 0) {
               evenTemp.push(num);
           } else {
               oddTemp.push(num);
           }
           
           while(!oddTemp.isEmpty()) {
               
               reverse.push(oddTemp.pop());
           }
           
           while(!reverse.isEmpty()) {
               a.push(reverse.pop());
           }
       }
      
      while(!bookStack.isEmpty()) {
          
          Book temp = (Book)bookStack.pop();
          
          if(temp.getSerialNum().charAt(0) == 'A') {
            kidStack.push(temp);
          } else if(temp.getSerialNum().charAt(0) == 'B') {
              adultStack.push(temp);
          } else {
              tempStack.push(temp);
          }
    }
    
    while(!tempStack.isEmpty()) {
        
        bookStack.push(tempStack.pop());
    }
}