public abstract class BuffsAndDebuffs implements InterfaceDoJogo {
    int vida;
    @Override
    public int damage(int dano) {
        return this.vida = this.vida - dano;
    }
    @Override
    public int healing(int hp) {
        return this.vida = this.vida + hp;
    }
    @Override
    public int getFinalHp() {
        return this.vida;
    }
}
