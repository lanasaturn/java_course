package test.qa;

public class HomeTrying {
    public static void main(String[] args) {
        Point p1 = new Point(7,3);
        Point p2 = new Point(2.,6);
        System.out.println("Вариант  1:");
        System.out.println(Math.sqrt(Math.pow((p2.x-p1.x),2)+Math.pow((p2.y-p1.y),2)));
        System.out.println();
        System.out.println("Вариант 2:");
        System.out.println(distance(p1, p2));
        System.out.println();
        System.out.println("Вариант 3:");
        System.out.println(p1.distance(p2));
    }
    public static double distance(Point p1, Point p2){
        double m1 = p2.x - p1.x;
        double m2 = p2.y - p1.y;
        return(Math.sqrt(Math.pow(m1, 2) + Math.pow(m2, 2)));
    }
}

