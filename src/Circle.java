public class Circle extends Form{
    private float radius;

    public Circle(){};

    public Circle(double radius)
    {
        this.radius=(float) radius;
    }

    public float getArea()
    {
        return (float) (3.14*(radius*radius));
    }

    public String toString()
    {
        return super.toString();
    }
}
