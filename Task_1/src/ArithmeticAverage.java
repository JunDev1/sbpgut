import java.util.Scanner;

public class ArithmeticAverage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число");
        int numOne = in.nextInt();
        System.out.println("Введите второе число");
        int numTwo = in.nextInt();
        System.out.println("Введите третье число");
        int numThree = in.nextInt();
        float avg = (float) (numOne + numTwo + numThree) / 3;
        System.out.println("Среднее арифметическое: ");
        System.out.println(avg);
    }
}
