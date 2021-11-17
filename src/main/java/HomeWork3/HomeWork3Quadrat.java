package HomeWork3;
import java.util.Scanner;

public class HomeWork3Quadrat {

    /* Вычисление корней квадратного уравнения */
    /*Условие: Метод принимает в качестве аргументов коэффициенты a, b, c квадратного уравнения (a*x^+b*x+c=0) */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Дано квадратное уравнение (a*x^+b*x+c=0)");
        System.out.print("Введите значение a: ");
        int a = scanner.nextInt();
        System.out.print("Введите значение b: ");
        int b = scanner.nextInt();
        System.out.print("Введите значение c: ");
        int c = scanner.nextInt();
        System.out.println("Дискриминат D = b * b - 4 * a * c");
        System.out.println("корень уравнения x1 = -b + √D / 2*a");
        System.out.println("корень уравнения x2 = -b + √D / 2*a");
        int d = b * b - 4 * a * c;
        double x1 = (-b - Math.sqrt(d)) / (2 * a);
        double x2 = (-b + Math.sqrt(d)) / (2 * a);
        if (x1 == 0) {
            System.out.println("Первый коэффициент не может быть 0");
        } else if (d > 0) {
            System.out.println("X1 = " + x1);
            System.out.println("X2 = " + x2);
        } else if (d < 0) {
            System.out.println("Нет действительных решений уравнения");
        } else {
            System.out.println("Первый коэффициент не может быть 0");
        }
    }
}
