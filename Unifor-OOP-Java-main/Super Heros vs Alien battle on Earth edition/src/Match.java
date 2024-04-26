public abstract class Match {
    // Setting a vida (HP)
    private static int hpDoHero = 200;
    private static int hpDoAlien = 200;
    protected static MuqueMan muqueMan = new MuqueMan(hpDoHero);
    protected static RaioLaser raioLaser = new RaioLaser(hpDoHero);
    protected static Relampago relampago = new Relampago(hpDoHero);
    protected static EvilAlien alien = new EvilAlien(hpDoAlien);

    // GENÉRICO
    static String dificuldade;
    static int round;
    static int contadorDeRodada;
    static String golpe;
}
