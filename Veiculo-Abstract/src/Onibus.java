public class Onibus extends Veiculo implements TransportePublico {
    @Override
    public void pegarPassageiros() {
        System.out.println("bus is taking hostages");
    }
    @Override
    public void acelerar() {
        System.out.println("bus is running");
    }
}
