class Point
{
    double x;
    double y;
    Point(double x1, double y1)
    {
        x = x1;
        y = y1;
    }
    public String toString()
    {
        return "x = " + x + ",   " + "y = " + y;
    }
}

class TestPoint  {
    public static void main(String args[]) {
        int aa = 0;
        int bb = 1;
        int cc = aa;
        aa = 3;
        System.out.println(aa);
        System.out.println(bb);
        System.out.println(cc);

        Point p1 = new Point(1, 2);
        Point p2 = new Point(2, 3);
        Point p3 = p1;
        p1.x = 0;
        p1.y = 0;
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        String a = "abc";
        String b = "def";
        String c = a;
        a = "ijk";
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        return;
    }
}