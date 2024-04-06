public class Main {
    public static void main(String[] args) {
        System.out.println(div(10, 2));
        
    }

    public static int div(int divedendo, int divisor) {
        if(divedendo < divisor){
            return 0;
        }
        
        return 1 + div(divedendo-divisor, divisor);
    }
}
