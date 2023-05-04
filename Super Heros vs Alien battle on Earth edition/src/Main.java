import java.util.Scanner;
import java.time.LocalDate;
public class Main {
    static Scanner prompt = new Scanner(System.in);
    public static boolean perguntaStart() {
        System.out.println("digite 'start' para comecar");
        String start = prompt.next();

        try {
            new PlaytheGame(start);
        } catch (PlayTheGameException e) {
            System.out.println("Failed! Try again");
            System.out.println();

            perguntaStart();
        }

        return true;
    }

    public static void main(String[] args)  {
        int contador = 0;

        // Escolha da dificuldade
        System.out.println("Escolha a difuldade");
        System.out.println("Escreva 'EASY' para fácil");
        System.out.println("Escreva 'STANDARD' para dificuldade padrão");
        System.out.println("Escreva 'Hard' para dificuldade difícil");
        Match.dificuldade = prompt.next();

        while (!Match.dificuldade.equalsIgnoreCase("EASY")
                &&
                !Match.dificuldade.equalsIgnoreCase("STANDARD")
                &&
                !Match.dificuldade.equalsIgnoreCase("HARD")) {

            System.out.println("Failed! Try again");
            System.out.println();

            System.out.println("Escolha a difuldade");
            System.out.println("Escreva 'EASY' para fácil");
            System.out.println("Escreva 'STANDARD' para dificuldade padrão");
            System.out.println("Escreva 'Hard' para dificuldade difícil");
            Match.dificuldade = prompt.next();
        }

        // Escolha do personagem
        System.out.println("Escolha seu personagem: ");
        System.out.println("1 - Muque-Man");
        System.out.println("2 - Raio-Laser");
        System.out.println("3 - Relâmpago");
        String escolhaDoPersonagem = prompt.next();

        while (!escolhaDoPersonagem.equals("1")
                &&
                !escolhaDoPersonagem.equals("2")
                &&
                !escolhaDoPersonagem.equals("3")) {

              System.out.println("Failed! Try again");
              System.out.println();

              System.out.println("Escolha seu personagem: ");
              System.out.println("1 - Muque-Man");
              System.out.println("2 - Raio-Laser");
              System.out.println("3 - Relâmpago");

              escolhaDoPersonagem = prompt.next();
        }

        // Inicia o jogo
        if (perguntaStart()) {

            switch (escolhaDoPersonagem) {
                   // Muque-Man
                case "1":
                    MatchMuqueManVsAlien matchMuqueManVsAlien = new MatchMuqueManVsAlien();
                break;

                // Raio-Laser
                case "2":
                    MatchRaioLaserVsAlien matchRaioLaserVsAlien = new MatchRaioLaserVsAlien();
                break;

                // Relâmpago
                case "3":
                    MatchRelampagoVsAlien matchRelampagoVsAlien = new MatchRelampagoVsAlien();
                break;

                default:
                    break;
            }

            System.out.println("FIM DE JOGO!!!");
            System.out.println();

            // Salva jogo
            LocalDate today = LocalDate.now();
            System.out.println("save #"+contador);
            System.out.println("Game saved on the date " + today);
        }
    }
}