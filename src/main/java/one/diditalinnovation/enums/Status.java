package one.diditalinnovation.enums;
/*
 * é basicamente um dicionário de dados imutável
 * não é permitido criar novas instâncias
 * O construtor é sempre declarado como private
 * por convenção, por serem objetos constantes e imutáveis (static final), os nomes são em MAIÚSCULOS.
 * */
public enum Status {

    OPEN(13, "Aberto"),
    CLOSE(02,"Fechado");

    private int cod;
    private String texto;

    Status(final int cod, final String texto){
        this.cod = cod;
        this.texto = texto;
    }

    public int getCod(){
        return cod;
    }

    public String getTexto(){
        return texto;
    }

}
