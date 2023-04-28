public class MuqueMan extends Personagem {
    MuqueMan(int vida) {
        this.vida=vida;
    }
    @Override
    public void start() {

        for (Round = 1; Round <= 6 && Main.muqueMan.getVidaFinal()>0 && Main.alien.getVidaFinal()>0; Round++) {

            // EASY MODE
            if (Main.dificuldade.equalsIgnoreCase("EASY")) {
                dado = Main.random.gerarNumeroAleatorio();

                System.out.println();
                System.out.println("Vez do Muque-Man...Jogando os dados...deu " + dado);
                System.out.println();

                // Golpes Muque-man
                if (dado == 1 || dado == 2) {
                    System.out.println("'E' para 'Chute'");
                    golpe = Main.prompt.next();
                    if (golpe.equalsIgnoreCase("E")) {
                        Main.muqueMan.setDano(10);
                        System.out.println("'Chute' Attack!" + " +" + Main.muqueMan.getDano() + " melee damage ");
                    }

                    // Punição
                    else {
                        System.out.println("Punição!");
                        System.out.println("Muque-Man sofre +5 de dano");
                        Main.muqueMan.getVida(5);
                    }
                }
                else if (dado >= 3 && dado <= 5) {
                    System.out.println("'Q' para 'Tornado'");
                    golpe = Main.prompt.next();
                    if (golpe.equalsIgnoreCase("Q")) {
                        Main.muqueMan.setDano(20);
                        System.out.println("'Tornado' Attack!'" + " +" + Main.muqueMan.getDano() + " melee damage ");
                    }

                    // Punição
                    else {
                        System.out.println("Punição!");
                        System.out.println("Muque-Man sofre +5 de dano");
                        Main.muqueMan.getVida(5);
                    }
                }
                else if (dado == 6) {
                    System.out.println("'Z' para 'Berserker'");
                    golpe = Main.prompt.next();
                    if (golpe.equalsIgnoreCase("Z")) {
                        Main.muqueMan.setDano(40);
                        System.out.println("'Berserker' Attack!" + " +" + Main.muqueMan.getDano() + " melee damage ");
                    }

                    // Punição
                    else {
                        System.out.println("Punição!");
                        System.out.println("Muque-Man sofre +5 de dano");
                        Main.muqueMan.getVida(5);
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
                    System.out.println("'Split Kick' Attack!" + " +" + Main.alien.getDano() + " alien damage ");
                } else if (dado >= 3 && dado <= 5) {
                    Main.alien.setDano(15);
                    System.out.println("'Bit Laser' Attack!" + " +" + Main.alien.getDano() + " alien damage ");

                } else if (dado == 6) {
                    Main.alien.setDano(20);
                    System.out.println("'Shockwave' Attack!" + " +" + Main.alien.getDano() + " alien damage ");
                }
            }

            // STANDARD MODE
            if (Main.dificuldade.equalsIgnoreCase("STANDARD")) {

                dado = Main.random.gerarNumeroAleatorio();

                System.out.println();
                System.out.println("Vez do Muque-Man...Jogando os dados...deu " + dado);
                System.out.println();

                // Golpes Muque-man
                if (dado == 1 || dado == 2) {
                    System.out.println("'E' para 'Chute'");
                    golpe = Main.prompt.next();
                    if (golpe.equalsIgnoreCase("E")) {
                        Main.muqueMan.setDano(10);
                        System.out.println("'Chute' Attack!'" + " +" + Main.muqueMan.getDano() + " melee damage ");
                    }

                    // Punição
                    else {
                        System.out.println("Punição!");
                        System.out.println("Muque-Man sofre +5 de dano");
                        Main.muqueMan.getVida(5);
                    }
                } else if (dado >= 3 && dado <= 5) {
                    System.out.println("'Q' para 'Tornado'");
                    golpe = Main.prompt.next();
                    if (golpe.equalsIgnoreCase("Q")) {
                        Main.muqueMan.setDano(20);
                        System.out.println("'Tornado' Attack!'" + " +" + Main.muqueMan.getDano() + " melee damage ");
                    }

                    // Punição
                    else {
                        System.out.println("Punição!");
                        System.out.println("Muque-Man sofre +6 de dano");
                        Main.muqueMan.getVida(6);
                    }
                } else if (dado == 6) {
                    System.out.println("'Z' para 'Berserker'");
                    golpe = Main.prompt.next();
                    if (golpe.equalsIgnoreCase("Z")) {
                        Main.muqueMan.setDano(40);
                        System.out.println("'Berserker' Attack!'" + " +" + Main.muqueMan.getDano() + " melee damage ");
                    }

                    // Punição
                    else {
                        System.out.println("Punição!");
                        System.out.println("Muque-Man sofre +7 de dano");
                        Main.muqueMan.getVida(7);
                    }
                }


                // Alien
                dado = Main.random.gerarNumeroAleatorio();
                System.out.println("Vez do Alien...Jogando os dados...deu " + dado);

                // Golpes Alien
                if (dado == 1 || dado == 2) {
                    Main.alien.setDano(10);
                    System.out.println("'Split Kick' Attack!'" + " +" + Main.alien.getDano() + " alien damage ");
                } else if (dado >= 3 && dado <= 5) {
                    Main.alien.setDano(20);
                    System.out.println("'Bit Laser' Attack!'" + " +" + Main.alien.getDano() + " alien damage ");
                } else if (dado == 6) {
                    Main.alien.setDano(40);
                    System.out.println("''Shockwave' Attack!'" + " +" + Main.alien.getDano() + " alien damage ");
                }
            }

            // HARD MODE
            if (Main.dificuldade.equalsIgnoreCase("HARD")) {

                dado = Main.random.gerarNumeroAleatorio();

                System.out.println();
                System.out.println("Vez do Muque-Man...Jogando os dados...deu " + dado);
                System.out.println();

                // Golpes Muque-man
                if (dado == 1 || dado == 2) {
                    System.out.println("'E' para 'Chute'");
                    golpe = Main.prompt.next();
                    if (golpe.equalsIgnoreCase("E")) {
                        Main.muqueMan.setDano(10);
                        System.out.println("'Chute' Attack!'" + " +" + Main.muqueMan.getDano() + " melee damage ");
                    }

                    // Punição
                    else {
                        System.out.println("Punição!");
                        System.out.println("Muque-Man sofre +7 de dano");
                        Main.muqueMan.getVida(7);
                    }
                }
                else if (dado >= 3 && dado <= 5) {
                    System.out.println("'Q' para 'Tornado'");
                    golpe = Main.prompt.next();
                    if (golpe.equalsIgnoreCase("Q")) {
                        Main.muqueMan.setDano(20);
                        System.out.println("''Tornado' Attack!'" + " +" + Main.muqueMan.getDano() + " melee damage ");
                    }

                    // Punição
                    else {
                        System.out.println("Punição!");
                        System.out.println("Muque-Man sofre +10 de dano");
                        Main.muqueMan.getVida(10);
                    }
                }
                else if (dado == 6) {
                    System.out.println("'Z' para 'Berserker'");
                    golpe = Main.prompt.next();
                    if (golpe.equalsIgnoreCase("Z")) {
                        Main.muqueMan.setDano(40);
                        System.out.println("'Berserker' Attack!'" + " +" + Main.muqueMan.getDano() + " melee damage ");
                    }

                    // Punição
                    else {
                        System.out.println("Punição!");
                        System.out.println("Muque-Man sofre +15 de dano");
                        Main.muqueMan.getVida(15);
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
                } else if (dado >= 3 && dado <= 5) {
                    Main.alien.setDano(25);
                    System.out.println("'Bit Laser' Attack!" + " +" + Main.alien.getDano() + " alien damage ");
                } else if (dado == 6) {
                    Main.alien.setDano(50);
                    System.out.println("'Shockwave' Attack!!" + " +" + Main.alien.getDano() + " alien damage ");
                }
            }

            System.out.println();

            System.out.println("Alien está com " + Main.alien.getVida(Main.muqueMan.getDano()) + " hp ");
            System.out.println("Muque-Man está com " + Main.muqueMan.getVida(Main.alien.getDano()) + " hp ");

            System.out.println();

            System.out.println("SPECIAL SKILL!");
            // SPECIAL SKILL
            if (Main.muqueMan.getVidaFinal() > 0 && Main.alien.getVidaFinal() > 0) {
                System.out.println(Main.muqueMan.getVida(-5) + " hp ");
            }
        }

        System.out.println("------------------");

        // Placar
        System.out.println("A vida final de Muque-Man " + Main.muqueMan.getVidaFinal() + " hp ");
        System.out.println("A vida final de Alien " + Main.alien.getVidaFinal() + " hp ");

        // Resultado
        if (Main.muqueMan.getVidaFinal() > Main.alien.getVidaFinal()) {
            System.out.println();
            System.out.println("O vencedor é Muqueman!");
        }
        else if (Main.muqueMan.getVidaFinal() < Main.alien.getVidaFinal()) {
            System.out.println();
            System.out.println("O vencedor é Alien!");
        }
        else {
            System.out.println("Empate!...pelo menos você não perdeu... HAHAHA!");
        }

        System.out.println("------------------");
    }
}
