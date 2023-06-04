public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora(4,2);
        calculadora.divisao(calculadora);

        calculadora.setN2(0);
        calculadora.divisao(calculadora);
    }
}