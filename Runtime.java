package PAVANSIR;
import java.util.Scanner;

public class Runtime {

    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        while (flag) {

            System.out.println("Enter your choice:");
            System.out.println("1. Triangle");
            System.out.println("2. Circle");
            System.out.println("3. Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1: {
                    System.out.println("Enter height:");
                    int height = sc.nextInt();

                    System.out.println("Enter breadth:");
                    int breadth = sc.nextInt();

                    Shape s = new Triangle(height, breadth);
                    s.Area();
                    break;
                }

                case 2: {
                    System.out.println("Enter radius:");
                    int radius = sc.nextInt();

                    Shape s = new Circle(radius);
                    s.Area();
                    break;
                }

                case 3: {
                    flag = false;
                    System.out.println("Program exited");
                    break;
                }

                default:
                    System.out.println(
                        "Enter a valid choice"
                    );
            }
        }

        sc.close();
    }
}

class Shape {

    public void Area() {
        System.out.println("Choose one shape");
    }
}

class Circle extends Shape {

    int r;
    double pi = 3.14;

    Circle(int r) {
        this.r = r;
    }

    @Override
    public void Area() {
        System.out.println("Area of Circle = " + (pi * r * r));
    }
}

class Triangle extends Shape {

    int height;
    int breadth;

    Triangle(int height, int breadth) {
        this.height = height;
        this.breadth = breadth;
    }

    @Override
    public void Area() {
        System.out.println(
            "Area of Triangle = " + (0.5 * height * breadth)
        );
    }
}
