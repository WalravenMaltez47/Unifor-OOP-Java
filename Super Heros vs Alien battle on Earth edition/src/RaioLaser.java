public class RaioLaser extends Personagem {
    RaioLaser(int vida) {
        this.vida = vida;
    }
    @Override
    public void start() {
        for (Round = 0; Round < 6 && Main.raioLaser.getVidaFinal() > 0 && Main.alien.getVidaFinal() > 0; Round++) {

            // EASY MODE
            if (Main.dificuldade.equalsIgnoreCase("EASY")) {

                dado = Main.random.gerarNumeroAleatorio();

                System.out.println();
                System.out.println("Vez do Raio-Laser...Jogando os dados...deu " + dado);
                System.out.println();

                // Golpes Raio-Laser
                if (dado == 1 || dado == 2) {
                    System.out.println("'E' para 'Optic Blast'");
                    golpe = Main.prompt.next();
                    if (golpe.equalsIgnoreCase("E")) {
                        Main.raioLaser.setDano(10);
                        System.out.println("'Optic Blast' Attack!" + " +" + Main.raioLaser.getDano() + " +("+Round*3+") " + " range damage ");
                    }

                    // Punição
                    else {
                        System.out.println("Punição!");
                        System.out.println("Raio-Laser sofre +5 de dano e agora está com " + Main.raioLaser.getVida(5) + " hp ");
                    }
                }
                else if (dado >= 3 && dado <= 5) {
                    System.out.println("'Q' para 'Mega Optic'");
                    golpe = Main.prompt.next();
                    if (golpe.equalsIgnoreCase("Q")) {
                        Main.raioLaser.setDano(20);
                        System.out.println("'Mega Optic' Attack!" + " +" + Main.raioLaser.getDano() + " +("+Round*3+") " + " range damage ");
                    }

                    // Punição
                    else {
                        System.out.println("Punição!");
                        System.out.println("Raio-Laser sofre +5 de dano e agora está com " + Main.raioLaser.getVida(5) + " hp ");
                    }
                }
                else if (dado == 6) {
                    System.out.println("'Z' para 'Super Optic'");
                    golpe = Main.prompt.next();
                    if (golpe.equalsIgnoreCase("Z")) {
                        Main.raioLaser.setDano(40);
                        System.out.println("'Super Optic' Attack!" + " +" + Main.raioLaser.getDano() + " +("+Round*3+") " + " range damage ");
                    }

                    // Punição
                    else {
                        System.out.println("Punição!");
                        System.out.println("Raio-Laser sofre +5 de dano e agora está com " + Main.raioLaser.getVida(5) + " hp ");
                    }
                }

                // Alien
                dado = Main.random.gerarNumeroAleatorio();

                System.out.println();
                System.out.println("Vez do Alien...Jogando os dados...deu " + dado);
                System.out.println();

                // Golpes Alien
                if (dado == 1 || dado == 2) {
                    Main.alien.setDano(5);
                    System.out.println("'Split Kick' Attack!'" + " +" + Main.alien.getDano() + " alien damage ");
                } else if (dado >= 3 && dado <= 5) {
                    Main.alien.setDano(10);
                    System.out.println("'Bit Laser' Attack!'" + " +" + Main.alien.getDano() + " alien damage ");
                } else if (dado == 6) {
                    Main.alien.setDano(30);
                    System.out.println("'Shockwave' Attack!'" + " +" + Main.alien.getDano() + " alien damage ");
                }
            }

            // STANDARD MODE
            if (Main.dificuldade.equalsIgnoreCase("STANDARD")) {

                dado = Main.random.gerarNumeroAleatorio();

                System.out.println();
                System.out.println("Vez do Raio-Laser...Jogando os dados...deu  " + dado);
                System.out.println();

                // Golpes Raio-Laser
                if (dado == 1 || dado == 2) {
                    System.out.println("'E' para 'Optic Blast'");
                    golpe = Main.prompt.next();
                    if (golpe.equalsIgnoreCase("E")) {
                        Main.raioLaser.setDano(10);
                        System.out.println("'Optic Blast' Attack!" + " +" + Main.raioLaser.getDano() + " +("+Round*3+") " + " range damage ");
                    }

                    // Punição
                    else {
                        System.out.println("Punição!");
                        System.out.println("Raio-Laser sofre +5 de dano e agora está com " + Main.raioLaser.getVida(5) + " hp ");
                    }
                }
                else if (dado >= 3 && dado <= 5) {
                    System.out.println("'Q' para 'Mega Optic'");
                    golpe = Main.prompt.next();
                    if (golpe.equalsIgnoreCase("Q")) {
                        Main.raioLaser.setDano(20);
                        System.out.println("'Mega Optic' Attack!" + " +" + Main.raioLaser.getDano()  + " +("+Round*3+") " + " range damage ");
                    }

                    // Punição
                    else {
                        System.out.println("Punição!");
                        System.out.println("Raio-Laser sofre +6 de dano e agora está com " + Main.raioLaser.getVida(6) + " hp ");
                    }
                }
                else if (dado == 6) {
                    System.out.println("'Z' para 'Super Optic'");
                    golpe = Main.prompt.next();
                    if (golpe.equalsIgnoreCase("Z")) {
                        Main.raioLaser.setDano(40);
                        System.out.println("'Super Optic' Attack!" + " +" + Main.raioLaser.getDano() + " +("+Round*3+") " + " range damage ");
                    }

                    // Punição
                    else {
                        System.out.println("Punição!");
                        System.out.println("Raio-Laser sofre +7 de dano e agora está com " + Main.raioLaser.getVida(7) + " hp ");
                    }
                }

                // Alien
                dado = Main.random.gerarNumeroAleatorio();

                System.out.println();
                System.out.println("Vez do Alien...Jogando os dados...deu " + dado);
                System.out.println();

                // Golpes Alien
                if (dado == 1 || dado == 2) {
                    Main.alien.setDano(10);
                    System.out.println("'Split Kick' Attack!" + " +" + Main.alien.getDano() + " alien damage ");
                }
                else if (dado >= 3 && dado <= 5) {
                    Main.alien.setDano(20);
                    System.out.println("'Bit Laser' Attack!" + " +" + Main.alien.getDano() + " alien damage ");
                }
                else if (dado == 6) {
                    Main.alien.setDano(40);
                    System.out.println("'Shockwave' Attack!" + " +" + Main.alien.getDano() + " alien damage ");
                }
            }

            // HARD MODE
            if (Main.dificuldade.equalsIgnoreCase("HARD")) {

                dado = Main.random.gerarNumeroAleatorio();

                System.out.println();
                System.out.println("Vez do Raio-Laser...Jogando os dados...deu " + dado);
                System.out.println();

                // Golpes Raio-Laser
                if (dado == 1 || dado == 2) {
                    System.out.println("'E' para 'Optic Blast'");
                    golpe = Main.prompt.next();

                    if (golpe.equalsIgnoreCase("E")) {
                        Main.raioLaser.setDano(10);
                        System.out.println("'Optic Blast' Attack!" + " +" + Main.raioLaser.getDano() + " +("+Round*3+") " + " range damage ");
                    }

                    // Punição
                    else {
                        System.out.println("Punição!");
                        System.out.println("Raio-Laser sofre +7 de dano e agora está com " + Main.raioLaser.getVida(7) + " hp ");
                    }
                }
                else if (dado >= 3 && dado <= 5) {
                    System.out.println("'Q' para 'Mega Optic'");
                    golpe = Main.prompt.next();
                    if (golpe.equalsIgnoreCase("Q")) {
                        Main.raioLaser.setDano(20);
                        System.out.println("'Mega Optic' Attack!" + " +" + Main.raioLaser.getDano() + " +("+Round*3+") " + " range damage ");
                    }

                    // Punição
                    else {
                        System.out.println("Punição!");
                        System.out.println("Raio-Laser sofre +10 de dano e agora está com " + Main.raioLaser.getVida(10) + " hp ");
                    }
                }
                else if (dado == 6) {
                    System.out.println("'Z' para 'Super Optic'");
                    golpe = Main.prompt.next();
                    if (golpe.equalsIgnoreCase("Z")) {
                        Main.raioLaser.setDano(40);
                        System.out.println("'Super Optic' Attack!" + " +" + Main.raioLaser.getDano() + " +("+Round*3+") " + " range damage ");
                    }

                    // Punição
                    else {
                        System.out.println("Punição!");
                        System.out.println("Raio-Laser sofre +15 de dano e agora está com " + Main.raioLaser.getVida(15) + " hp ");
                    }
                }

                // Alien
                dado = Main.random.gerarNumeroAleatorio();

                System.out.println();
                System.out.println("Vez do Alien...Jogando os dados...deu " + dado);
                System.out.println();

                // Golpes Alien
                if (dado == 1 || dado == 2) {
                    Main.alien.setDano(15);
                    System.out.println("'Split Kick' Attack!" + " +" + Main.alien.getDano() + " alien damage ");
                }
                else if (dado >= 3 && dado <= 5) {
                    Main.alien.setDano(25);
                    System.out.println("'Bit Laser' Attack!" + " +" + Main.alien.getDano() + " alien damage ");

                }
                else if (dado == 6) {
                    Main.alien.setDano(50);
                    System.out.println("'Shockwave' Attack!" + " +" + Main.alien.getDano() + " alien damage ");
                }
            }

            System.out.println();

            if (Main.raioLaser.getVidaFinal() > 0 && Main.alien.getVidaFinal() > 0 && Round == 0) {
                System.out.println("Alien está com " + Main.alien.getVida(Main.raioLaser.getDano()) + " hp ");
                System.out.println("Raio-Laser está com " + Main.raioLaser.getVida(Main.alien.getDano()) + " hp ");
            }

            else if (Main.raioLaser.getVidaFinal() > 0 && Main.alien.getVidaFinal() > 0 && Round > 0) {
                System.out.println("-----------------");
                // SPECIAL SKILL
                int multiplicador_De_Dano = 3 * Round;
                Main.raioLaser.setDano(multiplicador_De_Dano+getDano());
                System.out.println("Alien está com " + Main.alien.getVida(Main.raioLaser.getDano()) + " hp ");
                System.out.println("Raio-Laser está com " + Main.raioLaser.getVida(Main.alien.getDano()) + " hp ");
            }

            System.out.println();
            if (Round==0) {
                System.out.println("SPECIAL SKILL! Ativada");
            }
        }

        System.out.println("--------------------");

        // Placar
        System.out.println("A vida final de Raio-Laser " + Main.raioLaser.getVidaFinal() + " hp ");
        System.out.println("A vida final de Alien " + Main.alien.getVidaFinal() + " hp ");

        // Resultado
        if (Main.raioLaser.getVidaFinal() > Main.alien.getVidaFinal()) {
            System.out.println();
            System.out.println("O vencedor é Raio-Laser");
        }
        else if (Main.raioLaser.getVidaFinal() < Main.alien.getVidaFinal()) {
            System.out.println();
            System.out.println("O vencedor é Alien");
        }
        else {
            System.out.println("Empate!...pelo menos você não perdeu...HAHAHA!");
        }

        System.out.println("-------------------");
    }
}




