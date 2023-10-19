public class ComputadorPedrinho {
    public static void main(String[] args) {
        // pilares de POO :
        // encapsulamento : esconder algo, pois nem tudo precisa estar visivel.
        // herança : uma classe pode herdar caracteristicas de outra classe.
        // abstração : herda caracteristas da classe, mas pode alterar seus metodos para
        // a classe filha
        // polimorfismo : o código abaixo representa o conceito.

        ServicoMensagem svc = null;

        String appEscolhido = "msn";

        if (appEscolhido.equals("fb")) {
            svc = new FacebookMessenger();
        } else if (appEscolhido.equals("tl")) {
            svc = new Telegram();
        } else if (appEscolhido.equals("msn")) {
            svc = new MSNMessenger();
        }

        svc.enviarMensagem();
        svc.receberMensagem();

    }
}
