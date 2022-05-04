public class Prime {
  public static void prime(int n) {
    for (int i = 1; i < n; i++) {
      if (checkPrime(i)) {
        System.out.println(i);
      }
    }
  }

  public static boolean checkPrime(int n) {
    if (n == 1) return true;
    
    for (int i = 2; i < n; i++) {
      if (n % i == 0) {
        return false;
      }
    }

    return true;
  }
}