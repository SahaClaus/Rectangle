import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Пожалуйста, введите длину прямоугольника: ");
        double length = scanner.nextDouble();

        System.out.println("Пожалуйста, введите ширину прямоугольника: ");
        double width = scanner.nextDouble();

        double rectangleArea = length * width;
        double rectanglePerimeter = (length + width) * 2;

        System.out.printf("%nДлина: %f%n%nШирина: %f%n%nПлощадь: %f%n%nПериметр: %f%n", length, width, rectangleArea, rectanglePerimeter);
    }
}