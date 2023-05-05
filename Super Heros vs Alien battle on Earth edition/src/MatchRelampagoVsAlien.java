public class MatchRelampagoVsAlien extends Match {
    protected MatchRelampagoVsAlien() {
        for (round = 1; round <= 6
                && relampago.getVidaFinal() > 0
                && alien.getVidaFinal() > 0;
             round++) {

            relampago.start();
            alien.start();

            // Mostra Vida
            System.out.println();
            System.out.println("Alien está com " + alien.getVida(relampago.getDano()) + " hp ");
            System.out.println("Relâmpago está com " + relampago.getVida(alien.getDano()) + " hp ");
            System.out.println();

            if (relampago.getVidaFinal() > 0 && alien.getVidaFinal() > 0) {
                System.out.println("SPECIAL SKILL!");
                // SPECIAL SKILL
                System.out.println("Relâmpago adiciona +3 de dano ao alien");
                alien.getVida(3);
            }
        }

        System.out.println("=================");

        // Placar
        System.out.println("A vida final de Relâmpago " + relampago.getVidaFinal() + " hp ");
        System.out.println("A vida final de Alien " + alien.getVidaFinal() + " hp ");

        // Resultado
        if (relampago.getVidaFinal() > alien.getVidaFinal()) {
            System.out.println();
            System.out.println("O vencedor é Relâmpago");
        } else if (relampago.getVidaFinal() < alien.getVidaFinal()) {
            System.out.println();
            System.out.println("O vencedor é Alien");
        } else {
            System.out.println("Empate!...pelo menos você não perdeu...HAHAHA!");
        }

        System.out.println("==================");
    }
}
