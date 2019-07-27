package ru.pft.sandbox;

public class Point {
  public double x;
  public double y;

  public Point (double x, double y){
    this.x = x;
    this.y = y;
  }
  public double distance(double x, double y) {
    double m1 = this.x - x;
    double m2 = this.y - y;
    return (Math.sqrt(Math.pow(m1, 2) + Math.pow(m2, 2)));
  }

  public double distance(Point p) {
    return distance(p.x, p.y);
  }


}
