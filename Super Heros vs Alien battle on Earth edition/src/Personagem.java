public abstract class Personagem implements InterfaceDoJogo {
    public int Round;
    public int dado;
    public String golpe;

    public String dificuldade;

    // dano
    public int dano;
    @Override
    public void setDano(int dano) {
        this.dano = dano;
    }
    @Override
    public int getDano() {
        return this.dano;
    }

    // vida
    public int vida;
    @Override
    public int getVida(int dano) {
        this.vida = this.vida - dano;
        return Math.max(this.vida, 0);
    }
    @Override
    public int getVidaFinal() {
        return Math.max(this.vida, 0);
    }
}
