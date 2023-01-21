package application;

import entities.factory.*;

public class Program {
    public static void main(String[] args) {


        Cliente cliente = new Cliente("B",false);
        Factory factory = getFactory(cliente);
        Car carro = factory.create(cliente.requisicaoCarro());

        System.out.println();

        Cliente cliente1 = new Cliente("A",true);
        Factory factory1 = getFactory(cliente1);
        Car carro1 = factory.create(cliente1.requisicaoCarro());

    }
    private static Factory getFactory(Cliente cliente){

        if(cliente.comContrato()){
            return new ComContrato();
        }
        else {
            return new SemContrato();
        }
    }
}
