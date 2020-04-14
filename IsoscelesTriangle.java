package hu.flowacademy;

import java.util.Objects;

public class IsoscelesTriangle extends Triangle {
  double a;
  double b;


  public IsoscelesTriangle(double a, double b) {
    super(a, a, b);
  }

  @Override
  public String toString() {
    return "isoscelesTriangle{" +
            "a=" + super.getA() +
            ", b=" + super.getC() +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    IsoscelesTriangle that = (IsoscelesTriangle) o;
    return Double.compare(that.getA(), getA()) == 0 &&
            Double.compare(that.getC(), getC()) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), getA(), getC());
  }
}


