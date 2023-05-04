public class MuqueMan extends Personagem {

    MuqueMan(int vida) {
        super(vida);
    }
    public void start()  {

        // EASY MODE
        if (Match.dificuldade.equalsIgnoreCase("EASY")) {
            System.out.println("Vez do Muque-Man...Jogando os dados...deu... ");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            RandomMethod.dado = RandomMethod.random.gerarNumeroAleatorio();
            System.out.println(RandomMethod.dado);

            // Golpes Muque-man
            if (RandomMethod.dado == 1 || RandomMethod.dado == 2) {
                System.out.println("'E' para 'Chute'");
                Match.golpe = Main.prompt.next();
                if (Match.golpe.equalsIgnoreCase("E")) {
                    Match.muqueMan.setDano(10);
                    System.out.println("'Chute' Attack!'" + " +" + Match.muqueMan.getDano() + " melee damage ");
                }
                // Punição
                else {
                    Match.muqueMan.setDano(0);
                    System.out.println("Punição!");
                    System.out.println("Muque-Man sofre +5 de dano");
                    Match.muqueMan.getVida(5);
                }
            }
            else if (RandomMethod.dado >= 3 && RandomMethod.dado <= 5) {
                System.out.println("'Q' para 'Tornado'");
                Match.golpe = Main.prompt.next();
                if (Match.golpe.equalsIgnoreCase("Q")) {
                    Match.muqueMan.setDano(20);
                    System.out.println("'Tornado' Attack!" + " +" + Match.muqueMan.getDano() + " melee damage ");
                }
                // Punição
                else {
                    Match.muqueMan.setDano(0);
                    System.out.println("Punição!");
                    System.out.println("Muque-Man sofre +5 de dano");
                    Match.muqueMan.getVida(5);
                }
            }
            else if (RandomMethod.dado == 6) {
                System.out.println("'Z' para 'Berserker'");
                Match.golpe = Main.prompt.next();
                if (Match.golpe.equalsIgnoreCase("Z")) {
                        Match.muqueMan.setDano(40);
                        System.out.println("'Berserker' Attack!" + " +" + Match.muqueMan.getDano() + " melee damage ");
                }
                // Punição
                else {
                    Match.muqueMan.setDano(0);
                    System.out.println("Punição!");
                    System.out.println("Muque-Man sofre +5 de dano");
                    Match.muqueMan.getVida(5);
                }
            }
        }

        // STANDARD MODE
        if (Match.dificuldade.equalsIgnoreCase("STANDARD")) {
            System.out.println("Vez do Muque-Man...Jogando os dados...deu... ");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            RandomMethod.dado = RandomMethod.random.gerarNumeroAleatorio();
            System.out.println(RandomMethod.dado);

            // Golpes Muque-man
            if (RandomMethod.dado == 1 || RandomMethod.dado == 2) {
                System.out.println("'E' para 'Chute'");
                Match.golpe = Main.prompt.next();
                if (Match.golpe.equalsIgnoreCase("E")) {
                    Match.muqueMan.setDano(10);
                    System.out.println("'Chute' Attack!'" + " +" + Match.muqueMan.getDano() + " melee damage ");
                }
                // Punição
                else {
                    Match.muqueMan.setDano(0);
                    System.out.println("Punição!");
                    System.out.println("Muque-Man sofre +5 de dano");
                    Match.muqueMan.getVida(5);
                }
            }
            else if (RandomMethod.dado >= 3 && RandomMethod.dado <= 5) {
                System.out.println("'Q' para 'Tornado'");
                Match.golpe = Main.prompt.next();
                if (Match.golpe.equalsIgnoreCase("Q")) {
                    Match.muqueMan.setDano(20);
                    System.out.println("'Tornado' Attack!'" + " +" + Match.muqueMan.getDano() + " melee damage ");
                }
                // Punição
                else {
                    Match.muqueMan.setDano(0);
                    System.out.println("Punição!");
                    System.out.println("Muque-Man sofre +6 de dano");
                    Match.muqueMan.getVida(6);
                }
            }
            else if (RandomMethod.dado == 6) {
                System.out.println("'Z' para 'Berserker'");
                Match.golpe = Main.prompt.next();
                if (Match.golpe.equalsIgnoreCase("Z")) {
                    Match.muqueMan.setDano(40);
                    System.out.println("'Berserker' Attack!'" + " +" + Match.muqueMan.getDano() + " melee damage ");
                }
                // Punição
                else {
                    Match.muqueMan.setDano(0);
                    System.out.println("Punição!");
                    System.out.println("Muque-Man sofre +7 de dano");
                    Match.muqueMan.getVida(7);
                }
            }
        }

        // HARD MODE
        if (Match.dificuldade.equalsIgnoreCase("HARD")) {
            System.out.println("Vez do Muque-Man...Jogando os dados...deu... ");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            RandomMethod.dado = RandomMethod.random.gerarNumeroAleatorio();
            System.out.println(RandomMethod.dado);
            // Golpes Muque-man
            if (RandomMethod.dado == 1 || RandomMethod.dado == 2) {
                System.out.println("'E' para 'Chute'");
                Match.golpe = Main.prompt.next();
                if (Match.golpe.equalsIgnoreCase("E")) {
                    Match.muqueMan.setDano(10);
                    System.out.println("'Chute' Attack!'" + " +" + Match.muqueMan.getDano() + " melee damage ");
                }
                // Punição
                else {
                    Match.muqueMan.setDano(0);
                    System.out.println("Punição!");
                    System.out.println("Muque-Man sofre +7 de dano");
                    Match.muqueMan.getVida(7);
                }
            }
            else if (RandomMethod.dado >= 3 && RandomMethod.dado <= 5) {
                System.out.println("'Q' para 'Tornado'");
                Match.golpe = Main.prompt.next();
                if (Match.golpe.equalsIgnoreCase("Q")) {
                    Match.muqueMan.setDano(20);
                    System.out.println("''Tornado' Attack!'" + " +" + Match.muqueMan.getDano() + " melee damage ");
                }
                // Punição
                else {
                    Match.muqueMan.setDano(0);
                    System.out.println("Punição!");
                    System.out.println("Muque-Man sofre +10 de dano");
                    Match.muqueMan.getVida(10);
                }
            }
            else if (RandomMethod.dado == 6) {
                System.out.println("'Z' para 'Berserker'");
                Match.golpe = Main.prompt.next();
                if (Match.golpe.equalsIgnoreCase("Z")) {
                    Match.muqueMan.setDano(40);
                    System.out.println("'Berserker' Attack!'" + " +" + Match.muqueMan.getDano() + " melee damage ");
                }
                // Punição
                else {
                    Match.muqueMan.setDano(0);
                    System.out.println("Punição!");
                    System.out.println("Muque-Man sofre +15 de dano");
                    Match.muqueMan.getVida(15);
                }
            }
        }
    }
}
