import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class iuser {
    final String menu = "1. Добавить новую игрушку.\n" +
            "2. Загрузить все игрушки.\n" +
            "3. Изменить рейтинг игрушки.\n" +
            "4. Игра.\n" +
            "5. Выход.\n";

    public void menu() throws IOException {
        int id;
        String name;
        int quantity;
        Double wt;
        Scanner iscanner = new Scanner(System.in);
        read rd = new read();
        List<toy> toys = rd.readFile();
        while (true) {
            System.out.println("Выбор");
            System.out.println(menu);
            String choos = iscanner.nextLine();
            if (choos.equals("1")) {
                System.out.println("Создание игрушки");
                while (true) {
                    System.out.println("Название игрушки");
                    name = iscanner.nextLine();
                    if (Checker.isNotEmpty(name)) {
                        break;
                    } else {
                        System.out.println("Попробуйте сновва.");
                    }
                    while (true) {
                        System.out.println("кол-во игрушек: ");
                        String qnt = iscanner.nextLine();
                        if (Checker.isNumeric(qnt)) {
                            quantity = Integer.parseInt(qnt);
                            break;
                        } else {
                            System.out.println("Поробуйте снова.");
                        }

                    }
                    while (true) {
                        System.out.println("Частоту выпадения игрушки(от 0 до 100 %): ");
                        String wt2 = iscanner.nextLine();
                        if (Checker.isReal(wt2) && Checker.isCorrectValue(wt2)) {
                            wt = Double.parseDouble(wt2);
                            break;
                        } else {
                            System.out.println("Поробуйте снова.");
                        }
                    }
                    int lng = toys.size() + 1;
                    toy toy = new toy(lng, name, quantity, wt);
                    game game = new game();
                    game.addToy(toys, toy);

                }
            } else if (choos.equals("2")) {
                if (toys.size() != 0) {
                    pfile.printFile(toys);
                } else {
                    System.out.println("заполните список");
                }
            } else if (choos.equals("3")) {
                if (toys.size() != 0) {
                    while (true) {
                        System.out.println("ID игрушки: ");
                        String numder = iscanner.nextLine();
                        if (Checker.isNumeric(numder) && Integer.parseInt(numder) <= toys.size()) {
                            id = Integer.parseInt(numder);
                            break;
                        } else {
                            System.out.println("Поробуйте снова.");
                        }
                    }
                    while (true) {
                        System.out
                                .println("Введите новое значение частоты выпадания игрушки в процентах от 0 до 100: ");
                        String freaquecyTemp1 = iscanner.nextLine();
                        if (Checker.isReal(freaquecyTemp1) && Checker.isCorrectValue(freaquecyTemp1)) {
                            wt = Double.parseDouble(freaquecyTemp1);
                            break;
                        } else {
                            System.out.println("Поробуйте снова.");
                        }
                    }
                    toys.get(id - 1).setWt(wt);
                } else {
                    System.out.println("список пуст");
                }
            } else if (choos.equals("4")) {
                System.out.println("4");
                game game = new game();
                game.elementWeight(toys);
            } else if (choos.equals("5")) {
                System.out.println("Программа завершила свою работу.");
                if (toys.size() != 0) {
                    save csv = new save();
                    csv.writeResult(toys.get(0), false);
                    toys.remove(0);
                    for (toy item : toys) {
                        csv.writeResult(item, true);
                    }
                    break;
                } else {
                    break;
                }
            } else {
                System.out.println("Некорректный ввод. Попробуйте еще раз");
            }
            
        }
    }
}
