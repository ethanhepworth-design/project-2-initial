package com.csc205.project2.shapes;

/**
 * Cylinder class representing a 3D cylinder shape.
 * Volume = PI * r^2 * h
 * Surface Area = 2 * PI * r * (r + h)
 */
public class Cylinder extends Shape3D {
    
    private double radius;
    private double height;
    
    public Cylinder() {
        super();
        this.radius = 0;
        this.height = 0;
    }
    
    public Cylinder(String name, String color, double radius, double height) {
        super(name, color);
        setRadius(radius);
        setHeight(height);
    }
    
    public double getRadius() { return radius; }
    public void setRadius(double radius) {
        if (radius < 0) throw new IllegalArgumentException(\"Radius cannot be negative\");
        this.radius = radius;
    }
    
    public double getHeight() { return height; }
    public void setHeight(double height) {
        if (height < 0) throw new IllegalArgumentException(\"Height cannot be negative\");
        this.height = height;
    }
    
    @Override
    public double getVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }
    
    @Override
    public double getSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }
    
    @Override
    public String toString() {
        return String.format(\"Cylinder {name='%s', color='%s', radius=%.1f, height=%.1f}\", 
            getName(), getColor(), radius, height);
    }
}
