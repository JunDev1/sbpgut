import java.sql.SQLOutput;
import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        double pi = 3.14;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение радиуса: ");
        int r = in.nextInt();
        double square = pi * Math.pow(r,2);
        System.out.println("Площадь круга равна: ");
        System.out.println(square);
    }
}
