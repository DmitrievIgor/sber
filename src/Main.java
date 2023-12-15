import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        List<City> cityList = new ArrayList<>();
        try (Scanner scanner = new Scanner(Path.of(".\\Задача ВС Java Сбер.txt"))) {
            City city;
            while (scanner.hasNext()) {
                String str = scanner.nextLine();
                String[] strings = str.split("\t");
                city = new City(Integer.parseInt(strings[0]), strings[1], strings[2], strings[3], Integer.parseInt(strings[4]));
                if (strings.length == 6) {
                    city.setFoundation(strings[5]);
                } else {
                    city.setFoundation("Неизвестно");
                }
                cityList.add(city);
            }
            cityList.forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("IOException");
        }

    }
}