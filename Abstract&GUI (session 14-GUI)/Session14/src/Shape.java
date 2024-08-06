abstract public class Shape {
    private String Color;
    Shape()
    {
        this.Color = "Blue";
    }
    Shape(String color)
    {
        this.Color = color;
    }
    public String getColor(){ return this.Color; }
    abstract public double getArea();  //Button

    @Override
    public String toString() {
        return "Shape{" +
                "Color='" + Color + '\'' +
                '}';
    }
}
class Rectangle extends Shape
{
    private int Length,Width;
    Rectangle()
    {
        this.Length = 1;
        this.Width = 1;
    }


    Rectangle(int length,int width,String color)
    {
        super(color);
        this.Length = length;
        this.Width = width;
    }
    @Override
    public double getArea() {
        return (double) this.Length*this.Width;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+"Rectangle{" +
                "Length=" + Length +
                ", Width=" + Width +
                ", Area=" + this.getArea() +
                '}';
    }
}
class Triangle extends Shape
{
    private int Base,Height;

    public Triangle() {
        Base = 1;
        Height = 1;
    }


    public Triangle(String color, int base, int height) {
        super(color);
        Base = base;
        Height = height;
    }
    @Override
    public double getArea() {
        return (double) (this.Height*this.Base)/2;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+"Triangle{" +
                "Base=" + Base +
                ", Height=" + Height +
                ", Area=" + this.getArea() +
                '}';
    }
}
