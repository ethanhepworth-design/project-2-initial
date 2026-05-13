package com.csc205.project2.shapes;

/**
 * Cone class representing a 3D cone shape.
 * Volume = (1/3) * PI * r^2 * h
 * Surface Area = PI * r * (r + sqrt(r^2 + h^2))
 */
public class Cone extends Shape3D {
    
    private double radius;
    private double height;
    
    public Cone() {
        super();
        this.radius = 0;
        this.height = 0;
    }
    
    public Cone(String name, String color, double radius, double height) {
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
    
    public double getSlantHeight() {
        return Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
    }
    
    @Override
    public double getVolume() {
        return (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;
    }
    
    @Override
    public double getSurfaceArea() {
        return Math.PI * radius * (radius + getSlantHeight());
    }
    
    @Override
    public String toString() {
        return String.format(\"Cone {name='%s', color='%s', radius=%.1f, height=%.1f}\", 
            getName(), getColor(), radius, height);
    }
}
