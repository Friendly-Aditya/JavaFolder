public class AreaCalculator {
    public static double area(double radious){
        if (radious <0)
            return -1.0;
        else
            return radious*radious*Math.PI;
    }
    public static double area(double x,double y){
        if (x<0 || y<0)
            return -1.0;
        else
            return x*y;
    }
}
