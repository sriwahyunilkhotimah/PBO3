public class Rectangle extends Shape {
    protected double side1;
    protected double side2;

    public Rectangle(String name, double side1, double side2) {
        super(name);
        this.side1 = side1;
        this.side2 = side2;
    }

    public void calculatePerimeter() {
        perimeter = 2 * (side1 + side2);
    }

    public void calculateArea() {
        area = side1 * side2;
    }

    public static void main(String[] args) {
        Rectangle PersegiPanjang = new Rectangle("Persegi Panjang", 3, 4);
        PersegiPanjang.calculateArea();
        PersegiPanjang.calculatePerimeter();
        PersegiPanjang.getInfo();
    }
}