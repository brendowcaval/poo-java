
public abstract class ServicoMensagem {
    // abstraindo
    public abstract void enviarMensagem();

    public abstract void receberMensagem();

    // protected : somente as classes filhas poderão ver
    protected void validarConectadoInternet() {
        System.out.println("validando se está conectado a internet");
    }

    // Encapsulamento : esconder algo, pois nem tudo precisa estar visivel.
    // metodos private, somente visiveis na classe
    private void salvarHistoricoMensagem() {
        System.out.println("salvando o histórico da mensagem");
    }
}
