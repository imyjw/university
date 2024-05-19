// 기본 클래스 Shape
class Shape {
    public void calculateArea() {
        System.out.println("Shape area calculation");
    }
}

// 자식 클래스 Rectangle
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void calculateArea() {
        double area = length * width;
        System.out.println("Rectangle area: " + area);
    }
}

// 자식 클래스 Square
class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void calculateArea() {
        double area = side * side;
        System.out.println("Square area: " + area);
    }
}

// ShapeTest 클래스
class ShapeTest {
    public static void main(String[] args) {
        Shape rec=new Rectangle(4.0,5.0);
        Shape squ=new Square(3.0);
        Shape sha=new Shape();

        rec.calculateArea();
        squ.calculateArea();
        sha.calculateArea();

    }
}
