import java.util.*;
public class Tester extends Sorts{
  public static boolean DEBUG = false;
  public static boolean False = false;
  public static boolean False2 = false;
  public static void main(String[]args){
    int[] A = new int[]{4, 2, 5, 3, 6, 10, 1, 7, 9, 8};
    int[] a = A.clone();
    int[] A2 = A.clone();
    int[] B = new int[]{1, 3, 4, 2, 7, 5, 9, 10, 6, 8};
    int[] b = B.clone();
    int[] B2 = B.clone();
    int[] C = new int[]{7, 8, 10, 1, 3, 2, 6, 5, 9, 4};
    int[] c = C.clone();
    int[] C2 = C.clone();
    System.out.println("~~~~~~~ TESTING ARRAY A ~~~~~~~");
    bubbleSort(A);
    selectionSort(A2);
    Arrays.sort(a);
    if (!Arrays.equals(A, a)){
      False = true;
    }
    if (!Arrays.equals(A2, a)){
      False2 = true;
    }
    System.out.println("~~~~~~~ TESTING ARRAY B ~~~~~~~");
    bubbleSort(B);
    selectionSort(B2);
    Arrays.sort(b);
    if (!Arrays.equals(B, b)){
      False = true;
    }
    if (!Arrays.equals(B2, b)){
      False2 = true;
    }
    System.out.println("~~~~~~~ TESTING ARRAY C ~~~~~~~");
    bubbleSort(C);
    selectionSort(C2);
    Arrays.sort(c);
    if (!Arrays.equals(C, c)){
      False = true;
    }
    if (!Arrays.equals(C2, c)){
      False2 = true;
    }
    if (False == true){
      System.out.println("One or more tests have failed when testing bubbleSort");
    }
    if (False2 == true){
      System.out.println("One or more tests have failed when testing selectionSort");
    }
    else {
      System.out.println("All tests have passed!");
    }
  }
}
