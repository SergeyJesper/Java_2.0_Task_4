import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Zyablitsev Sergey
 * task 4.2
 */

public class MainClassPresents {

    public static void main(String[] args) throws IOException {

        ArrayList<AbstractClassPresents> arrayList = new ArrayList<>();
        double fullprice = 0;
        double fullweight = 0;
        boolean check = false;
        int sweety;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Выберите товар, который нужно добавить в подарок:");
        System.out.println("'1' - медовый пряник \"Медовый\"");
        System.out.println("'2' - конфеты \"Шоколадные\"");
        System.out.println("'3' - конфеты жевательные \"Жевалка\"");
        System.out.println("'4' - закончить сборку подарка");
        while (!check){
            String choise = reader.readLine();
            switch (choise){
                case "1":
                    HoneyCake cake = new HoneyCake("Медовый", 45.00, 100, "Сладости и радости");
                    arrayList.add(cake);
                    fullprice = fullprice + cake.getPrice();
                    fullweight = fullweight + cake.getWeight();
                    System.out.println("медовый пряник \"Медовый\" добавлен в подарок");
                    break;
                case "2":
                    Candy candy = new Candy();
                    candy.setPrice(30.0);
                    candy.setTitle("Шоколадные");
                    candy.setWeight(10.0);
                    System.out.println("Какая сладость в конфетах?: 1 - слабая, 2 - средняя, 3 - самая сладкая");
                    Scanner scanner = new Scanner(System.in);
                    sweety = scanner.nextInt();
                    if (sweety == 1){
                        candy.setA(Sweetness.LOW);
                    }
                    else if (sweety == 2){
                        candy.setA(Sweetness.MEDIUM);
                    }
                    else if (sweety == 3){
                        candy.setA(Sweetness.HIGH);
                    }
                    arrayList.add(candy);
                    fullprice = fullprice + candy.getPrice();
                    fullweight = fullweight + candy.getWeight();
                    System.out.println("Конфеты \"Шоколадные\" добавлено в подарок");
                    break;
                case "3":
                    Jellybean jellybean = new Jellybean("Жевалка", 10.0, 15.0, "прямоугольная");
                    arrayList.add(jellybean);
                    fullprice = fullprice + jellybean.getPrice();
                    fullweight = fullweight + jellybean.getWeight();
                    System.out.println("Жевательные конфеты \"Жевалка\" добавлено в подарок");
                    break;
                case "4":
                    check = true;
                    break;
            }
        }

        System.out.println("Общий вес подарка: " + fullweight + " " + "Общая цена подарка: " + fullprice + " руб.");
        System.out.println("\nВаш собранный подарок: ");
        for (AbstractClassPresents array: arrayList ) {
            System.out.println(array.getTitle() + " (штука)");

        }

    }
}
