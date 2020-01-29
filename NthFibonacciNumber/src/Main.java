public class Main {
    // Fibonnaci Numbers are defined by the recurrence relation F(n) =  F(n-1) + F(n-2)
    // with seed values for F(0) = 0 and F(1) = 1

    public static void main(String[] args) {
        System.out.println(fib(0));
        System.out.println(fibSO(9));
    }

    // Using recursion
    static int fib(int n) {
        if (n<=1) {
            return n;
        }
        return fib(n-1) + fib(n-2);
    }

    // Space optimized method
    static int fibSO(int n){
        int a=0, b=1, c;
        if (n==0){
            return a;
        }
        for (int i=2; i<=n; i++){
            c = a+b;
            a = b;
            b = c;
        }
        return b;
    }
}
