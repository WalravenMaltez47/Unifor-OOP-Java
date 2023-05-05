public class MuqueMan extends Personagem {
    protected MuqueMan(int vida) {
        super(vida);
    }
    public void start()  {

        System.out.println("Vez do Muque-Man...Jogando os dados...deu... ");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        RandomMethod.dado = RandomMethod.random.gerarNumeroAleatorio();
        System.out.println(RandomMethod.dado);

        // Golpe Chute
        if (RandomMethod.dado == 1 || RandomMethod.dado == 2) {
            System.out.println("'E' para 'Chute'");
            Match.golpe = Main.prompt.next();
            if (Match.golpe.equalsIgnoreCase("E")) {
                Match.muqueMan.setDano(10);
                System.out.println("'Chute' Attack!'" + " +" + Match.muqueMan.getDano() + " melee damage ");
            }
            // Punição
            else {
                // Reset Dano
                Match.muqueMan.setDano(0);

                System.out.println("Punição!");
                // EASY MODE
                if (Match.dificuldade.equalsIgnoreCase("EASY")) {
                    System.out.println("Muque-Man sofre +5 de dano");
                    Match.muqueMan.getVida(5);
                }
                // STANDARD MODE
                else if (Match.dificuldade.equalsIgnoreCase("STANDARD")) {
                    System.out.println("Muque-Man sofre +5 de dano");
                    Match.muqueMan.getVida(5);
                }
                // HARD MODE
                else if (Match.dificuldade.equalsIgnoreCase("HARD")) {
                    System.out.println("Muque-Man sofre +7 de dano");
                    Match.muqueMan.getVida(7);
                }
            }
        }

        // Golpe Tornado
        else if (RandomMethod.dado >= 3 && RandomMethod.dado <= 5) {
            System.out.println("'Q' para 'Tornado'");
            Match.golpe = Main.prompt.next();
            if (Match.golpe.equalsIgnoreCase("Q")) {
                Match.muqueMan.setDano(20);
                System.out.println("'Tornado' Attack!" + " +" + Match.muqueMan.getDano() + " melee damage ");
            }
            // Punição
            else {
                // Reset Dano
                Match.muqueMan.setDano(0);

                System.out.println("Punição!");
                // EASY MODE
                if (Match.dificuldade.equalsIgnoreCase("EASY")) {
                    System.out.println("Muque-Man sofre +5 de dano");
                    Match.muqueMan.getVida(5);
                }
                // STANDARD MODE
                else if (Match.dificuldade.equalsIgnoreCase("STANDARD")) {
                    System.out.println("Muque-Man sofre +6 de dano");
                    Match.muqueMan.getVida(6);
                }
                // HARD MODE
                else if (Match.dificuldade.equalsIgnoreCase("HARD")) {
                    System.out.println("Muque-Man sofre +8 de dano");
                    Match.muqueMan.getVida(8);
                }
            }
        }

        // Golpe Berserker
        else if (RandomMethod.dado == 6) {
            System.out.println("'Z' para 'Berserker'");
            Match.golpe = Main.prompt.next();
            if (Match.golpe.equalsIgnoreCase("Z")) {
                Match.muqueMan.setDano(40);
                System.out.println("'Berserker' Attack!" + " +" + Match.muqueMan.getDano() + " melee damage ");
            }
            // Punição
            else {
                // Reset Dano
                Match.muqueMan.setDano(0);

                System.out.println("Punição!");
                // EASY MODE
                if (Match.dificuldade.equalsIgnoreCase("EASY")) {
                    System.out.println("Muque-Man sofre +5 de dano");
                    Match.muqueMan.getVida(5);
                }
                // STANDARD MODE
                else if (Match.dificuldade.equalsIgnoreCase("STANDARD")) {
                    System.out.println("Muque-Man sofre +7 de dano");
                    Match.muqueMan.getVida(7);
                }
                // HARD MODE
                else if (Match.dificuldade.equalsIgnoreCase("HARD")) {
                    System.out.println("Muque-Man sofre +9 de dano");
                    Match.muqueMan.getVida(9);
                }
            }
        }
    }
}