import java.util.*;

// prescribed by zubquzaini
public class LinkListApp {

    public static void main(String args[]) {
        
        ArrayList<Integer> nList = new ArrayList<Integer>(10);

        nList.add(0, 26);
        nList.add(1, 18);
        nList.add(2, 54);
        nList.add(3, 40);
        nList.add(4, 15);

        System.out.println(nList);
        for(int j=0; j<nList.size(); j++) {

            int data = nList.get(j);

            if((data%6) == 0) {

                nList.set(j,j*3);
            } else {

                nList.remove(j);
            }
        }
        System.out.println(nList);
    }
}

// Linked List Part II
// public static void main(String [] args) {

//     LinkList thelist = new LinkList();

//     thelist.insertAtBack("1");
//     thelist.insertAtBack("2");
//     thelist.insertAtBack("3");
//     thelist.insertAtBack("4");
//     thelist.insertAtBack("5");

//     int sum=0, count=0;

//     Object data = thelist.getFirst();
//     while(data != null) {

//         int no=Integer.parseInt(data.toString());
//         sum=sum+no;
//         count++;
//         data=thelist.getNext();
//     }

//     System.out.println("\nThe sum is: " + sum);
//     System.out.println("The average is: " + sum/count);

//     data = thelist.removeFromFront();
//     if(data != null) {
//         System.out.println("DATA DELETED: " + data.toString());
//     } else {
//         System.out.println("CANNOT DELETE - LIST EMPTY");
//     }

//     data = thelist.removeFromBack();
//     if(data != null) {
//         System.out.println("DATA DELETED : " + data.toString());
//     } else {
//         System.out.println("CANNOT DELETe - LIST EMPTY");
//     }

//     data = thelist.getFirst();
//     while(data != null) {
//         System.out.print(data.toString() + " ");
//         data = thelist.getNext();
//     }
// }

//     Lindked List Part I
//     public static void main(String[] args) {

//         // LinkedList is a predefined function in Java
//         // We can call the library from java.util in order to use the method

//         // Creating an empty Linked List, the list is an object. 
//         LinkList thelist = new LinkList();

//         // add some data into the linked list
//         thelist.insertAtBack("Mazlan");
//         thelist.insertAtBack("Anisah");
//         thelist.insertAtBack("Umar");
//         thelist.insertAtFront("Maryam");
//         thelist.insertAtFront("Ilman");

//         Object data = thelist.getFirst();
//         System.out.println();
//         while(data != null) {

//             System.out.print(data.toString() + " ");
//             data = thelist.getNext();
//         }
//         System.out.println();
//     }
// }
