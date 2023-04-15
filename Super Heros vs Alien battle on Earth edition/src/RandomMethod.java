import java.util.Random;
public class RandomMethod {
    public int gerarNumeroAleatorio() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }
}

