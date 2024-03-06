import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         try (Scanner sc = new Scanner(System.in)) {
            ArrayList<String> arrayList = new ArrayList<>();

            System.out.println("Digite o numero de repeticoes");
            int loop = sc.nextInt();

            for (int i = 0; i < loop; i++) {
                System.out.println("Digite uma String qualquer");
                String s = sc.next();
                arrayList.add(s);
            }

            arrayList.remove(arrayList.getSize()-1);

            for (int i = 0; i < arrayList.getSize(); i++) {
                System.out.println(arrayList.get(i));
            }
        }
        }
    }
