import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите возраст: ");
        int age = scan.nextInt();
        scan.close();

        if (age < 0) {
            System.out.println("Неверный возраст");
        } else if (age < 18) {
            System.out.println("Вы еще несовершеннолетний");
        } else {
            System.out.println("Вы стали взрослым");
        }
    }
}