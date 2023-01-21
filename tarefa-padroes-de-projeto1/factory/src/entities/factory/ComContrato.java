package entities.factory;

public class ComContrato extends Factory {
    @Override
    Car obterCarro(String requisicaoCarro) {
        switch (requisicaoCarro) {
            case "A":
                return new BmwX6(1000, "cheio", "Azul");
            case "B":
                return new PorschePanamera(1500, "cheio", "Vermelha");

            default:
                System.out.println("Modelo de carro nao encontrado.");
                return null;
        }
    }
}
