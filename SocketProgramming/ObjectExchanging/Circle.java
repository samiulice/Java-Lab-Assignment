package ObjectExchanging;

import java.io.Serializable;

public class Circle implements Serializable {
    double radius;
    Circle(double radius){
        this.radius = radius;
    }
    Circle(){
        this.radius = 1.0;
    }
    public double area(){
        return this.radius*this.radius*Math.PI;
    }
    public static double circumference(double radius){
        return 2*Math.PI*radius;
    }
}
