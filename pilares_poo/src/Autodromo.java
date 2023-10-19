
public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("5555");
        System.out.println(jeep.getChassi());
        jeep.ligar();

        Moto cb500 = new Moto();
        cb500.setChassi("00002");
        System.out.println(cb500.getChassi());
        cb500.ligar();
    }
}