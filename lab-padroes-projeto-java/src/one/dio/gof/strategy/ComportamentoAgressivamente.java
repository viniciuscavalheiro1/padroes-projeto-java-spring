package one.dio.gof.strategy;

public class ComportamentoAgressivamente implements Comportamento {

    @Override
    public void mover() {
        System.out.println("Movendo-se Agressivamente...");
    }
}
