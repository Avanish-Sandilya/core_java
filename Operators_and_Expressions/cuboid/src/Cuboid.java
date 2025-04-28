public class Cuboid {
    private final double length;
    private final double breadth;
    private final double height;

    public Cuboid(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }

    public double getHeight() {
        return height;
    }

    public String volume(){
        double vol=length*breadth*height;
        return String.format("%.2f",vol);
    }
}
