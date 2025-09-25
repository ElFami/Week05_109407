public class SquareTugas extends Shape{
    private int side;

    public SquareTugas(int side, String color) {
        super(color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }
    public void setSide(int side) {
        this.side = side;
    }
    public double getPerimeter(){
        return side * 4;
    }

    public double getArea(){
        return  side*side;
    }
}
