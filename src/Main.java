import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> cities = new ArrayList<>();
        String[] citiesArray = new String[] {"Boston", "New York", "Warsaw", "Boston", "Alicante"};
        Collections.addAll(cities, "Boston", "New York", "Warsaw", "Boston", "Alicante");

        for (String city :
                cities) {
            System.out.println(city);
            System.out.println(cities.indexOf(city));
        }

        List<String> anotherList = Arrays.asList(citiesArray);

        for (String city :
                cities) {
            System.out.println(city);
            System.out.println(anotherList.indexOf(city));
        }

        Scanner scanner = new Scanner(System.in);
        Map<String, String> citiesMap = new HashMap<>();

        for (String city :
                cities) {
            System.out.printf("Please provide country for %s \n", city);
            String country = scanner.nextLine();
            citiesMap.put(city, country);
        }

        for (Map.Entry<String, String> set:
                citiesMap.entrySet()) {
            System.out.println(set.getKey() + " " + set.getValue());
        }

    }
}