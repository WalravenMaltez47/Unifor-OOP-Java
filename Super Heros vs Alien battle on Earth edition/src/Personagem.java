public abstract class Personagem implements InterfaceDoJogo {
    public int vida;
    public int dano;

    // Buffs_and_Debuffs
    @Override
    public void setDano(int dano) {
        this.dano = dano;
    }
    @Override
    public int getDano() {
        return this.dano;
    }
    @Override
    public int getVida(int dano) {
        this.vida = this.vida - dano;
        return Math.max(this.vida, 0);
    }
    @Override
    public int healingSkill(int hp) {
        return Math.max(this.vida+hp, 0);
    }
    @Override
    public int getFinalHp() {
        return Math.max(this.vida, 0);
    }
}
