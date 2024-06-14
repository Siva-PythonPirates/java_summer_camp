import java.util.*;

// public class max {
//     public static void main(String[] args) {
//         int k=3;
//         int[] arr={1,3,-1,-3,5,3,6,7};
//         for (int i=0;i<=arr.length-k;i++) {
//             int maxVal = 0;
//             for (int j=i;j<i+k;j++) {
//                 maxVal=Math.max(maxVal,arr[j]);
//             }
//             System.out.print(maxVal+" ");
//         }
//     }
// }


// public class max {
//     public static void main(String[] args) {
//         int k = 3;
//         int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
//         Deque<Integer> queue = new LinkedList<>();
//         for (int i = 0; i < arr.length; i++) {
//             while (!queue.isEmpty() && queue.peek() < i - k + 1) {
//                 queue.poll();
//             }
//             while (!queue.isEmpty() && arr[queue.peekLast()] < arr[i]) {
//                 queue.pollLast();
//             }
//             queue.offer(i);
//             if (i >= k - 1) {
//                 System.out.print(arr[queue.peek()] + " ");
//             }
//         }
//     }
// }

public class max {
    public static void main(String[] args) {
        int k = 3;
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        Queue<Integer> queue=new LinkedList<>();
        for (int i=0;i<arr.length;i++) {
            if (!queue.isEmpty() && queue.peek()<i-k+1)
            queue.poll();
            while (!queue.isEmpty() && arr[queue.peek()]<arr[i])
            queue.poll();
            queue.offer(i);
            if (i>=k-1)
            System.out.println(arr[queue.peek()]);
        }
    }
}
