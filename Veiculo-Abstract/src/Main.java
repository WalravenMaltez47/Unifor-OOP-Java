public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Moto moto = new Moto();
        Onibus onibus = new Onibus();

        carro.acelerar();
        moto.acelerar();
        onibus.acelerar();
        onibus.pegarPassageiros();
    }
}