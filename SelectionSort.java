// public class SelectionSort {

//     public static void main(String[] args) {
//         int[] arr={64, 25, 12, 22, 11};
//         for(int i=0;i<arr.length;i++){
//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[i]>arr[j]){
//                     int temp=arr[i];
//                     arr[i]=arr[j];
//                     arr[j]=temp;
//                     }
//             }
//         }
//         for(int i=0;i<arr.length;i++)
//         System.out.print(arr[i]+" ");
//     }

// }


public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={64, 25, 12, 22, 11};    
        int n=arr.length;
        for (int i=0;i<n-1;i++) {
            int min=i;
            for (int j=i+1;j<n;j++) {
                if (arr[j]<arr[min])
                min=j;
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        for (int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");
    }
}
