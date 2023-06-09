import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GerenciadorDeTarefas {
    Scanner scanner = new Scanner(System.in);
    static LocalDate today = LocalDate.now();
    public GerenciadorDeTarefas() throws InterruptedException {

        String name;
        String descricao;

        // Define the Map
        Map<String, Tarefa> mapName = new HashMap<>();

        for (int i = 0; i < 2; i++) {
            System.out.println("===========");
            System.out.println("name:");
            name = scanner.next();
            System.out.println("descricao:");
            descricao = scanner.next();

            // Put the information in mapName
            mapName.put(name,new Tarefa(name,descricao,today));
        }

        Thread.sleep(2000);
        while (true) {
            System.out.println("Pesquisa: 'palavraChave' ");
            System.out.println("Saida: 'sair'");
            name = scanner.next();

            if (name.equalsIgnoreCase("sair")) break;

            Tarefa palavraChave = mapName.get(name);
            if (palavraChave==null)
                System.out.println("projeto inixistente");
            else {
                // Get the information from mapName
                for (String projeto : Arrays.asList(
                        "O nome do projeto: " + palavraChave.getName(),
                        "A descricao: " + palavraChave.getDescricao(),
                        "A data de conclusao: " + palavraChave.getDataConclusao())) {

                    System.out.println(projeto);
                }
            }
        }
    }
}
