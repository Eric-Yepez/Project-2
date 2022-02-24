package com.csc205.project2;

public class Cube extends Sphere{

    public Cube(double length) {
        super(length);
    }

    double surfaceArea() {
        return 6.0*radius*radius;
    }

    double volume() {
        return radius*radius*radius;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cube {");
        sb.append("radius = ").append(radius);
        sb.append(", surface area = ").append(surfaceArea());
        sb.append(", volume = ").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
