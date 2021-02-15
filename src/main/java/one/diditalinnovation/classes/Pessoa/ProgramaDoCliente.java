package one.diditalinnovation.classes.Pessoa;

import one.diditalinnovation.classes.Cliente.Cliente;

public class ProgramaDoCliente {

    public static void main(String[] args) {
        final var cliente = new Cliente(18);

        cliente.getIdade();

        cliente.getPeso();

        System.out.println(cliente.relatorio());


    }
}
