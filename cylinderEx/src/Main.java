public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3.75);
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());
        Cylinder cylinder = new Cylinder(5.55, 6.25);
        System.out.println(cylinder.getRadius());
        System.out.println(cylinder.getArea());
    }
}
