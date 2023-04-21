public abstract class Personagem implements InterfaceDoJogo {
    public int vida;
    public int dano;

    // dano
    @Override
    public void setDano(int dano) {
        this.dano = dano;
    }
    @Override
    public int getDano() {
        return this.dano;
    }

    // vida
    @Override
    public int getVida(int dano) {
        this.vida = this.vida - dano;
        return Math.max(this.vida, 0);
    }
    @Override
    public int getVidaFinal() {
        return Math.max(this.vida, 0);
    }

    // buff ou debuff
    @Override
    public int healingSkill(int hp) {
        return Math.max(this.vida+hp, 0);
    }
}
