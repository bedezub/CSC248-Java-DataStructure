public class mainApp {
    
    public static void main(String args[]) {
        
        //multiply(5,4);
        
        // This is one of the thing that is not happening in my carreer
        System.out.println(Number(11));
    }
    
    static int Number(int n) {
        
        if(n<6) {
            System.out.println("n<6 value: " + n);
            return 3 * n - 2;
        } else {
            System.out.println("else value: " + n);
            return 2 * Number(n-7) + 7;
        }
    }
    /*
    static int multiply(int m, int n) {
        if(m==0) {
            System.out.println("m==0 value: m-" + m + " n-" + n);
            return 0;
        } else if(n==0) {
            System.out.println("n==0 value: m-" + m + " n-" + n);
            return 0;
        } else {
            System.out.println("else value: m-" + m + " n-" + n);
            return(m + multiply(m,n-1));
        }
    }
    
    static int F(int M, int N) {
        
        if(N<=0) {
            System.out.println("N<=0 value: m-" + M + " n-" + N);
            return M;
        } else if (M<=0) {
            System.out.println("M<=0 value: m-" + M + " n-" + N);
            return N;
        } else if(M<=N) {
            System.out.println("M<=N value: m-" + M + " n-" + N);
            return M+N;
        } else if(M>N) {
            System.out.println("M>N return: m-" + M + " n-" + N);
            return F(M-1, F(M-1, N-1));
        } 
        return 6675;
    }
    */
}