import java.util.*;
public class InsertionSort {
    public static void main(String args[]) {
    int[] arr={9,5,1,4,3};
    int n=arr.length;
    for (int i=1;i<n;i++) {
        int key=arr[i];
        int j=i-1;
        while (j>=0 && key<arr[j]) {
          arr[j+1]=arr[j];
          --j;
        }
        arr[j+1]=key;
      }
    System.out.println(Arrays.toString(arr));
  }
}

