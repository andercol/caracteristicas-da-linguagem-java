package one.diditalinnovation.statics;
/*
 * Uma variável estática poderá ser acessada por todas as instâncias de objetos desta classe, e quando seu conteúdo
 * é modificado em uma instância, a modificação ocorre em todas as demais.
 * Nas declarações de métodos ajudam no acesso direto à classe, portanto não é necessário
 * instanciar um objeto para acessar o método.
 * */
public class Cachorro {

    //public String zoologia = "Quadrupede"; //Uma instância

    public static String zoologia = "Quadrupede"; // Todas as instâncias

    public static String late(){
        return "Au! Au!";
    }
}
