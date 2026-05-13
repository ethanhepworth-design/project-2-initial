package com.csc205.project2.shapes;

/**
 * Cube class representing a 3D cube shape.
 * Volume = s^3
 * Surface Area = 6 * s^2
 */
public class Cube extends Shape3D {
    
    private double side;
    
    public Cube() {
        super();
        this.side = 0;
    }
    
    public Cube(String name, String color, double side) {
        super(name, color);
        setSide(side);
    }
    
    public double getSide() { return side; }
    public void setSide(double side) {
        if (side < 0) throw new IllegalArgumentException(\"Side cannot be negative\");
        this.side = side;
    }
    
    @Override
    public double getVolume() {
        return Math.pow(side, 3);
    }
    
    @Override
    public double getSurfaceArea() {
        return 6 * Math.pow(side, 2);
    }
    
    @Override
    public String toString() {
        return String.format(\"Cube {name='%s', color='%s', side=%.1f}\", 
            getName(), getColor(), side);
    }
}
