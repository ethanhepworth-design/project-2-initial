package com.csc205.project2.shapes;

/**
 * Sphere class representing a 3D sphere shape.
 * Volume = (4/3) * PI * r^3
 * Surface Area = 4 * PI * r^2
 */
public class Sphere extends Shape3D {
    
    private double radius;
    
    public Sphere() {
        super();
        this.radius = 0;
    }
    
    public Sphere(String name, String color, double radius) {
        super(name, color);
        setRadius(radius);
    }
    
    public double getRadius() { return radius; }
    public void setRadius(double radius) {
        if (radius < 0) throw new IllegalArgumentException(\"Radius cannot be negative\");
        this.radius = radius;
    }
    
    @Override
    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
    
    @Override
    public double getSurfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
    
    @Override
    public String toString() {
        return String.format(\"Sphere {name='%s', color='%s', radius=%.1f}\", 
            getName(), getColor(), radius);
    }
}
