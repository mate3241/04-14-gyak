package hu.flowacademy;

public class Main {

  public static void main(String[] args) {
    Triangle triangle1 = new Triangle(4, 5, 6);
    System.out.println(triangle1.perimeter());
    System.out.println(triangle1.area());
    IsoscelesTriangle triangle2 = new IsoscelesTriangle(7, 8);
    System.out.println(triangle2.perimeter());
    System.out.println(triangle2.area());
    EquilateralTriangle triangle3 = new EquilateralTriangle(7);
    System.out.println(triangle3.perimeter());
    System.out.println(triangle3.area());
    IsoscelesTriangle triangle4 = new IsoscelesTriangle(7, 8);
    System.out.println(triangle2.equals(triangle4));
    System.out.println(triangle2 == triangle4);

    /*SmartIntArray sia = new SmartIntArray(new int[]{1, 2, 3, 4, 5});
    System.out.println(sia.sum);
    System.out.println(sia.average);
    System.out.println(sia.minimumElement);
    System.out.println(sia.maximumElement);
    */
  }
}
