// Prescribed by zubquzaini
public class sorting {

    public static void main(String[] args) {

        // Assume we have an array with list of unordered numbers
        int numberOfLife[] = {4,2,1,5,3};

        // Calling bubble sort Method
        bubbleSort(numberOfLife);

        // Assume we have an array with list of unordered numbers
        int ageIsJustANumber[] = {4,2,1,5,3};
        
        // Calling insertion sort Method
        insertionSort(ageIsJustANumber);        
    }

    // Bubble Sort Method. Ascending Order. 
    public static void bubbleSort(int[] a) {
        
        System.out.println("Bubble Sort: Ascending Order");

        int temp; // Store temporary value during sorting

        // Outer loop: Iterate based on size of array. 
        for(int j=0; j < a.length; j++) {

            // Inner loop: Iterate through all the index of the array. 
            // Sorting will be done if the value of index meets the condition.
            for (int i = 0; i < a.length - 1; i++) {

                // Ascending Sort will happen when value in a[i] is greater then a[i+1] 
                if (a[i] > a[i+1]) {
                    
                    // Sorting Process occurs here. Let the magic happens.
                    // Value in a[i] will be stored in temp
                    // as value in a[i+1] will replace value in a[i]
                    temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                }
            }

            // Ignore this part. I just want to see the output during sorting
            System.out.print("Sorting phase " + (j+1) + ": ");
            for(int x=0; x< a.length; x++) {

                System.out.print(a[x] + " ");
            }
            System.out.println();
        }
        System.out.println();
    } // end of bubble sort

    // Insertion Sort. Ascending Order because why not. 
    public static void insertionSort(int[] a) {
        
        System.out.println("Insertion Sort: Ascending Order");

        // Outer loop: Iterate based on size of array. 
        for (int i = 1; i < a.length; i++) {


            int current = a[i];
            int j = i - 1;

            // Inner loop: Iterate through all the index of the array.
            while(j >= 0 && current < a[j]) {
                a[j+1] = a[j];
                j--;
            }
            // at this point we've exited, so j is either -1
            // or it's at the first element where current >= a[j]
            a[j+1] = current;

            // Ignore this part. I just want to see the output during sorting
            System.out.print("Sorting phase " + (j+1) + ": ");
            for(int x=0; x< a.length; x++) {

                System.out.print(a[x] + " ");
            }
            System.out.println();
        }
    }

}