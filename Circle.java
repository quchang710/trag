
class Circle {
    private double radius;

    // Constructor không tham số (mặc định radius = 1.0)
    public Circle() {
        radius = 1.0;
    }

    // Constructor với tham số radius
    public Circle(double r) {
        radius = r;
    }

    // Getter cho radius
    public double getRadius() {
        return radius;
    }

    // Setter cho radius
    public void setRadius(double r) {
        radius = r;
    }

    // Phương thức tính diện tích
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Phương thức tính chu vi
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    // Override phương thức toString() để hiển thị thông tin của đối tượng
    @Override
    public String toString() {
        return "Circle[radius=" + radius + "]";
    }
}