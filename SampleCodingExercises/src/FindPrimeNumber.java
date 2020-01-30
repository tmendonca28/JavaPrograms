public class FindPrimeNumber {
    // Prime numbers are whole numbers greater than 1; divisible by only one and itself
    public static void main(String[] args) {
        System.out.println(isPrime(12));
        System.out.println(isPrime(11));
    }

    // NB: runs with O(n)
    static boolean isPrime(int n){
        // Sanity check
        if (n<=1){
            return false;
        }
        for (int i = 2; i<n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
