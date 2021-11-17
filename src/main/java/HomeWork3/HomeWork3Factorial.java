package HomeWork3;
/**
 * public static int factoring(int resultFactor) - первый метод;
 * public static long calc(long n) - второй метод.
 */
public class HomeWork3Factorial {

    public static void main(String[] args) {
        System.out.println("Факториал числа n 1! =" + " " + factoring(1));
        System.out.println("Факториал числа n 2! =" + " " + calc(2));
        System.out.println("Факториал числа n 3! =" + " " + calc(3));
        System.out.println("Факториал числа n 4! =" + " " + calc(4));
        System.out.println("Факториал числа n 5! =" + " " + calc(5));
        System.out.println("Факториал числа n 6! =" + " " + calc(6));
        System.out.println("Факториал числа n 7! =" + " " + calc(7));
        System.out.println("Факториал числа n 8! =" + " " + calc(8));
        System.out.println("Факториал числа n 9! =" + " " + calc(9));
        System.out.println("Факториал числа n 10! =" + " " + calc(10));
        System.out.println("Факториал числа n 12! =" + " " + calc(12));
    }

    public static int factoring(int resultFactor) {
        if (resultFactor <= 1) {
            return resultFactor;
        } else {
            return resultFactor * factoring(resultFactor - 1);
        }
        /* по аналогии не работает
        public static long factor(long resultFactorTwo) {
            if (resultFactorTwo <= 1) {
                return (int) resultFactorTwo;
            } else {
                return resultFactorTwo * factor(resultFactorTwo - 1);
            }  */
    }

    public static long calc(long n) {
        if (n <= 1)
            return 1;
        else
            return n * calc(n - 1);
    }
}
