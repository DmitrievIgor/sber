import java.io.IOException;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;

public class CityUtils {
    public static void initialize(List<City> cityList) {
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

        } catch (IOException e) {
            System.out.println("IOException");
        }
    }

    public static void sortByName(List<City> cityList) {
        cityList.stream().sorted((city1, city2) -> city1.getName().compareTo(city2.getName())).forEach(System.out::println);
    }

    public static void sortByDistrictAndName(List<City> cityList) {
        cityList.stream().sorted((city1, city2) -> {
            if (city1.getDistrict().compareTo(city2.getDistrict()) == 0) {
                return city1.getName().compareTo(city2.getName());
            }
            return city1.getDistrict().compareTo(city2.getDistrict());
        }).forEach(System.out::println);
    }

    public static void mostPopulation(List<City> cityList) {
        Integer[] cityArray = cityList.stream().map(City::getPopulation).toArray(Integer[]::new);
        int maxPopulation = Arrays.stream(cityArray).max(Comparator.naturalOrder()).get();


        int index = 0;
        for (int i = 0; i < cityArray.length; i++) {
            if (cityArray[i] == maxPopulation) {
                index = i;
            }

        }
        System.out.println("[" + index + "] = " + maxPopulation);
    }

    public static void countCityInDistrict(List<City> cityList) {
        Map<String, Integer> mapCity = cityList.stream().collect
                (Collectors.toMap(City::getDistrict,city -> 1,Integer::sum));

        mapCity.forEach((key,value)->System.out.printf("%s - %d%n",key,value));

    }
}
