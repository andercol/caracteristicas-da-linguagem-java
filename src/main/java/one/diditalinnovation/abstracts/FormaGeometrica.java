package one.diditalinnovation.abstracts;

/*
* O modificador Abastract só é utilizado em Classes e Métodos.
* Uma Classe abstrata não pode ser instanciada.
* Se uma Classe possui um método abstrato a Classe também tem que ser abstrata.
* Uma classe é apenas uma ideia de uma classe um "modelo"
* */

public abstract class FormaGeometrica {

    public abstract String nome();
    public abstract Double area();

    public String desenha(int x, int y) {

        return "Desenhando nas coordenadas X="+x+" Y:"+y;
    }

}
