public class Square extends Form{
    private float side;

    public Square(){};

    public Square(double side)
    {
        this.side= (float) side;
    }

    public float getArea()
    {
        return side*side;
    }

    public String toString()
    {
        return super.toString();
    };

}
