package ToyStore;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Raffle r = new Raffle();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("""
                    Меню:
                    1 - Добавьте новую игрушку.
                    2 - Измените частоту выпадения игрушек.
                    3 - Учавствуйте в лотерее!
                    0 - Выход.
                    >\s""");
            var selection = scanner.next();
            switch (selection) {
                case "1" -> r.addToy();
                case "2" -> r.setFrequency();
                case "3" -> r.raffle();
                case "0" -> {
                    System.out.println("Bye");
                    System.exit(0);
                }
                default -> System.out.println("Неверный выбор операции.");
            }
        }
    }
}
