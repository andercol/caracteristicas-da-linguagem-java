package one.diditalinnovation.classes.Cliente;

public class ProgramaDoCliente {

    public static void main(String[] args) {
        final var cliente = new Cliente(18);

        cliente.getIdade();

        cliente.getPeso();

        //System.out.println(cliente.relatorio());
        /*
        * cliente não ira coseguir acessar o relatorio
        * pois esse é um método "protect" da classe pessoa e
        * a classe "Pessoa" que é herdada pela classe "Cliente" está em outro pacote.
        * */

    }
}
