package hu.flowacademy;

import java.util.Objects;

public class EquilateralTriangle extends Triangle {
  double a;


  public EquilateralTriangle(double a) {
    super(a, a, a);
  }

  @Override
  public String toString() {
    return "equilateralTriangle{" +
            "a=" + a +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    EquilateralTriangle that = (EquilateralTriangle) o;
    return Double.compare(that.a, a) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), a);
  }
}
