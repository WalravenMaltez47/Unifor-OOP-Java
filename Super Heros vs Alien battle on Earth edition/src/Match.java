public class Match {
    // Setting a vida (HP)
    static int hpDoHero = 200;
    static int hpDoAlien = 200;
    static MuqueMan muqueMan = new MuqueMan(hpDoHero);
    static RaioLaser raioLaser = new RaioLaser(hpDoHero);
    static Relampago relampago = new Relampago(hpDoHero);
    static EvilAlien alien = new EvilAlien(hpDoAlien);

    // GENÉRICO
    static String dificuldade;
    static int round;
    static int contadorDeRodada;
    static String golpe;
}
