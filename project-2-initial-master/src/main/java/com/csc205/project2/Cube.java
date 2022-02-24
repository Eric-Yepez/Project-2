package com.csc205.project2;

public class Cube extends Sphere{

    double width;

    public Cube(double width) {
        super(width);
    }

    double surfaceArea() {
        return 6.0*width*width;
    }

    double volume() {
        return width*width*width;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cube {");
        sb.append("width = ").append(radius);
        sb.append(", surface area = ").append(surfaceArea());
        sb.append(", volume = ").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
