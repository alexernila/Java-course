public class Point {
    private int x;
    private int y;

    public Point(){
        this(0, 0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
//        (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
//        xA=this.x, yA = this.y
//        xB= 0, yB=0
        double disX = -this.x;
        double disY = -this.y;
        return Math.sqrt((disX)*(disX) + (disY)*(disY));
    }
    public double distance(int x, int y){
        double disX = x-this.x;
        double disY = y-this.y;
        return Math.sqrt((disX)*(disX) + (disY)*(disY));
    }
    public double distance(Point point){
        double disX = point.getX()-this.x;
        double disY = point.getY()-this.y;
        return Math.sqrt((disX)*(disX) + (disY)*(disY));
    }
}
