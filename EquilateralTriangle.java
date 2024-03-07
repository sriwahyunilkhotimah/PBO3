public class EquilateralTriangle extends Triangle {
    public EquilateralTriangle(String name, double side) {
        super(name, side, side, side);
    }

    public void calculatePerimeter() {
        perimeter = side1 + side2 + side3;
    }

    public void calculateArea() {
        area = 0.5 * side1 * side2;
    }

public static void main(String[] args) {
    EquilateralTriangle samaSisiTriangle = new EquilateralTriangle("Segitiga Sama Sisi", 3.0);
    samaSisiTriangle.calculateArea();
    samaSisiTriangle.calculatePerimeter();
    samaSisiTriangle.getInfo();
}
}