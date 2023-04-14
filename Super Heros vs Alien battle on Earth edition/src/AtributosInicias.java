public abstract class AtributosInicias implements InterfaceDoJogo {
    int vida;
    public int dano(int dano) {
        return this.vida = this.vida - dano;
    }

    public int getVidaFinal() {
        return this.vida;
    }

}
