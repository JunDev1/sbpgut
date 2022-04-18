import java.util.Scanner;

public class Volume {
    public static void main(String[] args) {
        double pi = 3.14;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите радиус цилиндра: ");
        int r = in.nextInt();
        System.out.println("Введите ширину цилиндра: ");
        int h = in.nextInt();
        double volume = pi * Math.pow(r, 2)* h;
        double square = 2 * pi * r * (r+h);
        System.out.print("Объём цилиндра: ");
        System.out.println(volume);
        System.out.print("Площадь цилиндра: ");
        System.out.println(square);
        ;
    }
}
