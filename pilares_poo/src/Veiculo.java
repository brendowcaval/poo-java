public abstract class Veiculo {

    // Herança : essa classe foi especializada para aplicar em Carro e Moto.
    // nas classe que vão herdar, necessário informa o extends nomeClasse
    private String chassi;

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    // abstração : carro e moto tem o metodo ligar, mas são diferentes entre si.
    public abstract void ligar();
}
