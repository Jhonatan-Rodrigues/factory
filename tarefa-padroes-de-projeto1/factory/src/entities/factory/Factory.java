package entities.factory;

public abstract class Factory {

    public Car create(String requisicaoCarro) {

        Car carro = obterCarro(requisicaoCarro);
        carro = preparandoCarro(carro);
        return carro;

    }

    private Car preparandoCarro(Car car) {
        car.montandoCarro();
        car.limpeza();
        car.checagem();
        car.gasolina();
        return car;
    }

    abstract Car obterCarro(String requisicaoCarro);
}
