import java.util.Scanner;
public class Main {
    public static String dificuldade;

    // Setting a vida (HP)
    static int hpDoHero = 200;
    static int hpDoAlien = 200;

    // Setting objeto
    static MuqueMan muqueMan = new MuqueMan(hpDoHero);
    static RaioLaser raioLaser = new RaioLaser(hpDoHero);
    static Relampago relampago = new Relampago(hpDoHero);
    static EvilAlien alien = new EvilAlien(hpDoAlien);
    static Scanner prompt = new Scanner(System.in);
    static RandomMethod random = new RandomMethod();

    // Start do jogo
    public static boolean perguntaStart() {
        System.out.println("digite 'start' para comecar");
        String start = prompt.next();

        try {
            new StartGame(start);
        } catch (StartGameException e) {
            System.out.println("Failed! Try again");
            System.out.println();

            perguntaStart();
        }

        return true;
    }
    public static void main(String[] args) {

        // Escolha da dificuldade
        System.out.println("Escolha a difuldade");
        System.out.println("Escreva 'EASY' para fácil");
        System.out.println("Escreva 'STANDARD' para dificuldade padrão");
        System.out.println("Escreva 'Hard' para dificuldade difícil");
        dificuldade = prompt.next();

        while (!dificuldade.equalsIgnoreCase("EASY")
               &&
               !dificuldade.equalsIgnoreCase("STANDARD")
               &&
               !dificuldade.equalsIgnoreCase("HARD")) {

            System.out.println("Failed! Try again");
            System.out.println();

            System.out.println("Escolha a difuldade");
            System.out.println("Escreva 'EASY' para fácil");
            System.out.println("Escreva 'STANDARD' para dificuldade padrão");
            System.out.println("Escreva 'Hard' para dificuldade difícil");

            dificuldade = prompt.next();
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
                case "1": muqueMan.start();
                break;

                // Raio-Laser
                case "2": raioLaser.start();
                break;

                // Relâmpago
                case "3": relampago.start();
                break;

                default:
                    break;
            }
        }
    }
}