public class Morcego extends Animal {
    @Override
    public void voar() {
        System.out.println("bat is flying");
    }
    @Override
    public String getCor() {
        return "morcego tem a cor "+cor;
    }
}
