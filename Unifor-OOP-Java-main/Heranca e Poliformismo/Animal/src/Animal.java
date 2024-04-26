public class Animal {
    String name;
    int idade;
    double peso;

    // setters
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setNome(String nome) {
        this.name = nome;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    // getters
    public double getPeso() {
        return peso;
    }
    public int getIdade() {
        return idade;
    }
    public String getNome() {
        return name;
    }

    public String eat(String comida) {
        return ("Estou comendo "+comida);
    }

    public String sleepPlace(String dormir) {
        return ("Estou dormindo como um "+dormir);
    }

}
