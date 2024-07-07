import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();
        
        // Сравнение чисел
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }
        
        // Арифметические операции
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        
        if (b != 0) {
            int quotient = a / b;
            System.out.println("Сумма: " + sum);
            System.out.println("Разность: " + difference);
            System.out.println("Произведение: " + product);
            System.out.println("Частное: " + quotient);
        } else {
            System.out.println("Сумма: " + sum);
            System.out.println("Разность: " + difference);
            System.out.println("Произведение: " + product);
            System.out.println("Деление на ноль невозможно");
        }
        
        scanner.close();
    }
}