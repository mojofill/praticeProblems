public class FB {
  // 3: fizz and 5: buzz
  public static void f(int n) {
    for (int i = 1; i <= n; i++) {
      if (i % 3 == 0) System.out.println(i + ": fizz");
      else if (i % 5 == 0) System.out.println(i + ": buzz");
      else if (i % 3 == 0 && i % 5 == 0) System.out.println(i + ": fizz buzz");
    }
  }
}