public class Calculadora {
    int n1,n2;

    Calculadora(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    // n1
    public void setN1(int n1) {
        this.n1 = n1;
    }public int getN1() {
        return n1;
    }

    // n2
    public void setN2(int n2) {
        this.n2 = n2;
    }public int getN2() {
        return n2;
    }

    // Divisao de n1 por n2
    public void divisao(Calculadora calculadora) {
        try {
            if (calculadora.getN2()==0) {throw new Exception("Não existe divisão por zero. Altere o valor de n2 para diferente de 0");}
            System.out.println((calculadora.getN1()/calculadora.getN2()));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
