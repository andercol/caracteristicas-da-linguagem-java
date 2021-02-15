
package one.diditalinnovation.classes.Pessoa;

/*
*   Desenvolvimento básico em Java - Digital Innovation One
*   Classe criada para exemplificar modificadores de acesso.
* */

public class Pessoa {

    private Integer idade;
    private Float peso;

    public Pessoa(Float peso) {

    }

    public Pessoa(final Integer idade){
        this.idade = idade;
    }

    public Pessoa(final Integer idade, final float peso){
        this.idade = idade;
        this.peso = peso;
    }

    public Integer getIdade(){return this.idade;}

    public Float getPeso(){return peso;}

    protected String relatorio(){
        return "Idade: "+ idade +" e Peso: " +peso;
    }
}
