//RECURRSION

// import java.util.*;
// public class FibonacciRecursion {  
//     int fibonacci(int i) {
//         if (i < 2) return i;
//         return fibonacci(i-1) + fibonacci(i-2);
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println(new FibonacciRecursion().fibonacci(sc.nextInt()));
//         sc.close();
//     }
// }


//fibo - DP


import java.util.*;
public class FibonacciRecursion {
    public static int fibonacci(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(fibonacci(sc.nextInt()));
    }
}
































