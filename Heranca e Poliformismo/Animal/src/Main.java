public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();

        cachorro.setNome("Jade"); System.out.println(cachorro.getNome());
        cachorro.emitirSom();

        System.out.println(); // Backspace

        System.out.println(cachorro.sleepPlace()); // Com override

        gato.setNome("gg"); System.out.println(gato.getNome());
        gato.emitirSom();

        System.out.println(); // Backspace

        System.out.println(gato.sleepPlace("gato")); // Sem override
    }
}