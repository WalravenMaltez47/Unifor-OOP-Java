import java.util.HashMap;

public class Main {
    private static HashMap<Integer,Integer> cacheMap = new HashMap<>();

    // Run
    public static void main(String[] args) {
        System.out.println(fib(9));
    }

    private static int fib(int x) {
        // caso base ou de parada
        if(x<=1) {return x;}

        else {
            //recarrega o valor armazenado
            if (cacheMap.containsKey(x)) { return cacheMap.get(x); }

            // caso geral ou repetitivo
            int valor = fib(x-1) + fib(x-2);

            cacheMap.put(x, valor);
            return cacheMap.get(x);
        }
    }
}
