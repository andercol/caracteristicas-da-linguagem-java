package one.diditalinnovation.finals;

public class Programa {

    public static void main(String[] args) {

        final HardcoreGamer hardcoreGamer = new HardcoreGamer();

        final Gamer gamer = new Gamer();

        final CasualGamer casualGamer = new CasualGamer();

        final var game = "PUBG";

        //game = "WoW"; //não deixa mudar o valor da variavel porque é final.

        System.out.println(casualGamer.play(game));
    }
}
