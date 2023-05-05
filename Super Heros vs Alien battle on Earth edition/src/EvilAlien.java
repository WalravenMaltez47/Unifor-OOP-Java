public class EvilAlien extends Personagem {
    protected EvilAlien(int vida) {
        super(vida);
    }
    public void start() {

        System.out.println("Vez do Alien...Jogando os dados...deu... ");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        RandomMethod.dado = RandomMethod.random.gerarNumeroAleatorio();
        System.out.println(RandomMethod.dado);

        // Golpe Split Kick
        if (RandomMethod.dado == 1 || RandomMethod.dado == 2) {
            // EASY MODE
            if (Match.dificuldade.equalsIgnoreCase("EASY")) {
                Match.alien.setDano(5);
            }
            // STANDARD MODE
            else if (Match.dificuldade.equalsIgnoreCase("STANDARD")) {
                Match.alien.setDano(10);
            }
            // HARD MODE
            else if (Match.dificuldade.equalsIgnoreCase("HARD")) {
                Match.alien.setDano(15);
            }
            System.out.println("'Split Kick' Attack!" + " +" + Match.alien.getDano() + " alien damage ");
        }

        // Golpe Bit Laser
        else if (RandomMethod.dado >= 3 && RandomMethod.dado <= 5) {
            // EASY MODE
            if (Match.dificuldade.equalsIgnoreCase("EASY")) {
                Match.alien.setDano(15);
            }
            // STANDARD MODE
            else if (Match.dificuldade.equalsIgnoreCase("STANDARD")) {
                Match.alien.setDano(20);
            }
            // HARD MODE
            else if (Match.dificuldade.equalsIgnoreCase("HARD")) {
                Match.alien.setDano(25);
            }
            System.out.println("'Bit Laser' Attack!" + " +" + Match.alien.getDano() + " alien damage ");
        }

        // Golpe Shockwave Attack
        else if (RandomMethod.dado == 6) {
            // EASY MODE
            if (Match.dificuldade.equalsIgnoreCase("EASY")) {
                Match.alien.setDano(20);
            }
            // STANDARD MODE
            else if (Match.dificuldade.equalsIgnoreCase("STANDARD")) {
                Match.alien.setDano(40);
            }
            // HARD MODE
            else if (Match.dificuldade.equalsIgnoreCase("HARD")) {
                Match.alien.setDano(50);
            }
            System.out.println("'Shockwave' Attack!" + " +" + Match.alien.getDano() + " alien damage ");
        }
    }
}
