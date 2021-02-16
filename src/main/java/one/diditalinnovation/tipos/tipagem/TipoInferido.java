package one.diditalinnovation.tipos.tipagem;

/*
* ao utilizar a palavra reservada "var" a partir da versão 10 do java
* não preciso informar o tipo apenas utilizar a pavra "var" e atribuir o valor que o java ira
* entender qual é o tipo de definir automaticamente.
*
* */

public class TipoInferido {

    public static void main(String[] args) {

        var numero = Integer.valueOf("123456");

        var texto = "O número é : ";

        System.out.println(texto + numero);

    }
}
