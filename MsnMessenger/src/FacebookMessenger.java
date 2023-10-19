public class FacebookMessenger extends ServicoMensagem { // herdando da classe ServicoMensagem

    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("enviando mensagem pelo facebook.");
    }

    @Override
    public void receberMensagem() {
        System.out.println("recebendo mensagem pelo facebook.");
    }

}
