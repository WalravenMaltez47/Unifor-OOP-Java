public class Relampago extends Personagem {
    Relampago(int vida) {
        this.vida = vida;
    }
    public void start() throws InterruptedException {

        for (Round = 1; Round <= 6 && Main.relampago.getVidaFinal() > 0 && Main.alien.getVidaFinal() > 0; Round++) {

            // EASY MODE
            if (Main.dificuldade.equalsIgnoreCase("EASY")) {
                System.out.println("Vez do Relampago...Jogando os dados...deu");
                Thread.sleep(2500);
                dado = Main.random.gerarNumeroAleatorio();
                System.out.println(dado);

                // Golpes Relâmpago
                if (dado == 1 || dado == 2) {
                    System.out.println("'E' para 'Lightning Attack'");
                    golpe = Main.prompt.next();
                    if (golpe.equalsIgnoreCase("E")) {
                        Main.relampago.setDano(10);
                        System.out.println("'Lightnig Attack' Attack!" + " +" + Main.relampago.getDano() + " magic damage ");
                    }
                    // Punição
                    else {
                        Main.relampago.setDano(0);
                        System.out.println("Punição!");
                        System.out.println("Relâmpago sofre +5 de dano");
                        Main.relampago.getVida(5);
                    }
                }
                else if (dado >= 3 && dado <= 5) {
                    System.out.println("Q para 'Lightning Storm'");
                    golpe = Main.prompt.next();
                    if (golpe.equalsIgnoreCase("Q")) {
                        Main.relampago.setDano(20);
                        System.out.println("'Lightning Storm' Attack!" + " +" + Main.relampago.getDano() + " magic damage ");
                    }
                    // Punição
                    else {
                        Main.relampago.setDano(0);
                        System.out.println("Punição!");
                        System.out.println("Relâmpago sofre +5 de dano");
                        Main.relampago.getVida(5);
                    }
                }
                else if (dado == 6) {
                    System.out.println("'Z' para 'Hail Storm'");
                    golpe = Main.prompt.next();
                    if (golpe.equalsIgnoreCase("Z")) {
                        Main.relampago.setDano(40);
                        System.out.println("'Hail Storm' Attack!" + " +" + Main.relampago.getDano() + " magic damage ");
                    }
                    // Punição
                    else {
                        Main.relampago.setDano(0);
                        System.out.println("Punição!");
                        System.out.println("Relâmpago sofre +5 de dano");
                        Main.relampago.getVida(5);
                    }
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
                } else if (dado >= 3 && dado <= 5) {
                    Main.alien.setDano(15);
                    System.out.println("'Bit Laser' Attack!" + " +" + Main.alien.getDano() + " alien damage ");
                } else if (dado == 6) {
                    Main.alien.setDano(30);
                    System.out.println("'Shockwave' Attack!" + " +" + Main.alien.getDano() + " alien damage ");
                }
            }

            // STANDARD MODE
            if (Main.dificuldade.equalsIgnoreCase("STANDARD")) {
                System.out.println("Vez do Relampago...Jogando os dados...deu...");
                Thread.sleep(2500);
                dado = Main.random.gerarNumeroAleatorio();
                System.out.println(dado);

                // Golpes Relâmpago
                if (dado == 1 || dado == 2) {
                    System.out.println("'E' para 'Lightning Attack'");
                    golpe = Main.prompt.next();
                    if (golpe.equalsIgnoreCase("E")) {
                        Main.relampago.setDano(10);
                        System.out.println("'Lightnig Attack' Attack!" + " +" + Main.relampago.getDano() + " magic damage ");
                    }
                    // Punição
                    else {
                        Main.relampago.setDano(0);
                        System.out.println("Punição!");
                        System.out.println("Relâmpago sofre +5 de dano");
                        Main.relampago.getVida(5);
                    }

                }
                else if (dado >= 3 && dado <= 5) {
                    System.out.println("Q para 'Lightning Storm'");
                    golpe = Main.prompt.next();
                    if (golpe.equalsIgnoreCase("Q")) {
                        Main.relampago.setDano(20);
                        System.out.println("'Lightning Storm' Attack!" + " +" + Main.relampago.getDano() + " magic damage ");
                    }
                    // Punição
                    else {
                        Main.relampago.setDano(0);
                        System.out.println("Punição!");
                        System.out.println("Relâmpago sofre +6 de dano");
                        Main.relampago.getVida(6);
                    }
                }
                else if (dado == 6) {
                    System.out.println("'Z' para 'Hail Storm'");
                    golpe = Main.prompt.next();
                    if (golpe.equalsIgnoreCase("Z")) {
                        Main.relampago.setDano(40);
                        System.out.println("'Hail Storm' Attack!" + " +" + Main.relampago.getDano() + " magic damage ");
                    }
                    // Punição
                    else {
                        Main.relampago.setDano(0);
                        System.out.println("Punição!");
                        System.out.println("Relâmpago sofre +7 de dano");
                        Main.relampago.getVida(7);
                    }
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
                } else if (dado >= 3 && dado <= 5) {
                    Main.alien.setDano(20);
                    System.out.println("'Bit Laser' Attack!" + " +" + Main.alien.getDano() + " alien damage ");
                } else if (dado == 6) {
                    Main.alien.setDano(40);
                    System.out.println("'Shockwave' Attack!" + " +" + Main.alien.getDano() + " alien damage ");
                }
            }

            // HARD MODE
            if (Main.dificuldade.equalsIgnoreCase("HARD")) {
                System.out.println("Vez do Relampago...Jogando os dados...deu...");
                Thread.sleep(2000);
                dado = Main.random.gerarNumeroAleatorio();
                System.out.println(dado);

                // Golpes Relâmpago
                if (dado == 1 || dado == 2) {
                    System.out.println("'E' para 'Lightning Attack'");
                    golpe = Main.prompt.next();
                    if (golpe.equalsIgnoreCase("E")) {
                        Main.relampago.setDano(10);
                        System.out.println("'Lightnig Attack' Attack!" + " +" + Main.relampago.getDano() + " magic damage ");
                    }
                    // Punição
                    else {
                        Main.relampago.setDano(0);
                        System.out.println("Punição!");
                        System.out.println("Relâmpago sofre +7 de dano");
                        Main.relampago.getVida(7);
                    }
                }
                else if (dado >= 3 && dado <= 5) {
                    System.out.println("Q para 'Lightning Storm'");
                    golpe = Main.prompt.next();
                    if (golpe.equalsIgnoreCase("Q")) {
                        Main.relampago.setDano(20);
                        System.out.println("'Lightning Storm' Attack!" + " +" + Main.relampago.getDano() + " magic damage ");
                    }
                    // Punição
                    else {
                        Main.relampago.setDano(0);
                        System.out.println("Punição!");
                        System.out.println("Relâmpago sofre +8 de dano");
                        Main.relampago.getVida(8);
                    }
                }
                else if (dado == 6) {
                    System.out.println("'Z' para 'Hail Storm'");
                    golpe = Main.prompt.next();
                    if (golpe.equalsIgnoreCase("Z")) {
                        Main.relampago.setDano(40);
                        System.out.println("'Hail Storm' Attack!" + " +" + Main.relampago.getDano() + " magic damage ");
                    }
                    // Punição
                    else {
                        Main.relampago.setDano(0);
                        System.out.println("Punição!");
                        System.out.println("Relâmpago sofre +9 de dano");
                        Main.relampago.getVida(9);
                    }
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

            if (Main.relampago.getVidaFinal() > 0 && Main.alien.getVidaFinal() > 0) {

                System.out.println("SPECIAL SKILL!");
                // SPECIAL SKILL
                System.out.println("Relâmpago adiciona +3 de dano ao alien");
                Main.alien.getVida(3);
            }

            // Mostra Vida
            System.out.println("Alien está com " + Main.alien.getVida(Main.relampago.getDano()) + " hp ");
            System.out.println("Relâmpago está com " + Main.relampago.getVida(Main.alien.getDano()) + " hp ");
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
