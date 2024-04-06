public class Main {
    public static void main(String[] args) {
        System.out.println(elevadoA_N(4));
    }
    public static int elevadoA_N(int N) {
        if (N<=0) {
            return 1;
        }

        return 2 * elevadoA_N(N-1);
    }
}
