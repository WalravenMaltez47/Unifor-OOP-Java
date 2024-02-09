import java.util.HashMap;
import java.util.Map;


public class Main {
   private static Map<Integer, Integer> cacheMap = new HashMap<>();

   // Run
    public static void main(String[] args) {
        System.out.println(sum(9));
    }

    private static int sum(int x) {
        // caso base ou de parada
        if(x<=0) { return 0; }

        else {
            // recarraga o valor armazenado
            if(cacheMap.containsKey(x)) { return cacheMap.get(x); }

            // caso geral ou repetitivo
            int valor = x + sum(x-1);

            // armazena o valor correspondente a uma chave
            cacheMap.put(x, valor);

            return cacheMap.get(x);
        }
    }
}