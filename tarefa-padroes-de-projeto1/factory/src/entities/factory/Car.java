package entities.factory;

public abstract class Car {

    private int potenciaMotor;
    private String tanque;
    private String cor;

    public Car(int potenciaMotor, String tanque, String cor) {
        this.potenciaMotor = potenciaMotor;
        this.tanque = tanque;
        this.cor = cor;
    }

    public void montandoCarro() {
        System.out.println("O modelo do seu carro é: "+ getClass().getSimpleName().toString());
        System.out.println("O carro está sendo montado E com motor da potencia " +
                potenciaMotor + ", aguarde a limpeza");
    }

    public void gasolina() {
        System.out.println("Como cortesia da fabrica, o seu tanque ja veio " + tanque.toLowerCase());
    }

    public void limpeza() {
        System.out.println("Nosso serviço de lava rápido é muito eficiente e ja deixou seu carro pronto para utilizar, a cor "
                + cor.toLowerCase() + " está brilhando");

    }

    public void checagem() {
        System.out.println("O mecanico ja checou e está tudo certo.");
    }


}
