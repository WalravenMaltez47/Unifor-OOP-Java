import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] array = new String[10];
        ArrayList arrayList = new ArrayList(array);

        System.out.println("Digite o numero de repeticoes");
        int loop = sc.nextInt();

        for (int i = 0; i < loop; i++) {
            System.out.println("Digite uma String qualquer");
            String s = sc.next();
            arrayList.add(s);
        }

        arrayList.removeArrayIndexValue(arrayList.getSize()-1);

        for (int i = 0; i < arrayList.getSize(); i++) {
            System.out.println(arrayList.getArrayIndexValue(i));
        }
    }
}