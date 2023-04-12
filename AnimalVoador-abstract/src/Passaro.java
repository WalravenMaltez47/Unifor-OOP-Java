public class Passaro extends Animal{
    @Override
    public void voar() {
        System.out.println("bird is flying");
    }
    @Override
    public String getCor() {
        return "Passaro tem a cor "+cor;
    }
}
