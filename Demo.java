public class Demo {

public static void main(String[] args) {
  if (args.length == 0){
    printLoop(5);
  } else
  printLoop(Integer.parseInt(args[0]));
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

}
