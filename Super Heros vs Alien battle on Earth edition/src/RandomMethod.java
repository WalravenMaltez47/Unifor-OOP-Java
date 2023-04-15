import java.util.Random;
public class RandomMethod {
    public int gerarNumeroAleatorio() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }

   /* // Uma outra forma de fazer caso queira escolher os valores de cada face do dado e seu tamanho.

   int[] numeros = {1,2,3,4,5,6};
    public int gerarNumeroAleatorio() {
        Random random = new Random();
        int comprimento = random.nextInt(numeros.length);
        return numeros[comprimento];
    } */
}

