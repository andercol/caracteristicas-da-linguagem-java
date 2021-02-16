package one.diditalinnovation.interfaces;

public class Gol implements Carro{


    @Override
    public String marca() {

        return "Volkswagem";
    }

    //não é preciso sobrescrever o método defaul, ele é herdado.
}
