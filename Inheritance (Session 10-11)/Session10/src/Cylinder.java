public class Cylinder extends Circle{
    private double Height;
    Cylinder()
    {
        this.Height = 1.0;
    }
    Cylinder(double height)
    {
        this.Height = height;
    }
    Cylinder(double height,double radius)
    {
        super(radius);
        this.Height = height;
    }
    Cylinder(double height,double radius,String color)
    {
        super(radius,color);
        this.Height = height;
    }
    public double getHeight()
    {
        return this.Height;
    }
    public void setHeight(double height)
    {
        this.Height = height;
    }
    public double getVolume()
    {
        return super.getArea()*this.getHeight();
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+"Cylinder{" +
                "Height=" + Height +
                "  Volume=" + this.getVolume() +
                '}';
    }
}
