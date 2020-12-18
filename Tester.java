import java.util.*;
public class Tester extends Sorts{
  public static boolean DEBUG = false;
  public static boolean False = false;
  public static void main(String[]args){
    int[] A = new int[]{4, 2, 5, 3, 6, 10, 1, 7, 9, 8};
    int[] a = A.clone();
    int[] B = new int[]{1, 3, 4, 2, 7, 5, 9, 10, 6, 8};
    int[] b = B.clone();
    int[] C = new int[]{7, 8, 10, 1, 3, 2, 6, 5, 9, 4};
    int[] c = C.clone();
    System.out.println("~~~~~~~ TESTING ARRAY A ~~~~~~~");
    bubbleSort(A);
    Arrays.sort(a);
    if (!Arrays.equals(A, a)){
      False = true;
    }
    System.out.println("~~~~~~~ TESTING ARRAY B ~~~~~~~");
    bubbleSort(B);
    Arrays.sort(b);
    if (!Arrays.equals(B, b)){
      False = true;
    }
    System.out.println("~~~~~~~ TESTING ARRAY C ~~~~~~~");
    bubbleSort(C);
    Arrays.sort(c);
    if (!Arrays.equals(C, c)){
      False = true;
    }
    if (False == true){
      System.out.println("One or more tests have failed when testing bubbleSort");
    }
    else {
      System.out.println("All tests have passed!");
    }
  }
}
