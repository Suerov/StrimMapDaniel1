import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(1, 2, 3, 4, 5);
        integerList.stream().map(x -> x * x).forEach(System.out::println);
    }
}