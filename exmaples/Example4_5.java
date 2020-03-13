class Rect
{
    double width;  //矩形的宽
    double height; //矩形的高
    Rect(double w, double h){
        width = w;
        height = h;
    }
    double getArea()
    {
        double area=width*height;
        return area;
    }
}
class Lader
{
    double above;  //梯形的上底
    double bottom;
    double height;
    Lader(){
        above = 1; bottom = 1; height = 1;
    }
    Lader(double above1, double bottom1, double height1){
        above = above1;
        bottom = bottom1;
        height = height1;
    }
    double getArea()
    {
        return (above+bottom)*height/2;
    }
}
class Circle1 {
    double radius;
    Circle1(double radius1){
        radius = radius1;
    }
    double getArea() {
        return 3.14 * radius * radius;
    }
}

public class Example4_5  {
    public static void main(String args[]) {
        Rect rectangle = new Rect(109.87, 25.18);
        Lader lader = new Lader(10.798, 156.65, 18.12);
        Lader lader2 = new Lader();
        Circle1 c = new Circle1(2);
        System.out.println("矩形的面积:"+ rectangle.getArea());
        System.out.println("梯形的面积:"+ lader.getArea());
        System.out.println("梯形的面积:"+ lader2.getArea());
        System.out.println("圆的面积：" + c.getArea());
        return;
    }
}