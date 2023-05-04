public class Relampago extends Personagem {
    Relampago(int vida) {
        super(vida);
    }
    public void start()  {

        // EASY MODE
        if (Match.dificuldade.equalsIgnoreCase("EASY")) {
            System.out.println("Vez do Relampago...Jogando os dados...deu");
            try {
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            RandomMethod.dado = RandomMethod.random.gerarNumeroAleatorio();
            System.out.println(RandomMethod.dado);

            // Golpes Relâmpago
            if (RandomMethod.dado == 1 || RandomMethod.dado == 2) {
                System.out.println("'E' para 'Lightning Attack'");
                Match.golpe = Main.prompt.next();
                if (Match.golpe.equalsIgnoreCase("E")) {
                    Match.relampago.setDano(10);
                    System.out.println("'Lightnig Attack' Attack!" + " +" + Match.relampago.getDano() + " magic damage ");
                }
                // Punição
                else {
                    Match.relampago.setDano(0);
                    System.out.println("Punição!");
                    System.out.println("Relâmpago sofre +5 de dano");
                    Match.relampago.getVida(5);
                }
            }
            else if (RandomMethod.dado >= 3 && RandomMethod.dado <= 5) {
                System.out.println("Q para 'Lightning Storm'");
                Match.golpe = Main.prompt.next();
                if (Match.golpe.equalsIgnoreCase("Q")) {
                    Match.relampago.setDano(20);
                    System.out.println("'Lightning Storm' Attack!" + " +" + Match.relampago.getDano() + " magic damage ");
                }
                // Punição
                else {
                    Match.relampago.setDano(0);
                    System.out.println("Punição!");
                    System.out.println("Relâmpago sofre +5 de dano");
                    Match.relampago.getVida(5);
                }
            }
            else if (RandomMethod.dado == 6) {
                System.out.println("'Z' para 'Hail Storm'");
                Match.golpe = Main.prompt.next();
                if (Match.golpe.equalsIgnoreCase("Z")) {
                    Match.relampago.setDano(40);
                    System.out.println("'Hail Storm' Attack!" + " +" + Match.relampago.getDano() + " magic damage ");
                }
                // Punição
                else {
                    Match.relampago.setDano(0);
                    System.out.println("Punição!");
                    System.out.println("Relâmpago sofre +5 de dano");
                    Match.relampago.getVida(5);
                }
            }
        }

        // STANDARD MODE
        if (Match.dificuldade.equalsIgnoreCase("STANDARD")) {
            System.out.println("Vez do Relampago...Jogando os dados...deu...");
            try {
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            RandomMethod.dado = RandomMethod.random.gerarNumeroAleatorio();
            System.out.println(RandomMethod.dado);

            // Golpes Relâmpago
            if (RandomMethod.dado == 1 || RandomMethod.dado == 2) {
                System.out.println("'E' para 'Lightning Attack'");
                Match.golpe = Main.prompt.next();
                if (Match.golpe.equalsIgnoreCase("E")) {
                    Match.relampago.setDano(10);
                    System.out.println("'Lightnig Attack' Attack!" + " +" + Match.relampago.getDano() + " magic damage ");
                }
                // Punição
                else {
                    Match.relampago.setDano(0);
                    System.out.println("Punição!");
                    System.out.println("Relâmpago sofre +5 de dano");
                    Match.relampago.getVida(5);
                }
            }
            else if (RandomMethod.dado >= 3 && RandomMethod.dado <= 5) {
                System.out.println("Q para 'Lightning Storm'");
                Match.golpe = Main.prompt.next();
                if (Match.golpe.equalsIgnoreCase("Q")) {
                    Match.relampago.setDano(20);
                    System.out.println("'Lightning Storm' Attack!" + " +" + Match.relampago.getDano() + " magic damage ");
                }
                // Punição
                else {
                    Match.relampago.setDano(0);
                    System.out.println("Punição!");
                    System.out.println("Relâmpago sofre +6 de dano");
                    Match.relampago.getVida(6);
                }
            }
            else if (RandomMethod.dado == 6) {
                System.out.println("'Z' para 'Hail Storm'");
                Match.golpe = Main.prompt.next();
                if (Match.golpe.equalsIgnoreCase("Z")) {
                    Match.relampago.setDano(40);
                    System.out.println("'Hail Storm' Attack!" + " +" + Match.relampago.getDano() + " magic damage ");
                }
                // Punição
                else {
                    Match.relampago.setDano(0);
                    System.out.println("Punição!");
                    System.out.println("Relâmpago sofre +7 de dano");
                    Match.relampago.getVida(7);
                }
            }
        }

        // HARD MODE
        if (Match.dificuldade.equalsIgnoreCase("HARD")) {
            System.out.println("Vez do Relampago...Jogando os dados...deu...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            RandomMethod.dado = RandomMethod.random.gerarNumeroAleatorio();
            System.out.println(RandomMethod.dado);

            // Golpes Relâmpago
            if (RandomMethod.dado == 1 || RandomMethod.dado == 2) {
                System.out.println("'E' para 'Lightning Attack'");
                Match.golpe = Main.prompt.next();
                if (Match.golpe.equalsIgnoreCase("E")) {
                    Match.relampago.setDano(10);
                    System.out.println("'Lightnig Attack' Attack!" + " +" + Match.relampago.getDano() + " magic damage ");
                }
                // Punição
                else {
                    Match.relampago.setDano(0);
                    System.out.println("Punição!");
                    System.out.println("Relâmpago sofre +7 de dano");
                    Match.relampago.getVida(7);
                }
            }
            else if (RandomMethod.dado >= 3 && RandomMethod.dado <= 5) {
                System.out.println("Q para 'Lightning Storm'");
                Match.golpe = Main.prompt.next();
                if (Match.golpe.equalsIgnoreCase("Q")) {
                    Match.relampago.setDano(20);
                    System.out.println("'Lightning Storm' Attack!" + " +" + Match.relampago.getDano() + " magic damage ");
                }
                // Punição
                else {
                    Match.relampago.setDano(0);
                    System.out.println("Punição!");
                    System.out.println("Relâmpago sofre +8 de dano");
                    Match.relampago.getVida(8);
                }
            }
            else if (RandomMethod.dado == 6) {
                System.out.println("'Z' para 'Hail Storm'");
                Match.golpe = Main.prompt.next();
                if (Match.golpe.equalsIgnoreCase("Z")) {
                    Match.relampago.setDano(40);
                    System.out.println("'Hail Storm' Attack!" + " +" + Match.relampago.getDano() + " magic damage ");
                }
                // Punição
                else {
                    Match.relampago.setDano(0);
                    System.out.println("Punição!");
                    System.out.println("Relâmpago sofre +9 de dano");
                    Match.relampago.getVida(9);
                }
            }
        }
    }
}
