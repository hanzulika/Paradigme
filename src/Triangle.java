public class Triangle extends Form{
    private float height;
    private float base;

    public Triangle(){};

    public Triangle(double height,double base)
    {
        this.height= (float) height;
        this.base= (float) base;
    }

    public float getArea()
    {
        return (base*height)/2;
    }

    public String toString()
    {
        return super.toString();
    };

    public boolean equals(Triangle o1)
    {
        return this.getArea() == o1.getArea();
    };
}
