package one.dio.gof.subsistema2.cep;

import one.dio.gof.singleton.SingletonEager;

public class CepApi {
    private static CepApi intancia =  new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstance() {

        return intancia;
    }

    public String recuperarCidade(String cep) {
        return "Parambu";
    }

    public String recuperarEstado(String cep) {
        return "Ceara";
    }
}
