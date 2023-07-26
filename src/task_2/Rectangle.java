package task_2;

import java.util.Scanner;

public class Rectangle {
    public double side1;
    public double side2;

    static double areaCalculator(double side1, double side2) {return side1 * side2;}

    static double perimeterCalculator(double side1, double side2) {return 2 * (side1 + side2);}


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите длину стороны один: ");
        double side1 = in.nextDouble();
        System.out.print("Введите длину стороны два: ");
        double side2 = in.nextDouble();

        Rectangle rectangle = new Rectangle();
        double areaCalculator = rectangle.areaCalculator(side1, side2);
        System.out.println("Площадь прямоугольника: " + areaCalculator);

        double perimeterCalculator = rectangle.perimeterCalculator(side1, side2);
        System.out.println("Периметр прямоугольника: " + perimeterCalculator);

    }

}
