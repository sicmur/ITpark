package HomeWork2;

public class HomeWork2 {

    public static void main(String[] args) {
        int summa = summa(459, 896);
        System.out.println(summa);
        int minus = minus(239, 153);
        System.out.println(minus);
        int multi = multi(69);
        System.out.println(multi);
        int devide = devide(7);
        System.out.println(devide);
        System.out.println(lawOm(16, 4));
    }

    public static int summa(int arg1, int arg2) {
        return arg1 + arg2;
    }

    public static int minus(int arg1, int arg2) {
        return arg1 - arg2;
    }

    public static int multi(int arg1) {
        return arg1 * 81;
    }

    public static int devide(int arg2) {
        return 986 / arg2;
    }

    public static int lawOm(int resistance, int voltage) {
        return resistance / voltage;
    }

}
