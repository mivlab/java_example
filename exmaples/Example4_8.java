
class Circle {
    double radius,area;
    Circle(double r){
        radius = r;
    }
    void setRadius(double r) {
        radius=r;
    }
    double getRadius() {
        return radius;
    }
    double getArea(){
        area=3.14*radius*radius;
        return area;
    }
}

class Circular {
    Circle bottom;
    double height;
    void setBottom(Circle c) {
        bottom = c;
    }
    void setHeight(double h) {
        height = h;
    }
    double getVolume() {
        if(bottom == null)
            return -1;
        else
            return bottom.getArea()*height/3.0;
    }
    double getBottomRadius() {
        return bottom.getRadius();
    }
    public void setBottomRadius(double r){
        bottom.setRadius(r);
    }
}
public class Example4_8 {
    public static void main(String args[]) {
        Circle circle = new Circle(1);
        Circular circular = new Circular();
        circular.setHeight(1);
        circular.setBottom(circle);
        System.out.println("圆锥体积：" + circular.getVolume());
        circle.setRadius(2);
        System.out.println("圆锥体积：" + circular.getVolume());
        circle = new Circle(1);
        System.out.println("圆锥体积：" + circular.getVolume());
    }
}
