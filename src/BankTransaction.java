import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BankTransaction {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Выберите регион:");
        System.out.println("1 - Москва");
        System.out.println("2 - Нью-Йорк");
        int region = scanner.nextInt();


        ZoneId zoneId;
        if (region == 1) {
            zoneId = ZoneId.of("Europe/Moscow");
        } else if (region == 2) {
            zoneId = ZoneId.of("America/New_York");
        } else {
            System.out.println("Некорректный выбор региона!");
            return;
        }


        System.out.print("Введите ваше имя: ");
        String firstName = scanner.next();
        System.out.print("Введите вашу фамилию: ");
        String lastName = scanner.next();


        System.out.print("Введите сумму перевода: ");
        double amount = scanner.nextDouble();


        LocalDateTime time = LocalDateTime.now(zoneId);


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        System.out.println("------ Чек ------");
        System.out.println("Время: " + formatter.format(time));
        System.out.println("Сумма: " + amount);
        System.out.println("Отправитель: " + firstName.charAt(0) + ". " + lastName.charAt(0) + ".");
    }
}