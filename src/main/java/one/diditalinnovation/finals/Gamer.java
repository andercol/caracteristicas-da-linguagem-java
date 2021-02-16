package one.diditalinnovation.finals;
/*
 * Quando aplicado o modificador "Final" em uma classe, não permite estender
 * nos métodos impede que o mesmo seja sobrescrito (overriding) na subclasse,
 * nos valores de variáveis não pode ser alterado depois que já tenha sido atribuído um valor.
 **/
public class Gamer {

    public String keyboard(){ return "Keyboard Gamer!";}

    public final String mouse(){ return "Mouse Gamer!";}

}
