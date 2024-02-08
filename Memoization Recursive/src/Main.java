import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println(fib(9));
    }

    private static final Map<Integer, Integer> cache = new HashMap<>();
    private static int fib(int x) {
        if (x <= 1) { return x; }

        else {
            if (cache.containsKey(x)) { return cache.get(x); }

            int result = fib(x - 1) + fib(x - 2);
            cache.put(x, result);
            return cache.get(x);
        }
    }
}
