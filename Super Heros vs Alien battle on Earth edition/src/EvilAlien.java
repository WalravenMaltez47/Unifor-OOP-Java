public class EvilAlien extends Personagem {
    EvilAlien(int vida) {
        super(vida);
    }
    public void start() {

        // EASY MODE
        if (Match.dificuldade.equalsIgnoreCase("EASY")) {
            System.out.println("Vez do Alien...Jogando os dados...deu... ");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            RandomMethod.dado = RandomMethod.random.gerarNumeroAleatorio();
            System.out.println(RandomMethod.dado);

            // Golpes Alien
            if (RandomMethod.dado == 1 || RandomMethod.dado == 2) {
                Match.alien.setDano(5);
                System.out.println("'Split Kick' Attack!" + " +" + Match.alien.getDano() + " alien damage ");
            } else if (RandomMethod.dado >= 3 && RandomMethod.dado <= 5) {
                Match.alien.setDano(15);
                System.out.println("'Bit Laser' Attack!" + " +" + Match.alien.getDano() + " alien damage ");

            } else if (RandomMethod.dado == 6) {
                Match.alien.setDano(20);
                System.out.println("'Shockwave' Attack!" + " +" + Match.alien.getDano() + " alien damage ");
            }
        }

        // STANDARD MODE
        if (Match.dificuldade.equalsIgnoreCase("STANDARD")) {
            System.out.println("Vez do Alien...Jogando os dados...deu... ");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            RandomMethod.dado = RandomMethod.random.gerarNumeroAleatorio();
            System.out.println(RandomMethod.dado);

            // Golpes Alien
            if (RandomMethod.dado == 1 || RandomMethod.dado == 2) {
                Match.alien.setDano(10);
                System.out.println("'Split Kick' Attack!'" + " +" + Match.alien.getDano() + " alien damage ");
            } else if (RandomMethod.dado >= 3 && RandomMethod.dado <= 5) {
                Match.alien.setDano(20);
                System.out.println("'Bit Laser' Attack!'" + " +" + Match.alien.getDano() + " alien damage ");
            } else if (RandomMethod.dado == 6) {
                Match.alien.setDano(40);
                System.out.println("''Shockwave' Attack!'" + " +" + Match.alien.getDano() + " alien damage ");
            }
        }

        // HARD MODE
        if (Match.dificuldade.equalsIgnoreCase("HARD")) {
            System.out.println("Vez do Alien...Jogando os dados...deu... ");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            RandomMethod.dado = RandomMethod.random.gerarNumeroAleatorio();
            System.out.println(RandomMethod.dado);

            // Golpes Alien
            if (RandomMethod.dado == 1 || RandomMethod.dado == 2) {
                Match.alien.setDano(15);
                System.out.println("'Split Kick' Attack!" + " +" + Match.alien.getDano() + " alien damage ");
            } else if (RandomMethod.dado >= 3 && RandomMethod.dado <= 5) {
                Match.alien.setDano(25);
                System.out.println("'Bit Laser' Attack!" + " +" + Match.alien.getDano() + " alien damage ");
            } else if (RandomMethod.dado == 6) {
                Match.alien.setDano(50);
                System.out.println("'Shockwave' Attack!!" + " +" + Match.alien.getDano() + " alien damage ");
            }
        }
    }
}
