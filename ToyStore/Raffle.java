package ToyStore;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.Scanner;

public class Raffle {

    private static ArrayList<Toy> toys = new ArrayList<>();
    private static PriorityQueue<Toy> prizes = new PriorityQueue<>();

    private static int idCounter = 0;

    public void addToy() {
        Scanner scan = new Scanner(System.in);
        String title;
        int frequency;
        while (true) {
            System.out.print(" Введите название: ");
            title = scan.nextLine();
            if (title.isEmpty()) {
                System.out.println("Некоректный ввод! Попробуйте еще..");
                break;
            }
            System.out.print("Введите частоту выпадения: ");
            String value = scan.nextLine();
            if (isDigit(value)) {
                frequency = Integer.parseInt(value);
                if (frequency <= 0) {
                    System.out.println("Некоректный ввод! Попробуйте еще..");
                } else {
                    Toy toy = new Toy(idCounter, title, frequency);
                    if (!toys.contains(toy) || toys.size() == 0) {
                        idCounter++;
                        toys.add(toy);
                        System.out.println("Новая игрушка успешно добавлена!");
                    } else {
                        System.out.println("Данная игрушка уже находится в призовом фонде лотереи");
                    }
                }
            } else {
                System.out.println("Некоректный ввод! Попробуйте еще..");
            }
            break;
        }
    }

    public void setFrequency() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Toy ID: ");
        String value = scan.nextLine();
        if (isDigit(value)) {
            int selectedId = Integer.parseInt(value);
            if (selectedId >= 0 && selectedId < toys.size()) {
                System.out.println("Игрушка " + toys.get(selectedId).getToyTitle() +
                        " имеет частоту побед " + toys.get(selectedId).getToyVictoryFrequency());
                System.out.print("Введите новую частоту выпадения: ");
                value = scan.nextLine();
                if (isDigit(value)) {
                    int newFrequency = Integer.parseInt(value);
                    toys.get(selectedId).setToyVictoryFrequency(newFrequency);
                    System.out.println("Частота выпадения успешно изменена!");
                } else {
                    System.out.println("Некоректный ввод! Попробуйте еще..");
                }
            } else {
                System.out.println("Увы, в призовом фонде нет игрушки с введенным ID");
            }
        } else {
            System.out.println("Некоректный ввод! Попробуйте еще..");
        }
    }

    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public Toy getPrize() {
        if (prizes.size() == 0) {
            Random random = new Random();
            for (Toy toy : toys) {
                for (int i = 0; i < toy.getToyVictoryFrequency(); i++) {
                    Toy temp = new Toy(toy.getToyId(), toy.getToyTitle(), random.nextInt(1, 10));
                    prizes.add(temp);
                }
            }
        }
        return prizes.poll();
    }

    public void raffle() {
        if (toys.size() >= 2) {
            Toy prize = getPrize();
            System.out.println("Prize: " + prize.getToyTitle());
            saveResult(prize.getInfo());
        } else {
            System.out.println("В призовой фонд необходимо добавить как минимум 2 игрушки.");
        }
    }

    private void saveResult(String text) {
        File file = new File("RaffleRes.txt");
        try {
            file.createNewFile();
        } catch (Exception ignored) {
            throw new RuntimeException();
        }
        try (FileWriter fw = new FileWriter("RuffleRes.txt", true)) {
            fw.write(text + "\n");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
