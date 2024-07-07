import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();

        if (a == b) {
            System.out.println("Числа идентичны");
        } else {
            System.out.println("Числа неидентичны");
        }

        scanner.close();
    }
}
