public abstract class BuffsAndDebuffs implements InterfaceDoJogo {
    int vida;
    @Override
    public int damage(int dano) {
         this.vida = this.vida - dano;
        if (this.vida>=0){
            return this.vida;
        }
        return 0;
    }
    @Override
    public int healing(int hp) {
        this.vida = this.vida + hp;
        if (this.vida<0) {
            return 0;
        }
        else {return this.vida;}
    }
    @Override
    public int getFinalHp() {
        return this.vida;
    }
}
