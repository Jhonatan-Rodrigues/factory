package entities.factory;

public class SemContrato extends Factory {
    @Override
    Car obterCarro(String requisicaoCarro) {
        switch (requisicaoCarro) {
            case "A":
                return new Renegade(500, "cheio", "Preto");
            case "B":
                return new Fox(300, "cheio", "Branco");

            default:
                System.out.println("Modelo de carro nao encontrado.");
                return null;
        }
    }
}

