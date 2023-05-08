public class Pedido {
    String chaveDoPedido;
    String item;
    Double valor;
    public  Pedido (
            String chaveDoPedido,
            String item,
            double valor) {

        this.chaveDoPedido = chaveDoPedido;
        this.item = item;
        this.valor = valor;

    }
    public String getChaveDoPedido() {
        return chaveDoPedido;
    }

    public String getItem() {
        return item;
    }

    public Double getValor() {
        return valor;
    }
}
