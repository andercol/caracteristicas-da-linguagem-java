package one.diditalinnovation.classes.Pessoa;
import one.diditalinnovation.classes.usuario.SuperUsuario;

/*
 *   Desenvolvimento básico em Java - Digital Innovation One
 *   Classe criada para exemplificar modificadores de acesso.
 * */

public class ProgramaDoUsuario {

    public static void main(String[] args) {
        final var batman = new SuperUsuario("batman", "123445$#@");
        batman.getLogin();

        //batman.getPsw(); // Erro. o metodo ".getSenha()" da classe SuperUsuario é protect-

       // String nomeDoCliente = batman.nome; // Erro. a variavel "nome" da classe SuperUsuario não é publica.
    }
}
