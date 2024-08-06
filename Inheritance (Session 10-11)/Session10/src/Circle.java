public class Circle {
    private double Radius;
    private String Color;

    Circle()
    {
        this.Radius = 1.0;
        this.Color = "Red";
    }
    Circle(double radius)
    {
        this.Radius = radius;
    }
    Circle(double radius,String color)
    {
        this.Radius = radius;
        this.Color = color;
    }
    public double getRadius()
    {
        return  this.Radius;
    }
    public void setRadius(double radius)
    {
        this.Radius = radius;
    }
    public  String getColor()
    {
        return this.Color;
    }
    public void setColor(String color)
    {
        this.Color = color;
    }
    public double getArea()
    {
        return 3.142*(this.getRadius()*this.getRadius());
    }

    @Override
    public String toString() {
        return "Circle{" +
                "Radius=" + Radius +
                ", Color='" + Color + '\'' +
                ", Area='" + this.getArea() + '\'' +
                '}';
    }
}
