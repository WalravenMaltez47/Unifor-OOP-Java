public class Main {
    public static void main(String[] args) {
        Morcego morcego = new Morcego();
        Passaro passaro = new Passaro();

        morcego.setIdade(10);
        System.out.println("O morcego tem "+morcego.getIdade()+" anos");

        passaro.setCor("Azul");
        System.out.println(passaro.getCor());

        morcego.voar();
        passaro.voar();
    }
}