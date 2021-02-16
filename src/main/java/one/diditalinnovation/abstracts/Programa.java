package one.diditalinnovation.abstracts;

public class Programa {

    public static void main(String[] args) {

        //Não é possivel instanciar a classe abstrata "FormaGeometrica".
        //final FormaGeometrica formaGeometrica = new FormaGeometrica();

        final FormaGeometrica quadrado = new Quadrado("Quadrado", 10.0);

        System.out.println(quadrado); //chama o método tostring da classe quadrado e imprime.

        System.out.println(quadrado.desenha(12,34));
        //imprime os valores passado para o método desenha herdado da classe "FormaGeometrica"

        System.out.println(quadrado.nome());
        System.out.println(quadrado.area());
    }
}
