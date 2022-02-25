package com.csc205.project2;

public class RectangularPrism {

    double length;
    double width;
    double height;

    public RectangularPrism(double length, double width, double height) {
        super();
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public double setLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double setWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double setHeight() {
        return height;
    }

    double surfaceArea() {
        return 2.0 * (width*length + height*length + height*width);
    }

    public double volume() {
        return width * length * height;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rectangular Prism {");
        sb.append("length = ").append(length);
        sb.append(", width = ").append(width);
        sb.append(", height = ").append(height);
        sb.append(", surface area = ").append(surfaceArea());
        sb.append(", volume = ").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
