public class MatchRaioLaserVsAlien extends Match {
    public MatchRaioLaserVsAlien() {
        for (round = 0; round < 6
                && raioLaser.getVidaFinal() > 0
                && alien.getVidaFinal() > 0;
             round++) {
            contadorDeRodada = round;

            raioLaser.start();
            alien.start();

            // Mostra Vida
            System.out.println();
            if (raioLaser.getVidaFinal() > 0 && alien.getVidaFinal() > 0 && round == 0) {
                System.out.println("Alien está com " + alien.getVida(raioLaser.getDano()) + " hp ");
                System.out.println("Raio-Laser está com " + raioLaser.getVida(alien.getDano()) + " hp ");
            }

            // SPECIAL SKILL
            System.out.println();
            if (round == 0) {
                System.out.println("SPECIAL SKILL! Ativada");
            } else if (round > 0) {
                int multiplicador_De_Dano = 3 * contadorDeRodada;
                raioLaser.setDano(multiplicador_De_Dano + raioLaser.getDano());
                // Mostra Vida
                System.out.println("Alien está com " + alien.getVida(raioLaser.getDano()) + " hp ");
                System.out.println("Raio-Laser está com " + raioLaser.getVida(alien.getDano()) + " hp ");
            }
        }

        System.out.println("=============");

        // Placar
        System.out.println("A vida final de Raio-Laser " + raioLaser.getVidaFinal() + " hp ");
        System.out.println("A vida final de Alien " + alien.getVidaFinal() + " hp ");

        // Resultado
        if (Match.raioLaser.getVidaFinal() > alien.getVidaFinal()) {
            System.out.println();
            System.out.println("O vencedor é Raio-Laser");
        } else if (raioLaser.getVidaFinal() < alien.getVidaFinal()) {
            System.out.println();
            System.out.println("O vencedor é Alien");
        } else {
            System.out.println("Empate!...pelo menos você não perdeu...HAHAHA!");
        }

        System.out.println("================");
    }
}
