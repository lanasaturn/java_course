package test.qa;

public class MyFirstProgram {
    public static void main(String[] args) {
        System.out.println("Hello world, little bitches");
        hello1();
        hello2("bitch!");

        double side = 5;
        System.out.println("Квадрат имеет сторону: side = "+ side +". Его площадь: S = " + area(side) );
        double k,l;
        k= 5;
        l=6;
        System.out.println("Прямоугольник имеет стороны: "+ k +" и  "+ l +". Его площадь: S = " + area(k,l) );
    }
    //void - значит функция ничего не возвращает
    public static void hello1(){
        String smb = "World";
        System.out.println("Hello " + smb);
    }
    public static void hello2(String smb){
        System.out.println("Hello " + smb);
    }
    //Тут функция возвращает значение n
    public static double area(double n){
        return n*n;
    }
    public static double area (double a, double b){
        return a * b;
    }


}