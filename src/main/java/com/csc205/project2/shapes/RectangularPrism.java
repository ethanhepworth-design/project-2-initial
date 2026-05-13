package com.csc205.project2.shapes;

/**
 * RectangularPrism class representing a 3D rectangular prism shape.
 * Volume = l * w * h
 * Surface Area = 2 * (lw + lh + wh)
 */
public class RectangularPrism extends Shape3D {
    
    private double length;
    private double width;
    private double height;
    
    public RectangularPrism() {
        super();
        this.length = 0;
        this.width = 0;
        this.height = 0;
    }
    
    public RectangularPrism(String name, String color, double length, double width, double height) {
        super(name, color);
        setLength(length);
        setWidth(width);
        setHeight(height);
    }
    
    public double getLength() { return length; }
    public void setLength(double length) {
        if (length < 0) throw new IllegalArgumentException(\"Length cannot be negative\");
        this.length = length;
    }
    
    public double getWidth() { return width; }
    public void setWidth(double width) {
        if (width < 0) throw new IllegalArgumentException(\"Width cannot be negative\");
        this.width = width;
    }
    
    public double getHeight() { return height; }
    public void setHeight(double height) {
        if (height < 0) throw new IllegalArgumentException(\"Height cannot be negative\");
        this.height = height;
    }
    
    @Override
    public double getVolume() {
        return length * width * height;
    }
    
    @Override
    public double getSurfaceArea() {
        return 2 * ((length * width) + (length * height) + (width * height));
    }
    
    @Override
    public String toString() {
        return String.format(\"RectangularPrism {name='%s', color='%s', length=%.1f, width=%.1f, height=%.1f}\", 
            getName(), getColor(), length, width, height);
    }
}
