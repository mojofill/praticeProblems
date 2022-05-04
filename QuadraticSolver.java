public class QuadraticSolver {
  public static void solve(double a, double b, double c) {
    double discriminant = Math.pow(b, 2) - 4 * a * c;
    if (discriminant < 0) {
      System.out.println("solution is not real");
    }
    else {
      double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
      double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
      System.out.println("x1: " + x1);
      System.out.println("x2: " + x2);
    }
  }
}