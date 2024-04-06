public class Main {
    public static void main(String[] args) {
        print0ToN(9);
    }

    public static void print0ToN(int N) {
        if(N<0) {
        return;
       }

       print0ToN(N-1);
       System.out.println(N);
    }
}
