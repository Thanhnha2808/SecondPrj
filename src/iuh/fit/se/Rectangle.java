package iuh.fit.se;

import java.util.Scanner;

/**
 * @description:
 * @author: Thanh Nha
 * @version: 1.0
 * @created: 8/23/2024 9:15 PM
 */

public class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
        this.length = 0;
        this.width = 0;
    }

    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    public void setLength(double length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Length must be greater than 0");
        }
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        if (width <= 0) {
            throw new IllegalArgumentException("Width must be greater than 0");
        }
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public double getArea() {
        return length * width;
    }

    @Override
    public String toString() {
        return String.format("Rectangle[length=%.2f, width=%.2f]", length, width);
    }

    // Phương thức main để chạy chương trình
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the length of the rectangle: ");
            double length = scanner.nextDouble();

            System.out.print("Enter the width of the rectangle: ");
            double width = scanner.nextDouble();

            Rectangle rectangle = new Rectangle(length, width);

            System.out.printf("Perimeter: %.2f%n", rectangle.getPerimeter());
            System.out.printf("Area: %.2f%n", rectangle.getArea());
            System.out.println(rectangle);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}