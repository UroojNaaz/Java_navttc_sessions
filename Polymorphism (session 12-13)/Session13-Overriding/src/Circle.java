public class Circle {
    private double Radius;
    Circle(){ this.Radius = 1.0; }
    Circle(double radius){ this.Radius = radius; }
    public double getRadius(){ return this.Radius;}
     public double getArea(){
        return  Math.PI*(this.getRadius()*this.getRadius());
    }

    @Override
    public String toString() {
        return "Circle{" +
                " Radius=" + Radius +
                " Area=" + this.getArea() +
                '}';
    }
}
class Cylinder extends Circle
{
    private double Height;
    Cylinder(){
        this.Height = 1.0;
    }
    Cylinder(double height,double radius)
    {
        super(radius);
        this.Height = height;
    }
    public double getHeight(){ return this.Height; }
    public  double getVolume(){ return this.getHeight()*this.getRadius()*this.getRadius(); }

    @Override
    public double getArea()
    {
        return (2*Math.PI*super.getRadius()*this.getHeight())+(2*super.getArea());
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                " Height=" + this.getHeight() +
                " Area=" + this.getArea() +
                " Volume=" + this.getVolume() +
                '}';
    }
}
