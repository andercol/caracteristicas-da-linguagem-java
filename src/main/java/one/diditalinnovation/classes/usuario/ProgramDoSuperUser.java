package one.diditalinnovation.classes.usuario;

/*
 *   Desenvolvimento básico em Java - Digital Innovation One
 *   Classe criada para exemplificar modificadores de acesso.
 * */

public class ProgramDoSuperUser {

    public static void main(String[] args) {
        final var superUser = new SuperUsuario("root", "12345");

        superUser.getLogin();

        superUser.getPsw();

        String root = superUser.nome;
        /*
        System.out.println(superUser.getLogin());
        System.out.printf(superUser.getPsw());
        System.out.println(superUser.nome);
        */
    }
}
