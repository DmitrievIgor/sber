import java.io.IOException;
import java.nio.file.Path;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        List<City> cityList = new ArrayList<>();
        CityUtils.initialize(cityList);
//        CityUtils.sortByName(cityList);
//        CityUtils.sortByDistrictAndName(cityList);
        CityUtils.mostPopulation(cityList);
    }

}