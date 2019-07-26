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

        Point d = new Point();

        System.out.println("Distance = "+ distance());

    }

    public static void hello1(){
        String smb = "World";
        System.out.println("Hello " + smb);
    }

    public static void hello2(String smb){
        System.out.println("Hello " + smb);
    }

    public static double distance{
        int p1, p2;
        double sqrt = Math.sqrt(p1, p2);
        return sqrt;
    }






}