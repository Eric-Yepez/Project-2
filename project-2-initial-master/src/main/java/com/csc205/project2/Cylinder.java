package com.csc205.project2;

public class Cylinder {

    double radius;
    double height;
    public Cylinder(double radius, double height) {
        super();
        this.radius = radius;
        this.height = height;
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

    double surfaceArea() {
        return 2.0*22/7*radius*(radius + height);
    }

    double volume() {
        return 22/7*radius*radius*height;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cylinder {");
        sb.append("radius = ").append(radius);
        sb.append(", surface area = ").append(surfaceArea());
        sb.append(", volume = ").append(volume());
        sb.append(", height = ").append(height);
        sb.append('}');
        return sb.toString();
    }
}
