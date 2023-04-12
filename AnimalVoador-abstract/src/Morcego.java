public class Morcego extends Animal {
    @Override
    public void voar() {
        System.out.println("bat is flying!"); // changes have been made here
    }
    @Override
    public String getCor() {
        return "morcego tem a cor "+cor;
    }
}
