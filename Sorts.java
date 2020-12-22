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
      int big = i;
      for (int j = i + 1; j < n; j++){
        if (data[j] < data[big]){
          big = j;
        }
      }
      int result = data[big];
      data[big] = data[i];
      data[i] = result;
    }
  }
  public static void insertionSort(int[] data){
    int n = data.length;
    for (int i = 1; i < n; i++) {
        int current = data[i];
        int prev = i - 1;
        while ((prev >= 0) && (data[prev] > current )) {
            data[prev+1] = data[prev];
            prev -= 1;
        }
        data[prev+1] = current;
    }
  }
}
