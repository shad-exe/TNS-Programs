import java.lang.Math;

public class Cylinder {

  private double radius;
  private double height;

  public Cylinder() {
    this.radius = 1.0;
    this.height = 1.0;
  }
  public Cylinder(double radius, double height) {
    this.radius = radius;
    this.height = height;
  }
  public Cylinder(double length, double breadth) {
    this.radius = length / 2.0; 
    this.height = breadth;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public double calculateSurfaceArea() {
    return 2 * Math.PI * radius * (radius + height);
  }

  public double calculateVolume() {
    return Math.PI * radius * radius * height;
  }

  public static void main(String[] args) {

    Cylinder cylinder1 = new Cylinder(5, 10);
    double surfaceArea1 = cylinder1.calculateSurfaceArea();
    double volume1 = cylinder1.calculateVolume();
    System.out.println("Surface area of cylinder1: " + surfaceArea1);
    System.out.println("Volume of cylinder1: " + volume1);

    Cylinder cylinder2 = new Cylinder(5, 5);
    double surfaceArea2 = cylinder2.calculateSurfaceArea();
    double volume2 = cylinder2.calculateVolume();
    System.out.println("Surface area of cylinder2: " + surfaceArea2);
    System.out.println("Volume of cylinder2: " + volume2);
  }
}
