public class Demo {

public static void main(String[] args) {
  if (args.length == 0){
    printLoop(5);
  } else
  printLoop(Integer.parseInt(args[0]));
}

public static void printLoop(int n) {
  for (int i = 1; i <= n; i++) {
    for (int j = i; j <= n; j++) {
      System.out.print(i);
    }
    System.out.println();
  }
}

public static String arrToString(int[] arr){
  String str = "{";
  if (arr.length == 0) {
    return "{}";
  }
  for (int i = 0; i <arr.length - 1; i++) {
    str += + arr[i] + ", ";
  }
  str += arr[arr.length-1] + "}";
  return str;
}

public static String arrayDeepToString(int[][] arr) {
  String str = "{";
  if (arr.length == 0) {
    return "{}";
  }
  for (int i = 0; i < arr.length - 1; i++) {
    str += arrToString(arr[i]) + ", ";
  }
  str += arrToString(arr[arr.length-1]) + "}";
  return str;
}

public static int[][] create2DArray(int rows, int cols, int maxValue) {
  int[][] array = new int[rows][cols];
  for (int i = 0; i < rows; i++) {
    for (int j = 0; j < cols; j++) {
      int value = (int) Math.round(Math.random() * maxValue);
      array[i][j] = value;
    }
  }
  return array;
}

}
