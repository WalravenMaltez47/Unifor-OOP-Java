public class Start implements InterfaceDoJogo {
    int vida;
    int dano;
    String start;
    @Override
    public void setStart(String start) throws StartException {
        if (!start.equals("START")&&!start.equals("start")) {
            throw new StartException("");
        }
        else {this.start=start;}
    }

// Buffs_and_Debuffs
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
    public int healing(int hp) {
        this.vida = this.vida + hp;
        return Math.max(this.vida, 0);
    }
    @Override
    public int getFinalHp() {
        return Math.max(this.vida, 0);
    }
}
