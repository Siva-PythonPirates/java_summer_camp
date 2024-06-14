//NEAREST GREATEST ELEMENT WITHOUT ANY ARRAY

// import java.util.*;
// public class main {
//     public static void main(String args[]) {
//         int[] arr = {5, 3, 2, 10, 6, 8, 1, 4, 12, 7, 4};
//         Stack<Integer> stack = new Stack<>();
//         for (int i = 0; i < arr.length; i++) {
//             while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
//                 stack.pop();
//                 System.out.println(arr[i]);
//             }
//             stack.push(i);
//         }
//         while (!stack.isEmpty()) {
//             stack.pop();
//             System.out.println(-1);
//         }
//     }
// }

//NEAREST GREATEST ELEMENT WITH AN ARRAY

// import java.util.*;
// public class main{
//     public static void main(String args[]){
//         int[] arr={5,3,2,10,6,8,1,4,12,7,4};
//         Stack<Integer> stack=new Stack<>();
//         int[] f=new int[arr.length];
//         Arrays.fill(f, -1);
//         int i=0;
//         while(i<arr.length){
//             while(!stack.isEmpty() && arr[stack.peek()]<arr[i])
//             f[stack.pop()]=arr[i];
//             stack.push(i);
//             i++;
//         }
//         for(int k:f)
//         System.out.println(k);
//     }
// }









// ELEVATOR

// import java.util.Scanner;

// public class main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the floor of user-1: ");
//         int user1Floor = scanner.nextInt();
//         System.out.print("Enter the floor of user-2: ");
//         int user2Floor = scanner.nextInt();
//         System.out.print("Enter the current position of the lift: ");
//         int liftPosition = scanner.nextInt();
//         System.out.print("Enter the direction of the lift (up/down): ");
//         String liftDirection = scanner.next();
//         Elevator elevator = new Elevator(liftPosition, liftDirection);
//         elevator.requestFloor(user1Floor);
//         elevator.requestFloor(user2Floor);
//         elevator.move();
//     }
// }

// class Elevator {
//     private int currentPosition;
//     private String direction;
//     private int[] floorsRequested = new int[10];
//     private int requestCount = 0;
//     public Elevator(int currentPosition, String direction) {
//         this.currentPosition = currentPosition;
//         this.direction = direction;
//     }

//     public void requestFloor(int floor) {
//         floorsRequested[requestCount++] = floor;
//     }
    
//     public void move() {
//         if (direction.equals("up")) {
//             for (int i = currentPosition + 1; i < floorsRequested.length; i++) {
//                 if (isFloorRequested(i)) {
//                     System.out.println("Stopping at floor: " + i);
//                 }
//             }
//             for (int i = 0; i < currentPosition; i++) {
//                 if (isFloorRequested(i)) {
//                     System.out.println("Stopping at floor: " + i);
//                 }
//             }
//         } else {
//             for (int i = currentPosition - 1; i >= 0; i--) {
//                 if (isFloorRequested(i)) {
//                     System.out.println("Stopping at floor: " + i);
//                 }
//             }
//             for (int i = floorsRequested.length - 1; i > currentPosition; i--) {
//                 if (isFloorRequested(i)) {
//                     System.out.println("Stopping at floor: " + i);
//                 }
//             }
//         }
//     }
//     private boolean isFloorRequested(int floor) {
//         for (int i = 0; i < requestCount; i++) {
//             if (floorsRequested[i] == floor) {
//                 return true;
//             }
//         }
//         return false;
//     }
// }




//BIN SEARCH TREE

// class TreeNode {
//     int data;
//     TreeNode left;
//     TreeNode right;

//     public TreeNode(int data) {
//         this.data = data;
//         this.left = null;
//         this.right = null;
//     }
// }

// class BinaryTree {
//     TreeNode root;

//     public BinaryTree() {
//         this.root = null;
//     }

//     public void insert(int data) {
//         root = insertRec(root, data);
//     }

//     private TreeNode insertRec(TreeNode root, int data) {
//         if (root == null) {
//             root = new TreeNode(data);
//             return root;
//         }
//         if (data < root.data) {
//             root.left = insertRec(root.left, data);
//         } else if (data > root.data) {
//             root.right = insertRec(root.right, data);
//         }
//         return root;
//     }

//     public void inorder() {
//         inorderRec(root);
//     }

//     private void inorderRec(TreeNode root) {
//         if (root != null) {
//             inorderRec(root.left);
//             System.out.print(root.data + " ");
//             inorderRec(root.right);
//         }
//     }

//     public void preorder() {
//         preorderRec(root);
//     }

//     private void preorderRec(TreeNode root) {
//         if (root != null) {
//             System.out.print(root.data + " ");
//             preorderRec(root.left);
//             preorderRec(root.right);
//         }
//     }

//     public void postorder() {
//         postorderRec(root);
//     }

//     private void postorderRec(TreeNode root) {
//         if (root != null) {
//             postorderRec(root.left);
//             postorderRec(root.right);
//             System.out.print(root.data + " ");
//         }
//     }

//     public int diameter() {
//         return diameterRec(root);
//     }

//     private int diameterRec(TreeNode root) {
//         if (root == null) {
//             return 0;
//         }

//         int leftHeight = height(root.left);
//         int rightHeight = height(root.right);

//         int leftDiameter = diameterRec(root.left);
//         int rightDiameter = diameterRec(root.right);

//         return Math.max(leftHeight + rightHeight + 1, Math.max(leftDiameter, rightDiameter));
//     }

//     private int height(TreeNode node) {
//         if (node == null) {
//             return 0;
//         }
//         return 1 + Math.max(height(node.left), height(node.right));
//     }
// }

// public class main {
//     public static void main(String[] args) {
//         BinaryTree tree = new BinaryTree();
//         tree.insert(11);
//         tree.insert(20);
//         tree.insert(3);
//         tree.insert(42);
//         tree.insert(54);
//         tree.insert(16);
//         tree.insert(32);
//         tree.insert(9);
//         tree.insert(4);
//         tree.insert(10);

//         System.out.print("In-order traversal: ");
//         tree.inorder();
//         System.out.println();
//         System.out.print("Pre-order traversal: ");
//         tree.preorder();
//         System.out.println();
//         System.out.print("Post-order traversal: ");
//         tree.postorder();
//         System.out.println();

//         System.out.println("Diameter of the tree: " + tree.diameter());
//     }
// }


//BINARY TREE

import java.util.*;

public class main {
    static class TreeNode {
        int data;
        TreeNode left, right;
        public TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree {
        TreeNode root;
        public BinaryTree() {
            this.root = null;
        }
        public void insert(int data) {
            root = insertRec(root, data);
        }
        private TreeNode insertRec(TreeNode root, int data) {
            if (root == null) {
                root = new TreeNode(data);
                return root;
            }
            if (data < root.data)
            root.left = insertRec(root.left, data);
            else if (data > root.data)
            root.right = insertRec(root.right, data);
            return root;
        }
        public int height() {
            return heightRec(root);
        }
        private int heightRec(TreeNode root) {
            if (root == null)
            return 0;
            int leftHeight = heightRec(root.left);
            int rightHeight = heightRec(root.right);
            
            return 1 + Math.max(leftHeight, rightHeight);
        }
        public int diameter() {
            return diameterRec(root);
        }
        private int diameterRec(TreeNode root) {
            if (root == null) {
                return 0;
            }
            int leftHeight = heightRec(root.left);
            int rightHeight = heightRec(root.right);
            int rootDiameter = leftHeight + rightHeight + 1;
            int leftDiameter = diameterRec(root.left);
            int rightDiameter = diameterRec(root.right);
            return Math.max(rootDiameter, Math.max(leftDiameter, rightDiameter));
        }
    }
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(11);
        tree.insert(20);
        tree.insert(3);
        tree.insert(42);
        tree.insert(54);
        tree.insert(16);
        tree.insert(32);
        tree.insert(9);
        tree.insert(4);
        tree.insert(10);
        int height = tree.height();
        System.out.println("Height of the binary tree: " + height);
        int diameter = tree.diameter();
        System.out.println("Diameter of the binary tree: " + diameter);
    }
}
