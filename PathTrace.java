// import java.util.ArrayList;
// import java.util.List;

// public class PathTrace {
//     public static void main(String[] args) {
//         int n=3;
//         countPaths(n);
//     }

//     public static void countPaths(int n) {
//         List<String> paths = new ArrayList<>();
//         backtrack(0, 0, "",paths,n);
//         System.out.println(paths.size());
//         for (String path : paths)
//         System.out.println(path);
//     }

//     public static void backtrack(int i, int j, String path, List<String> paths, int n) {
//         if (i==n-1 && j==n-1) {
//             paths.add(path);
//             return;
//         }
//         if (i<n-1)
//         backtrack(i+1,j,path+"("+(i+1)+","+j+") ",paths,n);
//         if (j<n-1)
//         backtrack(i,j+1,path+"("+i+","+(j+1)+") ",paths,n);
//     }
// }
// 1,1,1
// 1,1,0
// 1,1,1



// import java.util.ArrayList;
// import java.util.List;

// public class PathTrace {
//     static int[][] dp=new int[3][3];
//     public static void main(String[] args) {
//         int n=3;
//         countPaths(n);
//     }

//     public static void countPaths(int n) {
//         List<String> paths = new ArrayList<>();
//         backtrack(0, 0, "",paths,n);
//         System.out.println(paths.size());
//         for (String path : paths)
//         System.out.println(path);
//     }

//     public static void backtrack(int i, int j, String path, List<String> paths, int n) {
//         if (i==n-1 && j==n-1) {
//             paths.add(path);
//             return;
//         }
//         if (i<n-1)
//         backtrack(i+1,j,path+"("+(i+1)+","+j+") ",paths,n);
//         if (j<n-1)
//         backtrack(i,j+1,path+"("+i+","+(j+1)+") ",paths,n);
//     }
// }



//optimal

// public class PathTrace {
//     static int fact(int n){    
//         if (n == 0) return 1;    
//         else return(n*fact(n-1));    
//        }   
//     public static void main(String[] args) {
//         int n=4;
//         System.out.println(fact(2*(n-1))/(fact(n-1)*fact(n-1)));
//     }
// }


// 1,1,1
// 1,1,0
// 1,1,1



// import java.util.ArrayList;
// import java.util.List;

// public class PathTrace {
//     public static void main(String[] args) {
//         int[][] matrix = {
//                 {1, 1, 1},
//                 {0, 1, 0},
//                 {1, 1, 1}
//         };
//         countPaths(matrix);
//     }

//     public static void countPaths(int[][] matrix) {
//         List<String> paths = new ArrayList<>();
//         backtrack(0, 0, "", paths, matrix);
//         System.out.println(paths.size());
//         for (String path : paths) {
//             System.out.println(path);
//         }
//     }

//     public static void backtrack(int i, int j, String path, List<String> paths, int[][] matrix) {
//         if (i==matrix.length-1 && j== matrix[0].length-1) {
//             paths.add(path);
//             return;
//         }
//         if (i<matrix.length-1 && matrix[i+1][j]==1) {
//             backtrack(i+1,j,path+"("+(i+1)+","+j+") ",paths,matrix);
//         }
//         if (j<matrix[0].length-1 && matrix[i][j+1]==1) {
//             backtrack(i,j+1,path+"("+i+","+(j+1)+") ",paths,matrix);
//         }
//     }
// }








public class PathTrace {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1}
        };
        System.out.println(countPaths(matrix, 0, 0));
    }
    public static int countPaths(int[][] matrix, int i, int j) {
        if (i==matrix.length-1 && j==matrix[0].length-1) return 1;
        if (i>=matrix.length || j>=matrix[0].length || matrix[i][j]==0) return 0;
        matrix[i][j]=0;
        int paths=countPaths(matrix,i+1,j)+countPaths(matrix,i,j+1);
        matrix[i][j]=1;
        return paths;
    }
}