package test.qa;

public class Rectangle {
    public double a;
    public double b;
    public Rectangle(double a, double b) {
        //вот объект
        this.a = a;
        this.b = b;
    }
    //функция
    public double area (){
        //через this делается ссылка на объект
        return this.a * this.b;
    }
}
