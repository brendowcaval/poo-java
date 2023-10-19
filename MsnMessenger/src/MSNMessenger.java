
public class MSNMessenger extends ServicoMensagem { // herdando da classe ServicoMensagem

    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("enviando mensagem pelo msn.");
    }

    @Override
    public void receberMensagem() {
        System.out.println("recebendo mensagem pelo msn.");
    }

}