public abstract class BuffsAndDebuffs implements InterfaceDoJogo {
    int vida;
    public int dano(int dano) {
        return this.vida = this.vida - dano;
    }
    public int healing(int hp) {
        return this.vida = this.vida + hp;
    }
    public int getVidaFinal() {
        return this.vida;
    }
}
