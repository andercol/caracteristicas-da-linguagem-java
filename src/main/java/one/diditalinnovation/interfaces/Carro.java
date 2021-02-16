package one.diditalinnovation.interfaces;
/*
* Interfaces é como um contrato que quando assumido por outra classe deve ser implementado.
* Métodos abstratos devem ser implementados por todos. Novos métodos quebram as implementações.
* Métodos default são herdados a todos que implementam. Novos métodos não quebram as implementações.
* em java não permite herança multipla de classes, mas é possivel multipla heranças de interface.
* */
public interface Carro extends Automovel{

    String marca();
    //Double valor();
    //se adicionar um método abstrato na interface tem que adicionar em todas as classes que estende essa interface

    default void ligar(){
        System.out.println("Ligando o carro!");
    }

    //se adicionar um método default na interface não quebra as classes que estende essa interface
    default String codigoRenavan(){
        return "6533JIJIO";
    }
}
