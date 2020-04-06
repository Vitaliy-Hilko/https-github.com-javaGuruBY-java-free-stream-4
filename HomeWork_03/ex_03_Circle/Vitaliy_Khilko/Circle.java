package CircleDemo;

public class Circle {
    final double PI = 3.1415;
    public int radius;


    Circle(int radius){
        this.radius = radius;
    }

    /* public void setRadius(int radius){
        this.radius = radius;
    }

    public int getRadius(){
        System.out.println(this.radius);
    }  */

    public void calculateArea(int radius){
        double SSS = PI * this.radius;
        System.out.println(SSS);
    }
}
