public class FrogJump {

    public static int minCost(int[] heights) {
        int n=heights.length;
        if (n==0) return 0;
        int[] dp=new int[n];
        dp[0]=0;
        dp[1]=Math.abs(heights[1]-heights[0]);
        for (int i=2;i<n;i++) {
            int jumpOneStep=dp[i-1]+Math.abs(heights[i]-heights[i-1]);
            int jumpTwoSteps=dp[i-2]+Math.abs(heights[i]-heights[i-2]);
            dp[i]=Math.min(jumpOneStep, jumpTwoSteps);
        }
        return dp[n-1];
    }

    public static void main(String[] args) {
        int[] heights={30,10,60,60,50};
        System.out.println(minCost(heights));
    }   
}
