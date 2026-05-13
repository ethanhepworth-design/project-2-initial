package com.csc205.project2.shapes;

/**
 * Abstract base class for all 3D shapes.
 */
public abstract class Shape3D implements ThreeDimensionalShape {
    
    private String name;
    private String color;
    
    public Shape3D() {
        this.name = \"\";
        this.color = \"\";
    }
    
    public Shape3D(String name, String color) {
        this.name = name;
        this.color = color;
    }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    
    @Override
    public String toString() {
        return String.format(\"%s {name='%s', color='%s'}\", 
            getClass().getSimpleName(), name, color);
    }
}
