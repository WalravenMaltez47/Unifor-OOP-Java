import java.util.Scanner;
public class Main {

    // Setting a vida (HP)
    static int hpDoHero = 200;
    static int hpDoAlien = 200;

    // Setting objeto
    static MuqueMan muqueMan = new MuqueMan(hpDoHero);
    static RaioLaser raioLaser = new RaioLaser(hpDoHero);
    static Relampago relampago = new Relampago(hpDoHero);
    static EvilAlien alien = new EvilAlien(hpDoAlien);
    static Start startMain = new Start();
    static Scanner prompt = new Scanner(System.in);
    static RandomMethod random = new RandomMethod();

    // Start do jogo
    public static boolean perguntaStart() {
        System.out.println("digite 'start' para comecar");
        String start = prompt.next();

        try {
            startMain.setStart(start);
        } catch (StartException e) {
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
        String dificuldade = prompt.next();

        while (!dificuldade.equals("EASY")
               &&
               !dificuldade.equals("easy")
               &&
               !dificuldade.equals("STANDARD")
               &&
               !dificuldade.equals("standard")
               &&
               !dificuldade.equals("HARD")
               &&
               !dificuldade.equals("hard")) {

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


        if (perguntaStart()) {

            int dado;
            int Round;
            String golpe;

            switch (escolhaDoPersonagem) {

                // Muque-Man
                case "1":

                    // EASY MODE
                    if (dificuldade.equals("EASY")||dificuldade.equals("easy")) {

                            for (Round = 1; Round <= 6 && muqueMan.getFinalHp()>0 && alien.getFinalHp()>0; Round++) {
                                dado = random.gerarNumeroAleatorio();
                                System.out.println("Vez do Muque-Man...Jogando os dados...deu " + dado);

                                if (dado == 1 || dado == 2) {
                                    System.out.println("'E' para 'Chute'");
                                    golpe = prompt.next();
                                    if (golpe.equals("e") || golpe.equals("E")) {
                                        muqueMan.setDano(10);
                                        System.out.println("'Chute' Attack!"  + " +"+ muqueMan.getDano() + " melee demage ");
                                        System.out.println("alien esta com " + alien.getVida(muqueMan.getDano()) + " HP ");
                                    }
                                    // Punição
                                    else {
                                        System.out.println("Punição!");
                                        System.out.println("Muque-Man sofre +5 de dano e agora está com " + muqueMan.getVida(5) + " HP ");
                                    }
                                }
                                else if (dado >= 3 && dado <= 5) {
                                    System.out.println("'Q' para 'Tornado'");
                                    golpe = prompt.next();
                                    if (golpe.equals("q") || golpe.equals("Q")) {
                                        muqueMan.setDano(20);
                                        System.out.println("'Tornado' Attack!'"  + " +"+ muqueMan.getDano() + " melee demage ");
                                        System.out.println("alien esta com " + alien.getVida(muqueMan.getDano()) + " HP ");
                                    }

                                    // Punição
                                    else {
                                        System.out.println("Punição!");
                                        System.out.println("Muque-Man sofre +5 de dano e agora está com " + muqueMan.getVida(5) + " HP ");
                                    }
                                }
                                else if (dado == 6) {
                                    System.out.println("'Z' para 'Berserker'");
                                    golpe = prompt.next();
                                    if (golpe.equals("z") || golpe.equals("Z")) {
                                        muqueMan.setDano(40);
                                        System.out.println("'Berserker' Attack!" + " +"+muqueMan.getDano() + " melee demage ");
                                        System.out.println("Alien está com " + alien.getVida(muqueMan.getDano()) + " HP ");
                                    }

                                    // Punição
                                    else {
                                        System.out.println("Punição!");
                                        System.out.println("Muque-Man sofre +5 de dano e agora está com " + muqueMan.getVida(5) + " HP ");
                                    }
                                }

                                System.out.println(); // Backspace

                                // Alien
                                dado = random.gerarNumeroAleatorio();
                                System.out.println("Vez do Alien...Jogando os dados...deu " + dado);

                                // Golpes
                                if (dado == 1 || dado == 2) {
                                    alien.setDano(5);
                                    System.out.println("'Split Kick' Attack!" + " +"+alien.getDano() + " alien demage ");
                                    System.out.println("Muque-Man  está com " + muqueMan.getVida(alien.getDano()) + " HP ");
                                }
                                else if (dado >= 3 && dado <= 5) {
                                    alien.setDano(15);
                                    System.out.println("'Bit Laser' Attack!" + " +"+alien.getDano() + " alien demag ");
                                    System.out.println("Muque-Man está com " + muqueMan.getVida(alien.getDano()) + " HP ");
                                }
                                else if (dado == 6) {
                                    alien.setDano(20);
                                    System.out.println("'Shockwave' Attack!" + " +"+alien.getDano() + " alien demag ");
                                    System.out.println("Muque-Man  está com " + muqueMan.getVida(alien.getDano()) + " HP ");
                                }

                                System.out.println();

                                // special ability
                                System.out.println("abilidade especial do Muque-Man lhe concede +5 de hp, agora ele está com " + muqueMan.healing(5) + " HP ");
                            }

                            // Placar
                            System.out.println("A vida final de Muque-Man " + muqueMan.getFinalHp() + " HP ");
                            System.out.println("A vida final de Alien " + alien.getFinalHp() + " HP ");

                            // Resultado
                            if (muqueMan.getFinalHp() > alien.getFinalHp()) {
                                System.out.println();
                                System.out.println("O vencedor é Muqueman!");
                            }
                            else if (muqueMan.getFinalHp() < alien.getFinalHp()) {
                                System.out.println();
                                System.out.println("O vencedor é Alien!");
                            }
                            else {
                                System.out.println("Empate!...pelo menos você não perdeu... HAHAHA!");
                            }
                    }

                    // STANDARD MODE
                    if (dificuldade.equals("STANDARD") || dificuldade.equals("standard")) {
                        for (Round = 1; Round <= 6 && muqueMan.getFinalHp()>0 && alien.getFinalHp()>0; Round++) {
                            dado = random.gerarNumeroAleatorio();
                            System.out.println("Vez do Muque-Man...Jogando os dados...deu " + dado);

                            if (dado == 1 || dado == 2) {
                                System.out.println("'E' para 'Chute'");
                                golpe = prompt.next();
                                if (golpe.equals("e") || golpe.equals("E")) {
                                    muqueMan.setDano(10);
                                    System.out.println("'Chute' Attack!'" + " +"+muqueMan.getDano() + " melee demage ");
                                    System.out.println("Alien está com " + alien.getVida(muqueMan.getDano()) + " HP ");
                                }

                                // Punição
                                else {
                                    System.out.println("Punição!");
                                    System.out.println("Muque-Man sofre +5 de dano e agora está com " + muqueMan.getVida(5) + " HP ");
                                }
                            }
                            else if (dado >= 3 && dado <= 5) {
                                System.out.println("'Q' para 'Tornado'");
                                golpe = prompt.next();
                                if (golpe.equals("q") || golpe.equals("Q")) {
                                    muqueMan.setDano(20);
                                    System.out.println("'Tornado' Attack!'" + " +"+muqueMan.getDano() + " melee demage ");
                                    System.out.println("Alien está com " + alien.getVida(muqueMan.getDano()) + " HP ");
                                }

                                // Punição
                                else {
                                    System.out.println("Punição!");
                                    System.out.println("Muque-Man sofre +6 de dano e agora está com " + muqueMan.getVida(5) + " HP ");
                                }
                            }
                            else if (dado == 6) {
                                System.out.println("'Z' para 'Berserker'");
                                golpe = prompt.next();
                                if (golpe.equals("z") || golpe.equals("Z")) {
                                    muqueMan.setDano(40);
                                    System.out.println("'Berserker' Attack!'" + " +"+muqueMan.getDano() + " melee demage ");
                                    System.out.println("Alien está com " + alien.getVida(muqueMan.getDano()) + " HP ");
                                }

                                // Punição
                                else {
                                    System.out.println("Punição!");
                                    System.out.println("Muque-Man sofre +7 de dano e agora está com " + muqueMan.getVida(5) + " HP ");
                                }
                            }

                            System.out.println(); // Backspace

                            // Alien
                            dado = random.gerarNumeroAleatorio();
                            System.out.println("Vez do Alien...Jogando os dados...deu " + dado);

                            // Golpes
                            if (dado == 1 || dado == 2) {
                                alien.setDano(10);
                                System.out.println("'Split Kick' Attack!'" + " +"+alien.getDano() + " alien demage ");
                                System.out.println("Muque-Man está com " + muqueMan.getVida(alien.getDano()) + " HP ");
                            }
                            else if (dado >= 3 && dado <= 5) {
                                muqueMan.setDano(10);
                                System.out.println("'Bit Laser' Attack!'" + " +"+alien.getDano() + " alien demage ");
                                System.out.println("Muque-Man está com " + muqueMan.getVida(muqueMan.getDano()) + " HP ");
                            }
                            else if (dado == 6) {
                                muqueMan.setDano(20);
                                System.out.println("''Shockwave' Attack!'" + " +"+alien.getDano() + " alien demage ");
                                System.out.println("Muque-Man está com " +muqueMan.getVida(alien.getDano()) + " HP ");
                            }

                            // special ability
                            System.out.println("abilidade especial do Muque-Man lhe concede +5 de hp, agora ele está com " + muqueMan.healing(5) + " HP ");
                        }

                        // Placar
                        System.out.println("A vida final de Muque-Man " + muqueMan.getFinalHp() + " HP ");
                        System.out.println("A vida final de Alien " + alien.getFinalHp() + " HP ");

                        // Resultado
                        if (muqueMan.getFinalHp() > alien.getFinalHp()) {
                            System.out.println();
                            System.out.println("O vencedor é Muqueman!");
                        }
                        else if (muqueMan.getFinalHp() < alien.getFinalHp()) {
                            System.out.println();
                            System.out.println("O vencedor é Alien!");
                        }
                        else {
                            System.out.println("Empate!...pelo menos você não perdeu... HAHAHA!");
                        }

                    }

                    // HARD MODE
                    if (dificuldade.equals("HARD") || dificuldade.equals("hard")) {

                        for (Round = 1; Round <= 6 && muqueMan.getFinalHp()>0 && alien.getFinalHp()>0; Round++) {

                            dado = random.gerarNumeroAleatorio();
                            System.out.println("Vez do Muque-Man...Jogando os dados...deu " + dado);


                            if (dado == 1 || dado == 2) {
                                System.out.println("'E' para 'Chute'");
                                golpe = prompt.next();
                                if (golpe.equals("e") || golpe.equals("E")) {
                                    muqueMan.setDano(10);
                                    System.out.println("'Chute' Attack!'" + " +"+muqueMan.getDano() + " melee demage ");
                                    System.out.println("Alien está com " + alien.getVida(muqueMan.getDano()) + " HP ");
                                }

                                // Punição
                                else {
                                    System.out.println("Punição!");
                                    System.out.println("Muque-Man sofre +7 de dano e agora está com " + muqueMan.getVida(5) + " HP ");
                                }
                            }
                            else if (dado >= 3 && dado <= 5) {
                                System.out.println("'Q' para 'Tornado'");
                                golpe = prompt.next();
                                if (golpe.equals("q") || golpe.equals("Q")) {
                                    muqueMan.setDano(20);
                                    System.out.println("''Tornado' Attack!'" + " +"+muqueMan.getDano() + " melee demage ");
                                    System.out.println("Alien está com " + alien.getVida(muqueMan.getDano()) + " HP ");
                                }

                                // Punição
                                else {
                                    System.out.println("Punição!");
                                    System.out.println("Muque-Man sofre +10 de dano e agora está com " + muqueMan.getVida(6) + " HP ");
                                }
                            }
                            else if (dado == 6) {
                                System.out.println("'Z' para 'Berserker'");
                                golpe = prompt.next();
                                if (golpe.equals("z") || golpe.equals("Z")) {
                                    muqueMan.setDano(20);
                                    System.out.println("'Berserker' Attack!'" + " +"+muqueMan.getDano() + " melee demage ");
                                    System.out.println("Alien está com " + alien.getVida(muqueMan.getDano()) + " HP ");
                                }

                                // Punição
                                else {
                                    System.out.println("Punição!");
                                    System.out.println("Muque-Man sofre +15 de dano e agora está com " + muqueMan.getVida(7) + " HP ");
                                }
                            }

                            System.out.println(); // Backspace

                            // ALIEN
                            dado = random.gerarNumeroAleatorio();
                            System.out.println("Vez do Alien...Jogando os dados...deu " + dado);

                            // Golpes
                            if (dado == 1 || dado == 2) {
                                alien.setDano(20);
                                System.out.println("'Split Kick' Attack!" + " +"+alien.getDano() + " alien demage ");
                                System.out.println("Muque-Man  está com " + muqueMan.getVida(+alien.getDano()) + " HP ");
                            }
                            else if (dado >= 3 && dado <= 5) {
                                alien.setDano(50);
                                System.out.println("'Bit Laser' Attack!" + " +"+alien.getDano() + " alien demage ");
                                System.out.println("Muque-Man  está com " + muqueMan.getVida(+alien.getDano()) + " HP ");
                            }
                            else if (dado == 6) {
                                alien.setDano(50);
                                System.out.println("'Shockwave' Attack!!" + " +"+alien.getDano() + " alien demage ");
                                System.out.println("Muque-Man  está com " + muqueMan.getVida(+alien.getDano()) + " HP ");
                            }

                            // special ability
                            System.out.println("abilidade especial do Muque-Man lhe concede +5 de hp, agora ele está com " + muqueMan.healing(5) + " HP ");
                        }

                        // Placar
                        System.out.println("A vida final de Muque-Man " + muqueMan.getFinalHp() + " HP ");
                        System.out.println("A vida final de Alien " + alien.getFinalHp() + " HP ");

                        // Resultado
                        if (muqueMan.getFinalHp() > alien.getFinalHp()) {
                            System.out.println();
                            System.out.println("O vencedor é Muqueman!");
                        }
                        else if (muqueMan.getFinalHp() < alien.getFinalHp()) {
                            System.out.println();
                            System.out.println("O vencedor é Alien!");
                        }
                        else {
                            System.out.println("Empate!...pelo menos você não perdeu... HAHAHA!");
                        }
                    }
                    break;

                // Raio-Laser
                case "2":

                    // EASY MODE
                    if (dificuldade.equals("EASY")||dificuldade.equals("easy")) {
                        for (Round = 0; Round < 6 && raioLaser.getFinalHp()>0 && alien.getFinalHp()>0; Round++) {
                            dado = random.gerarNumeroAleatorio();
                            System.out.println("Vez do Raio-Laser...Jogando os dados...deu " + dado);

                            // Golpes
                            if (dado == 1 || dado == 2) {
                                System.out.println("'E' para 'Optic Blast'");
                                golpe = prompt.next();
                                if (golpe.equals("e") || golpe.equals("E")) {
                                    if (Round==0) {
                                        raioLaser.setDano(10);
                                        System.out.println("'Optic Blast' Attack!" + " +"+raioLaser.getDano() + " range demage ");
                                        System.out.println("Alien está com " + alien.getVida(raioLaser.getDano()) + " HP ");
                                    }

                                    // SPECIAL ABELITY
                                    else {
                                        int multiplicador_De_Dano = 3*Round;
                                        raioLaser.setDano(10+multiplicador_De_Dano);
                                        System.out.println("'Optic Blast' Attack!" + " +"+raioLaser.getDano() + " range demage ");
                                        System.out.println("Alien está com " + alien.getVida(raioLaser.getDano()) + " HP ");
                                    }
                                }

                                // Punição
                                else {
                                    System.out.println("Punição!");
                                    System.out.println("Raio-Laser sofre +5 de dano e agora está com " + raioLaser.getVida(5) + " HP ");
                                }
                            }
                            else if (dado >= 3 && dado <= 5) {
                                System.out.println("'Q' para 'Mega Optic'");
                                golpe = prompt.next();
                                if (golpe.equals("q")||golpe.equals("Q")) {
                                    if (Round==0) {
                                        raioLaser.setDano(20);
                                        System.out.println("'Mega Optic' Attack!" + " +"+raioLaser.getDano() + " range demage ");
                                        System.out.println("Alien está com " + alien.getVida(raioLaser.getDano()) + " HP ");
                                    }

                                    // SPECIAL ABELITY
                                    else {
                                        int multiplicador_De_Dano = 3*Round;
                                        raioLaser.setDano(20+multiplicador_De_Dano);
                                        System.out.println("'Mega Optic' Attack!" + " +"+raioLaser.getDano() + " range demage ");
                                        System.out.println("Alien está com " + alien.getVida(raioLaser.getDano()) + " HP ");
                                    }
                                }

                                // Punição
                                else {
                                    System.out.println("Punição!");
                                    System.out.println("Raio-Laser sofre +5 de dano e agora está com " + raioLaser.getVida(5) + " HP ");
                                }
                            }
                            else if (dado == 6) {
                                System.out.println("'Z' para 'Super Optic'");
                                golpe = prompt.next();
                                if (golpe.equals("z")||golpe.equals("Z")) {
                                    if (Round==0) {
                                        raioLaser.setDano(40);
                                        System.out.println("'Super Optic' Attack!" + " +"+raioLaser.getDano() + " range demage ");
                                        System.out.println("Alien está com " + alien.getVida(raioLaser.getDano()) + " HP ");
                                    }

                                    else {
                                        int multiplicador_De_Dano = 3*Round;
                                        raioLaser.setDano(40*multiplicador_De_Dano);
                                        System.out.println("'Super Optic' Attack!" + " +"+raioLaser.getDano() + " range demage ");
                                        System.out.println("Alien está com " + alien.getVida(raioLaser.getDano()) + " HP ");
                                    }
                                }

                                // Punição
                                else {
                                    System.out.println("Punição!");
                                    System.out.println("Raio-Laser sofre +5 de dano e agora está com " + raioLaser.getVida(5) + " HP ");
                                }
                            }

                            System.out.println(); // Backspace

                            // Alien
                            dado = random.gerarNumeroAleatorio();
                            System.out.println("Vez do Alien...Jogando os dados...deu " + dado);

                            // Golpes
                            if (dado == 1 || dado == 2) {
                                alien.setDano(5);
                                System.out.println("'Split Kick' Attack!'" + " +"+alien.getDano() + " alien demage ");
                                System.out.println("Raio-Laser está com " + raioLaser.getVida(alien.getDano()) + " HP ");
                            }
                            else if (dado >= 3 && dado <= 5) {
                                alien.setDano(10);
                                System.out.println("'Bit Laser' Attack!'" + " +"+alien.getDano() + " alien demage ");
                                System.out.println("Raio-Laser está com " + raioLaser.getVida(alien.getDano()) + " HP ");
                            }
                            else if (dado == 6) {
                                alien.setDano(30);
                                System.out.println("'Shockwave' Attack!'" + " +"+alien.getDano() + " alien demage ");
                                System.out.println("Raio-Laser está com " + raioLaser.getVida(alien.getDano()) + " HP ");
                            }

                            // special ability
                            int multiplicadorDeDano = (3*Round);
                            raioLaser.setDano(multiplicadorDeDano);
                        }

                        // Placar
                        System.out.println("A vida final de Raio-Laser " + raioLaser.getFinalHp() + " HP ");
                        System.out.println("A vida final de Alien " + alien.getFinalHp() + " HP ");

                        // Resultado
                        if (raioLaser.getFinalHp() > alien.getFinalHp()) {
                            System.out.println();
                            System.out.println("O vencedor é Raio-Laser");
                        }
                        else if (raioLaser.getFinalHp() < alien.getFinalHp()) {
                            System.out.println();
                            System.out.println("O vencedor é Alien");
                        }
                        else {
                            System.out.println("Empate!...pelo menos você não perdeu...HAHAHA!");
                        }

                    }

                    // STANDARD MODE
                    if (dificuldade.equals("STANDARD")||dificuldade.equals("standard")) {
                        for (Round = 0; Round < 6 && raioLaser.getFinalHp()>0 && alien.getFinalHp()>0; Round++) {

                            dado = random.gerarNumeroAleatorio();
                            System.out.println("Vez do Raio-Laser...Jogando os dados...deu  " + dado);

                            // Golpes
                            if (dado == 1 || dado == 2) {
                                System.out.println("'E' para 'Optic Blast'");
                                golpe = prompt.next();
                                if (golpe.equals("e") || golpe.equals("E")) {
                                    if (Round==0) {
                                        raioLaser.setDano(10);
                                        System.out.println("'Optic Blast' Attack!" + " +"+raioLaser.getDano() + " range demage ");
                                        System.out.println("Alien está com " + alien.getVida(raioLaser.getDano()) + " HP ");
                                    }

                                    // SPECIAL ABELITY
                                    else {
                                        int multiplicador_De_Dano = 3*Round;
                                        raioLaser.setDano(10+multiplicador_De_Dano);
                                        System.out.println("'Optic Blast' Attack!" + " +"+raioLaser.getDano() + " range demage ");
                                        System.out.println("Alien está com " + alien.getVida(raioLaser.getDano()) + " HP ");
                                    }
                                }

                                // Punição
                                else {
                                    System.out.println("Punição!");
                                    System.out.println("Raio-Laser sofre +5 de dano e agora está com " + raioLaser.getVida(5) + " HP ");
                                }
                            }
                            else if (dado >= 3 && dado <= 5) {
                                System.out.println("'Q' para 'Mega Optic'");
                                golpe = prompt.next();
                                if (golpe.equals("q")||golpe.equals("Q")) {
                                    if (Round==0) {
                                        raioLaser.setDano(20);
                                        System.out.println("'Mega Optic' Attack!" + " +"+raioLaser.getDano() + " range demage ");
                                        System.out.println("Alien está com " + alien.getVida(raioLaser.getDano()) + " HP ");
                                    }

                                    // SPECIAL ABELITY
                                    else {
                                        int multiplicador_De_Dano = 3*Round;
                                        raioLaser.setDano(20+multiplicador_De_Dano);
                                        System.out.println("'Mega Optic' Attack!" + " +"+raioLaser.getDano() + " range demage ");
                                        System.out.println("Alien está com " + alien.getVida(raioLaser.getDano()) + " HP ");
                                    }
                                }

                                // Punição
                                else {
                                    System.out.println("Punição!");
                                    System.out.println("Raio-Laser sofre +6 de dano e agora está com " + raioLaser.getVida(6) + " HP ");
                                }
                            }
                            else if (dado == 6) {
                                System.out.println("'Z' para 'Super Optic'");
                                golpe = prompt.next();
                                if (golpe.equals("z")||golpe.equals("Z")) {
                                    if (Round==0) {
                                        raioLaser.setDano(40);
                                        System.out.println("'Super Optic' Attack!" + " +"+raioLaser.getDano() + " range demage ");
                                        System.out.println("Alien está com " + alien.getVida(raioLaser.getDano()) + " HP ");
                                    }

                                    else {
                                        int multiplicador_De_Dano = 3*Round;
                                        raioLaser.setDano(40*multiplicador_De_Dano);
                                        System.out.println("'Super Optic' Attack!" + " +"+raioLaser.getDano() + " range demage ");
                                        System.out.println("Alien está com " + alien.getVida(raioLaser.getDano()) + " HP ");
                                    }
                                }

                                // Punição
                                else {
                                    System.out.println("Punição!");
                                    System.out.println("Raio-Laser sofre +7 de dano e agora está com " + raioLaser.getVida(7)+ " HP ");
                                }
                            }

                            System.out.println(); // Backspace

                            // Alien
                            dado = random.gerarNumeroAleatorio();
                            System.out.println("Vez do Alien...Jogando os dados...deu " + dado);

                            // Golpes
                            if (dado == 1 || dado == 2) {
                                alien.setDano(10);
                                System.out.println("'Split Kick' Attack!" + " +"+alien.getDano() + " alien demage ");
                                System.out.println("Raio-Laser está com " + raioLaser.getVida(alien.getDano()) + " HP ");
                            }
                            else if (dado >= 3 && dado <= 5) {
                                alien.setDano(20);
                                System.out.println("'Bit Laser' Attack!" + " +" + alien.getDano() + " alien demage ");
                                System.out.println("Raio-Laser está com " + raioLaser.getVida(alien.getDano()) + " HP ");
                            }
                            else if (dado == 6) {
                                alien.setDano(40);
                                System.out.println("'Shockwave' Attack!" + " +" + alien.getDano() + " alien demage ");
                                System.out.println("Raio-Laser está com " + raioLaser.getVida(alien.getDano()) + " HP ");
                            }

                        }

                        // Placar
                        System.out.println("A vida final de Raio-Laser " + raioLaser.getFinalHp() + " HP ");
                        System.out.println("A vida final de Alien " + alien.getFinalHp() + " HP ");

                        // Resultado
                        if (raioLaser.getFinalHp() > alien.getFinalHp()) {
                            System.out.println();
                            System.out.println("O vencedor é Raio-Laser");
                        }
                        else if (raioLaser.getFinalHp() < alien.getFinalHp()) {
                            System.out.println();
                            System.out.println("O vencedor é Alien");
                        }
                        else {
                            System.out.println("Empate!...pelo menos você não perdeu...HAHAHA!");
                        }
                    }

                    // HARD MODE
                    if (dificuldade.equals("HARD")||dificuldade.equals("hard")) {
                        for (Round = 0; Round < 6 && raioLaser.getFinalHp()>0 && alien.getFinalHp()>0; Round++) {

                            dado = random.gerarNumeroAleatorio();
                            System.out.println("Vez do Raio-Laser...Jogando os dados...deu " + dado);

                            // Golpes
                            if (dado == 1 || dado == 2) {
                                System.out.println("'E' para 'Optic Blast'");
                                golpe = prompt.next();
                                if (golpe.equals("e") || golpe.equals("E")) {
                                    if (Round==0) {
                                        raioLaser.setDano(10);
                                        System.out.println("'Optic Blast' Attack!" + " +"+raioLaser.getDano() + " range demage ");
                                        System.out.println("Alien está com " + alien.getVida(raioLaser.getDano()) + " HP ");
                                    }

                                    // SPECIAL ABELITY
                                    else {
                                        int multiplicador_De_Dano = 3*Round;
                                        raioLaser.setDano(10+multiplicador_De_Dano);
                                        System.out.println("'Optic Blast' Attack!" + " +"+raioLaser.getDano() + " range demage ");
                                        System.out.println("Alien está com " + alien.getVida(raioLaser.getDano()) + " HP ");
                                    }
                                }

                                // Punição
                                else {
                                    System.out.println("Punição!");
                                    System.out.println("Raio-Laser sofre +7 de dano e agora está com " + raioLaser.getVida(7) + " HP ");
                                }
                            }
                            else if (dado >= 3 && dado <= 5) {
                                System.out.println("'Q' para 'Mega Optic'");
                                golpe = prompt.next();
                                if (golpe.equals("q")||golpe.equals("Q")) {
                                    if (Round==0) {
                                        raioLaser.setDano(20);
                                        System.out.println("'Mega Optic' Attack!" + " +"+raioLaser.getDano() + " range demage ");
                                        System.out.println("Alien está com " + alien.getVida(raioLaser.getDano()) + " HP ");
                                    }

                                    // SPECIAL ABELITY
                                    else {
                                        int multiplicador_De_Dano = 3*Round;
                                        raioLaser.setDano(20+multiplicador_De_Dano);
                                        System.out.println("'Mega Optic' Attack!" + " +"+raioLaser.getDano() + " range demage ");
                                        System.out.println("Alien está com " + alien.getVida(raioLaser.getDano()) + " HP ");
                                    }
                                }

                                // Punição
                                else {
                                    System.out.println("Punição!");
                                    System.out.println("Raio-Laser sofre +10 de dano e agora está com " + raioLaser.getVida(10) + " HP ");
                                }
                            }
                            else if (dado == 6) {
                                System.out.println("'Z' para 'Super Optic'");
                                golpe = prompt.next();
                                if (golpe.equals("z")||golpe.equals("Z")) {
                                    if (Round==0) {
                                        raioLaser.setDano(40);
                                        System.out.println("'Super Optic' Attack!" + " +"+raioLaser.getDano() + " range demage ");
                                        System.out.println("Alien está com " + alien.getVida(raioLaser.getDano()) + " HP ");
                                    }

                                    else {
                                        int multiplicador_De_Dano = 3*Round;
                                        raioLaser.setDano(40*multiplicador_De_Dano);
                                        System.out.println("'Super Optic' Attack!" + " +"+raioLaser.getDano() + " range demage ");
                                        System.out.println("Alien está com " + alien.getVida(raioLaser.getDano()) + " HP ");
                                    }
                                }

                                // Punição
                                else {
                                    System.out.println("Punição!");
                                    System.out.println("Raio-Laser sofre +15 de dano e agora está com " + raioLaser.getVida(15)+ " HP ");
                                }
                            }

                            System.out.println(); // Backspace

                            // Alien
                            dado = random.gerarNumeroAleatorio();
                            System.out.println("Vez do Alien...Jogando os dados...deu " + dado);

                            // Golpes
                            if (dado == 1 || dado == 2) {
                                alien.setDano(15);
                                System.out.println("'Split Kick' Attack!" + " +"+alien.getDano() + " alien demage ");
                                System.out.println("Raio-Laser está com " + raioLaser.getVida(alien.getDano()) + " HP ");
                            }
                            else if (dado >= 3 && dado <= 5) {
                                alien.setDano(30);
                                System.out.println("'Bit Laser' Attack!" + " +"+alien.getDano() + " alien demage ");
                                System.out.println("Raio-Laser está com " + raioLaser.getVida(alien.getDano()) + " HP ");

                            }
                            else if (dado == 6) {
                                alien.setDano(60);
                                System.out.println("'Shockwave' Attack!" + " +"+alien.getDano() + " alien demage ");
                                System.out.println("Raio-Laser está com " + raioLaser.getVida(alien.getDano()) + " HP ");
                            }

                            // special ability
                            int multiplicadorDeDano = (3*Round);
                            raioLaser.setDano(multiplicadorDeDano);
                        }

                        // Placar
                        System.out.println("A vida final de Raio-Laser " + raioLaser.getFinalHp() + " HP ");
                        System.out.println("A vida final de Alien " + alien.getFinalHp() + " HP ");

                        // Resultado
                        if (raioLaser.getFinalHp() > alien.getFinalHp()) {
                            System.out.println();
                            System.out.println("O vencedor é Raio-Laser");
                        }
                        else if (raioLaser.getFinalHp() < alien.getFinalHp()) {
                            System.out.println();
                            System.out.println("O vencedor é Alien");
                        }
                        else {
                            System.out.println("Empate!...pelo menos você não perdeu...HAHAHA!");
                        }
                    }
                    break;

                case "3": // Relâmpago

                    // EASY MODE
                    if (dificuldade.equals("EASY")||dificuldade.equals("easy")) {
                        for (Round = 1; Round <= 6 && relampago.getFinalHp()>0 && alien.getFinalHp()>0; Round++) {
                            dado = random.gerarNumeroAleatorio();
                            System.out.println("Vez do Relampago...Jogando os dados...deu " + dado);

                            // Golpes
                            if (dado == 1 || dado == 2) {
                                System.out.println("'E' para 'Lightning Attack'");
                                golpe = prompt.next();
                                if (golpe.equals("e")||golpe.equals("E")) {
                                    relampago.setDano(10);
                                    System.out.println("'Lightnig Attack' Attack!" + " +"+relampago.getDano() + " magic demage ");
                                    System.out.println("Alien está com " + alien.getVida(relampago.getDano()) + " HP ");
                                }

                                // Punição
                                else {
                                    System.out.println("Punição!");
                                    System.out.println("Relâmpago sofre +5 de dano e agora está com " + relampago.getVida(5) + " HP ");
                                }
                            }
                            else if (dado >= 3 && dado <= 5) {
                                System.out.println("Q para 'Lightning Storm'");
                                golpe = prompt.next();
                                if (golpe.equals("q")||golpe.equals("Q")) {
                                    relampago.setDano(20);
                                    System.out.println("'Lightning Storm' Attack!" + " +"+relampago.getDano() + " magic demage ");
                                    System.out.println("Alien está com " + alien.getVida(relampago.getDano()) + " HP ");
                                }

                                // Punição
                                else {
                                    System.out.println("Punição!");
                                    System.out.println("Relâmpago sofre +5 de dano e agora está com " + relampago.getVida(5) + " HP ");
                                }
                            }
                            else if (dado == 6) {
                                System.out.println("'Z' para 'Hail Storm'");
                                golpe = prompt.next();
                                if (golpe.equals("z")||golpe.equals("Z")) {
                                    relampago.setDano(40);
                                    System.out.println("'Hail Storm' Attack!" + " +"+relampago.getDano() + " magic demage ");
                                    System.out.println("Alien está com " + alien.getVida(relampago.getDano()) + " HP ");
                                }

                                // Punição
                                else {
                                    System.out.println("Punição!");
                                    System.out.println("Relâmpago sofre +5 de dano e agora está com " + relampago.getVida(5) + " HP ");
                                }
                            }

                            System.out.println(); // Backspace

                            // Alien
                            dado = random.gerarNumeroAleatorio();
                            System.out.println("Vez do Alien...Jogando os dados...deu " + dado);

                            // Golpes
                            if (dado == 1 || dado == 2) {
                                alien.setDano(10);
                                System.out.println("'Split Kick' Attack!" + " +"+alien.getDano() + " alien demage ");
                                System.out.println("Raio-Laser está com " + raioLaser.getVida(alien.getDano()) + " HP ");
                            }
                            else if (dado >= 3 && dado <= 5) {
                                alien.setDano(15);
                                System.out.println("'Bit Laser' Attack!" + " +"+alien.getDano() + " alien demage ");
                                System.out.println("Raio-Laser está com " + raioLaser.getVida(alien.getDano()) + " HP ");
                            }
                            else if (dado == 6) {
                                alien.setDano(30);
                                System.out.println("'Shockwave' Attack!" + " +"+alien.getDano() + " alien demage ");
                                System.out.println("Raio-Laser está com " + raioLaser.getVida(alien.getDano()) + " HP ");
                            }

                            // special ability
                            System.out.println("abilidade especial do Relâmpago adiciona +3 de dano ao alien, agora Alien está com " + alien.getVida(3) + " HP ");
                        }

                        // Placar
                        System.out.println("A vida final de Relâmpago " + relampago.getFinalHp() + " HP ");
                        System.out.println("A vida final de Alien " + alien.getFinalHp() + " HP ");

                        // Resultado
                        if (relampago.getFinalHp() > alien.getFinalHp()) {
                            System.out.println();
                            System.out.println("O vencedor é Relâmpago");
                        }
                        else if (relampago.getFinalHp() < alien.getFinalHp()) {
                            System.out.println();
                            System.out.println("O vencedor é Alien");
                        }
                        else {
                            System.out.println("Empate!...pelo menos você não perdeu...HAHAHA!");
                        }
                    }

                    // STANDARD MODE
                    if (dificuldade.equals("STANDARD")||dificuldade.equals("standard")) {
                        for (Round = 1; Round <= 6  && relampago.getFinalHp()>0 && alien.getFinalHp()>0; Round++) {
                            dado = random.gerarNumeroAleatorio();
                            System.out.println("Vez do Relampago...Jogando os dados...deu " + dado);

                            // Golpes
                            if (dado == 1 || dado == 2) {
                                System.out.println("'E' para 'Lightning Attack'");
                                golpe = prompt.next();
                                if (golpe.equals("e")||golpe.equals("E")) {
                                    relampago.setDano(10);
                                    System.out.println("'Lightnig Attack' Attack!" + " +"+relampago.getDano() + " magic demage ");
                                    System.out.println("Alien está com " + alien.getVida(relampago.getDano()) + " HP ");
                                }

                                // Punição
                                else {
                                    System.out.println("Punição!");
                                    System.out.println("Relâmpago sofre +5 de dano e agora está com " + relampago.getVida(5) + " HP ");
                                }
                            }
                            else if (dado >= 3 && dado <= 5) {
                                System.out.println("Q para 'Lightning Storm'");
                                golpe = prompt.next();
                                if (golpe.equals("q")||golpe.equals("Q")) {
                                    relampago.setDano(20);
                                    System.out.println("'Lightning Storm' Attack!" + " +"+relampago.getDano() + " magic demage ");
                                    System.out.println("Alien está com " + alien.getVida(relampago.getDano()) + " HP ");
                                }

                                // Punição
                                else {
                                    System.out.println("Punição!");
                                    System.out.println("Relâmpago sofre +6 de dano e agora está com " + relampago.getVida(6) + " HP ");
                                }
                            }
                            else if (dado == 6) {
                                System.out.println("'Z' para 'Hail Storm'");
                                golpe = prompt.next();
                                if (golpe.equals("z")||golpe.equals("Z")) {
                                    relampago.setDano(40);
                                    System.out.println("'Hail Storm' Attack!" + " +"+relampago.getDano() + " magic demage ");
                                    System.out.println("Alien está com " + alien.getVida(relampago.getDano()) + " HP ");
                                }

                                // Punição
                                else {
                                    System.out.println("Punição!");
                                    System.out.println("Relâmpago sofre +7 de dano e agora está com " + relampago.getVida(7) + " HP ");
                                }
                            }

                            System.out.println(); // Backspace

                            // Alien
                            dado = random.gerarNumeroAleatorio();
                            System.out.println("Vez do Alien...Jogando os dados...deu " + dado);

                            // Golpes
                            if (dado == 1 || dado == 2) {
                                alien.setDano(10);
                                System.out.println("'Split Kick' Attack!" + " +"+alien.getDano() + " alien demage ");
                                System.out.println("Raio-Laser está com " + raioLaser.getVida(alien.getDano()) + " HP ");
                            }
                            else if (dado >= 3 && dado <= 5) {
                                alien.setDano(20);
                                System.out.println("'Bit Laser' Attack!" + " +"+alien.getDano() + " alien demage ");
                                System.out.println("Raio-Laser está com " + raioLaser.getVida(alien.getDano()) + " HP ");
                            }
                            else if (dado == 6) {
                                alien.setDano(40);
                                System.out.println("'Shockwave' Attack!" + " +"+alien.getDano() + " alien demage ");
                                System.out.println("Raio-Laser está com " + raioLaser.getVida(alien.getDano()) + " HP ");
                            }

                            // special ability
                            System.out.println("abilidade especial do Relâmpago adiciona +3 de dano ao alien, agora Alien está com " + alien.getVida(3) + " HP ");
                        }

                        // Placar
                        System.out.println("A vida final de Relâmpago " + relampago.getFinalHp() + " HP ");
                        System.out.println("A vida final de Alien " + alien.getFinalHp() + " HP ");

                        // Resultado
                        if (relampago.getFinalHp() > alien.getFinalHp()) {
                            System.out.println();
                            System.out.println("O vencedor é Relâmpago");
                        }
                        else if (relampago.getFinalHp() < alien.getFinalHp()) {
                            System.out.println();
                            System.out.println("O vencedor é Alien");
                        }
                        else {
                            System.out.println("Empate!...pelo menos você não perdeu...HAHAHA!");
                        }
                    }

                    // HARD MODE
                    if (dificuldade.equals("HARD")||dificuldade.equals("hard")) {
                        for (Round = 1; Round <= 6  && relampago.getFinalHp()>0 && alien.getFinalHp()>0; Round++) {
                            dado = random.gerarNumeroAleatorio();
                            System.out.println("Vez do Relampago...Jogando os dados...deu " + dado);

                            // Golpes
                            if (dado == 1 || dado == 2) {
                                System.out.println("'E' para 'Lightning Attack'");
                                golpe = prompt.next();
                                if (golpe.equals("e")||golpe.equals("E")) {
                                    relampago.setDano(10);
                                    System.out.println("'Lightnig Attack' Attack!" + " +"+relampago.getDano() + " magic demage ");
                                    System.out.println("Alien está com " + alien.getVida(relampago.getDano()) + " HP ");
                                }

                                // Punição
                                else {
                                    System.out.println("Punição!");
                                    System.out.println("Relâmpago sofre +7 de dano e agora está com " + relampago.getVida(7) + " HP ");
                                }
                            }
                            else if (dado >= 3 && dado <= 5) {
                                System.out.println("Q para 'Lightning Storm'");
                                golpe = prompt.next();
                                if (golpe.equals("q")||golpe.equals("Q")) {
                                    relampago.setDano(20);
                                    System.out.println("'Lightning Storm' Attack!" + " +"+relampago.getDano() + " magic demage ");
                                    System.out.println("Alien está com " + alien.getVida(relampago.getDano()) + " HP ");
                                }

                                // Punição
                                else {
                                    System.out.println("Punição!");
                                    System.out.println("Relâmpago sofre +10 de dano e agora está com " + relampago.getVida(10) + " HP ");
                                }
                            }
                            else if (dado == 6) {
                                System.out.println("'Z' para 'Hail Storm'");
                                golpe = prompt.next();
                                if (golpe.equals("z")||golpe.equals("Z")) {
                                    relampago.setDano(40);
                                    System.out.println("'Hail Storm' Attack!" + " +"+relampago.getDano() + " magic demage ");
                                    System.out.println("Alien está com " + alien.getVida(relampago.getDano()) + " HP ");
                                }

                                // Punição
                                else {
                                    System.out.println("Punição!");
                                    System.out.println("Relâmpago sofre +15 de dano e agora está com " + relampago.getVida(15) + " HP ");
                                }
                            }

                            System.out.println(); // Backspace

                            // Alien
                            dado = random.gerarNumeroAleatorio();
                            System.out.println("Vez do Alien...Jogando os dados...deu " + dado);

                            // Golpes
                            if (dado == 1 || dado == 2) {
                                alien.setDano(15);
                                System.out.println("'Split Kick' Attack!" + " +"+alien.getDano() + " alien demage ");
                                System.out.println("Raio-Laser está com " + raioLaser.getVida(alien.getDano()) + " HP ");
                            }
                            else if (dado >= 3 && dado <= 5) {
                                alien.setDano(30);
                                System.out.println("'Bit Laser' Attack!" + " +"+alien.getDano() + " alien demage ");
                                System.out.println("Raio-Laser está com " + raioLaser.getVida(alien.getDano()) + " HP ");
                            }
                            else if (dado == 6) {
                                alien.setDano(50);
                                System.out.println("'Shockwave' Attack!" + " +"+alien.getDano() + " alien demage ");
                                System.out.println("Raio-Laser está com " + raioLaser.getVida(alien.getDano()) + " HP ");
                            }

                            // special ability
                            System.out.println("abilidade especial do Relâmpago adiciona +3 de dano ao alien, agora Alien está com " + alien.getVida(3) + " HP ");
                        }

                        // Placar
                        System.out.println("A vida final de Relâmpago " + relampago.getFinalHp() + " HP ");
                        System.out.println("A vida final de Alien " + alien.getFinalHp() + " HP ");

                        // Resultado
                        if (relampago.getFinalHp() > alien.getFinalHp()) {
                            System.out.println();
                            System.out.println("O vencedor é Relâmpago");
                        }
                        else if (relampago.getFinalHp() < alien.getFinalHp()) {
                            System.out.println();
                            System.out.println("O vencedor é Alien");
                        }
                        else {
                            System.out.println("Empate!...pelo menos você não perdeu...HAHAHA!");
                        }
                    }
                    break;

                default:
                    break;
            }
        }
    }
}