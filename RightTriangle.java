public class RightTriangle extends Triangle {
    public RightTriangle(String name, double base, double height) {
        super(name, base, height, Math.sqrt(base * base + height * height));
    }

    public void calculatePerimeter() {
        perimeter = side1 + side2 + side3;
    }

    public void calculateArea() {
        area = 0.5 * side1 * side2;
    }

    public static void main(String[] args) {
        RightTriangle sikuSikuTriangle = new RightTriangle("Segitiga Siku-siku", 6.0, 8.0);
        sikuSikuTriangle.calculateArea();
        sikuSikuTriangle.calculatePerimeter();
        sikuSikuTriangle.getInfo();
    }
}