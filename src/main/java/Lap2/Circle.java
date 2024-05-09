package Lap2;

public class Circle {
    //properties
    private int x,y,r;

    //constructor
    public Circle(int x, int y, int r) {
        this.x=x;
        this.y=y;
        this.r=r;
    }
    //getter/setter
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
    //methods
    public void show() {
        System.out.println("x = " + x + ";y = " + y + "; r = "
                + r);
    }
    public static void main(String [] args) {
        Circle c1 = new Circle(3,5,6);
        c1.show();
        Circle c2 = new Circle(4,5,8);
        c2.show();
    }
}
