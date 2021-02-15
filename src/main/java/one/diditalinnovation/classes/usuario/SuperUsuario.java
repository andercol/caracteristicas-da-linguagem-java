package one.diditalinnovation.classes.usuario;

/*
 *   Desenvolvimento básico em Java - Digital Innovation One
 *   Classe criada para exemplificar modificadores de acesso.
 * */

public class SuperUsuario {

    private String login;
    private String psw;
    String nome;

    public  SuperUsuario (final String login, final String psw){
        this.login = login;
        this.psw = psw;
    }

    public String getLogin() {
        return login;
    }

    protected String getPsw() {
        return psw;
    }
}
