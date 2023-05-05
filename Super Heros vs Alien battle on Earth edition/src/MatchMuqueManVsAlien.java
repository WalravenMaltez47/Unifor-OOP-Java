public class MatchMuqueManVsAlien extends Match {
    public MatchMuqueManVsAlien() {
        for (round = 0; round < 6
                && muqueMan.getVidaFinal()>0
                && alien.getVidaFinal()>0;
             round++) {

            muqueMan.start();
            alien.start();

            // Mostra Vida
            System.out.println();
            System.out.println("Alien está com " + alien.getVida(muqueMan.getDano()) + " hp ");
            System.out.println("Muque-Man está com " + muqueMan.getVida(alien.getDano()) + " hp ");
            System.out.println();

            System.out.println("SPECIAL SKILL!");
            // SPECIAL SKILL
            if (muqueMan.getVidaFinal() > 0 && alien.getVidaFinal() > 0) {
                System.out.println(muqueMan.getVida(-5) + " hp ");
            }

            // Reset Dano
            Match.muqueMan.setDano(0);
        }

        System.out.println("=================");

        // Placar
        System.out.println("A vida final de Muque-Man " + muqueMan.getVidaFinal() + " hp ");
        System.out.println("A vida final de Alien " + alien.getVidaFinal() + " hp ");

        // Resultado
        if (muqueMan.getVidaFinal() > alien.getVidaFinal()) {
            System.out.println();
            System.out.println("O vencedor é Muqueman!");
        }
        else if (muqueMan.getVidaFinal() < alien.getVidaFinal()) {
            System.out.println();
            System.out.println("O vencedor é Alien!");
        }
        else {
            System.out.println("Empate!...pelo menos você não perdeu... HAHAHA!");
        }

        System.out.println("================");
    }
}
