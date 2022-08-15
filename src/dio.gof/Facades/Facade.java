package dio.gof.Facades;

import dio.gof.subsistema1.crm.CrmServise;
import dio.gof.subsistema2.cep.CepApi;

public class Facade {
    public void migrarCliente(String nome, String cep){
        String cidade= CepApi.gitInstancia().recuperarCidade(cep);
        String estado = CepApi.gitInstancia().recuperarEstado(cep);
        CrmServise.gravarCliente(nome, cep, cidade, estado);
    }
}
