package dio.gof.Strategy;

import javax.swing.plaf.synth.SynthStyleFactory;

public class ComportamentoNormal implements Comportamento{
    public void mover(){
        System.out.println("Movendo-se normalmente...");
    }
}