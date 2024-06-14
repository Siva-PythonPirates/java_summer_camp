//Recursion

// import java.util.Scanner;
// public class ClimbingStaircase {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println(climbStairs(sc.nextInt()));
//     }
//     public static int climbStairs(int n) {
//         if (n==0 || n==1) return 1;
//         else return climbStairs(n-1) + climbStairs(n-2);
//     }
// }


//Memoization

// import java.util.Scanner;
// public class ClimbingStaircase {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         if (n==0) {
//             System.out.println(1);
//             return;
//         }
//         int[] dp=new int[n+1];
//         dp[0]=1;
//         dp[1]=1;
//         for (int i=2;i<=n;i++)
//         dp[i]=dp[i-1]+dp[i-2];
//         System.out.println(dp[n]);
//     }
// }


//Tabulation

// import java.util.Scanner;

// public class ClimbingStaircase {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         System.out.println(climbStairs(n));
//     }
//     public static int climbStairs(int n) {
//         if (n<=1) return 1;
//         int[] dp=new int[n+1];
//         dp[0]=dp[1]=1;      
//         for (int i=2;i<=n;i++) 
//         dp[i]=dp[i-1]+dp[i-2];
//         return dp[n];
//     }
// }


//Optimization

// import java.util.Scanner;
// public class ClimbingStaircase {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();   
//         System.out.println(climbStairs(n));
//     }
//     public static int climbStairs(int n) {
//         if (n==0) return 1;
//         if (n==1) return 1;
//         int prev1=1,prev2=1;
//         for (int i=2;i<=n;i++) {
//             int current=prev1+prev2;
//             prev2=prev1;
//             prev1=current;
//         }
//         return prev1;
//     }
// }
 