public class Circle {
    private final double PI;
    private int radius;

    public Circle(double PI, int radius) {
        this.PI = PI;
        this.radius = radius;
    }

    public double getPI() {
        return PI;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    static void area(double pi, int radius ){
        System.out.println("Areas: " + pi*radius*radius);
    }
    static  void circumference(double pi, int radius){
        System.out.println("Circumference: " + 2*pi*radius);
    }
}
