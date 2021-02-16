package one.diditalinnovation.finals;
/*
* Quando aplicado o modificador "Final" em uma classe, não permite estender
* nos métodos impede que o mesmo seja sobrescrito (overriding) na subclasse,
* nos valores de variáveis não pode ser alterado depois que já tenha sido atribuído um valor.
*/
public class CasualGamer extends Gamer{

    @Override
    public String keyboard() {
        return super.keyboard();
    }

    //não pode sobescrever o método mouse pois é final.
  /*  @Override
    public String mouse() {
        return super.mouse();
    }*/

    public String play(final String game){
        //game = "WoW"; //não deixa mudar o valor da variavel porque é final.

        return "jogando "+game;
    }
}
