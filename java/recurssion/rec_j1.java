public class rec_j1 {
    static int sum;

    public static void main(String[] args) {
        int n = 1200506;
        // System.out.println(factorial(6));
        System.out.println(zeroCount(n,0));
        // prin(n);
    }

    // reversal to the number
    static int rev(int n) {
        if (n == 0)
            return n;
        int rem = n % 10;
        sum = sum * 10 + rem;
        rev(n / 10);
        return sum;
    }

    // printing number 0 to n
    static void pri(int n) {
        if (n == 0)
            return;
        pri(n - 1);
        System.out.println(n);

    }

    // printing each digit of the number
    static void prin(int n) {
        if (n == 0)
            return;
        int rem = n % 10;
        System.out.println(rem);
        prin(n / 10);
    }

    // checking for palindrome
    static boolean palin(int n) {
        return n == rev(n);
    }

    // to find the factorial to the given number
    static int factorial(int n){
        if(n <= 1){
            return n;
        }
        return n * factorial(n-1);
    }

    // to count the number of zeros in the given number
    static int zeroCount(int n, int count){
        if(n == 0){
            return count;
        }
        int rem = n % 10;
        if(rem == 0){
            ++count;
        }
        return zeroCount(n/10, count);
        
    }
}