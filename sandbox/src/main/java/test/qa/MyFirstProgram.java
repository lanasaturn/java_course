package test.qa;

public class MyFirstProgram {
    public static void main(String[] args) {
        System.out.println("Hello world, little bitches");
        hello1();
        hello2("Alex");

        Square s = new Square(5);
        //s.l = 5;

        System.out.println("Квадрат имеет сторону: "+ s.l +". Его площадь: S = " + area(s) );

        Rectangle r = new Rectangle(5,6);
        //r.a= 5;
        //r.b=6;
        System.out.println("Прямоугольник имеет стороны: "+ r.a +" и  "+ r.b +". Его площадь: S = " + area(r) );
    }

    public static void hello1(){
        String smb = "World";
        System.out.println("Hello " + smb);
    }
    public static void hello2(String smb){
        System.out.println("Hello " + smb);
    }

    public static double area(Square s){
        return s.l*s.l;
    }
    public static double area (Rectangle r){
        return r.a * r.b;
    }


}