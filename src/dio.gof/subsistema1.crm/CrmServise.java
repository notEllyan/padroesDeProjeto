package dio.gof.subsistema1.crm;
public class CrmServise {
    private CrmServise(){
        super();
    }

    public static void gravarCliente(String nome, String cep, String cidade, String estado){
        System.out.println("Cliente Salvo no CRM");
    }
}
