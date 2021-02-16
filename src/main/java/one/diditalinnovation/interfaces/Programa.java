package one.diditalinnovation.interfaces;

public class Programa {

    public static void main(String[] args) {

        final Gol gol = new Gol();
        System.out.println("Marca do Gol: "+gol.marca());
        gol.ligar();

        final Veiculo trator = new Trator();
        System.out.println("Registro do Trator: "+trator.registro());
        trator.ligar();

        //final Carro fiesta = new Fiesta(); //se definir o tipo fiesta vai quebrar pq Carro não implementa registro.
        //final Veiculo fiesta = new Fiesta(); //se definir o tipo Veiculo vai quebrar pq veiculo não implementa Marca.

        final Fiesta fiesta = new Fiesta(); // nesse caso tem que utilizar o proprio tipo "fiesta"
        System.out.println("Marca do Fiesta: "+fiesta.marca());
        System.out.println("Registro do Fiesta: "+fiesta.registro());

        fiesta.ligar(); //vai imprimir os dois métodos do carro e do veiculo pois a classe fiesta implementa os dois.

        //Carro.super.ligar(); // só pode ser acessado por quem implementa

    }

}
