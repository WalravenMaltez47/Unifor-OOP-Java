public abstract class Personagem implements InterfaceVida, InterfaceDano {

    // Vida
    private int vida;
    protected Personagem(int vida) {
        this.vida = vida;
    }
    @Override
    public int getVida(int dano) {
        this.vida = this.vida - dano;
        return Math.max(this.vida, 0);
    }
    @Override
    public int getVidaFinal() {
        return Math.max(this.vida, 0);
    }

    // Dano
    private int dano;
    @Override
    public void setDano(int dano) {
        this.dano = dano;
    }
    @Override
    public int getDano() {
        return this.dano;
    }
}
