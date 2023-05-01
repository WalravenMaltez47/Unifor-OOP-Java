public class RaioLaser extends Personagem {
    RaioLaser(int vida) {
        this.vida = vida;
    }
    @Override
    public void start() throws InterruptedException {
        for (Round = 0; Round < 6 && Main.raioLaser.getVidaFinal() > 0 && Main.alien.getVidaFinal() > 0; Round++) {

            // EASY MODE
            if (Main.dificuldade.equalsIgnoreCase("EASY")) {
                System.out.println("Vez do Raio-Laser...Jogando os dados...deu...");
                Thread.sleep(2500);
                dado = Main.random.gerarNumeroAleatorio();
                System.out.println(dado);

                // Golpes Raio-Laser
                if (dado == 1 || dado == 2) {
                    System.out.println("'E' para 'Optic Blast'");
                    golpe = Main.prompt.next();
                    Main.raioLaser.setDano(10);
                    System.out.println("'Optic Blast' Attack!" + " +" + Main.raioLaser.getDano() + " +("+Round*3+") " + " range damage ");
                }
                else if (dado >= 3 && dado <= 5) {
                    System.out.println("'Q' para 'Mega Optic'");
                    golpe = Main.prompt.next();
                    Main.raioLaser.setDano(20);
                    System.out.println("'Mega Optic' Attack!" + " +" + Main.raioLaser.getDano() + " +("+Round*3+") " + " range damage ");
                }
                else if (dado == 6) {
                    System.out.println("'Z' para 'Super Optic'");
                    golpe = Main.prompt.next();
                    Main.raioLaser.setDano(40);
                    System.out.println("'Super Optic' Attack!" + " +" + Main.raioLaser.getDano() + " +("+Round*3+") " + " range damage ");
                }

                // Alien
                System.out.println("Vez do Alien...Jogando os dados...deu...");
                Thread.sleep(2500);
                dado = Main.random.gerarNumeroAleatorio();
                System.out.println(dado);

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
                System.out.println("Vez do Raio-Laser...Jogando os dados...deu...");
                Thread.sleep(2500);
                dado = Main.random.gerarNumeroAleatorio();
                System.out.println(dado);

                // Golpes Raio-Laser
                if (dado == 1 || dado == 2) {
                    System.out.println("'E' para 'Optic Blast'");
                    golpe = Main.prompt.next();
                    Main.raioLaser.setDano(10);
                    System.out.println("'Optic Blast' Attack!" + " +" + Main.raioLaser.getDano() + " +("+Round*3+") " + " range damage ");
                }
                else if (dado >= 3 && dado <= 5) {
                    System.out.println("'Q' para 'Mega Optic'");
                    golpe = Main.prompt.next();
                    Main.raioLaser.setDano(20);
                    System.out.println("'Mega Optic' Attack!" + " +" + Main.raioLaser.getDano()  + " +("+Round*3+") " + " range damage ");
                }
                else if (dado == 6) {
                    System.out.println("'Z' para 'Super Optic'");
                    golpe = Main.prompt.next();
                    Main.raioLaser.setDano(40);
                    System.out.println("'Super Optic' Attack!" + " +" + Main.raioLaser.getDano() + " +("+Round*3+") " + " range damage ");
                }

                // Alien
                System.out.println("Vez do Alien...Jogando os dados...deu...");
                Thread.sleep(2500);
                dado = Main.random.gerarNumeroAleatorio();
                System.out.println(dado);

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
                System.out.println("Vez do Raio-Laser...Jogando os dados...deu...");
                Thread.sleep(2500);
                dado = Main.random.gerarNumeroAleatorio();
                System.out.println(dado);

                // Golpes Raio-Laser
                if (dado == 1 || dado == 2) {
                    System.out.println("'E' para 'Optic Blast'");
                    golpe = Main.prompt.next();
                    Main.raioLaser.setDano(10);
                    System.out.println("'Optic Blast' Attack!" + " +" + Main.raioLaser.getDano() + " +("+Round*3+") " + " range damage ");
                }
                else if (dado >= 3 && dado <= 5) {
                    System.out.println("'Q' para 'Mega Optic'");
                    golpe = Main.prompt.next();
                    Main.raioLaser.setDano(20);
                    System.out.println("'Mega Optic' Attack!" + " +" + Main.raioLaser.getDano() + " +("+Round*3+") " + " range damage ");
                }
                else if (dado == 6) {
                    System.out.println("'Z' para 'Super Optic'");
                    golpe = Main.prompt.next();
                    Main.raioLaser.setDano(40);
                    System.out.println("'Super Optic' Attack!" + " +" + Main.raioLaser.getDano() + " +("+Round*3+") " + " range damage ");
                }

                // Alien
                System.out.println("Vez do Alien...Jogando os dados...deu...");
                Thread.sleep(2500);
                dado = Main.random.gerarNumeroAleatorio();
                System.out.println(dado);

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




