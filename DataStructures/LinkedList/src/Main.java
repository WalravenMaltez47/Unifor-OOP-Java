public class Main {
public static void main(String[] args) {
    LinkedList<Integer> lista = new LinkedList<>();

    lista.add(1);
    System.out.println(lista);

    lista.add(2);
    System.out.println(lista);

    lista.add(3);
    System.out.println(lista);

    lista.clean();
    System.out.println(lista);

}
}
