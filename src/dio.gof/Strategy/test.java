 package dio.gof.Strategy;

public class test {
    Comportamento normal = new ComportamentoNormal();
    Comportamento defensivo = new ComportamentoDefensivo();
    Comportamento ofensivo = new ComportamentoOfensivo();

    Robo robo = new Robo();
    robo.setComportamento(normal);
    robo.mover();
    robo.mover();
    robo.setComportamento(defensivo);
    robo.mover();
    robo.mover();
    robo.setComportamento(ofensivo);
    robo.mover();
    robo.mover();
}
