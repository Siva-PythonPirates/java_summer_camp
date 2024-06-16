public class HouseRobbery {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n==0) return 0;
        if (n==1) return nums[0];
        
        int prev2 = nums[0];
        int prev1 = Math.max(nums[0],nums[1]);
        
        for (int i=2;i<n;i++) {
            int current = Math.max(prev1,prev2+nums[i]);
            prev2=prev1;
            prev1=current;
        }
        
        return prev1;
    }   
}








// public class HouseRobbery {
//     public int rob(int[] nums) {
//         int n = nums.length;
//         // if (n==0) return 0;
//         if (n==1) return nums[0];
//         if(n==2)return Math.max(rob(nums,0,nums.length-1),rob(nums,1,nums.length-1));

//     }

//         private int rob(int[] nums,int l,int r){

//         int prev2=0;
//         int prev1=0;
//         for (int i=l;i<=r;i++) {
//             int current=Math.max(prev1,prev2+nums[i]);
//             prev2=prev1;
//             prev1=current;
//         }
//         return prev1;
//     }
// }
