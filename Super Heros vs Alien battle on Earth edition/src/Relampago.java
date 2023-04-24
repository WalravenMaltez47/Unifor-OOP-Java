public class Relampago extends Personagem {
    Relampago(int vida) {
        this.vida = vida;
    }
    @Override
    public void start() {

        for (Round = 1; Round <= 6 && Main.relampago.getVidaFinal() > 0 && Main.alien.getVidaFinal() > 0; Round++) {

            // EASY MODE
            if (Main.dificuldade.equalsIgnoreCase("EASY")) {

                dado = Main.random.gerarNumeroAleatorio();

                System.out.println();
                System.out.println("Vez do Relampago...Jogando os dados...deu " + dado);
                System.out.println();

                System.out.println("--------------------");
                // Golpes Relâmpago
                if (dado == 1 || dado == 2) {
                    System.out.println("'E' para 'Lightning Attack'");
                    golpe = Main.prompt.next();
                    if (golpe.equalsIgnoreCase("E")) {
                        Main.relampago.setDano(10);
                        System.out.println("'Lightnig Attack' Attack!" + " +" + Main.relampago.getDano() + " magic damage ");
                        System.out.println("Alien está com " + Main.alien.getVida(Main.relampago.getDano()) + " hp ");
                    }

                    // Punição
                    else {
                        System.out.println("Punição!");
                        System.out.println("Relâmpago sofre +5 de dano e agora está com " + Main.relampago.getVida(5) + " hp ");
                    }
                }
                else if (dado >= 3 && dado <= 5) {
                    System.out.println("Q para 'Lightning Storm'");
                    golpe = Main.prompt.next();
                    if (golpe.equalsIgnoreCase("Q")) {
                        Main.relampago.setDano(20);
                        System.out.println("'Lightning Storm' Attack!" + " +" + Main.relampago.getDano() + " magic damage ");
                        System.out.println("Alien está com " + Main.alien.getVida(Main.relampago.getDano()) + " hp ");
                    }

                    // Punição
                    else {
                        System.out.println("Punição!");
                        System.out.println("Relâmpago sofre +5 de dano e agora está com " + Main.relampago.getVida(5) + " hp ");
                    }
                }
                else if (dado == 6) {
                    System.out.println("'Z' para 'Hail Storm'");
                    golpe = Main.prompt.next();
                    if (golpe.equalsIgnoreCase("Z")) {
                        Main.relampago.setDano(40);
                        System.out.println("'Hail Storm' Attack!" + " +" + Main.relampago.getDano() + " magic damage ");
                        System.out.println("Alien está com " + Main.alien.getVida(Main.relampago.getDano()) + " hp ");
                    }

                    // Punição
                    else {
                        System.out.println("Punição!");
                        System.out.println("Relâmpago sofre +5 de dano e agora está com " + Main.relampago.getVida(5) + " hp ");
                    }
                }

                System.out.println("-------------------");

                // Alien
                dado = Main.random.gerarNumeroAleatorio();

                System.out.println();
                System.out.println("Vez do Alien...Jogando os dados...deu " + dado);
                System.out.println();

                System.out.println("--------------------");
                // Golpes Alien
                if (dado == 1 || dado == 2) {
                    Main.alien.setDano(10);
                    System.out.println("'Split Kick' Attack!" + " +" + Main.alien.getDano() + " alien damage ");
                    System.out.println("Relâmpago está com " + Main.relampago.getVida(Main.alien.getDano()) + " hp ");
                } else if (dado >= 3 && dado <= 5) {
                    Main.alien.setDano(15);
                    System.out.println("'Bit Laser' Attack!" + " +" + Main.alien.getDano() + " alien damage ");
                    System.out.println("Relâmpago está com " + Main.relampago.getVida(Main.alien.getDano()) + " hp ");
                } else if (dado == 6) {
                    Main.alien.setDano(30);
                    System.out.println("'Shockwave' Attack!" + " +" + Main.alien.getDano() + " alien damage ");
                    System.out.println("Relâmpago está com " + Main.relampago.getVida(Main.alien.getDano()) + " hp ");
                }
            }

            // STANDARD MODE
            if (Main.dificuldade.equalsIgnoreCase("STANDARD")) {

                dado = Main.random.gerarNumeroAleatorio();

                System.out.println();
                System.out.println("Vez do Relampago...Jogando os dados...deu " + dado);
                System.out.println();

                System.out.println("-------------------");
                // Golpes Relâmpago
                if (dado == 1 || dado == 2) {
                    System.out.println("'E' para 'Lightning Attack'");
                    golpe = Main.prompt.next();
                    if (golpe.equalsIgnoreCase("E")) {
                        Main.relampago.setDano(10);
                        System.out.println("'Lightnig Attack' Attack!" + " +" + Main.relampago.getDano() + " magic damage ");
                        System.out.println("Alien está com " + Main.alien.getVida(Main.relampago.getDano()) + " hp ");
                    }

                    // Punição
                    else {
                        System.out.println("Punição!");
                        System.out.println("Relâmpago sofre +5 de dano e agora está com " + Main.relampago.getVida(5) + " hp ");
                    }
                }
                else if (dado >= 3 && dado <= 5) {
                    System.out.println("Q para 'Lightning Storm'");
                    golpe = Main.prompt.next();
                    if (golpe.equalsIgnoreCase("Q")) {
                        Main.relampago.setDano(20);
                        System.out.println("'Lightning Storm' Attack!" + " +" + Main.relampago.getDano() + " magic damage ");
                        System.out.println("Alien está com " + Main.alien.getVida(Main.relampago.getDano()) + " hp ");
                    }

                    // Punição
                    else {
                        System.out.println("Punição!");
                        System.out.println("Relâmpago sofre +6 de dano e agora está com " + Main.relampago.getVida(6) + " hp ");
                    }
                }
                else if (dado == 6) {
                    System.out.println("'Z' para 'Hail Storm'");
                    golpe = Main.prompt.next();
                    if (golpe.equalsIgnoreCase("Z")) {
                        Main.relampago.setDano(40);
                        System.out.println("'Hail Storm' Attack!" + " +" + Main.relampago.getDano() + " magic damage ");
                        System.out.println("Alien está com " + Main.alien.getVida(Main.relampago.getDano()) + " hp ");
                    }

                    // Punição
                    else {
                        System.out.println("Punição!");
                        System.out.println("Relâmpago sofre +7 de dano e agora está com " + Main.relampago.getVida(7) + " hp ");
                    }
                }

                System.out.println("-------------------");

                // Alien
                dado = Main.random.gerarNumeroAleatorio();

                System.out.println();
                System.out.println("Vez do Alien...Jogando os dados...deu " + dado);
                System.out.println();

                System.out.println("-------------------");
                // Golpes Alien
                if (dado == 1 || dado == 2) {
                    Main.alien.setDano(10);
                    System.out.println("'Split Kick' Attack!" + " +" + Main.alien.getDano() + " alien damage ");
                    System.out.println("Relâmpago está com " + Main.relampago.getVida(Main.alien.getDano()) + " hp ");
                } else if (dado >= 3 && dado <= 5) {
                    Main.alien.setDano(20);
                    System.out.println("'Bit Laser' Attack!" + " +" + Main.alien.getDano() + " alien damage ");
                    System.out.println("Relâmpago está com " + Main.relampago.getVida(Main.alien.getDano()) + " hp ");
                } else if (dado == 6) {
                    Main.alien.setDano(40);
                    System.out.println("'Shockwave' Attack!" + " +" + Main.alien.getDano() + " alien damage ");
                    System.out.println("Relâmpago está com " + Main.relampago.getVida(Main.alien.getDano()) + " hp ");
                }

                System.out.println("------------------");
            }

            // HARD MODE
            if (Main.dificuldade.equalsIgnoreCase("HARD")) {

                dado = Main.random.gerarNumeroAleatorio();

                System.out.println();
                System.out.println("Vez do Relampago...Jogando os dados...deu " + dado);
                System.out.println();

                System.out.println("----------------");
                // Golpes Relâmpago
                if (dado == 1 || dado == 2) {
                    System.out.println("'E' para 'Lightning Attack'");
                    golpe = Main.prompt.next();
                    if (golpe.equalsIgnoreCase("E")) {
                        Main.relampago.setDano(10);
                        System.out.println("'Lightnig Attack' Attack!" + " +" + Main.relampago.getDano() + " magic damage ");
                        System.out.println("Alien está com " + Main.alien.getVida(Main.relampago.getDano()) + " hp ");
                    }

                    // Punição
                    else {
                        System.out.println("Punição!");
                        System.out.println("Relâmpago sofre +7 de dano e agora está com " + Main.relampago.getVida(7) + " hp ");
                    }
                }
                else if (dado >= 3 && dado <= 5) {
                    System.out.println("Q para 'Lightning Storm'");
                    golpe = Main.prompt.next();
                    if (golpe.equalsIgnoreCase("Q")) {
                        Main.relampago.setDano(20);
                        System.out.println("'Lightning Storm' Attack!" + " +" + Main.relampago.getDano() + " magic damage ");
                        System.out.println("Alien está com " + Main.alien.getVida(Main.relampago.getDano()) + " hp ");
                    }

                    // Punição
                    else {
                        System.out.println("Punição!");
                        System.out.println("Relâmpago sofre +10 de dano e agora está com " + Main.relampago.getVida(10) + " hp ");
                    }
                }
                else if (dado == 6) {
                    System.out.println("'Z' para 'Hail Storm'");
                    golpe = Main.prompt.next();
                    if (golpe.equalsIgnoreCase("Z")) {
                        Main.relampago.setDano(40);
                        System.out.println("'Hail Storm' Attack!" + " +" + Main.relampago.getDano() + " magic damage ");
                        System.out.println("Alien está com " + Main.alien.getVida(Main.relampago.getDano()) + " hp ");
                    }

                    // Punição
                    else {
                        System.out.println("Punição!");
                        System.out.println("Relâmpago sofre +15 de dano e agora está com " + Main.relampago.getVida(15) + " hp ");
                    }
                }

                System.out.println("-----------------");

                // Alien
                dado = Main.random.gerarNumeroAleatorio();

                System.out.println();
                System.out.println("Vez do Alien...Jogando os dados...deu " + dado);
                System.out.println();

                System.out.println("------------------");
                // Golpes Alien
                if (dado == 1 || dado == 2) {
                    Main.alien.setDano(15);
                    System.out.println("'Split Kick' Attack!" + " +" + Main.alien.getDano() + " alien damage ");
                    System.out.println("Relâmpago está com " + Main.relampago.getVida(Main.alien.getDano()) + " hp ");
                }
                else if (dado >= 3 && dado <= 5) {
                    Main.alien.setDano(25);
                    System.out.println("'Bit Laser' Attack!" + " +" + Main.alien.getDano() + " alien damage ");
                    System.out.println("Relâmpago está com " + Main.relampago.getVida(Main.alien.getDano()) + " hp ");
                }
                else if (dado == 6) {
                    Main.alien.setDano(50);
                    System.out.println("'Shockwave' Attack!" + " +" + Main.alien.getDano() + " alien damage ");
                    System.out.println("Relâmpago está com " + Main.relampago.getVida(Main.alien.getDano()) + " hp ");
                }

                System.out.println("--------------------");

            }

            if (Main.relampago.getVidaFinal() > 0 && Main.alien.getVidaFinal() > 0) {

                // SPECIAL SKILL
                System.out.println("abilidade especial do Relâmpago adiciona +3 de dano ao alien, " +
                        "agora Alien está com " + Main.alien.getVida(3) + " hp ");
            }
        }

        System.out.println("-----------------");

        // Placar
        System.out.println("A vida final de Relâmpago " + Main.relampago.getVidaFinal() + " hp ");
        System.out.println("A vida final de Alien " + Main.alien.getVidaFinal() + " hp ");

        // Resultado
        if (Main.relampago.getVidaFinal() > Main.alien.getVidaFinal()) {
            System.out.println();
            System.out.println("O vencedor é Relâmpago");
        } else if (Main.relampago.getVidaFinal() < Main.alien.getVidaFinal()) {
            System.out.println();
            System.out.println("O vencedor é Alien");
        } else {
            System.out.println("Empate!...pelo menos você não perdeu...HAHAHA!");
        }

        System.out.println("--------------------");
    }
}
