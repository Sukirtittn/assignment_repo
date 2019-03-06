import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q10 {
    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println((Integer) list.stream().filter(e -> e > 5).mapToInt(Integer::intValue).sum());
    }
}
