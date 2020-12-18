public class Sorts{
  public static void bubbleSort(int[] data){
    int n = data.length;
    boolean swap = true;
    while (swap){
      swap = false;
      for (int i = 0; i < n - 1; i++){
        if (data[i] > data[i + 1]){
          int swapped = data[i];
          data[i] = data[i + 1];
          data[i+1] = swapped;
          swap = true;
        }
      }
    }
  }
  public static void selectionSort(int[] data){
    int n = data.length;
    for (int i = 0; i < n; i++){
      int big = data[i];
      for (int j = i + 1; j < n; j++){
        if (data[j] < big){
          big = data[j];
          data[j] = data[i];
        }
      }

      data[i] = big;
    }
  }
}
