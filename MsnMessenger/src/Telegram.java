public class Telegram extends ServicoMensagem { // herdando da classe ServicoMensagem

    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("enviando mensagem pelo telegram.");
    }

    @Override
    public void receberMensagem() {
        System.out.println("recebendo mensagem pelo telegram.");
    }

}
