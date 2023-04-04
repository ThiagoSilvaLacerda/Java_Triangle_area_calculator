package entities;

public class Triangle {
    public double a;
    public double b;
    public double c;
    public double area() {
        double semiperimeter = (a+b+c)/2;
        double result = Math.sqrt(semiperimeter*(semiperimeter-a)*(semiperimeter-b)*(semiperimeter-c));
        return result;

    }

}