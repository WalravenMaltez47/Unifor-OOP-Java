import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner prompt = new Scanner(System.in);

        // setting a vida (hp)
        MuqueMan muqueMan = new MuqueMan(200);
        RaioLaser raioLaser = new RaioLaser(200);
        Relampago relampago = new Relampago(200);
        EvilAlien evilAlien = new EvilAlien(200);


        // Escolha do personagem
        System.out.println("Escolha seu personagem: ");
        System.out.println("1 - Muque-Man");
        System.out.println("2 - Raio-Laser");
        System.out.println("3 - Relâmpago");
        int escolhaDoPersonagem = prompt.nextInt();

        System.out.println("digite 'start' para comecar");
        String start = prompt.next();

        if (start.equals("start") || start.equals("START")) {
            int dado;
            int Round;
            String golpe;

            switch (escolhaDoPersonagem) {
                case 1:
                    for (Round = 1; Round <= 6; Round++) {

                        // Muque-Man
                        System.out.println("Vez do Muque-Man.. Jogando os dados..");
                        dado = prompt.nextInt(); // sera trocado por random
                        if (dado == 1 || dado == 2) {
                            System.out.println("'E' para 'Chute'");
                            golpe = prompt.next();
                            if (golpe.equals("e")||golpe.equals("E")) {
                                System.out.println("Chute Attack!");
                                System.out.println();
                                System.out.println("Alien sofreu +10 de dano de Muque-Man e agora está com " + evilAlien.damage(10) + " hp ");
                            }
                            else {
                                System.out.println("Punição!");
                                System.out.println("Muque-Man sofre +5 de dano e agora está com "+muqueMan.damage(5)+ " hp ");
                            }
                        }
                        else if (dado >= 3 && dado <= 5) {
                            System.out.println("'Q' para 'Tornado'");
                            golpe = prompt.next();
                            if (golpe.equals("q")||golpe.equals("Q")) {
                                System.out.println("Alien sofreu +20 de dano de Muque-Man e agora está com " + evilAlien.damage(20) + " hp ");
                            }
                            else {
                                System.out.println("Punição!");
                                System.out.println("Muque-Man sofre +6 de dano e agora está com "+muqueMan.damage(6) + " hp ");
                            }
                        }
                        else if (dado == 6) {
                            System.out.println("'Z' para 'Berserker'");
                            golpe = prompt.next();
                            if (golpe.equals("z")||golpe.equals("Z")) {
                                System.out.println("Alien sofreu +40 de dano de Muque-Man e agora está com " + evilAlien.damage(40) + " hp ");
                            }
                            else {
                                System.out.println("Punição!");
                                System.out.println("Muque-Man sofre +7 de dano e agora está com " + muqueMan.damage(7) + " hp ");
                            }
                        }

                        // special ability
                        System.out.println("abilidade especial do Muque-Man lhe concede +5 de hp, agora ele está com " + muqueMan.healing(5) + " hp ");

                        // Alien
                        System.out.println("Vez do Alien.. Jogando os dados..");
                        dado = prompt.nextInt(); // sera trocado por random
                        if (dado == 1 || dado == 2) {
                            System.out.println("Alien utiliza 'Split Kick!'");
                            System.out.println("Muque-Man sofreu +10 de dano de Alien e agora está com " + muqueMan.damage(10) + " hp ");
                        }
                        else if (dado >= 3 && dado <= 5) {
                            System.out.println("Alien utiliza 'Bit Laser'");
                            System.out.println("Muque-Man sofreu +20 de dano de Alien e agora está com " + muqueMan.damage(20) + " hp ");
                        }
                        else if (dado == 6) {
                            System.out.println("Alien utiliza 'Shockwave!'");
                            System.out.println("Muque-Man sofreu +40 de dano de Alien e agora está com " + muqueMan.damage(40) + " hp ");
                        }
                    }

                    // Vencedor ou Perdedor
                    if (muqueMan.getFinalHp() > evilAlien.getFinalHp()) {
                        System.out.println();
                        System.out.println("O vencedor é Muqueman!");
                    }
                    else if (muqueMan.getFinalHp() < evilAlien.getFinalHp()) {
                        System.out.println();
                        System.out.println("O vencedor é Alien!");
                    }
                    else {
                        System.out.println("Empate!...pelo menos você não perdeu...");
                    }
                    break;

                case 2:
                    for (Round = 1; Round <= 6; Round++) {

                        // Raio-Laser
                        int multiplicadorDeDano = (3*Round);
                        System.out.println("Vez do Raio-Laser.. Jogando os dados..");
                        dado = prompt.nextInt(); // sera trocado por random

                        if (dado == 1 || dado == 2) {
                            System.out.println("'E' para 'Optic Blast'");
                            golpe = prompt.next();
                            if (golpe.equals("e") || golpe.equals("E")) {
                                System.out.println("Alien sofreu +10 de dano de Raio-Laser e agora está com " + evilAlien.damage(10) + " hp ");
                            }
                            else {
                                System.out.println("Punição!");
                                System.out.println("Raio-Laser sofre +5 de dano e agora está com "+raioLaser.damage(5)+ " hp ");
                            }
                        }
                        else if (dado >= 3 && dado <= 5) {
                            System.out.println("'Q' para 'Mega Optic'");
                            golpe = prompt.next();
                            if (golpe.equals("q")||golpe.equals("Q")) {
                                System.out.println("Alien sofreu +20 de dano de Raio-Laser e agora está com " + evilAlien.damage(20) + " hp ");
                            }
                            else {
                                System.out.println("Punição!");
                                System.out.println("Raio-Laser sofre +6 de dano e agora está com "+raioLaser.damage(6)+ " hp ");
                            }
                        }
                        else if (dado == 6) {
                            System.out.println("'Z' para 'Super Optic'");
                            golpe = prompt.next();
                            if (golpe.equals("z")||golpe.equals("Z")) {
                                System.out.println("Alien sofreu +40 de dano de Raio-Laser e agora está com " + evilAlien.damage(40) + " hp ");
                            }
                            else {
                                System.out.println("Punição!");
                                System.out.println("Raio-Laser sofre +7 de dano e agora está com "+raioLaser.damage(7)+ " hp ");
                            }
                        }

                        // special ability
                        System.out.println("abilidade especial do Raio-Laser aumenta em +3 o seu dano por rodada, agora Alien está com "+evilAlien.damage(multiplicadorDeDano) + " hp ");

                        // Alien
                        System.out.println("Vez do Alien.. Jogando os dados..");
                        dado = prompt.nextInt(); // sera trocado por random
                        if (dado == 1 || dado == 2) {
                            System.out.println("Alien utiliza 'Split Kick!'");
                            System.out.println("Raio-Laser sofreu +10 de dano de Alien e agora está com " + raioLaser.damage(10) + " hp ");
                        } else if (dado >= 3 && dado <= 5) {
                            System.out.println("Alien utiliza 'Bit Laser'");
                            System.out.println("Raio-Laser sofreu +20 de dano de Alien e agora está com " + raioLaser.damage(20) + " hp ");
                        } else if (dado == 6) {
                            System.out.println("Alien utiliza 'Shockwave!'");
                            System.out.println("Raio-Laser sofreu +40 de dano de Alien e agora está com " + raioLaser.damage(40) + " hp ");
                        }
                    }

                    // Vencedor ou Perdedor
                    if (raioLaser.getFinalHp() > evilAlien.getFinalHp()) {
                        System.out.println();
                        System.out.println("O vencedor é Raio-Laser");
                    }
                    else if (raioLaser.getFinalHp() < evilAlien.getFinalHp()) {
                        System.out.println();
                        System.out.println("O vencedor é Alien");
                    }
                    else {
                        System.out.println("Empate!...pelo menos você não perdeu...");
                    }
                    break;

                case 3:
                    for (Round = 1; Round <= 6; Round++) {

                        // Relampago
                        System.out.println("Vez do Relampago.. Jogando os dados..");
                        dado = prompt.nextInt(); // sera trocado por random
                        if (dado == 1 || dado == 2) {
                            System.out.println("'E' para 'Lightning Attack'");
                            golpe = prompt.next();
                            if (golpe.equals("e")||golpe.equals("E")) {
                                System.out.println("Alien sofreu +10 de dano de Relampago e agora está com " + evilAlien.damage(10) + " hp ");
                            }
                            else {
                                System.out.println("Punição!");
                                System.out.println("Relâmpago sofre +5 de dano e agora está com "+relampago.damage(5) + " hp ");
                            }
                        }
                        else if (dado >= 3 && dado <= 5) {
                            System.out.println("Q para 'Lightning Storm'");
                            golpe = prompt.next();
                            if (golpe.equals("q")||golpe.equals("Q")) {
                                System.out.println("Alien sofreu +20 de dano de Relampago e agora está com " + evilAlien.damage(20) + " hp ");
                            }
                            else {
                                System.out.println("Punição!");
                                System.out.println("Relâmpago sofre +6 de dano e agora está com "+relampago.damage(6) + " hp ");
                            }
                        }
                        else if (dado == 6) {
                            System.out.println("'Z' para 'Hail Storm'");
                            golpe = prompt.next();
                            if (golpe.equals("z")||golpe.equals("Z")) {
                                System.out.println("Alien sofreu +40 de dano de Relâmpago e agora está com " + evilAlien.damage(40) + " hp ");
                            }
                            else {
                                System.out.println("Punição!");
                                System.out.println("Relâmpago sofre +7 de dano e agora está com "+relampago.damage(7) + " hp ");
                            }
                        }

                        // special ability
                        System.out.println("abilidade especial do Relâmpago adiciona +3 de dano ao alien, agora Alien está com "+evilAlien.damage(3) + " hp ");

                        // Alien
                        System.out.println("Vez do Alien.. Jogando os dados..");
                        dado = prompt.nextInt(); // sera trocado por random
                        if (dado == 1 || dado == 2) {
                            System.out.println("Alien utiliza 'Split Kick!'");
                            System.out.println("Relâmpago sofreu +10 de dano de Alien e agora está com " + relampago.damage(10) + " hp ");
                        } else if (dado >= 3 && dado <= 5) {
                            System.out.println("Alien utiliza 'Bit Laser'");
                            System.out.println("Relâmpago sofreu +20 de dano de Alien e agora está com " + relampago.damage(20) + " hp ");
                        } else if (dado == 6) {
                            System.out.println("Alien utiliza 'Shockwave!'");
                            System.out.println("Relâmpago sofreu +40 de dano de Alien e agora está com " + relampago.damage(40) + " hp ");
                        }
                    }

                    // Vencedor ou Perdedor
                    if (relampago.getFinalHp() > evilAlien.getFinalHp()) {
                        System.out.println();
                        System.out.println("O vencedor é Relâmpago");
                    }
                    else if (relampago.getFinalHp() < evilAlien.getFinalHp()) {
                        System.out.println();
                        System.out.println("O vencedor é Alien");
                    }
                    else {
                        System.out.println("Empate!...pelo menos você não perdeu...");
                    }
                    break;
            }
        }
    }
}