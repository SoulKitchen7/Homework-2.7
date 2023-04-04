import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> employeeBook = new HashMap<>(Map.of());
        employeeBook.put (1, "David Beckham");
        employeeBook.put (2, "Lionel Messi");
        employeeBook.put (3, "Erling Haaland");
        employeeBook.put (4, "Steven Gerrard");
        employeeBook.put (5, "Zinedine Zidane");

        System.out.println(employeeBook.get(1));
        employeeBook.remove(2);
        System.out.println(employeeBook);
    }
}