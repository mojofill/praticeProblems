public class FIbonacci {
  public static void f(int n) {
    int curr_num = 1;
    int past_num = 1;

    System.out.println(past_num);
    System.out.println(curr_num);

    for (int i = 0; i < n; i++) {
      System.out.println(curr_num + past_num);
      int newNum = curr_num + past_num;
      past_num = curr_num;
      curr_num = newNum;
    }
  }
}