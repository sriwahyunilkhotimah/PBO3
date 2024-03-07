public class IsoscelesTriangle extends Triangle {
    public IsoscelesTriangle(String name, double base, double height) {
        super(name, base, height, Math.sqrt(base * base + height * height));
    }

    public void calculatePerimeter() {
        perimeter = side1 + side2 + side3;
    }

    public void calculateArea() {
        area = 0.5 * side1 * side2;
    }
public static void main(String[] args) {
    IsoscelesTriangle samaKakiTriangle = new IsoscelesTriangle("Segitiga Sama Kaki", 3,4);
    samaKakiTriangle.calculateArea();
    samaKakiTriangle.calculatePerimeter();
    samaKakiTriangle.getInfo();
}
}