public class Cachorro extends Animal {
    public void emitirSom() {
        System.out.printf("au");
    }

    // override
    public String sleepPlace() {
        return ("Estou dormindo como um Cachorro");
    }
    //
}
