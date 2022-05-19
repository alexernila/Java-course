public class Cylinder extends Circle{
    double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
        if(height<0){
            this.height = 0;
        }
    }

    public double getHeight(){
        return this.height;
    }

    public double getVolume(){
        return getArea()*getHeight();
    }
}
