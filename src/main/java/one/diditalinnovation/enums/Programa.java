package one.diditalinnovation.enums;

import one.diditalinnovation.abstracts.FormaGeometrica;

/*
* é basicamente um dicionário de dados imutável
* não é permitido criar novas instâncias
* O construtor é sempre declarado como private
* por convenção, por serem objetos constantes e imutáveis (static final), os nomes são em MAIÚSCULOS.
* */
public class Programa {

    public static void main(String[] args) {

        //final TipoVeiculo tipoVeiculo = new TipoVeiculo(); //não é possivel estanciar um Enum

        System.out.println(TipoVeiculo.TERRESTRE);
        System.out.println(TipoVeiculo.AQUATICO);

        //System.out.println(TipoVeiculo.valueOf('aereo')); para construir um enum apartir de um valor tem que utilizar "MAIUSCULOS"
        System.out.println(TipoVeiculo.valueOf("AEREO"));

        for (TipoVeiculo tipo: TipoVeiculo.values()){
            System.out.println("Tipo: "+tipo);
        }

        System.out.println("Código do Status CLOSE: "+Status.CLOSE.getCod());
        System.out.println("Texto do Status OPEN: "+Status.OPEN.getTexto());

    }

}
