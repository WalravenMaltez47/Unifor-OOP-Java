public class RaioLaser extends Personagem {
    RaioLaser(int vida) {
        super(vida);
    }
    public void start()  {

        System.out.println("Vez do Raio-Laser...Jogando os dados...deu...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        RandomMethod.dado = RandomMethod.random.gerarNumeroAleatorio();
        System.out.println(RandomMethod.dado);

        // Golpe Optic Blast
        if (RandomMethod.dado == 1 || RandomMethod.dado == 2) {
            System.out.println("'E' para 'Optic Blast'");
            Match.golpe = Main.prompt.next();
            if (Match.golpe.equalsIgnoreCase("E")) {
                Match.raioLaser.setDano(10);
                System.out.println("'Optic Blast' Attack!" + " +" + Match.raioLaser.getDano() + " +(" + Match.round * 3 + ") " + " range damage ");
            }
            // Punição
            else {
                Match.raioLaser.setDano(0);
                Match.contadorDeRodada = 0;
                System.out.println("Punição!");
                // EASY MODE
                if (Match.dificuldade.equalsIgnoreCase("EASY")) {
                    System.out.println("Raio-Laser sofre +5 de dano");
                    Match.raioLaser.getVida(5);
                }
                // STANDARD MODE
                else if (Match.dificuldade.equalsIgnoreCase("STANDARD")) {
                    System.out.println("Raio-Laser sofre +5 de dano");
                    Match.raioLaser.getVida(5);
                }
                // HARD MODE
                else if (Match.dificuldade.equalsIgnoreCase("HARD")) {
                    System.out.println("Raio-Laser sofre +7 de dano");
                    Match.raioLaser.getVida(7);
                }
            }
        }

        // Golpe Mega Optic
        else if (RandomMethod.dado >= 3 && RandomMethod.dado <= 5) {
            System.out.println("'Q' para 'Mega Optic'");
            Match.golpe = Main.prompt.next();
            if (Match.golpe.equalsIgnoreCase("Q")) {
                Match.raioLaser.setDano(20);
                System.out.println("'Mega Optic' Attack!" + " +" + Match.raioLaser.getDano() + " +(" + Match.round * 3 + ") " + " range damage ");
            }
            // Punição
            else {
                Match.raioLaser.setDano(0);
                Match.contadorDeRodada = 0;
                System.out.println("Punição!");
                // EASY MODE
                if (Match.dificuldade.equalsIgnoreCase("EASY")) {
                    System.out.println("Raio-Laser sofre +5 de dano");
                    Match.raioLaser.getVida(5);
                }
                // STANDARD MODE
                else if (Match.dificuldade.equalsIgnoreCase("STANDARD")) {
                    System.out.println("Raio-Laser sofre +6 de dano");
                    Match.raioLaser.getVida(6);
                }
                // HARD MODE
                else if (Match.dificuldade.equalsIgnoreCase("HARD")) {
                    System.out.println("Raio-Laser sofre +8 de dano");
                    Match.raioLaser.getVida(8);
                }
            }
        }

        // Golpe Super Optic
        else if (RandomMethod.dado == 6) {
            System.out.println("'Z' para 'Super Optic'");
            Match.golpe = Main.prompt.next();
            if (Match.golpe.equalsIgnoreCase("Z")) {
                Match.raioLaser.setDano(40);
                System.out.println("'Super Optic' Attack!" + " +" + Match.raioLaser.getDano() + " +(" + Match.round * 3 + ") " + " range damage ");
            }
            // Punição
            else {
                Match.raioLaser.setDano(0);
                Match.contadorDeRodada = 0;
                System.out.println("Punição!");
                // EASY MODE
                if (Match.dificuldade.equalsIgnoreCase("EASY")) {
                    System.out.println("Raio-Laser sofre +5 de dano");
                    Match.raioLaser.getVida(5);
                }
                // STANDARD MODE
                else if (Match.dificuldade.equalsIgnoreCase("STANDARD")) {
                    System.out.println("Raio-Laser sofre +7 de dano");
                    Match.raioLaser.getVida(7);
                }
                // HARD MODE
                else if (Match.dificuldade.equalsIgnoreCase("HARD")) {
                    System.out.println("Raio-Laser sofre +9 de dano");
                    Match.raioLaser.getVida(9);
                }
            }
        }
    }
}




