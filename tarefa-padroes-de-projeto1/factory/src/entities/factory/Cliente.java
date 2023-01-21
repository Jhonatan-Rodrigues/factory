package entities.factory;

public class Cliente {

    private String requisicaoCarro;
    private boolean comContrato;

    public Cliente(String requisicaoCarro, boolean comContrato) {
        this.requisicaoCarro = requisicaoCarro;
        this.comContrato = comContrato;
    }

    public boolean comContrato() {
        return comContrato;
    }
    public String requisicaoCarro() {
        return requisicaoCarro;
    }
}
