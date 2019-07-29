package test.qa;

public class MyFirstProgram {
    public static void main(String[] args) {
        System.out.println("Hello world, little bitches");
        hello1();
        hello2("Alex");

        Square s = new Square(5);
        System.out.println("Сторона квадрата: "+ s.l +". Площадь: " + s.area() );

        Rectangle r = new Rectangle(5,6);
        System.out.println("Прямоугольник: "+ r.a +" и  "+ r.b +". Площадь = " + r.area() );

        System.out.println();
        System.out.println("Задачка про точки");
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

    public static void hello1(){
        String smb = "World";
        System.out.println("Hello " + smb);
    }

    public static void hello2(String smb){
        System.out.println("Hello " + smb);
    }
    public static double distance(Point p1, Point p2){
        double m1 = p2.x - p1.x;
        double m2 = p2.y - p1.y;
        return(Math.sqrt(Math.pow(m1, 2) + Math.pow(m2, 2)));
    }

}