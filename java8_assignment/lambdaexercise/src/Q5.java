import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
public class Q5 {
    public static void main(String[] args) {
        Consumer<Integer> consumer=e-> System.out.println("consumed: "+e);
        consumer.accept(5);
        Predicate<Integer> predicate=e->e%2!=0;
        System.out.println( predicate.test(7));
        Supplier<Integer> supplier=()->24;
        System.out.println(supplier.get());
        Function<Integer,Integer> function=(a)-> {
          return (supplier.get())+a;
        };
        System.out.println(function.apply(9));
    }
}
