public class Shape {
    private String Color;
    private boolean Filled;
    Shape()
    {
        this.Color = "Red";
        this.Filled = true;
    }
    Shape(String color,boolean filled)
    {
        this.Color = color;
        this.Filled = filled;
    }

    public String getColor(){ return  this.Color; }
    public void setColor(String color){ this.Color = color; }

    public boolean isFilled(){ return this.Filled; }
    public void setFilled(boolean filled){ this.Filled = filled; }

    @Override
    public String toString() {
        return "Shape{" +
                "Color='" + Color + '\'' +
                ", Filled=" + Filled +
                '}';
    }
}

class Circle extends Shape
{
    private double Radius;
    Circle()
    {
        this.Radius = 1.0;
    }
    Circle(double radius){ this.Radius = radius; }
    Circle(double radius,String color,boolean filled)
    {
        super(color,filled);
        this.Radius = radius;
    }
    public void setRadius(double radius){this.Radius =radius;}
    public double getRadius(){return this.Radius;}

    public double getArea()
    {
        return 3.142*(this.getRadius()*this.getRadius());
    }
    public double getPerimeter()
    {
        return 2*3.142*this.getRadius();
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+"Circle{" +
                " Radius=" + Radius +
                " Area=" + this.getArea() +
                " Perimeter=" + this.getPerimeter() +
                '}';
    }
}

class Rectangle extends Shape
{
    private double Width,Length;

    Rectangle(){this.Width = 1.0; this.Length = 1.0;}
    Rectangle(double width,double length)
    {
        this.Width = width;
        this.Length = length;
    }
    Rectangle(double width,double length,String color,boolean filled)
    {
        super(color,filled);
        this.Width = width;
        this.Length = length;
    }
    public double getWidth(){return this.Width;}
    public double getLength(){return this.Length;}
    public void setWidth(double width){this.Width = width;}
    public void setLength(double length){this.Length = length;}

    public double getArea(){return this.getLength()*this.getWidth();}
    public double getPerimeter(){ return  2*(this.getLength()+this.getWidth());}

    @Override
    public String toString() {
        return super.toString()+"\n"+"Rectangle{" +
                "Width=" + Width +
                ", Length=" + Length +
                ", Area=" + this.getArea() +
                ", Perimeter=" + this.getPerimeter() +
                '}';
    }
}

class Square extends Rectangle{
    Square(){super();}
    Square(double side){super(side,side);}
    Square(double side,String color,boolean filled)
    {
        super(side,side,color,filled);
    }
}
