import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lista {
    static Scanner scanner = new Scanner(System.in);
    String etiqueta;
    String item;
    double valor;
    Integer i;

    public Lista() {

        Map<String, Pedido> pedidoMap = new HashMap<>();
        for (i = 0; i < 2; i++) {

            System.out.println("Etiqueta");
            etiqueta = scanner.next();
            System.out.println("Produto");
            item = scanner.next();
            System.out.println("Price");
            valor = scanner.nextDouble();

            Pedido pedido = new Pedido(etiqueta,item,valor);
            pedidoMap.put(etiqueta, pedido);
        }

        double valorMaximo = Double.NEGATIVE_INFINITY;
        double valorMinimo = Double.POSITIVE_INFINITY;
        for (Pedido price : pedidoMap.values()) {
            if (price.getValor() > valorMaximo) {
                valorMaximo = price.getValor();
            }
            if (price.getValor() < valorMinimo) {
                valorMinimo = price.getValor();
            }
        }
        System.out.println("Valor máximo: " + " US " + valorMaximo);
        System.out.println("Valor mínimo: " + " US " + valorMinimo);

        while (true) {
            System.out.println("Digite a chave do pedido ou 'sair' para sair:");
            String chaveDesejada = scanner.next();
            if (chaveDesejada.equalsIgnoreCase("sair")) {
                break;
            }
            Pedido pedido = pedidoMap.get(chaveDesejada);
            if (pedido != null) {
                System.out.println("Chave do Pedido: " + pedido.getChaveDoPedido());
                System.out.println("Item: " + pedido.getItem());
                System.out.println("Valor: " + pedido.getValor());
            } else {
                System.out.println("Pedido não encontrado.");
            }
        }
    }
}
