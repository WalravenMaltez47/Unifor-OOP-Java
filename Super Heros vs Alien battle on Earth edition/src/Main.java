import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner prompt = new Scanner(System.in);
        RandomMethod random = new RandomMethod();

        // setting a vida (hp)
        int hpDoHero = 200;
        int hpDoAlien = 200;
        MuqueMan muqueMan = new MuqueMan(hpDoHero);
        RaioLaser raioLaser = new RaioLaser(hpDoHero);
        Relampago relampago = new Relampago(hpDoHero);
        EvilAlien alien = new EvilAlien(hpDoAlien);

        // Escolha do personagem
        System.out.println("Escolha seu personagem: ");
        System.out.println("1 - Muque-Man");
        System.out.println("2 - Raio-Laser");
        System.out.println("3 - Relâmpago");
        int escolhaDoPersonagem = prompt.nextInt();

        // Escolha da Dificuldade
        System.out.println("Escolha a difuldade");
        System.out.println("Escreva 'EASY' para fácil");
        System.out.println("Escreva 'STANDARD' para dificuldade padrão");
        System.out.println("Escreva 'Hard' para dificuldade difícil");
        String dificuldade = prompt.next();

        // Start
        System.out.println("digite 'start' para comecar");
        String start = prompt.next();

        if (start.equals("start") || start.equals("START")) {

            int dado;
            int Round;
            String golpe;

            switch (escolhaDoPersonagem) {

                case 1: // Muque-Man

                    // EASY MODE
                    if (dificuldade.equals("EASY")||dificuldade.equals("easy")) {
                        // if (hpDoHero<0) {return;} else {}

                            for (Round = 1; Round <= 6; Round++) {
                                dado = random.gerarNumeroAleatorio();
                                System.out.println("Vez do Muque-Man...Jogando os dados...deu " + dado);

                                if (dado == 1 || dado == 2) {
                                    System.out.println("'E' para 'Chute'");
                                    golpe = prompt.next();
                                    if (golpe.equals("e") || golpe.equals("E")) {
                                        System.out.println("'Chute' Attack!");
                                        System.out.println("Alien sofreu +10 de dano de Muque-Man e agora está com " + alien.damage(10) + " HP ");
                                    }

                                    // Punição
                                    else {
                                        System.out.println("Punição!");
                                        System.out.println("Muque-Man sofre +5 de dano e agora está com " + muqueMan.damage(5) + " HP ");
                                    }
                                }
                                else if (dado >= 3 && dado <= 5) {
                                    System.out.println("'Q' para 'Tornado'");
                                    golpe = prompt.next();
                                    if (golpe.equals("q") || golpe.equals("Q")) {
                                        System.out.println("'Tornado' Attack!");
                                        System.out.println("Alien sofreu +20 de dano de Muque-Man e agora está com " + alien.damage(20) + " HP ");
                                    }

                                    // Punição
                                    else {
                                        System.out.println("Punição!");
                                        System.out.println("Muque-Man sofre +5 de dano e agora está com " + muqueMan.damage(5) + " HP ");
                                    }
                                }
                                else if (dado == 6) {
                                    System.out.println("'Z' para 'Berserker'");
                                    golpe = prompt.next();
                                    if (golpe.equals("z") || golpe.equals("Z")) {
                                        System.out.println("'Berserker' Attack!");
                                        System.out.println("Alien sofreu +40 de dano de Muque-Man e agora está com " + alien.damage(40) + " HP ");
                                    }

                                    // Punição
                                    else {
                                        System.out.println("Punição!");
                                        System.out.println("Muque-Man sofre +5 de dano e agora está com " + muqueMan.damage(5) + " HP ");
                                    }
                                }

                                // special ability
                                System.out.println("abilidade especial do Muque-Man lhe concede +5 de hp, agora ele está com " + muqueMan.healing(5) + " HP ");

                                System.out.println(); // Backspace

                                // Alien
                                dado = random.gerarNumeroAleatorio();
                                System.out.println("Vez do Alien...Jogando os dados...deu " + dado);

                                // Golpes
                                if (dado == 1 || dado == 2) {
                                    System.out.println("'Split Kick' Attack!");
                                    System.out.println("Muque-Man sofreu +5 de dano de Alien e agora está com " + muqueMan.damage(5) + " HP ");
                                }
                                else if (dado >= 3 && dado <= 5) {
                                    System.out.println("'Bit Laser' Attack!");
                                    System.out.println("Muque-Man sofreu +10 de dano de Alien e agora está com " + muqueMan.damage(10) + " HP ");
                                }
                                else if (dado == 6) {
                                    System.out.println("'Shockwave' Attack!");
                                    System.out.println("Muque-Man sofreu +20 de dano de Alien e agora está com " + muqueMan.damage(20) + " HP ");
                                }
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
                        for (Round = 1; Round <= 6; Round++) {
                            dado = random.gerarNumeroAleatorio();
                            System.out.println("Vez do Muque-Man...Jogando os dados...deu " + dado);

                            if (dado == 1 || dado == 2) {
                                System.out.println("'E' para 'Chute'");
                                golpe = prompt.next();
                                if (golpe.equals("e") || golpe.equals("E")) {
                                    System.out.println("'Chute' Attack!");
                                    System.out.println("Alien sofreu +10 de dano de Muque-Man e agora está com " + alien.damage(10) + " HP ");
                                }

                                // Punição
                                else {
                                    System.out.println("Punição!");
                                    System.out.println("Muque-Man sofre +5 de dano e agora está com " + muqueMan.damage(5) + " HP ");
                                }
                            }
                            else if (dado >= 3 && dado <= 5) {
                                System.out.println("'Q' para 'Tornado'");
                                golpe = prompt.next();
                                if (golpe.equals("q") || golpe.equals("Q")) {
                                    System.out.println("'Tornado' Attack!");
                                    System.out.println("Alien sofreu +20 de dano de Muque-Man e agora está com " + alien.damage(20) + " HP ");
                                }

                                // Punição
                                else {
                                    System.out.println("Punição!");
                                    System.out.println("Muque-Man sofre +6 de dano e agora está com " + muqueMan.damage(6) + " HP ");
                                }
                            }
                            else if (dado == 6) {
                                System.out.println("'Z' para 'Berserker'");
                                golpe = prompt.next();
                                if (golpe.equals("z") || golpe.equals("Z")) {
                                    System.out.println("'Berserker' Attack!");
                                    System.out.println("Alien sofreu +40 de dano de Muque-Man e agora está com " + alien.damage(40) + " HP ");
                                }

                                // Punição
                                else {
                                    System.out.println("Punição!");
                                    System.out.println("Muque-Man sofre +7 de dano e agora está com " + muqueMan.damage(7) + " HP ");
                                }
                            }

                            // special ability
                            System.out.println("abilidade especial do Muque-Man lhe concede +5 de hp, agora ele está com " + muqueMan.healing(5) + " HP ");

                            System.out.println(); // Backspace

                            // Alien
                            dado = random.gerarNumeroAleatorio();
                            System.out.println("Vez do Alien...Jogando os dados...deu " + dado);

                            // Golpes
                            if (dado == 1 || dado == 2) {
                                System.out.println("'Split Kick' Attack!");
                                System.out.println("Muque-Man sofreu +10 de dano de Alien e agora está com " + muqueMan.damage(10) + " HP ");
                            }
                            else if (dado >= 3 && dado <= 5) {
                                System.out.println("'Bit Laser' Attack!");
                                System.out.println("Muque-Man sofreu +20 de dano de Alien e agora está com " + muqueMan.damage(20) + " HP ");
                            }
                            else if (dado == 6) {
                                System.out.println("'Shockwave' Attack!");
                                System.out.println("Muque-Man sofreu +40 de dano de Alien e agora está com " + muqueMan.damage(40) + " HP ");
                            }
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
                        for (Round = 1; Round <= 6; Round++) {
                            dado = random.gerarNumeroAleatorio();
                            System.out.println("Vez do Muque-Man...Jogando os dados...deu " + dado);


                            if (dado == 1 || dado == 2) {
                                System.out.println("'E' para 'Chute'");
                                golpe = prompt.next();
                                if (golpe.equals("e") || golpe.equals("E")) {
                                    System.out.println("'Chute' Attack!");
                                    System.out.println("Alien sofreu +5 de dano de Muque-Man e agora está com " + alien.damage(5) + " HP ");
                                }

                                // Punição
                                else {
                                    System.out.println("Punição!");
                                    System.out.println("Muque-Man sofre +7 de dano e agora está com " + muqueMan.damage(7) + " HP ");
                                }
                            }
                            else if (dado >= 3 && dado <= 5) {
                                System.out.println("'Q' para 'Tornado'");
                                golpe = prompt.next();
                                if (golpe.equals("q") || golpe.equals("Q")) {
                                    System.out.println("'Tornado' Attack!");
                                    System.out.println("Alien sofreu +10 de dano de Muque-Man e agora está com " + alien.damage(10) + " HP ");
                                }

                                // Punição
                                else {
                                    System.out.println("Punição!");
                                    System.out.println("Muque-Man sofre +10 de dano e agora está com " + muqueMan.damage(7) + " HP ");
                                }
                            }
                            else if (dado == 6) {
                                System.out.println("'Z' para 'Berserker'");
                                golpe = prompt.next();
                                if (golpe.equals("z") || golpe.equals("Z")) {
                                    System.out.println("'Berserker' Attack!");
                                    System.out.println("Alien sofreu +30 de dano de Muque-Man e agora está com " + alien.damage(30) + " HP ");
                                }

                                // Punição
                                else {
                                    System.out.println("Punição!");
                                    System.out.println("Muque-Man sofre +15 de dano e agora está com " + muqueMan.damage(7) + " HP ");
                                }
                            }

                            // special ability
                            System.out.println("abilidade especial do Muque-Man lhe concede +5 de hp, agora ele está com " + muqueMan.healing(5) + " HP ");

                            System.out.println(); // Backspace

                            // Alien
                            dado = random.gerarNumeroAleatorio();
                            System.out.println("Vez do Alien...Jogando os dados...deu " + dado);

                            // Golpes
                            if (dado == 1 || dado == 2) {
                                System.out.println("'Split Kick' Attack!");
                                System.out.println("Muque-Man sofreu +20 de dano de Alien e agora está com " + muqueMan.damage(20) + " HP ");
                            }
                            else if (dado >= 3 && dado <= 5) {
                                System.out.println("'Bit Laser' Attack!");
                                System.out.println("Muque-Man sofreu +30 de dano de Alien e agora está com " + muqueMan.damage(30) + " HP ");
                            }
                            else if (dado == 6) {
                                System.out.println("'Shockwave' Attack!");
                                System.out.println("Muque-Man sofreu +50 de dano de Alien e agora está com " + muqueMan.damage(50) + " HP ");
                            }
                        }

                        // Placar
                        System.out.println("A vida final de Muque-Man " + muqueMan.getFinalHp() + "hpDoHero");
                        System.out.println("A vida final de Alien " + alien.getFinalHp() + "hpDoHero");

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

                case 2: // Raio-Laser

                    // EASY MODE
                    if (dificuldade.equals("EASY")||dificuldade.equals("easy")) {
                        for (Round = 1; Round <= 6; Round++) {
                            int multiplicadorDeDano = (3*Round);
                            dado = random.gerarNumeroAleatorio();
                            System.out.println("Vez do Raio-Laser...Jogando os dados...deu " + dado);

                            // Golpes
                            if (dado == 1 || dado == 2) {
                                System.out.println("'E' para 'Optic Blast'");
                                golpe = prompt.next();
                                if (golpe.equals("e") || golpe.equals("E")) {
                                    System.out.println("'Optic Blast' Attack!");
                                    System.out.println("Alien sofreu +10 de dano de Raio-Laser e agora está com " + alien.damage(10) + " HPo ");
                                }

                                // Punição
                                else {
                                    System.out.println("Punição!");
                                    System.out.println("Raio-Laser sofre +5 de dano e agora está com " + raioLaser.damage(5) + " HP ");
                                }
                            }
                            else if (dado >= 3 && dado <= 5) {
                                System.out.println("'Q' para 'Mega Optic'");
                                golpe = prompt.next();
                                if (golpe.equals("q")||golpe.equals("Q")) {
                                    System.out.println("'Mega Optic' Attack!");
                                    System.out.println("Alien sofreu +20 de dano de Raio-Laser e agora está com " + alien.damage(20) + " HP ");
                                }

                                // Punição
                                else {
                                    System.out.println("Punição!");
                                    System.out.println("Raio-Laser sofre +5 de dano e agora está com " + raioLaser.damage(5) + " HP ");
                                }
                            }
                            else if (dado == 6) {
                                System.out.println("'Z' para 'Super Optic'");
                                golpe = prompt.next();
                                if (golpe.equals("z")||golpe.equals("Z")) {
                                    System.out.println("'Super Optic' Attack!");
                                    System.out.println("Alien sofreu +40 de dano de Raio-Laser e agora está com " + alien.damage(40) + " HP ");
                                }

                                // Punição
                                else {
                                    System.out.println("Punição!");
                                    System.out.println("Raio-Laser sofre +5 de dano e agora está com " + raioLaser.damage(5) + " HP ");
                                }
                            }

                            // special ability
                            System.out.println("abilidade especial do Raio-Laser aumenta em +3 o seu dano por rodada, agora Alien está com " + alien.damage(multiplicadorDeDano) + " HP ");

                            System.out.println(); // Backspace

                            // Alien
                            dado = random.gerarNumeroAleatorio();
                            System.out.println("Vez do Alien...Jogando os dados...deu " + dado);

                            // Golpes
                            if (dado == 1 || dado == 2) {
                                System.out.println("'Split Kick' Attack!");
                                System.out.println("Raio-Laser sofreu +5 de dano de Alien e agora está com " + raioLaser.damage(5) + " HP ");
                            }
                            else if (dado >= 3 && dado <= 5) {
                                System.out.println("'Bit Laser' Attack!");
                                System.out.println("Raio-Laser sofreu +10 de dano de Alien e agora está com " + raioLaser.damage(10) + " HP ");
                            }
                            else if (dado == 6) {
                                System.out.println("'Shockwave' Attack!");
                                System.out.println("Raio-Laser sofreu +20 de dano de Alien e agora está com " + raioLaser.damage(20) + " HP ");
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

                    // STANDARD MODE
                    if (dificuldade.equals("STANDARD")||dificuldade.equals("standard")) {
                        for (Round = 1; Round <= 6; Round++) {
                            int multiplicadorDeDano = (3*Round);
                            dado = random.gerarNumeroAleatorio();
                            System.out.println("Vez do Raio-Laser...Jogando os dados...deu  " + dado);

                            // Golpes
                            if (dado == 1 || dado == 2) {
                                System.out.println("'E' para 'Optic Blast'");
                                golpe = prompt.next();
                                if (golpe.equals("e") || golpe.equals("E")) {
                                    System.out.println("'Optic Blast' Attack!");
                                    System.out.println("Alien sofreu +10 de dano de Raio-Laser e agora está com " + alien.damage(10) + " HP ");
                                }

                                // Punição
                                else {
                                    System.out.println("Punição!");
                                    System.out.println("Raio-Laser sofre +5 de dano e agora está com " + raioLaser.damage(5) + " HP ");
                                }
                            }
                            else if (dado >= 3 && dado <= 5) {
                                System.out.println("'Q' para 'Mega Optic'");
                                golpe = prompt.next();
                                if (golpe.equals("q")||golpe.equals("Q")) {
                                    System.out.println("'Mega Optic' Attack!");
                                    System.out.println("Alien sofreu +20 de dano de Raio-Laser e agora está com " + alien.damage(20) + " HP ");
                                }

                                // Punição
                                else {
                                    System.out.println("Punição!");
                                    System.out.println("Raio-Laser sofre +6 de dano e agora está com " + raioLaser.damage(6) + " HP ");
                                }
                            }
                            else if (dado == 6) {
                                System.out.println("'Z' para 'Super Optic'");
                                golpe = prompt.next();
                                if (golpe.equals("z")||golpe.equals("Z")) {
                                    System.out.println("'Super Optic' Attack!");
                                    System.out.println("Alien sofreu +40 de dano de Raio-Laser e agora está com " + alien.damage(40) + " HP ");
                                }

                                // Punição
                                else {
                                    System.out.println("Punição!");
                                    System.out.println("Raio-Laser sofre +7 de dano e agora está com " + raioLaser.damage(7)+ " HP ");
                                }
                            }

                            // special ability
                            System.out.println("abilidade especial do Raio-Laser aumenta em +3 o seu dano por rodada, agora Alien está com " + alien.damage(multiplicadorDeDano) + " HP ");

                            System.out.println(); // Backspace

                            // Alien
                            dado = random.gerarNumeroAleatorio();
                            System.out.println("Vez do Alien...Jogando os dados...deu " + dado);

                            // Golpes
                            if (dado == 1 || dado == 2) {
                                System.out.println("'Split Kick' Attack!");
                                System.out.println("Raio-Laser sofreu +10 de dano de Alien e agora está com " + raioLaser.damage(10) + " HP ");
                            }
                            else if (dado >= 3 && dado <= 5) {
                                System.out.println("'Bit Laser' Attack!");
                                System.out.println("Raio-Laser sofreu +20 de dano de Alien e agora está com " + raioLaser.damage(20) + " HP ");
                            }
                            else if (dado == 6) {
                                System.out.println("'Shockwave' Attack!");
                                System.out.println("Raio-Laser sofreu +40 de dano de Alien e agora está com " + raioLaser.damage(40) + " HP ");
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
                        for (Round = 1; Round <= 6; Round++) {
                            int multiplicadorDeDano = (3*Round);
                            dado = random.gerarNumeroAleatorio();
                            System.out.println("Vez do Raio-Laser...Jogando os dados...deu " + dado);

                            // Golpes
                            if (dado == 1 || dado == 2) {
                                System.out.println("'E' para 'Optic Blast'");
                                golpe = prompt.next();
                                if (golpe.equals("e") || golpe.equals("E")) {
                                    System.out.println("'Optic Blast' Attack!");
                                    System.out.println("Alien sofreu +10 de dano de Raio-Laser e agora está com " + alien.damage(10) + " HP ");
                                }

                                // Punição
                                else {
                                    System.out.println("Punição!");
                                    System.out.println("Raio-Laser sofre +7 de dano e agora está com " + raioLaser.damage(7) + " HP ");
                                }
                            }
                            else if (dado >= 3 && dado <= 5) {
                                System.out.println("'Q' para 'Mega Optic'");
                                golpe = prompt.next();
                                if (golpe.equals("q")||golpe.equals("Q")) {
                                    System.out.println("'Mega Optic' Attack!");
                                    System.out.println("Alien sofreu +20 de dano de Raio-Laser e agora está com " + alien.damage(20) + " HP ");
                                }

                                // Punição
                                else {
                                    System.out.println("Punição!");
                                    System.out.println("Raio-Laser sofre +10 de dano e agora está com " + raioLaser.damage(10) + " HP ");
                                }
                            }
                            else if (dado == 6) {
                                System.out.println("'Z' para 'Super Optic'");
                                golpe = prompt.next();
                                if (golpe.equals("z")||golpe.equals("Z")) {
                                    System.out.println("'Super Optic' Attack!");
                                    System.out.println("Alien sofreu +40 de dano de Raio-Laser e agora está com " + alien.damage(40) + " HP ");
                                }

                                // Punição
                                else {
                                    System.out.println("Punição!");
                                    System.out.println("Raio-Laser sofre +15 de dano e agora está com " + raioLaser.damage(15)+ " HP ");
                                }
                            }

                            // special ability
                            System.out.println("abilidade especial do Raio-Laser aumenta em +3 o seu dano por rodada, agora Alien está com " + alien.damage(multiplicadorDeDano) + " HP ");

                            System.out.println(); // Backspace

                            // Alien
                            dado = random.gerarNumeroAleatorio();
                            System.out.println("Vez do Alien...Jogando os dados...deu " + dado);

                            // Golpes
                            if (dado == 1 || dado == 2) {
                                System.out.println("'Split Kick' Attack!");
                                System.out.println("Raio-Laser sofreu +15 de dano de Alien e agora está com " + raioLaser.damage(15) + " HP ");
                            }
                            else if (dado >= 3 && dado <= 5) {
                                System.out.println("'Bit Laser' Attack!");
                                System.out.println("Raio-Laser sofreu +30 de dano de Alien e agora está com " + raioLaser.damage(30) + " HP ");
                            }
                            else if (dado == 6) {
                                System.out.println("'Shockwave' Attack!");
                                System.out.println("Raio-Laser sofreu +50 de dano de Alien e agora está com " + raioLaser.damage(50) + " HP ");
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
                    break;

                case 3: // Relâmpago

                    // EASY MODE
                    if (dificuldade.equals("EASY")||dificuldade.equals("easy")) {
                        for (Round = 1; Round <= 6; Round++) {
                            dado = random.gerarNumeroAleatorio();
                            System.out.println("Vez do Relampago...Jogando os dados...deu " + dado);

                            // Golpes
                            if (dado == 1 || dado == 2) {
                                System.out.println("'E' para 'Lightning Attack'");
                                golpe = prompt.next();
                                if (golpe.equals("e")||golpe.equals("E")) {
                                    System.out.println("'Lightnig Attack' Attack!");
                                    System.out.println("Alien sofreu +10 de dano de Relampago e agora está com " + alien.damage(10) + " HP ");
                                }

                                // Punição
                                else {
                                    System.out.println("Punição!");
                                    System.out.println("Relâmpago sofre +5 de dano e agora está com " + relampago.damage(5) + " HP ");
                                }
                            }
                            else if (dado >= 3 && dado <= 5) {
                                System.out.println("Q para 'Lightning Storm'");
                                golpe = prompt.next();
                                if (golpe.equals("q")||golpe.equals("Q")) {
                                    System.out.println("'Lightning Storm' Attack!");
                                    System.out.println("Alien sofreu +20 de dano de Relampago e agora está com " + alien.damage(20) + " HP ");
                                }

                                // Punição
                                else {
                                    System.out.println("Punição!");
                                    System.out.println("Relâmpago sofre +5 de dano e agora está com " + relampago.damage(5) + " HP ");
                                }
                            }
                            else if (dado == 6) {
                                System.out.println("'Z' para 'Hail Storm'");
                                golpe = prompt.next();
                                if (golpe.equals("z")||golpe.equals("Z")) {
                                    System.out.println("'Hail Storm' Attack!");
                                    System.out.println("Alien sofreu +40 de dano de Relâmpago e agora está com " + alien.damage(40) + " HP ");
                                }

                                // Punição
                                else {
                                    System.out.println("Punição!");
                                    System.out.println("Relâmpago sofre +5 de dano e agora está com " + relampago.damage(5) + " HP ");
                                }
                            }

                            // special ability
                            System.out.println("abilidade especial do Relâmpago adiciona +3 de dano ao alien, agora Alien está com " + alien.damage(3) + " HP ");

                            System.out.println(); // Backspace

                            // Alien
                            dado = random.gerarNumeroAleatorio();
                            System.out.println("Vez do Alien...Jogando os dados...deu " + dado);

                            // Golpes
                            if (dado == 1 || dado == 2) {
                                System.out.println("'Split Kick' Attack!");
                                System.out.println("Relâmpago sofreu +5 de dano de Alien e agora está com " + relampago.damage(5) + " HP ");
                            }
                            else if (dado >= 3 && dado <= 5) {
                                System.out.println("'Bit Laser' Attack!");
                                System.out.println("Relâmpago sofreu +10 de dano de Alien e agora está com " + relampago.damage(10) + " HP ");
                            }
                            else if (dado == 6) {
                                System.out.println("'Shockwave' Attack!");
                                System.out.println("Relâmpago sofreu +20 de dano de Alien e agora está com " + relampago.damage(20) + " HP ");
                            }
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
                        for (Round = 1; Round <= 6; Round++) {
                            dado = random.gerarNumeroAleatorio();
                            System.out.println("Vez do Relampago...Jogando os dados...deu " + dado);

                            // Golpes
                            if (dado == 1 || dado == 2) {
                                System.out.println("'E' para 'Lightning Attack'");
                                golpe = prompt.next();
                                if (golpe.equals("e")||golpe.equals("E")) {
                                    System.out.println("'Lightnig Attack' Attack!");
                                    System.out.println("Alien sofreu +10 de dano de Relampago e agora está com " + alien.damage(10) + " HP ");
                                }

                                // Punição
                                else {
                                    System.out.println("Punição!");
                                    System.out.println("Relâmpago sofre +5 de dano e agora está com " + relampago.damage(5) + " HP ");
                                }
                            }
                            else if (dado >= 3 && dado <= 5) {
                                System.out.println("Q para 'Lightning Storm'");
                                golpe = prompt.next();
                                if (golpe.equals("q")||golpe.equals("Q")) {
                                    System.out.println("'Lightning Storm' Attack!");
                                    System.out.println("Alien sofreu +20 de dano de Relampago e agora está com " + alien.damage(20) + " HP ");
                                }

                                // Punição
                                else {
                                    System.out.println("Punição!");
                                    System.out.println("Relâmpago sofre +6 de dano e agora está com " + relampago.damage(6) + " HP ");
                                }
                            }
                            else if (dado == 6) {
                                System.out.println("'Z' para 'Hail Storm'");
                                golpe = prompt.next();
                                if (golpe.equals("z")||golpe.equals("Z")) {
                                    System.out.println("'Hail Storm' Attack!");
                                    System.out.println("Alien sofreu +40 de dano de Relâmpago e agora está com " + alien.damage(40) + " HP ");
                                }

                                // Punição
                                else {
                                    System.out.println("Punição!");
                                    System.out.println("Relâmpago sofre +7 de dano e agora está com " + relampago.damage(7) + " HP ");
                                }
                            }

                            // special ability
                            System.out.println("abilidade especial do Relâmpago adiciona +3 de dano ao alien, agora Alien está com " + alien.damage(3) + " HP ");

                            System.out.println(); // Backspace

                            // Alien
                            dado = random.gerarNumeroAleatorio();
                            System.out.println("Vez do Alien...Jogando os dados...deu " + dado);

                            // Golpes
                            if (dado == 1 || dado == 2) {
                                System.out.println("'Split Kick' Attack!");
                                System.out.println("Relâmpago sofreu +10 de dano de Alien e agora está com " + relampago.damage(10) + " HP ");
                            }
                            else if (dado >= 3 && dado <= 5) {
                                System.out.println("'Bit Laser' Attack!");
                                System.out.println("Relâmpago sofreu +20 de dano de Alien e agora está com " + relampago.damage(20) + " HP ");
                            }
                            else if (dado == 6) {
                                System.out.println("'Shockwave' Attack!");
                                System.out.println("Relâmpago sofreu +40 de dano de Alien e agora está com " + relampago.damage(40) + " HP ");
                            }
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
                        for (Round = 1; Round <= 6; Round++) {
                            dado = random.gerarNumeroAleatorio();
                            System.out.println("Vez do Relampago...Jogando os dados...deu " + dado);

                            // Golpes
                            if (dado == 1 || dado == 2) {
                                System.out.println("'E' para 'Lightning Attack'");
                                golpe = prompt.next();
                                if (golpe.equals("e")||golpe.equals("E")) {
                                    System.out.println("'Lightnig Attack' Attack!");
                                    System.out.println("Alien sofreu +10 de dano de Relampago e agora está com " + alien.damage(10) + " HP ");
                                }

                                // Punição
                                else {
                                    System.out.println("Punição!");
                                    System.out.println("Relâmpago sofre +7 de dano e agora está com " + relampago.damage(7) + " HP ");
                                }
                            }
                            else if (dado >= 3 && dado <= 5) {
                                System.out.println("Q para 'Lightning Storm'");
                                golpe = prompt.next();
                                if (golpe.equals("q")||golpe.equals("Q")) {
                                    System.out.println("'Lightning Storm' Attack!");
                                    System.out.println("Alien sofreu +20 de dano de Relampago e agora está com " + alien.damage(20) + " HP ");
                                }

                                // Punição
                                else {
                                    System.out.println("Punição!");
                                    System.out.println("Relâmpago sofre +10 de dano e agora está com " + relampago.damage(10) + " HP ");
                                }
                            }
                            else if (dado == 6) {
                                System.out.println("'Z' para 'Hail Storm'");
                                golpe = prompt.next();
                                if (golpe.equals("z")||golpe.equals("Z")) {
                                    System.out.println("'Hail Storm' Attack!");
                                    System.out.println("Alien sofreu +40 de dano de Relâmpago e agora está com " + alien.damage(40) + " HP ");
                                }

                                // Punição
                                else {
                                    System.out.println("Punição!");
                                    System.out.println("Relâmpago sofre +15 de dano e agora está com " + relampago.damage(15) + " HP ");
                                }
                            }

                            // special ability
                            System.out.println("abilidade especial do Relâmpago adiciona +3 de dano ao alien, agora Alien está com " + alien.damage(3) + " HP ");

                            System.out.println(); // Backspace

                            // Alien
                            dado = random.gerarNumeroAleatorio();
                            System.out.println("Vez do Alien...Jogando os dados...deu " + dado);

                            // Golpes
                            if (dado == 1 || dado == 2) {
                                System.out.println("'Split Kick' Attack!");
                                System.out.println("Relâmpago sofreu +15 de dano de Alien e agora está com " + relampago.damage(15) + " HP ");
                            }
                            else if (dado >= 3 && dado <= 5) {
                                System.out.println("'Bit Laser' Attack!");
                                System.out.println("Relâmpago sofreu +25 de dano de Alien e agora está com " + relampago.damage(25) + " HP ");
                            }
                            else if (dado == 6) {
                                System.out.println("'Shockwave' Attack!");
                                System.out.println("Relâmpago sofreu +50 de dano de Alien e agora está com " + relampago.damage(50) + " HP ");
                            }
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