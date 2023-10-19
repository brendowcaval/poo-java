
public class Carro extends Veiculo {

    public void ligar() {
        confereCambio();
        confereCombustivel();
        System.out.println("carro ligado!");
    }

    // encapsulamento : estão nos métodos abaixo, onde não precisam estar visiveis
    // para o usuário
    private void confereCombustivel() {
        System.out.println("conferindo combustivel.");
    }

    private void confereCambio() {
        System.out.println("conferindo cambio");
    }
}