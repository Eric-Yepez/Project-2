package com.csc205.project2;

public class Sphere {

    double radius;

    public Sphere(double radius) {
        super();
        this.radius = radius;
    }

    public double getRadius() {

        return radius;
    }

    public void setRadius(double radius) {

        this.radius = radius;
    }

    double surfaceArea() {

        return 22.0*4.0;
    }

    double volume() {

        return 4.0/3.0*22.0/7.0*radius*radius*radius;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Sphere {");
        sb.append("radius = ").append(radius);
        sb.append(", surface area = ").append(surfaceArea());
        sb.append(", volume = ").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
