import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         try (Scanner sc = new Scanner(System.in)) {
            ArrayList<Integer> arrayList = new ArrayList<>();

            System.out.println("Digite o numero de repeticoes");
            int loop = sc.nextInt();

            for (int i = 0; i < loop; i++) {
                System.out.println("Digite um valor qualquer");
                int s = sc.nextInt();
                arrayList.add(s);
            }
        
            arrayList.remove(1);

            System.out.println("============");
            System.out.println();

            for (int i = 0; i < arrayList.getSize(); i++) {
                System.out.println(arrayList.get(i));
            }

            arrayList.set(10, 1);

            System.out.println("============");
            System.out.println();  

            
            for (int i = 0; i < arrayList.getSize(); i++) {
                System.out.println(arrayList.get(i));
            }
        }
    }
}